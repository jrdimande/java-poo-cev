package Aula_06.encapsulamento.exercise_1;

public class PagamentoCartao  implements Pagamento{
    private String titular;
    private int numerCartao;


    public PagamentoCartao(String titular, int numerCartao) {
        this.titular = titular;
        this.numerCartao = numerCartao;
    }

    public int getNumerCartao() {
        return numerCartao;
    }

    public void setNumerCartao(int numerCartao) {
        this.numerCartao = numerCartao;
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public void ralizarPagamento(double valor) {;
        System.out.printf("Pagamento de %.2f MZN efectudado com Cartao", valor);

    }


}
