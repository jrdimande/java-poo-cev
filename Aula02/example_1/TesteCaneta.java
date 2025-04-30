package Aula02.example_1;

public class TesteCaneta{
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = true;

        c1.status();
        c1.tampar();
        c1.rabiscar();
        c1.destampar();
        c1.status();
        c1.rabiscar();

    }
    }