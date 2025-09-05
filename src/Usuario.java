public class Usuario {
    // atributos da classe 
    private String login;
    private String senha;
    private String email;

    // contrutor da classe
    // função construtora
    public Usuario(String login, String abacaxi, String email) {
        this.login = login;
        if (abacaxi.length>8){
            this.senha = abacaxi;
        }
        this.email = email;
    }

    public mudarSenha(String senhaNova){
        this.senha = senhanova;
    }
    public String getSenha(){
        return this.senha
    }
}