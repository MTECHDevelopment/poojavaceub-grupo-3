public class Moto extends Veiculo implements Locavel{
    private String cilindradas;

    public Moto(String placa, String marca, String modelo, Double valorDiaria, StatusVeiculo status, String cilindradas){
        super(placa, marca, modelo, valorDiaria, status);
        this.cilindradas = cilindradas;
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String nCilindradas) {
        this.cilindradas = nCilindradas;
    }

    @Override 
    public Double calcularDiariaComDesconto() {
        System.out.println("Parabéns, agora o veículo custa: " + getValorDiaria() * 0.90);
        System.out.println("Você conseguiu 10% de desconto!");
        return getValorDiaria() * 0.90;
    }

    @Override
    public void iniciarLocacao() {
        if (verificarDisponibilidade()) {
            setStatus(StatusVeiculo.LOCADO);
            System.out.println("Locação iniciada. Status alterado para LOCADO.");
        } else {
            System.out.println("Veículo não disponível para locação.");
        }
    }

    @Override
    public void encerrarLocacao() {
        if (getStatus() == StatusVeiculo.LOCADO) {
            setStatus(StatusVeiculo.DISPONIVEL);
            System.out.println("Locação encerrada. Status alterado para DISPONIVEL.");
        } else {
            System.out.println("O veículo não estava locado");
        }
    }

    @Override
    public boolean verificarDisponibilidade() {
        if (getStatus() == StatusVeiculo.DISPONIVEL) {
            System.out.println("O veículo está disponível");
            return true;
        } else {
            System.out.println("O veículo está indisponível");
            return false;
        }
    }
}