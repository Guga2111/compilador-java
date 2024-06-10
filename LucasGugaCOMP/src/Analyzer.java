import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import gen.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Analyzer extends myLangBaseListener {
    private Map<String, String> symbols = new HashMap<>(); // tabela que vai ficar os simbolos
    private Map<String, String> variableValues = new HashMap<>(); // tabela q vai pegar as variaveis de cada simb

    public void enterVarDecl(myLangParser.VarDeclContext ctx) { // valida a declaração
        String type = ctx.type().getText();
        String id = ctx.ID().getText();
        System.out.println("Variable Declaration: " + type + " " + id);

        if (symbols.containsKey(id)) {
            System.err.println("Error: Variable " + id + " is already declared.");
        } else {
            symbols.put(id, type);
            if (ctx.expr() != null) {
                String value = evaluateExpression(ctx.expr());
                variableValues.put(id, value);
                System.out.println("Variable Initialization: " + id + " = " + value);
            }
        }
    }

    @Override
    public void enterAssign(myLangParser.AssignContext ctx) {
        String id = ctx.ID().toString();
        String value = evaluateExpression(ctx.expr());
        System.out.println("Assignment to variable: " + id + " = " + value);

        if (!symbols.containsKey(id)) {
            System.err.println("Error: Variable " + id + " is not declared.");
        } else {
            variableValues.put(id, value);
        }
    }

    @Override
    public void enterFuncDecl(myLangParser.FuncDeclContext ctx) { // valida a função
        String type = ctx.type().getText();
        String id = ctx.ID().getText();
        System.out.println("Function Declaration: " + type + " " + id);
    }

    @Override
    public void enterControlStruct(myLangParser.ControlStructContext ctx) { // valida a struct de controle
        System.out.println("Control Structure: " + ctx.getText());
    }

    @Override
    public void enterStructDecl(myLangParser.StructDeclContext ctx) {// valida a struct
        String id = ctx.ID().getText();
        System.out.println("Struct Declaration: struct " + id);
    }

    private String evaluateExpression(myLangParser.ExprContext ctx) { // valida a expressão
        if (ctx == null) {
            return "";
        }

        // Evaluate the expression as a string representation for simplicity
        // More sophisticated evaluation would require implementing an expression evaluator
        return ctx.getText();
    }

    public static void main(String[] args) throws Exception {
        File file = new File("analisar.txt"); // pega o arquivo
        Scanner scanner = new Scanner(file); // lê ele
        StringBuilder contentBuilder = new StringBuilder(); // cria uma builder de string

        while (scanner.hasNextLine()) {// lê tudo do arquivo
            String line = scanner.nextLine();
            contentBuilder.append(line).append('\n');
        }
        String analizar = contentBuilder.toString(); // pega oq vai ser analisado
        InputStream inputStream = new ByteArrayInputStream(analizar.getBytes(StandardCharsets.UTF_8)); // passa por um tratamento
        CharStream inputAux = CharStreams.fromStream(inputStream);
        myLangLexer lexer = new myLangLexer(inputAux); // passa por uma analisador lexico
        CommonTokenStream tokens1 = new CommonTokenStream(lexer); // pega os tokens
        tokens1.fill();
        List<Token> tokenList = tokens1.getTokens();
        for (Token token : tokenList) {
            System.out.println("Token: " + token.getText() + " - Type: " + token.getType());
        }
        myLangParser parser = new myLangParser(tokens1); // passa por um analisador sintatico
        ParseTree tree = parser.prog();
        System.out.println(tree.toStringTree(parser)); // printa a arvore
        ParseTreeWalker walker = new ParseTreeWalker();
        Analyzer analise = new Analyzer();
        walker.walk(analise, tree); // printa todas as validações
        
    }
}