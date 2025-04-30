package Aula02.example_1;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Status: " + this.tampada);
    }

    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro! Nao pode rabiscar");
        }else{
            System.out.println("Pode rabiscar");
        }

    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
}
