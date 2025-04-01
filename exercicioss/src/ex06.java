// Dado um array, remova os valores duplicados e exiba o novo array sem repetições.
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ex06 {
    public static void main(String[] args) {
        // Array inicial com valores duplicados
        int[] num = {1, 2, 3, 4, 5, 1, 2, 3, 5, 10, 11, 27, 33, 33, 33};

        // Criando um Set para armazenar apenas valores únicos
        Set<Integer> numUNICO = new HashSet<>();

        // Iterando sobre o array original e adicionando os elementos ao Set
        for (int n : num) {
            numUNICO.add(n); // O Set automaticamente ignora duplicados
        }

        // Convertendo o Set para uma lista para exibição ou manipulação posterior
        List<Integer> novalista = new ArrayList<>(numUNICO);

        // Exibindo o resultado
        System.out.println("Array sem duplicados: " + novalista);

        Collections.sort(novalista);
        System.out.println("ordenada" + novalista); //aqui ordena a lista
    }
    // precisei de ajuda para fazer esse, nao estava achando como remover os repetidos, não consegui acompanhar no exercicio que foi passado de exemplo, por isso deixei ele comentado tambem
}
