package Aula_04.example_1;

public class TesteCaneta {
    public static void main(String[] args){
        Caneta c1 = new Caneta();

        // Usando os metodos especiais
        c1.setModelo("Bic");
        c1.setPonta(0.5f);

        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Ponta: " + c1.getPonta());
    }
}
