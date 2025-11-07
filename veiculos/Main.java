public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("ABC1234", "Toyota", "Corolla", 400.0 , StatusVeiculo.DISPONIVEL, "5");
        Moto moto = new Moto("XYZ5678", "Honda", "CB500", 150.0 , StatusVeiculo.DISPONIVEL, 471);
        Caminhao caminhao = new Caminhao("LMN9101", "Volvo", "FH16", 1500.0, StatusVeiculo.DISPONIVEL, "10000kg");

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