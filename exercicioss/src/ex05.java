//Peça ao usuário um número e verifique se ele está presente no array. Exiba a posição caso esteja.
import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8, 10};
        Scanner sc = new Scanner(System.in);
        System.out.print("digite um número para verificar se está na lista: ");
        int numeroParaVerificar = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroParaVerificar) {
                System.out.println("Número encontrado na posição: " + i);
                encontrado = true;
            }else {
                System.out.println("Número não encontrado na lista ");
                break;
            }
        }
    }
}
