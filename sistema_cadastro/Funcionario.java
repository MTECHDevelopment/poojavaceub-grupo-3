import java.util.ArrayList;

public class Funcionario{
    private int id;
    private String nome;
    private double salario;
    private String matricula;
    private ProdutoRepository repo = new ProdutoRepository();

    public Funcionario(String x, double y){
        this.nome = x;
        this.salario = y;
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

    public void setId(int id) {
        this.id = novoId;
    }

    public void setSalario(double novoSalario){
        this.salario = novoSalario;

    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public void cadastrarProduto(String nome, double preco){
        Produto p = new Produto(nome, preco);
        repo.adicionar(p);
        p.exibirInfo();
        System.out.println(repo.listar());
    }

    public void consultarProduto(String nome) {
        Produto p = repo.buscarPorNome(nome);
        System.out.printf("Dados do produto %s %d", p.getNome(), p.getPreco());
    }



}