import java.io.InputStreamReader;
import java_cup.runtime.Symbol;

public class Main {
    public static void main(String[] args) {
        try {
            parser p = new parser(new Yylex(new InputStreamReader(System.in)));
            Symbol result = p.parse();
            System.out.println("Resultado: " + result.value);
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
