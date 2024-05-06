import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        int valor;

        do {
            System.out.print("Digite um valor inteiro entre 2 e 1000: ");
            Scanner entrada = new Scanner(System.in);
            valor = entrada.nextInt();
            entrada.close(); 
        } while (valor < 2 || valor > 1000);

        int[] N = new int[valor];

        for (int i = 0; i < N.length; i++) {
            N[i] = i + 1;
        }

        System.out.println("\nValores do vetor N:");
        for (int elemento : N) {
            System.out.print(elemento + " ");
        }
    }
}
