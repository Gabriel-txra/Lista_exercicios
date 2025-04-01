//Preencha um array com 10 números e conte quantos são pares e quantos são ímpares.
import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        int[] num = new int[10];
        int pares = 0;
        int impares = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite o " + (i+1) + " numero (10 numeros): ");
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("quantidade de numeros pares: " + pares);
        System.out.println("quantidade de numeros ímpares: " + impares);
    }
}
