package Aula_03.example_1;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Status: " + this.tampada);
    }

    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro! Nao pode rabiscar");
        }else{
            System.out.println("Pode rabiscar");
        }

    }

    protected void tampar(){
        this.tampada = true;
    }

    protected void destampar(){
        this.tampada = false;
    }

}
