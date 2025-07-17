package Aula_06.encapsulamento.exercise_1;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.println("Escolha o metodo de pagamento\n1 - Cartao\n2 - Mpesa");
        int escolha = read.nextInt();
        read.nextLine();

        System.out.print("Digite o nome do titular: ");
        String nome = read.nextLine();

        System.out.print("Digite o valor a pagar: ");
        double valor = read.nextDouble();

        Pagamento pagamento;

        if (escolha == 1){
            System.out.println("Digite o numero do cartao: ");
            int numeroCartao = read.nextInt();
            pagamento = new PagamentoCartao(nome, numeroCartao);

        }else {
            System.out.println("Digite o numero de telefone: ");
            int numeroTelefone = read.nextInt();

            pagamento = new PagamentoMpesa(nome, numeroTelefone);
        }

        pagamento.ralizarPagamento(valor);




    }
}
