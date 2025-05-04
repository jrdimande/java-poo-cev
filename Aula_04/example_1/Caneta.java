package Aula_04.example_1;

public class Caneta {
    public String modelo;
    private float ponta;

    // metodo constructor
    public  Caneta(String modelo, float ponta){
        this.modelo = modelo;
        this.ponta = ponta;
    }
    public Caneta(){}

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float ponta){
        this.ponta = ponta;
    }

}
