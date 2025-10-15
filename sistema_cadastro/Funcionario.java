public class Funcionario{
    private int id;
    private String nome;
    private double salario;
    private String matricula;

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
}