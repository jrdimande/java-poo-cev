package Aula_04.exercise_2;

public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo = 0;

    // Metodos especiais
    public ContaBancaria(String titular, int numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public String getTitular(){
        return this.titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }

    public int getNumeroConta(){
        return this.numeroConta;
    }
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    // Metodo para exibir informacoes da conta
    public void exibirInformacoes(){
        System.out.println("Titular: " + getTitular());
        System.out.println("Numero da conta: " + getNumeroConta());
        System.out.println("Saldo: " + getSaldo());
    }

    // Metodo para validar o valor do deposito
    private boolean validar_deposito(double valor){
        if (valor >= 100){
            return true;
        }else {
            return false;
        }
    }

    // Metodo para depositar valor na conta
    public void depositar(double valor){
        if (validar_deposito(valor) == true){
            this.saldo += valor;
            System.out.println("Depositou  " + valor + "MZN Na conta: " + getNumeroConta()  );
        }else {
            System.out.println("Valor Invalido, Deposite (valor >= 100)");
        }

    }

    // Metodo para fazer levantamento
    public void levantar(double levantar){
        if (saldo < this.saldo){
            this.saldo -= saldo;
            System.out.println("Efectuou levantamento de " + levantar + "MZN");
        }else {
            System.out.println("Saldo insuficiente!");
        }

    }




}
