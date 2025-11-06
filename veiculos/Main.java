public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("ABC1234", "Toyota", "Corolla", 150.000, StatusVeiculo.DISPONIVEL, "5");
        Moto moto = new Moto("XYZ5678", "Honda", "CB500", 100.000, StatusVeiculo.DISPONIVEL, 180);
        Caminhao caminhao = new Caminhao("LMN9101", "Volvo", "FH16", 300.000, StatusVeiculo.DISPONIVEL, "20000kg");

        System.out.println("Carro:");
        carro.exibirResumo();
        carro.calcularDiariaComDesconto();
        carro.iniciarLocacao();
        carro.encerrarLocacao();
        System.out.println();

        System.out.println("Moto:");
        moto.exibirResumo();
        moto.calcularDiariaComDesconto();
        moto.iniciarLocacao();
        moto.encerrarLocacao();
        System.out.println();

        System.out.println("Caminhão:");
        caminhao.exibirResumo();
        caminhao.calcularDiariaComDesconto();
        caminhao.iniciarLocacao();
        caminhao.encerrarLocacao();
    }
}