package lista2;
import java.util.ArrayList;
import java.util.Scanner;

// Sistema simples de cadastro de nomes utilizando ArrayList
public class ex1 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<String>();
        int sair = 0;

        while (sair == 0) {
            // menu com as opções
            System.out.println(" ____________________________");
            System.out.println("Menu:");
            System.out.println("1 - Adicionar nome");
            System.out.println("2 - Listar nomes");
            System.out.println("3 - Remover nome");
            System.out.println("4 - Buscar nome");
            System.out.println("0 - Sair");
            System.out.println(" ____________________________");
            System.out.println("Digite a opção desejada: ");

            int opcao = n.nextInt();
            n.nextLine(); 

            // adicionar os nomes
            if (opcao == 1) {
                System.out.println("Digite o nome que deseja adicionar: ");
                String nome = n.nextLine();
                if (nome.isEmpty()) {
                    System.out.println("Nome vazio, tente novamente.");
                } else {
                    nomes.add(nome);
                    System.out.println("Nome adicionado com sucesso!");
                }
            }
            // mostrar lista dos nomes
            else if (opcao == 2) {
                if (nomes.isEmpty()) {
                    System.out.println("A lista está vazia.");
                } else {
                    for (int i = 0; i < nomes.size(); i++) {
                        System.out.println("Nome: " + nomes.get(i) + " Posição: " + i);
                    }
                }
            }
            // remover o nome
            else if (opcao == 3) {
                System.out.println("Digite o nome que deseja remover: ");
                String nomeRemover = n.nextLine();
                if (nomes.contains(nomeRemover)) {
                    nomes.remove(nomeRemover);
                    System.out.println("Nome removido");
                } else {
                    System.out.println("Nome não encontrado.");
                }
            }
            // buscar nome
            else if (opcao == 4) {
                System.out.println("Digite o nome que deseja buscar: ");
                String nomeBuscar = n.nextLine();
                if (nomes.contains(nomeBuscar)) {
                    System.out.println("Nome encontrado");
                } else {
                    System.out.println("Nome não encontrado");
                }
            }
            // sair do programa
            else if (opcao == 0) {
                sair = 1; // Define a variável sair como 1 para encerrar o loop
                System.out.println("Saindo do programa");
            }
            else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}