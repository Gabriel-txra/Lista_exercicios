//Implemente um programa que rotacione os elementos do array k posições para a direita. Exemplo:
// //Entrada: [1, 2, 3, 4, 5], k = 2 com k sendo valor fixo 2
// //Saída: [4, 5, 1, 2, 3]
import java.util.Scanner;
public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lista = new int[5];
        int k = 2;
        System.out.println("digite 5 numeros: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.print("digite o " + (i+1) + " numero: ");
            lista[i] = sc.nextInt();
        }
        //mudando os elementos do array k posições para a direita
        for (int i = 0; i < k; i++) {
            int temp = lista[lista.length - 1]; // Armazena o último elemento
            // Desloca os elementos para a direita
            for (int j = lista.length - 1; j > 0; j--) {
                lista[j] = lista[j - 1];
            }
            //lançando o ultimo elemento na primeira posição
            lista[0] = temp;
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
        
    }
}
