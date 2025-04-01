
// peça ao usuario para inserir um conjunto de numeros e determine o maior e menor numero do valor
// e imprima o resultado
import java.util.Scanner;
public class ex01 {
    public static void main(String[] args) throws Exception {
        int [] numeros = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("digite o " + (i+1) + " numero (10 numeros): ");
            numeros[i] = sc.nextInt();
        }
        int maior = numeros[0];
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) { // Começa do índice 1, já que maior e menor foram inicializados com o índice 0
            maior = Math.max(maior, numeros[i]);
            menor = Math.min(menor, numeros[i]);
        }
        System.out.println("o maior número é: " + maior);
        System.out.println("o menor número é: " + menor);
    }
}
