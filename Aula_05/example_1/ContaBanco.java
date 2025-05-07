package Aula_05.example_1;

public class ContaBanco {
    // Atibutos
    public int numeroConta;
    protected String tipo;
    private String titular;
    private double saldo;
    private boolean status;

    // Metodos especiais
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }
    public int getNumeroConta(){
        return this.numeroConta;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }
    public String getTitular(){
        return this.titular;
    }

    public void setSaldo(double valor){
        this.saldo = valor;
    }
    public double getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean status){
        this.status = status;
    }
    public boolean getStatus(){
        return this.status;
    }

    // Metodos especificos
    public void abrirConta(String tipo){
        setTipo(tipo);
        setStatus(true);

        // Se a conta for corrente adiciona 50$ se !corrente adiciona 150$
        if (tipo == "cc"){
            this.saldo = 50;
        }else {
            this.saldo = 150;
        }

    }
    public void fecharConta(){
        if (getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        }else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }


    }
    public void depositar(double valor){
        if (this.getStatus() == true){
            this.setSaldo(this.getSaldo() + valor);
        }else {
            System.out.println("Impossivel depositar em uma conta fechada");
        }

    }
    public void sacar(double valor){
        if (this.getStatus() == true){
            if (this.getSaldo() >= valor){
                setSaldo(this.getSaldo() - valor);
            }else {
                System.out.println("Saldo insuficiente");
            }
        }else {
            System.out.println("Impossivel sacar");
        }

    }

    public void pagarMensalidade(){
        int v;

        if (this.getTipo() == "cc"){
            v = 12;
        }else {
            v = 20;
        }

        if (this.getStatus() == true){
            setSaldo(getSaldo() - v);
        }else {
            System.out.println("Impossivel pagar mensalidade");
        }
    }

    public void exibirInformacoes(){
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Titular: " + getTitular());
        System.out.println("Numero da conta: " + getNumeroConta());
        System.out.println("saldo: " + getSaldo() + "MZN");
        System.out.println("Status: " +  getStatus());
        System.out.println("------------------------------------------------------------------------");
    }


}
