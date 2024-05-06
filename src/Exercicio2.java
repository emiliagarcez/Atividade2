import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

    public static void main(String[] args) {
        int valor;

        // Criação da pilha
        Stack<Integer> numeros = new Stack<>();

        // Empilhamento de números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            Scanner entrada = new Scanner(System.in);
            valor = entrada.nextInt();
            entrada.close(); 

            if (valor % 2 == 0) {
                numeros.push(valor);
            } else {
                if (!numeros.isEmpty()) {
                    numeros.pop();
                    System.out.println("Número ímpar removido da pilha."); 
                } else {
                    System.out.println("A pilha está vazia. Nenhum número ímpar removido.");
                }
            }
        }

        // Desempilhamento e impressão da pilha
        System.out.println("\nDesempilhando elementos da pilha:");
        while (!numeros.isEmpty()) {
            System.out.print(numeros.pop() + " ");
        }
    }
}



