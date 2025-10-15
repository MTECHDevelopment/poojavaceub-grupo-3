import java.util.Scanner;
import java.util.ArrayList;

public class Loja {
    
    public static void main(String[] args) {

      Scanner entrada = new Scanner(System.in);
      
      // Instanciar os repositórios
      FuncionarioRepository funcionarioRepo = new FuncionarioRepository();
      ProdutoRepository produtoRepo = new ProdutoRepository();
      ClienteRepository clienteRepo = new ClienteRepository();

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
          entrada.nextLine(); // Limpar buffer

          switch (opcaoMenuFuncionario) {
            case 1:
              // Cadastrar Funcionário
              System.out.println("Deseja cadastrar um funcionário? (sim/não)");
              String respostaFuncionario = entrada.nextLine();

              while (respostaFuncionario.equalsIgnoreCase("sim") || respostaFuncionario.equalsIgnoreCase("s")) {
                System.out.println("Qual o id do funcionário? ");
                int idFuncionario = entrada.nextInt();
                entrada.nextLine(); // Limpar buffer
                System.out.println("Qual o nome do funcionário? ");
                String nomeFuncionario = entrada.nextLine();        
                System.out.println("Qual o salário do funcionário? ");
                double salarioFuncionario = entrada.nextDouble();
                entrada.nextLine(); // Limpar buffer
                System.out.println("Qual a matrícula do funcionário? ");
                String matriculaFuncionario = entrada.nextLine();

                Funcionario f = new Funcionario(idFuncionario, nomeFuncionario, salarioFuncionario, matriculaFuncionario);
                funcionarioRepo.adicionarFuncionario(f);

                System.out.println("Deseja cadastrar mais um? (sim/não)");
                respostaFuncionario = entrada.nextLine();
              }
              break;
            case 2:
              // Listar Funcionário
              ArrayList<Funcionario> funcionarios = funcionarioRepo.listarFuncionarios();
              if (funcionarios.isEmpty()) {
                System.out.println("Nenhum funcionário cadastrado.");
              } else {
                System.out.println("\n=== LISTA DE FUNCIONÁRIOS ===");
                for (Funcionario func : funcionarios) {
                  System.out.printf("ID: %d | Nome: %s | Salário: %.2f | Matrícula: %s\n", 
                    func.getId(), func.getNome(), func.getSalario(), func.getMatricula());
                }
              }
              break;
            case 3:
              // Buscar Funcionário por id
              System.out.println("Digite o ID do funcionário: ");
              int idBusca = entrada.nextInt();
              entrada.nextLine(); // Limpar buffer
              Funcionario funcBuscado = funcionarioRepo.buscarPorIdFuncionario(idBusca);
              if (funcBuscado != null) {
                System.out.printf("Funcionário encontrado: ID: %d | Nome: %s | Salário: %.2f | Matrícula: %s\n", 
                  funcBuscado.getId(), funcBuscado.getNome(), funcBuscado.getSalario(), funcBuscado.getMatricula());
              } else {
                System.out.println("Funcionário não encontrado.");
              }
              break;
            case 4:
              // Buscar Funcionário por nome
              System.out.println("Digite o nome do funcionário: ");
              String nomeBusca = entrada.nextLine();
              Funcionario funcBuscadoNome = funcionarioRepo.buscarPorNomeFuncionario(nomeBusca);
              if (funcBuscadoNome != null) {
                System.out.printf("Funcionário encontrado: ID: %d | Nome: %s | Salário: %.2f | Matrícula: %s\n", 
                  funcBuscadoNome.getId(), funcBuscadoNome.getNome(), funcBuscadoNome.getSalario(), funcBuscadoNome.getMatricula());
              } else {
                System.out.println("Funcionário não encontrado.");
              }
              break;
            case 5:
              // Atualizar Funcionário
              System.out.println("Digite o ID do funcionário a atualizar: ");
              int idAtualizar = entrada.nextInt();
              entrada.nextLine(); // Limpar buffer
              System.out.println("Digite o novo nome: ");
              String novoNome = entrada.nextLine();
              System.out.println("Digite o novo salário: ");
              double novoSalario = entrada.nextDouble();
              entrada.nextLine(); // Limpar buffer
              
              if (funcionarioRepo.atualizarPorIdFuncionario(idAtualizar, novoNome, novoSalario)) {
                System.out.println("Funcionário atualizado com sucesso.");
              } else {
                System.out.println("Funcionário não encontrado.");
              }
              break;
            case 6:
              // Excluir Funcionário por id
              System.out.println("Digite o ID do funcionário a excluir: ");
              int idExcluir = entrada.nextInt();
              entrada.nextLine(); // Limpar buffer
              
              if (funcionarioRepo.removerPorIdFuncionario(idExcluir)) {
                System.out.println("Funcionário excluído com sucesso.");
              } else {
                System.out.println("Funcionário não encontrado.");
              }
              break;
            case 7:
              // Excluir Funcionário por nome
              System.out.println("Digite o nome do funcionário a excluir: ");
              String nomeExcluir = entrada.nextLine();
              
              if (funcionarioRepo.removerPorNomeFuncionario(nomeExcluir)) {
                System.out.println("Funcionário excluído com sucesso.");
              } else {
                System.out.println("Funcionário não encontrado.");
              }
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
          entrada.nextLine(); // Limpar buffer

          switch (opcaoMenuProduto) {
            case 1:
              // Listar Produto
              ArrayList<Produto> produtos = produtoRepo.listarProdutos();
              if (produtos.isEmpty()) {
                System.out.println("Nenhum produto cadastrado.");
              } else {
                System.out.println("\n=== LISTA DE PRODUTOS ===");
                for (Produto prod : produtos) {
                  System.out.printf("ID: %d | Nome: %s | Preço: %.2f | Estoque: %d\n", 
                    prod.getId(), prod.getNome(), prod.getPreco(), prod.getQuantidadeEmEstoque());
                }
              }
              break;
            case 2:
              // Buscar Produto por id
              System.out.println("Digite o ID do produto: ");
              int idBuscaProd = entrada.nextInt();
              entrada.nextLine(); // Limpar buffer
              Produto prodBuscado = produtoRepo.buscarPorIdProduto(idBuscaProd);
              if (prodBuscado != null) {
                System.out.printf("Produto encontrado: ID: %d | Nome: %s | Preço: %.2f | Estoque: %d\n", 
                  prodBuscado.getId(), prodBuscado.getNome(), prodBuscado.getPreco(), prodBuscado.getQuantidadeEmEstoque());
              } else {
                System.out.println("Produto não encontrado.");
              }
              break;
            case 3:
              // Buscar Produto por nome
              System.out.println("Digite o nome do produto: ");
              String nomeBuscaProd = entrada.nextLine();
              Produto prodBuscadoNome = produtoRepo.buscarPorNomeProduto(nomeBuscaProd);
              if (prodBuscadoNome != null) {
                System.out.printf("Produto encontrado: ID: %d | Nome: %s | Preço: %.2f | Estoque: %d\n", 
                  prodBuscadoNome.getId(), prodBuscadoNome.getNome(), prodBuscadoNome.getPreco(), prodBuscadoNome.getQuantidadeEmEstoque());
              } else {
                System.out.println("Produto não encontrado.");
              }
              break;
            case 4:
              // Atualizar Produto
              System.out.println("Digite o ID do produto a atualizar: ");
              int idAtualizarProd = entrada.nextInt();
              entrada.nextLine(); // Limpar buffer
              System.out.println("Digite o novo nome: ");
              String novoNomeProd = entrada.nextLine();
              System.out.println("Digite o novo preço: ");
              double novoPrecoProd = entrada.nextDouble();
              entrada.nextLine(); // Limpar buffer
              
              if (produtoRepo.atualizarPorIdProduto(idAtualizarProd, novoNomeProd, novoPrecoProd)) {
                System.out.println("Produto atualizado com sucesso.");
              } else {
                System.out.println("Produto não encontrado.");
              }
              break;
            case 5:
              // Excluir Produto por id
              System.out.println("Digite o ID do produto a excluir: ");
              int idExcluirProd = entrada.nextInt();
              entrada.nextLine(); // Limpar buffer
              
              if (produtoRepo.removerPorIdProduto(idExcluirProd)) {
                System.out.println("Produto excluído com sucesso.");
              } else {
                System.out.println("Produto não encontrado.");
              }
              break;
            case 6:
              // Excluir Produto por nome
              System.out.println("Digite o nome do produto a excluir: ");
              String nomeExcluirProd = entrada.nextLine();
              
              if (produtoRepo.removerPorNomeProduto(nomeExcluirProd)) {
                System.out.println("Produto excluído com sucesso.");
              } else {
                System.out.println("Produto não encontrado.");
              }
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
          entrada.nextLine(); // Limpar buffer

          switch (opcaoMenuCliente) {
            case 1:
              // Listar Cliente
              ArrayList<Cliente> clientes = clienteRepo.listar();
              if (clientes.isEmpty()) {
                System.out.println("Nenhum cliente cadastrado.");
              } else {
                System.out.println("\n=== LISTA DE CLIENTES ===");
                for (Cliente cli : clientes) {
                  System.out.printf("ID: %d | Nome: %s | Telefone: %s | Email: %s\n", 
                    cli.getId(), cli.getNome(), cli.getTelefone(), cli.getEmail());
                }
              }
              break;
            case 2:
              // Buscar Cliente por id
              System.out.println("Digite o ID do cliente: ");
              int idBuscaCli = entrada.nextInt();
              entrada.nextLine(); // Limpar buffer
              Cliente cliBuscado = clienteRepo.buscarPorId(idBuscaCli);
              if (cliBuscado != null) {
                System.out.printf("Cliente encontrado: ID: %d | Nome: %s | Telefone: %s | Email: %s\n", 
                  cliBuscado.getId(), cliBuscado.getNome(), cliBuscado.getTelefone(), cliBuscado.getEmail());
              } else {
                System.out.println("Cliente não encontrado.");
              }
              break;
            case 3:
              // Buscar Cliente por nome
              System.out.println("Digite o nome do cliente: ");
              String nomeBuscaCli = entrada.nextLine();
              ArrayList<Cliente> todosClientes = clienteRepo.listar();
              Cliente clienteEncontrado = null;
              for (Cliente c : todosClientes) {
                if (c.getNome().equalsIgnoreCase(nomeBuscaCli)) {
                  clienteEncontrado = c;
                  break;
                }
              }
              if (clienteEncontrado != null) {
                System.out.printf("Cliente encontrado: ID: %d | Nome: %s | Telefone: %s | Email: %s\n", 
                  clienteEncontrado.getId(), clienteEncontrado.getNome(), clienteEncontrado.getTelefone(), clienteEncontrado.getEmail());
              } else {
                System.out.println("Cliente não encontrado.");
              }
              break;
            case 4:
              // Atualizar Cliente
              System.out.println("Digite o ID do cliente a atualizar: ");
              int idAtualizarCli = entrada.nextInt();
              entrada.nextLine(); // Limpar buffer
              System.out.println("Digite o novo nome: ");
              String novoNomeCli = entrada.nextLine();
              System.out.println("Digite o novo telefone: ");
              String novoTelefoneCli = entrada.nextLine();
              System.out.println("Digite o novo email: ");
              String novoEmailCli = entrada.nextLine();
              
              if (clienteRepo.atualizar(idAtualizarCli, novoNomeCli, novoTelefoneCli, novoEmailCli)) {
                System.out.println("Cliente atualizado com sucesso.");
              } else {
                System.out.println("Cliente não encontrado.");
              }
              break;
            case 5:
              // Excluir Cliente por id
              System.out.println("Digite o ID do cliente a excluir: ");
              int idExcluirCli = entrada.nextInt();
              entrada.nextLine(); // Limpar buffer
              
              if (clienteRepo.removerPorId(idExcluirCli)) {
                System.out.println("Cliente excluído com sucesso.");
              } else {
                System.out.println("Cliente não encontrado.");
              }
              break;
            case 6:
              // Excluir Cliente por nome
              System.out.println("Digite o nome do cliente a excluir: ");
              String nomeExcluirCli = entrada.nextLine();
              ArrayList<Cliente> clientesParaExcluir = clienteRepo.listar();
              boolean removido = false;
              for (int i = 0; i < clientesParaExcluir.size(); i++) {
                if (clientesParaExcluir.get(i).getNome().equalsIgnoreCase(nomeExcluirCli)) {
                  clienteRepo.removerPorId(clientesParaExcluir.get(i).getId());
                  System.out.println("Cliente excluído com sucesso.");
                  removido = true;
                  break;
                }
              }
              if (!removido) {
                System.out.println("Cliente não encontrado.");
              }
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
          entrada.nextLine(); // Limpar buffer

          switch (opcaoMenuCadastroCliente) {
            case 1:
              // Cadastrar Cliente
              System.out.println("Deseja cadastrar um cliente? (sim/não)");
              String respostaCliente = entrada.nextLine();

              while (respostaCliente.equalsIgnoreCase("sim") || respostaCliente.equalsIgnoreCase("s")) {
                System.out.println("Qual o nome do cliente? ");
                String nomeCliente = entrada.nextLine();        
                System.out.println("Qual o telefone do cliente? ");
                String telefoneCliente = entrada.nextLine();
                System.out.println("Qual o email do cliente? ");
                String emailCliente = entrada.nextLine();

                Cliente c = new Cliente(0, nomeCliente, telefoneCliente, emailCliente);
                Cliente clienteCadastrado = clienteRepo.adicionar(c);
                System.out.printf("Cliente %s cadastrado com sucesso com ID: %d\n", clienteCadastrado.getNome(), clienteCadastrado.getId());

                System.out.println("Deseja cadastrar mais um? (sim/não)");
                respostaCliente = entrada.nextLine();
              }
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
          entrada.nextLine(); // Limpar buffer

          switch (opcaoMenuCadastroProduto) {
            case 1:
              // Cadastrar Produto
              System.out.println("Deseja cadastrar produto? (sim/não)");
              String respostaProduto = entrada.nextLine();

              while (respostaProduto.equalsIgnoreCase("sim") || respostaProduto.equalsIgnoreCase("s")) {
                System.out.println("Qual id do produto? ");
                int idProduto = entrada.nextInt();
                entrada.nextLine(); // Limpar buffer
                System.out.println("Qual o nome do produto? ");
                String nomeProduto = entrada.nextLine();        
                System.out.println("Qual o preço? ");
                double precoProduto = entrada.nextDouble();
                entrada.nextLine(); // Limpar buffer
                System.out.println("Qual a quantidade em estoque? ");
                int quantidadeEmEstoque = entrada.nextInt();
                entrada.nextLine(); // Limpar buffer
                
                Produto p = new Produto(idProduto, nomeProduto, precoProduto, quantidadeEmEstoque);
                produtoRepo.adicionarProduto(p);
                
                System.out.println("Deseja cadastrar mais um? (sim/não)");
                respostaProduto = entrada.nextLine();
              }
              break;
            case 0:
              // Voltar ao menu principal
              break;
          }

          break;
        case 0:
          // sair 
          System.out.println("Saindo do sistema...");
          break;
        default:
          System.out.println("Opção digitada inválida");
          break;
        } 
      } while (opcaoPrincipal != 0);

      entrada.close();
    }
}