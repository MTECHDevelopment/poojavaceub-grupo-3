import java.util.ArrayList;

public class Funcionario{
    private int id;
    private String nome;
    private double salario;
    private String matricula;
    private ProdutoRepository repo = new ProdutoRepository();

    public Funcionario(int id, String nome, double salario, String matricula){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.matricula = matricula;
    }

    public int getId() {
        return id;
    }

    public String getNome(){
        return nome;
    }
    public double getSalario(){
        return salario;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setId(int novoId) {
        this.id = novoId;
    }

    public void setSalario(double novoSalario){
        this.salario = novoSalario;

    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public void setMatricula(String novaMatricula){
        this.matricula = novaMatricula;
    }

    public void cadastrarProduto(int id, String nome, double preco, int quantidadeEmEstoque){
        Produto p = new Produto(id, nome, preco, quantidadeEmEstoque);
        repo.adicionarProduto(p);
        p.exibirInfo();
        System.out.println(repo.listarProdutos());
    }

    public void consultarProduto(String nome) {
        Produto p = repo.buscarPorNomeProduto(nome);
        System.out.printf("Dados do produto %s %d", p.getNome(), p.getPreco());
    }
}