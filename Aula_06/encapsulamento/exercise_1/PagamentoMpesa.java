package Aula_06.encapsulamento.exercise_1;

public class PagamentoMpesa implements Pagamento{
    private String nome;
    private int numeroTelefone;

    public PagamentoMpesa(String nome, int numeroTelefone) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void ralizarPagamento(double valor) {
        System.out.println("Pagamento  de %.2f MZN efectuado via Mpesa", valor);

    }
}
