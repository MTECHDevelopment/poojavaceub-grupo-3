import java.util.Scanner;

public class Loja {
    
    public static void main(String[] args) {


      Scanner entrada = new Scanner(System.in);

      int opcaoPrincipal;

      int opcaoMenuFuncionario;
      int opcaoMenuProduto;
      int opcaoMenuCliente;
      int opcaoMenuCadastroCliente;
      int opcaoMenuCadastroProduto;

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
          // SUBMENU FUNCIONÁRIOS
          System.out.println("\n=========== MENU FUNCIONÁRIOS ===========");
          System.out.println("O que você gostaria de fazer? ");
          System.out.println("1) Cadastrar Funcionário");
          System.out.println("2) Listar Funcionário");
          System.out.println("3) Buscar Funcionário por id");
          System.out.println("4) Buscar Funcionário por nome");
          System.out.println("5) Atualizar Funcionário");
          System.out.println("6) Excluir Funcionário por id");
          System.out.println("7) Excluir Funcionário por nome");
          System.out.println("0) Voltar ao menu principal");

          System.out.println("Digite a sua opção para o menu funcionário: ");
          opcaoMenuFuncionario = entrada.nextInt();

          switch (opcaoMenuFuncionario) {
            case 1:
              // Cadastrar Funcionário
              System.out.println("Qual seu id do funcionario? ");
              String idFunc = entrada.nextLine();

              System.out.println("Qual seu nome? ");
              String nome = entrada.nextLine();        

              System.out.println("Qual seu Salario? ");
              String salario = entrada.nextLine();
              
              System.out.println("Qual a sua matricula? ");
              String matricula = entrada.nextLine();

              Funcionario func = new Funcionario(Integer.parseInt(idFunc), nome, Double.parseDouble(salario), matricula);          
              break;
            case 2:
              // Listar Funcionário
              break;
            case 3:
              // Buscar Funcionário por id
              break;
            case 4:
              // Buscar Funcionário por nome
              break;
            case 5:
              // Atualizar Funcionário
              break;
            case 6:
              // Excluir Funcionário por id
              break;
            case 7:
              // Excluir Funcionário por nome
              break;
            case 0:
              // Voltar ao menu principal
              break;
          }
          break;
        case 2:
          // gerenciar produtos
          // SUBMENU produtos
          System.out.println("\n=========== MENU PRODUTOS ===========");
          System.out.println("O que você gostaria de fazer? ");
          System.out.println("1) Listar Produto");
          System.out.println("2) Buscar Produto por id");
          System.out.println("3) Buscar Produto por nome");
          System.out.println("4) Atualizar Produto");
          System.out.println("5) Excluir Produto por id");
          System.out.println("6) Excluir Produto por nome");
          System.out.println("0) Voltar ao menu principal");

          System.out.println("Digite a sua opção para o menu produtos: ");
          opcaoMenuProduto = entrada.nextInt();

          switch (opcaoMenuProduto) {
            case 1:
              // Listar Produto
              break;
            case 2:
              // Buscar Produto por id
              break;
            case 3:
              // Buscar Produto por nome
              break;
            case 4:
              // Atualizar Produto
              break;
            case 5:
              // Excluir Produto por id
              break;
            case 6:
              // Excluir Produto por nome
              break;
            case 0:
              // Voltar ao menu principal
              break;
          }

          break;
        case 3:
          // gerenciar clientes
          // SUBMENU clientes
          System.out.println("\n=========== MENU CLIENTES ===========");
          System.out.println("O que você gostaria de fazer? ");
          System.out.println("1) Listar Cliente");
          System.out.println("2) Buscar Cliente por id");
          System.out.println("3) Buscar Cliente por nome");
          System.out.println("4) Atualizar Cliente");
          System.out.println("5) Excluir Cliente por id");
          System.out.println("6) Excluir Cliente por nome");
          System.out.println("0) Voltar ao menu principal");

          System.out.println("Digite a sua opção para o menu clientes: ");
          opcaoMenuCliente = entrada.nextInt();

          switch (opcaoMenuCliente) {
            case 1:
              // Listar Cliente
              break;
            case 2:
              // Buscar Cliente por id
              break;
            case 3:
              // Buscar Cliente por nome
              break;
            case 4:
              // Atualizar Cliente
              break;
            case 5:
              // Excluir Cliente por id
              break;
            case 6:
              // Excluir Cliente por nome
              break;
            case 0:
              // Voltar ao menu principal
              break;
          }

          break;
        case 4:
          // cadastrar cliente
          // SUBMENU CADASTRO CLIENTES
          System.out.println("\n=========== MENU CADASTRO CLIENTE ===========");
          System.out.println("O que você gostaria de fazer? ");
          System.out.println("1) Cadastrar cliente");
          System.out.println("0) Voltar ao menu principal");

          System.out.println("Digite a sua opção para o menu cadastro cliente: ");
          opcaoMenuCadastroCliente = entrada.nextInt();

          switch (opcaoMenuCadastroCliente) {
            case 1:
              // Cadastrar Cliente
              break;
            case 0:
              // Voltar ao menu principal
              break;
          }

          break;
        case 5:
          // cadastrar produto
          // SUBMENU CADASTRO PRODUTOS
          System.out.println("\n=========== MENU CADASTRO PRODUTO ===========");
          System.out.println("O que você gostaria de fazer? ");
          System.out.println("1) Cadastrar produto");
          System.out.println("0) Voltar ao menu principal");

          System.out.println("Digite a sua opção para o menu cadastro produto: ");
          opcaoMenuCadastroProduto = entrada.nextInt();

          switch (opcaoMenuCadastroProduto) {
            case 1:
              // Cadastrar Produto
              System.out.println("Deseja cadastrar produto?");
              String resposta = entrada.nextLine();

              while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("SIM") || resposta.equals("s") || resposta.equals("S")) {
                System.out.println("Qual id do produto? ");
                String idProduto = entrada.nextLine(); 
                System.out.println("Qual produto? ");
                String produto = entrada.nextLine();        
                System.out.println("Qual preço? ");
                String preco = entrada.nextLine();
                System.out.println("Qual a quantidade em estoque? ");
                String quantidadeEmEstoque = entrada.nextLine();          
                func.cadastrarProduto(Integer.parseInt(idProduto), produto, Double.parseDouble(preco), Integer.parseInt(quantidadeEmEstoque));
                
                System.out.println("Deseja cadastrar mais um? ");
                String nomeproduto = entrada.nextLine();    
                func.consultarProduto(nomeproduto);
                
              }
              break;
            case 0:
              // Voltar ao menu principal
              break;
          }

          break;
        case 0:
          // sair 
          break;
        default:
          System.out.println("Opção digitada inválida");
          break;
        } 
      } while (opcaoPrincipal != 0);


    }
    


}