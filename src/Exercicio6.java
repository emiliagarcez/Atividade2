import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        int valor;

        do {
            System.out.print("Digite um valor inteiro entre 4 e 50: ");
            Scanner entrada = new Scanner(System.in);
            valor = entrada.nextInt();
            entrada.close(); 
        } while (valor < 4 || valor > 50);

        int[][] N = new int[valor][valor];
        int[][] Z = new int[valor][valor];

        dadosMatriz(N, valor);
        dadosMatriz(Z, valor);

        int[][] Soma = new int[valor][valor];

        somaMatrizes(N, Z, Soma, valor);

        System.out.println("\nValores da matriz N:");
        mostraMatriz(N, valor);

        System.out.println("\nValores da matriz Z:");
        mostraMatriz(Z, valor);

        System.out.println("\nValores da matriz N + matriz Z:");
        mostraMatriz(Soma, valor);
    }


    private static void dadosMatriz(int[][] matriz, int valor) {
        for (int i = 0; i < valor; i++) {
            for (int j = 0; j < valor; j++) {
                matriz[i][j] = (int) (Math.random() * 100); 
            }
        }
    }

    private static void somaMatrizes(int[][] N, int[][] Z, int[][] Soma, int valor) {
        for (int i = 0; i < valor; i++) {
            for (int j = 0; j < valor; j++) {
                Soma[i][j] = N[i][j] + Z[i][j];
            }
        }
    }

    private static void mostraMatriz(int[][] matriz, int valor) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println(); 
        }
    }
}