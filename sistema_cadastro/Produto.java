public class Produto{
    private String nome;
    private double preco;

    public Produto(String x , double y) {
        this.nome = x;
        this.preco=y;

    }
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double x){
        this.preco=x;
    }
    public void setNome(String x){
        this.nome=x;
    }

    public void exibirInfo(){
        System.out.printf("Produto %s, cadastrado.\n", this.nome);    }


}