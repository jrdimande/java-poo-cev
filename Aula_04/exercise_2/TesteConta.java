package Aula_04.exercise_2;

public class TesteConta {
    public static void main(String[] args){
        ContaBancaria cb = new ContaBancaria("Kelly", 19022020);

        cb.exibirInformacoes();
        System.out.println();

        cb.depositar(1000);
        System.out.println();

        cb.depositar(12);
        System.out.println();

        cb.exibirInformacoes();
        System.out.println();

        cb.levantar(100000);
        //cb.validar_deposito(1000);
    }
}
