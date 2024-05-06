import java.util.Stack;

class Livro {
    String nome;
    String autor;
    String isbn;
    int ano;

    public Livro(String nome, String autor, String isbn, int ano) {
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
        this.ano = ano;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Ano: " + ano);
    }
}

public class PilhaLivros {
    public static void main(String[] args) {
        Stack<Livro> PilhaLivros = new Stack<>();

        PilhaLivros.push(new Livro("1984", "George Orwell", "9780451524935", 1949));
        PilhaLivros.push(new Livro("O Médico", "Noah Gordon", "9788577222728", 1986));
        PilhaLivros.push(new Livro("O Alquimista", "Paulo Coelho", "9780061122415", 1988));

        System.out.println("Livros na pilha:");
        while (!PilhaLivros.isEmpty()) {
            Livro livro = PilhaLivros.pop();
            livro.imprimir();
        }
    }
}


