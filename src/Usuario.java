public class Usuario {
    // atributos da classe 
    private String login;
    private String senha;
    private String email;

    // contrutor da classe
    // função construtora
    public Usuario(String login, String abacaxi, String email) {
        this.login = login;
        this.senha = abacaxi;
        this.email = email;
    }

    public void mudarSenha(String senhaNova){
        this.senha = senhaNova;
    }
    public String getSenha(){
        return this.senha;
    }
}