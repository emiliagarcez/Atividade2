import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor;

        do {
            System.out.print("Digite um valor inteiro menor ou igual a 20: ");
            valor = entrada.nextInt();
        } while (valor > 20 || valor <= 0);

        int[] N = new int[10];

        N[0] = valor;

        for (int i = 1; i < N.length; i++) {
            N[i] = N[i - 1] * 2;
        }

        System.out.println("\nValores do vetor N:");
        for (int elemento : N) {
            System.out.print(elemento + " ");
        }

        entrada.close();
    }
}
