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

    // Metodo para criar conta
    public void criarConta(String nome, int numero){
        setNome(nome);
        setNumero(numero);
        setStatus(true);
        System.out.println("Conta criada com sucesso");
        getInfo();

    }

    // Metodo para desativar conta
    public void desativarConta(){
        if (getSaldo() == 0){
            setStatus(false);
        }else {
            System.out.println("Nao pode desativar a conta, saldo > 0");
        }

    }

    // Metodo para deposito
     public void depositar(double valor){
        if (this.getStatus() == true){
            if (valor > 0){
                setSaldo(this.saldo += valor);
                System.out.println("Valor depositado com sucesso: +"+valor + "MZN");
            }else {
                System.out.println("Valor invalido! tente novamente");
            }
        }else {
            System.out.println("Conta Mpesa desativada");
        }

     }

     // Metodo para levantamento
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

     // Metodo para transferir dinheiro
     public void transferir(Mpesa conta, double valor){
        if (getSaldo() >= valor && valor > 0 && conta.getStatus() == true){
            this.setSaldo(this.getSaldo() - valor);
            conta.setSaldo(conta.getSaldo() + valor);
        }else {
            System.out.println("Ocorreu um erro! tente novamente!");
        }

     }

     // Metodo para exibir informacoes da conta
     public void getInfo(){
         System.out.println("------------------------------------------------------------------");
         System.out.println("Nome: " + getNome());
         System.out.println("Numero: " +  getNumero());
         System.out.println("Saldo: " + getSaldo());
     }





}
