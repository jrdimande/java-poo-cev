package Aula02.exercise_1;

public class Computador {
    String marca;
    String ref;
    int bateria;
    boolean ligado;

    void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Ligado: " + this.ligado);
        System.out.println("Bateria: " + this.bateria + "%");
    }

    void ligar(){
        if (this.ligado == true){
            System.out.println("O computador ja encontra-se ligado");
        }else {
            this.ligado = true;
        }
    }

    void desliga(){
        if (this.ligado == false){
            System.out.println("O computador ja encontra-se desligado");
        }else{
            this.ligado = false;
        }
    }
}
