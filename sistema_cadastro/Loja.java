import java.util.Scanner;

public class Loja {
    
    public static void main(String[] args) {


      Scanner entrada = new Scanner(System.in);

      int opcaoPrincipal;

      do{
        // MENU PRINCIPAL
        System.out.println("\n=========== MENU PRINCIPAL ===========");
        System.out.println("O que você gostaria de fazer? ");
        System.out.println("1) Gerenciar Funcionários");
        System.out.println("2) Gerenciar Produtos");
        System.out.println("3) Gerenciar Clientes");
        System.out.println("4) Cadastrar Cliente");
        System.out.println("5) Cadastrar Produto");
        System.out.println("0) Sair");

        System.out.println("Digite a sua opção: ");
        opcaoPrincipal = entrada.nextInt();

        switch (opcaoPrincipal) {
        case 1:
          // gerenciar funcionarios
          break;
        case 2:
          // gerenciar produtos
          break;
        case 3:
          // gerenciar clientes
          break;
        case 4:
          // cadastrar cliente
          break;
        case 5:
          // cadastrar produto
          break;
        case 0:
          // sair 
          break;
        default:
          System.out.println("Opção digitada inválida");
          break;
        } 
      } while (opcaoPrincipal != 0);


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