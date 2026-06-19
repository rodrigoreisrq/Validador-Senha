package ValidadorDeSenha;

public class ValidadorSenha {
    private String senha;

    public String digitarSenha(String senha) {
        if (senha.isEmpty()) {
            return "Digite sua senha.";

        }

        if (senha.length() < 8) {
            return "A senha deve conter 8 caracteres.";
        }
        if (senha.equals(" ")) {
            return "Senha não deve conter espaços";
        }
        this.senha = senha;

        boolean encontrouMaiusculo = false;
        for (char caractereMaiusculo : senha.toCharArray()) {
            if (Character.isUpperCase(caractereMaiusculo)) {
                encontrouMaiusculo = true;
                break;
            }

        }
        if (encontrouMaiusculo == false) {
            return "A senha deve conter um caractere maiúsculo";
        }
        this.senha = senha;

        //this.senha = senha;
        boolean encontrouMinusculo = false;
        for (char caractereMinusculo : senha.toCharArray()) {
            if (Character.isLowerCase(caractereMinusculo)) {
                encontrouMinusculo = true;
                break;
            }
        }
        if (encontrouMinusculo == false) {
            return "A senha deve conter um caractere minusculo";
        }
        this.senha = senha;

        boolean encontrouNumero = false;
        for(int numero : senha.toCharArray()){
            if(Character.isDigit(numero)){
                encontrouNumero = true;
                break;
            }
        }
        if(encontrouNumero != true){
            return "A senha deve conter um número";
        }
        return this.senha;
    }


    public String confirmacaoDeSenha(String senhaConfirmacao) {

        if (!senhaConfirmacao.equals(senha)) {
            return "A confirmação de senha está diferente da senha";
        } else {
            return senha;
        }

    }



}
