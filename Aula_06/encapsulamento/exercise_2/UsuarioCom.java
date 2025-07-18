package Aula_06.encapsulamento.exercise_2;

public class UsuarioCom implements Usuario{
    private String nome;
    private String senha;
    private String nivelAcesso;

    public UsuarioCom(String nome, String nivelAcesso) {
        this.nome = nome;
        this.senha = "1234";
        this.nivelAcesso = "Comum";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public void login(String usuario, String senha) {

        if (this.nome.equals(usuario) && this.senha.equals(senha)){
            System.out.printf("Acesso Liberado\nNivel Acesso: %s", this.nivelAcesso);
        }

    }

    @Override
    public  void logout(){
        System.out.println("Saiu da conta");
    }
}
