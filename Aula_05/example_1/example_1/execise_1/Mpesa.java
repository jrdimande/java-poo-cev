package Aula_05.example_1.example_1.execise_1;

public class Mpesa {
    private String nome;
    private int numero;
    private double saldo;
    private boolean status;

    // Metodos especiais
    public Mpesa(){
        this.status = false;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero = numero;

    }

    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double valor){
        this.saldo = valor;
    }

    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }

    // Metodos especificos
    public void criarConta(String nome, int numero){
        setNome(nome);
        setNumero(numero);
        setStatus(true);

    }

    public void desativarConta(){
        if (getSaldo() == 0){
            setStatus(false);
        }else {
            System.out.println("Saldo maior que zero(0)");
        }

    }


     public void depositar(double valor){
        if (this.getStatus() == true){
            if (valor > 0){
                setSaldo(this.saldo += valor);
                System.out.println("Valor depositado com sucesso");
            }else {
                System.out.println("Valor invalido! tente novamente");
            }
        }else {
            System.out.println("Conta Mpesa desativada");
        }

     }

     public void levantar(double valor){
         if (this.getStatus() == true){
             if (valor > 0){
                 setSaldo(this.saldo -= valor);
             }else {
                 System.out.println("Valor invalido! tente novamente");
             }
         }else {
             System.out.println("Conta Mpesa desativada");
         }

     }



}
