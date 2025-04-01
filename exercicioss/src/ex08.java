//Dado dois arrays ordenados, crie um terceiro array que contenha todos os elementos ordenados.
//Entrada: [1, 3, 5] e [2, 4, 6]  
//Saída: [1, 2, 3, 4, 5, 6]
import java.util.Arrays;
import java.util.Scanner;
public class ex08 {
    public static void main(String[] args) {
        int [] lista1 = new int[3];
        int [] lista2 = new int[3];
        int [] lista3 = new int[lista1.length + lista2.length];
        System.out.println("digite 3 numeros para a lista 1: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < lista1.length; i++) {
            System.out.print("digite o " + (i+1) + " numero: ");
            lista1[i] = sc.nextInt();
        }
        System.out.println("digite 3 numeros para a lista 2: ");
        for (int i = 0; i < lista2.length; i++) {
            System.out.print("digite o " + (i+1) + " numero: ");
            lista2[i] = sc.nextInt();
        }
        //adicionando lista1 na lista3
        for (int i = 0; i < lista1.length; i++) {
            lista3[i] = lista1[i];
        }
        //adicionandolista2 na lista3
        for (int i = 0; i < lista2.length; i++) {
            lista3[i + lista1.length] = lista2[i];
        }
        // Ordenando o array lista3
        Arrays.sort(lista3);
        System.out.println("Array ordenado: " + Arrays.toString(lista3)); // mudei para string para odernação, aqui n consegui usar o collections
    }
}
