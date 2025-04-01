//Crie um programa que inverta a ordem dos elementos de um array sem usar uma nova estrutura de dados auxiliar.
import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        int [] lista = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("digite 7 numeros: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.print("digite o " + (i+1) + " numero: ");
            lista[i] = sc.nextInt();
        }
        // Invertendo a ordem dos elementos do array
        for (int i = 0; i < lista.length / 2; i++) {
            int temp = lista[i]; // Armazena o valor atual
            //System.out.println("i: " + i + " lista[i]: " + lista[i] + " lista[lista.length - 1 - i]: " + lista[lista.length - 1 - i]);
            // Troca o valor atual com o valor correspondente do final do array
            lista[i] = lista[lista.length - 1 - i];
            // Atribui o valor armazenado para a posição correspondente do final do array       
            lista[lista.length - 1 - i] = temp;
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }

    }
}
