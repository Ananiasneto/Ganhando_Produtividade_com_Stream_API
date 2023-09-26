import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExemplo {
    public static void main(String[] args) {
        
        Supplier<String> saudacao = () -> "olá, seja bem vindo(a)";
        List<String> listaSaudacao = Stream.generate(saudacao)
                .limit(5)
                .toList();

        listaSaudacao.forEach(s -> System.out.print(s));
    }
}
