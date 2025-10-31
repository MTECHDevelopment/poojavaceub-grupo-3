public interface Locavel {
    Double TAXA_SEGURO = 5.0;

    // void iniciarLocacao() – altera o status para “locado”.
    void iniciarLocacao();

    // void encerrarLocacao() – altera o status para “disponível”.
    void encerrarLocacao();

    // boolean verificarDisponibilidade() – retorna se o veículo está disponível.
    boolean verificarDisponibilidade();

}