package Aula03.exercise_1;

public class Livro {
    public String titulo;
    String autor;
    protected int numeroPaginas;
    private double preco;

    public void exibirInformacoes(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Numero de paginas: " + this.numeroPaginas);
    }

    private void calculandoDesconto(){
        System.out.println("Calculando desconto...");
    }

    void aplicarDesconto(){
        calculandoDesconto();
    }
}
