package Aula_05.example_1.example_1;

public class TesteBanco {
    public static void main(String[] args){

        // Jubileu
        ContaBanco cb1 = new ContaBanco();
        cb1.setNumeroConta(1928344);
        cb1.setTitular("Jubileu");
        cb1.abrirConta("cc");
        cb1.exibirInformacoes();
        cb1.depositar(100);
        cb1.exibirInformacoes();
        cb1.depositar(50);
        cb1.exibirInformacoes();


        cb1.exibirInformacoes();


        // Cleusa
        ContaBanco cb2 = new ContaBanco();
        cb2.setNumeroConta(1234566);
        cb2.setTitular("Cleusa");
        cb2.abrirConta("cp");
        cb2.exibirInformacoes();
        cb2.depositar(50);
        cb2.exibirInformacoes();
        cb2.sacar(200);
        cb2.exibirInformacoes();
        cb2.fecharConta();
        cb2.depositar(200);
        cb2.sacar(200);
        cb2.fecharConta();
        cb2.depositar(100);

        cb2.exibirInformacoes();























    }
}
