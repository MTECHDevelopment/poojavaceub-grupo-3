import java.util.Scanner;

public class Loja {
    private static ProdutoRepository prorepo = new ProdutoRepository();
    private static FuncionarioRepository funcrepo = new FuncionarioRepository();
    private static ClienteRepository clirepo = new ClienteRepository();
    public static void main(String[] args) {


      Scanner entrada = new Scanner(System.in);

      int opcaoPrincipal;

      int opcaoMenuFuncionario;
      int opcaoMenuProduto;
      int opcaoMenuCliente;
      int opcaoMenuCadastroCliente;
      int opcaoMenuCadastroProduto;

      do {
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
            System.out.println("5) Atualizar Funcionário por id");
            System.out.println("6) Atualizar Funcionário por nome");
            System.out.println("7) Excluir Funcionário por id");
            System.out.println("8) Excluir Funcionário por nome");
            System.out.println("0) Voltar ao menu principal");

            System.out.println("Digite a sua opção para o menu funcionário: ");
            opcaoMenuFuncionario = entrada.nextInt();

            switch (opcaoMenuFuncionario) {
              case 1:
                // Cadastrar Funcionário
                System.out.println("--- CADASTRAR FUNCIONÁRIO ---");
                entrada.nextLine();
                System.out.print("Nome: ");
                String nome = entrada.nextLine();
                System.out.print("Salário: ");
                double salario = entrada.nextDouble();
                entrada.nextLine();
                System.out.print("Matrícula: ");
                String matricula = entrada.nextLine();
                Funcionario novoFunc = funcrepo.adicionar(new Funcionario(nome, salario, matricula));
                System.out.println("Funcionário cadastrado com sucesso: " + "\nNome: " + nome + "\nSalário: " + salario + "\nMatrícula: " + matricula + "\nNovoFuncionário: " + novoFunc);           
                break;
              case 2:
                // Listar Funcionário
                System.out.println("--- LISTAR OS FUNCIONÁRIOS ---");
                if (funcrepo.listarFuncionarios().isEmpty()) {
                    System.out.println("Nenhum funcionário cadastrado.");
                } else {
                    for (Funcionario f : funcrepo.listarFuncionarios()) {
                        System.out.println("ID: " + f.getId() + ", Nome: " + f.getNome() + ", Salário: " + f.getSalario() + ", Matrícula: " + f.getMatricula() + ", Funcionário: " + f);
                    }
                }
                break;
              case 3:
                // Buscar Funcionário por id
                System.out.println("--- BUSCAR FUNCIONÁRIO POR ID ---");
                System.out.print("ID: ");
                int id = entrada.nextInt();
                Funcionario f = funcrepo.buscarPorIdFuncionario(id);
                if (f != null) {
                    System.out.println("Funcionário encontrado: " + f + "\nNome: " + f.getNome() + "\nSalário: " + f.getSalario() + "\nMatrícula: " + f.getMatricula());
                } else {
                    System.out.println("ID não encontrado.");
                }
                break;
              case 4:
                // Buscar Funcionário por nome
                System.out.println("--- BUSCAR FUNCIONÁRIO POR NOME ---");
                System.out.println("Nome: ");
                entrada.nextLine();
                String nomeBusca = entrada.nextLine();
                Funcionario fNome = funcrepo.buscarPorNomeFuncionario(nomeBusca);
                if (fNome != null) {
                    System.out.println("Funcionário encontrado: " + fNome + "\nID: " + fNome.getId() + "\nSalário: " + fNome.getSalario() + "\nMatrícula: " + fNome.getMatricula());
                } else {
                    System.out.println("Nome não encontrado.");
                }
                break;
              case 5:
                // Atualizar Funcionário por id
                System.out.println("--- ATUALIZAR FUNCIONÁRIO POR ID ---");
                entrada.nextLine();
                System.out.println("ID: ");
                int idAtualizar = entrada.nextInt();
                entrada.nextLine();
                Funcionario fBusca = funcrepo.buscarPorIdFuncionario(idAtualizar);
                if (fBusca != null) {
                    System.out.println("Novo nome: ");
                    String novoNomeId = entrada.nextLine();
                    System.out.println("Novo salário: ");
                    double novoSalarioId = entrada.nextDouble();
                    boolean funcAtualizadoId = funcrepo.atualizarPorIdFuncionario(idAtualizar, novoNomeId, novoSalarioId);
                    if (funcAtualizadoId == true) {
                        System.out.println("Funcionário atualizado com sucesso: " + "\nid: " + idAtualizar + "\nNome: " + novoNomeId + "\nSalário: " + novoSalarioId);
                    } else {
                        System.out.println("Erro ao atualizar funcionário.");
                    }
                } else {
                    System.out.println("ID não encontrado.");
                }
                break;
              case 6:
                // Atualizar Funcionário por nome
                System.out.println("--- ATUALIZAR FUNCIONÁRIO POR NOME ---");
                entrada.nextLine();
                System.out.println("Nome atual: ");
                String nomeAtual = entrada.nextLine();
                Funcionario fNomeAtualizar = funcrepo.buscarPorNomeFuncionario(nomeAtual);
                if (fNomeAtualizar != null) {
                    System.out.println("Novo nome: ");
                    String novoNome = entrada.nextLine();
                    System.out.println("Novo salário: ");
                    double novoSalario = entrada.nextDouble();
                    boolean funcAtualizado = funcrepo.atualizarFuncionario(nomeAtual, novoNome, novoSalario);
                    if (funcAtualizado == true) {
                        System.out.println("Funcionário atualizado com sucesso: " + " Nome: " + novoNome + ", Salário: " + novoSalario);
                    } else {
                        System.out.println("Erro ao atualizar funcionário.");
                    }
                } else {
                    System.out.println("Nome não encontrado.");
                }
                break;
              case 7:
                // Excluir Funcionário por id
                System.out.println("--- EXCLUIR FUNCIONÁRIO POR ID ---");
                System.out.print("ID: ");
                int idExcluir = entrada.nextInt();
                boolean fExcluir = funcrepo.removerPorIdFuncionario(idExcluir);
                if (fExcluir == true) {
                    System.out.println("Funcionário excluído com sucesso.");
                } else {
                    System.out.println("Erro ao excluir funcionário.");
                }
                break;
              case 8:
                // Excluir Funcionário por nome
                System.out.println("--- EXCLUIR FUNCIONÁRIO POR NOME ---");
                entrada.nextLine();
                System.out.print("Nome: ");
                String nomeExcluir = entrada.nextLine();
                boolean fExcluirNome = funcrepo.removerPorNomeFuncionario(nomeExcluir);
                if (fExcluirNome == true) {
                    System.out.println("Funcionário excluído com sucesso.");
                } else {
                    System.out.println("Erro ao excluir funcionário.");
                }
                break;
              case 0:
                // Voltar ao menu principal
                break;
              default:
                System.out.println("Opção digitada inválida");
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
            System.out.println("4) Atualizar Produto por id");
            System.out.println("5) Atualizar Produto por nome");
            System.out.println("6) Excluir Produto por id");
            System.out.println("7) Excluir Produto por nome");
            System.out.println("0) Voltar ao menu principal");

            System.out.println("Digite a sua opção para o menu produtos: ");
            opcaoMenuProduto = entrada.nextInt();

            switch (opcaoMenuProduto) {
              case 1:
                // Listar Produto
                System.out.println("--- LISTAR OS PRODUTOS ---");
                if (prorepo.listarProdutos().isEmpty()) {
                    System.out.println("Nenhum produto cadastrado.");
                } else {
                    for (Produto p : prorepo.listarProdutos()) {
                        System.out.println("ID: " + p.getId() + ", Nome: " + p.getNome() + ", Preço: " + p.getPreco() + ", Quantidade em estoque: " + p.getQuantidadeEmEstoque() + ", Produto: " + p);
                    }
                }
                break;
              case 2:
                // Buscar Produto por id
                System.out.println("--- BUSCAR PRODUTO POR ID ---");
                System.out.print("ID: ");
                int idProduto = entrada.nextInt();
                Produto p = prorepo.buscarPorIdProduto(idProduto);
                if (p != null) {
                    System.out.println("Produto encontrado: " + p + "\nNome: " + p.getNome() + "\nPreço: " + p.getPreco() + "\nQuantidade em estoque: " + p.getQuantidadeEmEstoque());
                } else {
                    System.out.println("ID não encontrado.");
                }
                break;
              case 3:
                // Buscar Produto por nome
                System.out.println("--- BUSCAR PRODUTO POR NOME ---");
                System.out.println("Nome: ");
                entrada.nextLine();
                String nomeBuscaProduto = entrada.nextLine();
                Produto pNome = prorepo.buscarPorNomeProduto(nomeBuscaProduto);
                if (pNome != null) {
                    System.out.println("Produto encontrado: " + pNome + "\nId: " + pNome.getId() + "\nNome: " + pNome.getNome() + "\nPreço: " + pNome.getPreco() + "\nQuantidade em estoque: " + pNome.getQuantidadeEmEstoque());
                } else {
                    System.out.println("Nome não encontrado.");
                }
                break;
              case 4:
                // Atualizar Produto por id
                System.out.println("--- ATUALIZAR PRODUTO POR ID ---");
                entrada.nextLine();
                System.out.println("ID: ");
                int idAtualizarProduto = entrada.nextInt();
                entrada.nextLine();
                Produto pBusca = prorepo.buscarPorIdProduto(idAtualizarProduto);
                if (pBusca != null) {
                    System.out.println("Novo nome: ");
                    String novoNomeIdP = entrada.nextLine();
                    System.out.println("Novo preço: ");
                    double novoPrecoId = entrada.nextDouble();
                    System.out.println("Nova quantidade em estoque: ");
                    int novaQuantidadeEmEstoque = entrada.nextInt();
                    boolean proAtualizadoId = prorepo.atualizarPorIdProduto(idAtualizarProduto, novoNomeIdP, novoPrecoId, novaQuantidadeEmEstoque);
                    if (proAtualizadoId == true) {
                        System.out.println("Produto atualizado com sucesso: " + "\nid: " + idAtualizarProduto + "\nNome: " + novoNomeIdP + "\nPreço: " + novoPrecoId + "\nQuantidade em estoque: " + novaQuantidadeEmEstoque);
                    } else {
                        System.out.println("Erro ao atualizar o produto.");
                    }
                } else {
                    System.out.println("ID não encontrado.");
                }
                break;
              case 5:
                // Atualizar Produto por nome
                System.out.println("--- ATUALIZAR PRODUTO POR NOME ---");
                entrada.nextLine();
                System.out.println("Nome atual: ");
                String nomeAtualP = entrada.nextLine();
                Produto PNomeAtualizar = prorepo.buscarPorNomeProduto(nomeAtualP);
                if (PNomeAtualizar != null) {
                    System.out.println("Novo nome: ");
                    String novoNomeP = entrada.nextLine();
                    System.out.println("Novo preço: ");
                    double novoPreco = entrada.nextDouble();
                    System.out.println("Nova quantidade em estoque: ");
                    int novaQuantidadeEmEstoqueP = entrada.nextInt();
                    boolean proAtualizado = prorepo.atualizarProduto(nomeAtualP, novoNomeP, novoPreco, novaQuantidadeEmEstoqueP);
                    if (proAtualizado == true) {
                        System.out.println("Produto atualizado com sucesso: " + " Nome: " + novoNomeP + ", Preço: " + novoPreco + ", Quantidade em estoque: " + novaQuantidadeEmEstoqueP);
                    } else {
                        System.out.println("Erro ao atualizar o produto.");
                    }
                } else {
                    System.out.println("Nome não encontrado.");
                }
                break;
              case 6:
                // Excluir Produto por id
                System.out.println("--- EXCLUIR PRODUTO POR ID ---");
                System.out.print("ID: ");
                int idExcluirP = entrada.nextInt();
                boolean pExcluir = prorepo.removerPorIdProduto(idExcluirP);
                if (pExcluir == true) {
                    System.out.println("Produto excluído com sucesso.");
                } else {
                    System.out.println("Erro ao excluir o produto.");
                }
                break;
              case 7:
                // Excluir Produto por nome
                System.out.println("--- EXCLUIR PRODUTO POR NOME ---");
                entrada.nextLine();
                System.out.print("Nome: ");
                String nomeExcluirP = entrada.nextLine();
                boolean pExcluirNome = prorepo.removerPorNomeProduto(nomeExcluirP);
                if (pExcluirNome == true) {
                    System.out.println("Produto excluído com sucesso.");
                } else {
                    System.out.println("Erro ao excluir o produto.");
                }
                break;
              case 0:
                // Voltar ao menu principal
                break;
              default:
                System.out.println("Opção digitada inválida");
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
            System.out.println("4) Atualizar Cliente por id");
            System.out.println("5) Atualizar Cliente por nome");
            System.out.println("6) Excluir Cliente por id");
            System.out.println("7) Excluir Cliente por nome");
            System.out.println("0) Voltar ao menu principal");

            System.out.println("Digite a sua opção para o menu clientes: ");
            opcaoMenuCliente = entrada.nextInt();

            switch (opcaoMenuCliente) {
              case 1:
                // Listar Cliente
                System.out.println("--- LISTAR OS CLIENTES ---");
                if (clirepo.listar().isEmpty()) {
                    System.out.println("Nenhum cliente cadastrado.");
                } else {
                    for (Cliente c : clirepo.listar()) {
                        System.out.println("ID: " + c.getId() + ", Nome: " + c.getNome() + ", Telefone: " + c.getTelefone() + ", Email: " + c.getEmail() + ", Cliente: " + c);
                    }
                }
                break;
              case 2:
                // Buscar Cliente por id
                System.out.println("--- BUSCAR CLIENTE POR ID ---");
                System.out.print("ID: ");
                int idCliente = entrada.nextInt();
                Cliente c = clirepo.buscarPorId(idCliente);
                if (c != null) {
                    System.out.println("Cliente encontrado: " + c + "\nNome: " + c.getNome() + "\nTelefone: " + c.getTelefone() + "\nEmail: " + c.getEmail());
                } else {
                    System.out.println("ID não encontrado.");
                }
                break;
              case 3:
                // Buscar Cliente por nome
                System.out.println("--- BUSCAR CLIENTE POR NOME ---");
                System.out.println("Nome: ");
                entrada.nextLine();
                String nomeBuscaCliente = entrada.nextLine();
                Cliente cNome = clirepo.buscarPorNome(nomeBuscaCliente);
                if (cNome != null) {
                    System.out.println("Cliente encontrado: " + cNome + "\nId: " + cNome.getId() + "Nome: " + cNome.getNome() + "\nTelefone: " + cNome.getTelefone() + "\nEmail: " + cNome.getEmail());
                } else {
                    System.out.println("Nome não encontrado.");
                }
                break;
              case 4:
                // Atualizar Cliente por id
                System.out.println("--- ATUALIZAR CLIENTE POR ID ---");
                entrada.nextLine();
                System.out.println("ID: ");
                int idAtualizarCliente = entrada.nextInt();
                entrada.nextLine();
                Cliente cBusca = clirepo.buscarPorId(idAtualizarCliente);
                if (cBusca != null) {
                    System.out.println("Novo nome: ");
                    String novoNomeIdC = entrada.nextLine();
                    System.out.println("Novo telefone: ");
                    String novoTelefoneId = entrada.nextLine();
                    System.out.println("Novo email: ");
                    String novoEmail = entrada.nextLine();
                    boolean cliAtualizadoId = clirepo.atualizar(idAtualizarCliente, novoNomeIdC, novoTelefoneId, novoEmail);
                    if (cliAtualizadoId == true) {
                        System.out.println("Cliente atualizado com sucesso: " + "\nid: " + idAtualizarCliente + "\nNome: " + novoNomeIdC + "\nTelefone: " + novoTelefoneId + "\nEmail: " + novoEmail);
                    } else {
                        System.out.println("Erro ao atualizar o cliente.");
                    }
                } else {
                    System.out.println("ID não encontrado.");
                }
                break;
              case 5:
                // Atualizar Cliente por nome
                System.out.println("--- ATUALIZAR CLIENTE POR NOME ---");
                entrada.nextLine();
                System.out.println("Nome atual: ");
                String nomeAtualC = entrada.nextLine();
                Cliente CNomeAtualizar = clirepo.buscarPorNome(nomeAtualC);
                if (CNomeAtualizar != null) {
                    System.out.println("Novo nome: ");
                    String novoNomeC = entrada.nextLine();
                    System.out.println("Novo telefone: ");
                    String novoTelefone = entrada.nextLine();
                    System.out.println("Novo email: ");
                    String novoEmailC = entrada.nextLine();
                    boolean cliAtualizado = clirepo.atualizarCliente(nomeAtualC, novoNomeC, novoTelefone, novoEmailC);
                    if (cliAtualizado == true) {
                        System.out.println("Cliente atualizado com sucesso: " + " Nome: " + novoNomeC + ", Telefone: " + novoTelefone + ", Email: " + novoEmailC);
                    } else {
                        System.out.println("Erro ao atualizar o cliente.");
                    }
                } else {
                    System.out.println("Nome não encontrado.");
                }
                break;
              case 6:
                // Excluir Cliente por id
                System.out.println("--- EXCLUIR CLIENTE POR ID ---");
                System.out.print("ID: ");
                int idExcluirC = entrada.nextInt();
                boolean cExcluir = clirepo.removerPorId(idExcluirC);
                if (cExcluir == true) {
                    System.out.println("Cliente excluído com sucesso.");
                } else {
                    System.out.println("Erro ao excluir o cliente.");
                }
                break;
              case 7:
                // Excluir Cliente por nome
                System.out.println("--- EXCLUIR CLIENTE POR NOME ---");
                entrada.nextLine();
                System.out.print("Nome: ");
                String nomeExcluirC = entrada.nextLine();
                boolean cExcluirNome = clirepo.removerPorNome(nomeExcluirC);
                if (cExcluirNome == true) {
                    System.out.println("Cliente excluído com sucesso.");
                } else {
                    System.out.println("Erro ao excluir o cliente.");
                }
                break;
              case 0:
                // Voltar ao menu principal
                break;
              default:
                System.out.println("Opção digitada inválida");
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
                System.out.println("--- CADASTRAR CLIENTE ---");
                entrada.nextLine();
                System.out.print("Nome: ");
                String nome = entrada.nextLine();
                System.out.print("Telefone: ");
                String telefone = entrada.nextLine();
                System.out.print("Email: ");
                String email = entrada.nextLine();
                Cliente novoCli = clirepo.adicionar(new Cliente(nome, telefone, email));
                System.out.println("Cliente cadastrado com sucesso: " + "\nNome: " + nome + "\nTelefone: " + telefone + "\nEmail: " + email + "\nNovoCliente: " + novoCli);
                break;
              case 0:
                // Voltar ao menu principal
                break;
              default:
                System.out.println("Opção digitada inválida");
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
                System.out.println("--- CADASTRAR PRODUTO ---");
                entrada.nextLine();
                System.out.print("Nome: ");
                String nome = entrada.nextLine();
                System.out.print("Preço: ");
                double preco = entrada.nextDouble();
                entrada.nextLine();
                System.out.print("Quantidade em estoque: ");
                int quantidadeEmEstoque = entrada.nextInt();
                Produto novoPro = prorepo.adicionarProduto(new Produto(nome, preco, quantidadeEmEstoque));
                System.out.println("Produto cadastrado com sucesso: " + "\nNome: " + nome + "\nPreço: " + preco + "\nQuantidade em estoque: " + quantidadeEmEstoque + "\nNovoProduto: " + novoPro);
                break;
              case 0:
                // Voltar ao menu principal
                break;
              default:
                System.out.println("Opção digitada inválida");
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