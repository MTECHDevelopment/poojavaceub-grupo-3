public interface Contrato {
    // Atributo constante (por exemplo, o prazo padrão)
    int PRAZO_PADRAO = 30;

    // Métodos que toda classe que "assina contrato" de
    void assinarDocumento(String doc);
    void cancelarContrato(String motivo);
    boolean verificarValidade();
}