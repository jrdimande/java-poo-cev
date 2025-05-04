package Aula_03.exercise_1;

public class TesteLivro {
    public static void main(String[] args){
        Livro l1 = new Livro();

        l1.titulo = "Python Crash Course";
        l1.autor = "Mathew";
        l1.numeroPaginas = 500;

        l1.exibirInformacoes();
        l1.aplicarDesconto();
        // l1.calcularDesconto();
    }
}
