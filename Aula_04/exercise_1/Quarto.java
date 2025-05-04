package Aula_04.exercise_1;

public class Quarto {
    private String computador;
    private String documentos;
    public boolean aberto;

    public Quarto(String computador, String documentos){
        this.computador = computador;
        this.documentos = documentos;
    }

    public String getComputador(){
        return this.computador;
    }

    public String getDocumentos(){
        return this.documentos;
    }

    public void abrir(){
        this.aberto = true;
    }
    public void fechar(){
        this.aberto = false;
    }

}
