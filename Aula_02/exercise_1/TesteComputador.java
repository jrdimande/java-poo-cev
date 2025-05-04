package Aula_02.exercise_1;

public class TesteComputador {
    public static void main(String[] args){
        Computador c1 = new Computador();
        c1.marca = "HP";
        c1.ref = "ProBook";
        c1.bateria = 100;

        // Usando os metodos
        c1.desliga();
        c1.status();
        c1.ligar();
        c1.status();
        c1.ligar();

    }
}
