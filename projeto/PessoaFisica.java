public class PessoaFisica extends Pessoa implements Contrato {
    private String cpf;
    private boolean contratoAtivo = false;

    public PessoaFisica(String nome, String telefone, String cpf) {
        super(nome, telefone);
        this.cpf = cpf;
    }

    @Override
    public String getIdentificacao() {
        return cpf;
    }

    
}