public class Caminhao extends Veiculo implements Locavel{
    private String pesoSuportavel;

    public Caminhao(String placa, String marca, String modelo, double valorDiaria, StatusVeiculo status, String pesoSuportavel){
        super(placa, marca, modelo, valorDiaria, status);
        this.pesoSuportavel = pesoSuportavel;
    }

    public String getPesoSuportavel() {
        return pesoSuportavel;
    }

    public void setPesoSuportavel(String nPesoSuportavel) {
        this.pesoSuportavel = nPesoSuportavel;
    }

    @Override 
    public double calcularDiariaComDesconto() {
        System.out.println("O preço do veículo é de: " + getValorDiaria() * 1.15);
        return getValorDiaria() * 1.15;
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