import java.util.ArrayList;
import java.util.List;

public abstract class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private Double valorDiaria;
    private StatusVeiculo status;

    public Veiculo(String placa, String marca, String modelo, Double valorDiaria, StatusVeiculo status){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
        this.status = StatusVeiculo.DISPONIVEL;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Double getValorDiaria() {
        return valorDiaria;
    }

    public StatusVeiculo getStatus() {
        return status;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public void setStatus(StatusVeiculo status) {
        this.status = status;
    }

    abstract Double calcularDiariaComDesconto();

    public void exibirResumo() {
        System.out.println("Dados do veículo: \n" + "Placa - " + getPlaca() + "\nMarca - " + getMarca() + "\nModelo - " + getModelo() + "\nValor diária - " + getValorDiaria() + "\nStatus do veículo - " + getStatus());
    }

}