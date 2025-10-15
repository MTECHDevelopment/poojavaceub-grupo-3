public class Produto{
    private int id;
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(int id, String nome, double preco, int quantidadeEmEstoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getId() {
        return id;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidadeEmEstoque(){
        return quantidadeEmEstoque;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque){
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void exibirInfo(){
        System.out.printf("Produto %s, cadastrado.\n", this.nome);
        System.out.printf("Preço: %.2f\n", this.preco);
        System.out.printf("Quantidade em estoque: %d\n", this.quantidadeEmEstoque);
    }


}