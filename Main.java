package ValidadorDeSenha;

public class Main {
    public static void main(String[] args) {
        ValidadorSenha senha = new ValidadorSenha();
        senha.digitarSenha("abc");
        //senha.confirmacaoDeSenha("Re123459");
        System.out.println(senha.digitarSenha("Abc123459"));
        System.out.println(senha.confirmacaoDeSenha("Abc123459"));
    }
}
