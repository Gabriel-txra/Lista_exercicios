//2. Dado um array de números inteiros, calcule e exiba a média dos elementos.
import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <numeros.length; i++) {
            System.out.print("digite o " + (i+1) + " numero (5 numeros): ");
            numeros[i] = sc.nextInt();
        }
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        double media = (double) soma / numeros.length;
        System.out.println("a média dos numeros é: " + media);
    }
}
