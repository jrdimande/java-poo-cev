package Aula_03.example_1;

public class TestarCaneta {
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f;
        c1.carga = 80;
        c1.tampada = true;
        c1.status();

        c1.rabiscar();

    }
}
