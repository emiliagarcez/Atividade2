import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        int valor;

        do {
            System.out.print("Digite um valor inteiro entre 4 e 50: ");
            Scanner entrada = new Scanner(System.in);
            valor = entrada.nextInt();
            entrada.close(); 
        } while (valor < 4 || valor > 50);

        int[][] N = new int[valor][valor];

        for (int i = 0; i < N.length; i++) {
            for (int j = 0; j < N[i].length; j++) {
                N[i][j] = (i + 1) * (j + 1); 
            }
        }

        System.out.println("\nValores da matriz N:");
        for (int[] linha : N) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println(); 
        }
    }
}
