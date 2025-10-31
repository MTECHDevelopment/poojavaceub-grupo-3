public class Moto extends Veiculo implements Locavel{
    private String cilindradas;

    @Override 
    public Double calcularDiariaComDesconto() {
        this.valorDiaria = valorDiaria - (valorDiaria * 0.1);
        System.out.println("Você conseguiu 10% de desconto!");
    }

    @Override
    public void iniciarLocacao() {
        if (verificarDisponibilidade()) {
            this.status = StatusVeiculo.LOCADO;
            System.out.println("Locação iniciada. Status alterado para LOCADO.");
        } else {
            System.out.println("Veículo não disponível para locação.");
        }
    }

    @Override
    public void encerrarLocacao() {
        if (this.status == StatusVeiculo.LOCADO) {
            this.status = StatusVeiculo.DISPONIVEL
            System.out.println("Locação encerrada. Status alterado para DISPONIVEL.");
        } else {
            System.out.println("O veículo não estava locado");
        }
    }

    @Override
    public boolean verificarDisponibilidade() {
        return this.status == StatusVeiculo.DISPONIVEL;
        if (this.status == StatusVeiculo.DISPONIVEL) {
            System.out.println("O veículo está disponível");
        } else {
            System.out.println("O veículo está indisponível");
        }
    }
}