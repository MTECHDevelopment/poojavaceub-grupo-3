public class PessoaJuridica extends Pessoa implements Contrato {
    private String cnpj;
    private boolean contratoAtivo = false;

    public PessoaJuridica(String nome, String telefone, String cnpj) {
        super(nome, telefone);
        this.cnpj = cnpj;
    }

    @Override
    public String getIdentificacao() { 
        return cnpj;
    }

    @Override
    public void assinarDocumennto(String doc) {
        contratoAtivo = true;
        System.out.println(nome + " (CNPJ: " + cnpj + "assinou" + assinarDocumento() + 
            " - Prazo: " + PRAZO_PADRAO + " dias");
    }

    @Override
    public void cancelarContrato(String motivo) {
        contratoAtivo = false;
        System.out.println("Contrato de " + nome + " ca");

    }
}