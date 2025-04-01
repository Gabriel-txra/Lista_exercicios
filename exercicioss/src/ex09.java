//Dado um array com números positivos e negativos, encontre o subarray com a maior soma.
//Exemplo:
//Entrada: [-2,1,-3,4,-1,2,1,-5,4]  
//Saída: 6 (subarray [4,-1,2,1])

public class ex09 {
    public static void main(String[] args) {
        int[] num = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSoma = Integer.MIN_VALUE; // Inicializa com o menor valor possível
        int n = num.length;
        for (int i = 0; i < n; i++) {
            // Segundo loop: define o final do subarray
            for (int j = i; j < n; j++) {
                int somaAtual = 0;
                 // Terceiro loop: percorre os elementos do subarray definido por i e j
                for (int k = i; k <= j; k++) {
                    somaAtual += num[k];
                }
                if (somaAtual > maxSoma) {
                    maxSoma = somaAtual;
                }
            }
        }
        System.out.println("A maior soma de subarray é: " + maxSoma);
        //esse trem de kadame bugou minha cabeça tudo, pesquisei sobre mas ainda n fez sentido na minha cabeça
    }
}
