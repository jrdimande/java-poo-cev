package Aula_05.example_1.example_1.execise_1;

public class TesteMpesa {
    public static void main(String[] args){
        Mpesa c1 = new Mpesa();
        Mpesa c2 = new Mpesa();

        c1.criarConta("Junior", 000);
        c2.criarConta("ian", 111);

        // Depositar
        c1.depositar(-200);

        // transferir
        c1.transferir(c2, 100);

        // ver info
        c1.getInfo();
        c2.getInfo();

        c2.desativarConta();

    }
}
