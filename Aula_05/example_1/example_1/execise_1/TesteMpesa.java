package Aula_05.example_1.example_1.execise_1;

public class TesteMpesa {
    public static void main(String[] args){
        Mpesa c = new Mpesa();

        c.criarConta("Felicina", 847725920);
        c.depositar(100);
        System.out.println(c.getStatus());
        System.out.println(c.getSaldo());
        c.setStatus(false);
        c.depositar(100);
        System.out.println(c.getSaldo());
    }
}
