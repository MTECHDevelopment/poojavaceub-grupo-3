public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisisca("João", "1234");
        PessoaJuridica pj = new PessoaJuridica("Lo", "123");

        System.out.println("Nome da Pessoa " + pf.getNome() );

        pj assinarDocumento("Acordo Comercial");
    }
}