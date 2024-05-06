import java.util.Scanner;
import java.util.Stack;

public class Exercicio1 {

    public static void main(String[] args) {
        int valor;

        // Laço de repetição
        do {
            System.out.print("Digite um valor inteiro (entre 1 e 99): ");
            Scanner entrada = new Scanner(System.in);
            valor = entrada.nextInt();
            entrada.close(); 
        } while (valor < 1 || valor > 99);

        // Pilhas para números pares e ímpares
        Stack<Integer> numPares = new Stack<>();
        Stack<Integer> numImpares = new Stack<>();

        // Leitura e empilhamento dos números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            Scanner entrada = new Scanner(System.in);
            int numero = entrada.nextInt();
            entrada.close(); 
            if (numero % 2 == 0) {
                numPares.push(numero);
            } else {
                numImpares.push(numero);
            }
        }

        // Pilha de números pares
        System.out.println("\nPilha de números pares:");
        exibirPilha(numPares);

        // Pilha de números ímpares
        System.out.println("\nPilha de números ímpares:");
        exibirPilha(numImpares);
    }

    // Método para exibir a pilha
    private static void exibirPilha(Stack<Integer> pilha) {
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.print("[");
            for (Integer elemento : pilha) {
                System.out.print(elemento + " ");
            }
            System.out.print("]");
        }
    }
}
