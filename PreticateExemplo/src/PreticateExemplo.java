import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemplo {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "python", "javascript", "c", "go");
        Predicate<String> maisDeCincoLetras = palavra -> palavra.length() > 5;
        
        palavras.stream()
                .filter(maisDeCincoLetras) // Use the maisDeCincoLetras Predicate here
                .forEach(System.out::println);
    }
}