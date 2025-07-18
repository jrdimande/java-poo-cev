package Aula_06.encapsulamento.exercise_2;

public class main {
    public static void main(String[] args){
        Usuario usuario;

        usuario = new UsuarioAdmin("ian", "Admin");
        usuario.login("ian", "1234");
    }
}
