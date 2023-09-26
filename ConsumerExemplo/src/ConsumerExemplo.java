import java.util.List;
import java.util.Array;
import java.util.function.Consumer;


public class ConsumerExemplo {
    public static void main(String[] args){
        List<Integer> numeros =Array.aslist(1,2,3,4,5);
        Consumer<Integer> imprimirNumeroPar=numero ->{
            if (numero%2==0){
                system.out.println(numero);
            }
        }
        numeros.stream().forEach(imprimirNumeroPar);
    }
}
