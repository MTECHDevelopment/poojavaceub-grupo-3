import java.util.Scanner;

public class Loja {
    
    public static void main(String[] args) {

      Scanner entrada = new Scanner(System.in);  

      System.out.println("Qual seu nome? ");
      String nome = entrada.nextLine();        

      System.out.println("Qual seu Salario? ");
      String salario = entrada.nextLine();    

      Funcionario func = new Funcionario(nome,Double.parseDouble(salario));
      
      System.out.println("Deseja cadastrar produto?");
      String resposta = entrada.nextLine();    
         
      while (resposta.equals("sim")){
        System.out.println("Qual produto? ");
        String produto = entrada.nextLine();        
        System.out.println("Qual preço? ");
        String preco = entrada.nextLine();        
        func.cadastrarProduto(produto, Double.parseDouble(preco));
        
        System.out.println("Deseja cadastrar mais um? ");
        String nomeproduto = entrada.nextLine();    
        func.consultarProduto(nomeproduto);
        
      }


    }
    


}