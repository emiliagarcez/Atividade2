import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        int valor;

        do {
            System.out.print("Digite um valor inteiro entre 1 e 99: ");
            Scanner entrada = new Scanner(System.in);
            valor = entrada.nextInt();
            entrada.close(); 
        } while (valor < 1 || valor > 99);

        int[] N = new int[10];


        N[0] = valor;

        for (int i = 1; i < N.length; i++) {
            N[i] = i + 1;
        }

        int soma = 0;
        for (int elemento : N) {
            soma += elemento;
        }

        System.out.println("\nValores do vetor N:");
        for (int elemento : N) {
            System.out.print(elemento + " ");
        }
        System.out.println("\nSoma dos valores: " + soma);
    }
}
