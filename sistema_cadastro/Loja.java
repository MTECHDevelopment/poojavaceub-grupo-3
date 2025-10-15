import java.util.Scanner;
import java.util.ArrayList;

public class Loja {
    
    private static FuncionarioRepository funcionarioRepo = new FuncionarioRepository();
    private static ProdutoRepository produtoRepo = new ProdutoRepository();
    private static ClienteRepository clienteRepo = new ClienteRepository();
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcaoPrincipal;

        do {
            // MENU PRINCIPAL
            System.out.println("\n=========== MENU PRINCIPAL ===========");
            System.out.println("O que você gostaria de fazer? ");
            System.out.println("1) Gerenciar Funcionários");
            System.out.println("2) Gerenciar Produtos");
            System.out.println("3) Gerenciar Clientes");
            System.out.println("0) Sair");
            System.out.print("Digite a sua opção: ");
            
            opcaoPrincipal = entrada.nextInt();
            entrada.nextLine(); // Limpar buffer

            switch (opcaoPrincipal) {
                case 1:
                    menuFuncionarios();
                    break;
                case 2:
                    menuProdutos();
                    break;
                case 3:
                    menuClientes();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção digitada inválida!");
                    break;
            } 
        } while (opcaoPrincipal != 0);

        entrada.close();
    }

    // ======================== MENU FUNCIONÁRIOS ========================
    private static void menuFuncionarios() {
        int opcao;
        System.out.println("\n=========== MENU FUNCIONÁRIOS ===========");
        System.out.println("1) Cadastrar Funcionário");
        System.out.println("2) Listar Funcionários");
        System.out.println("3) Buscar Funcionário por ID");
        System.out.println("4) Buscar Funcionário por Nome");
        System.out.println("5) Atualizar Funcionário por ID");
        System.out.println("6) Excluir Funcionário por ID");
        System.out.println("7) Excluir Funcionário por Nome");
        System.out.println("0) Voltar ao menu principal");
        System.out.print("Digite a sua opção: ");
        
        opcao = entrada.nextInt();
        entrada.nextLine(); // Limpar buffer

        switch (opcao) {
            case 1:
                cadastrarFuncionario();
                break;
            case 2:
                listarFuncionarios();
                break;
            case 3:
                buscarFuncionarioPorId();
                break;
            case 4:
                buscarFuncionarioPorNome();
                break;
            case 5:
                atualizarFuncionarioPorId();
                break;
            case 6:
                excluirFuncionarioPorId();
                break;
            case 7:
                excluirFuncionarioPorNome();
                break;
            case 0:
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    private static void cadastrarFuncionario() {
        System.out.print("Digite o ID do funcionário: ");
        int id = entrada.nextInt();
        entrada.nextLine(); // Limpar buffer
        
        System.out.print("Digite o nome do funcionário: ");
        String nome = entrada.nextLine();
        
        System.out.print("Digite o salário do funcionário: ");
        double salario = entrada.nextDouble();
        entrada.nextLine(); // Limpar buffer
        
        System.out.print("Digite a matrícula do funcionário: ");
        String matricula = entrada.nextLine();

        Funcionario f = new Funcionario(id, nome, salario, matricula);
        funcionarioRepo.adicionarFuncionario(f);
    }

    private static void listarFuncionarios() {
        ArrayList<Funcionario> funcionarios = funcionarioRepo.listarFuncionarios();
        
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            System.out.println("\n===== LISTA DE FUNCIONÁRIOS =====");
            for (Funcionario f : funcionarios) {
                System.out.printf("ID: %d | Nome: %s | Salário: R$ %.2f | Matrícula: %s\n", 
                    f.getId(), f.getNome(), f.getSalario(), f.getMatricula());
            }
        }
    }

    private static void buscarFuncionarioPorId() {
        System.out.print("Digite o ID do funcionário: ");
        int id = entrada.nextInt();
        entrada.nextLine(); // Limpar buffer
        
        Funcionario f = funcionarioRepo.buscarPorIdFuncionario(id);
        if (f != null) {
            System.out.printf("Funcionário encontrado: ID: %d | Nome: %s | Salário: R$ %.2f | Matrícula: %s\n", 
                f.getId(), f.getNome(), f.getSalario(), f.getMatricula());
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    private static void buscarFuncionarioPorNome() {
        System.out.print("Digite o nome do funcionário: ");
        String nome = entrada.nextLine();
        
        Funcionario f = funcionarioRepo.buscarPorNomeFuncionario(nome);
        if (f != null) {
            System.out.printf("Funcionário encontrado: ID: %d | Nome: %s | Salário: R$ %.2f | Matrícula: %s\n", 
                f.getId(), f.getNome(), f.getSalario(), f.getMatricula());
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    private static void atualizarFuncionarioPorId() {
        System.out.print("Digite o ID do funcionário a atualizar: ");
        int id = entrada.nextInt();
        entrada.nextLine(); // Limpar buffer
        
        System.out.print("Digite o novo nome: ");
        String novoNome = entrada.nextLine();
        
        System.out.print("Digite o novo salário: ");
        double novoSalario = entrada.nextDouble();
        entrada.nextLine(); // Limpar buffer

        boolean atualizado = funcionarioRepo.atualizarPorIdFuncionario(id, novoNome, novoSalario);
        if (atualizado) {
            System.out.println("Funcionário atualizado com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    private static void excluirFuncionarioPorId() {
        System.out.print("Digite o ID do funcionário a excluir: ");
        int id = entrada.nextInt();
        entrada.nextLine(); // Limpar buffer
        
        boolean removido = funcionarioRepo.removerPorIdFuncionario(id);
        if (removido) {
            System.out.println("Funcionário removido com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    private static void excluirFuncionarioPorNome() {
        System.out.print("Digite o nome do funcionário a excluir: ");
        String nome = entrada.nextLine();
        
        boolean removido = funcionarioRepo.removerPorNomeFuncionario(nome);
        if (removido) {
            System.out.println("Funcionário removido com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    // ======================== MENU PRODUTOS ========================
    private static void menuProdutos() {
        int opcao;
        System.out.println("\n=========== MENU PRODUTOS ===========");
        System.out.println("1) Cadastrar Produto");
        System.out.println("2) Listar Produtos");
        System.out.println("3) Buscar Produto por ID");
        System.out.println("4) Buscar Produto por Nome");
        System.out.println("5) Atualizar Produto por ID");
        System.out.println("6) Excluir Produto por ID");
        System.out.println("7) Excluir Produto por Nome");
        System.out.println("0) Voltar ao menu principal");
        System.out.print("Digite a sua opção: ");
        
        opcao = entrada.nextInt();
        entrada.nextLine(); // Limpar buffer

        switch (opcao) {
            case 1:
                cadastrarProduto();
                break;
            case 2:
                listarProdutos();
                break;
            case 3:
                buscarProdutoPorId();
                break;
            case 4:
                buscarProdutoPorNome();
                break;
            case 5:
                atualizarProdutoPorId();
                break;
            case 6:
                excluirProdutoPorId();
                break;
            case 7:
                excluirProdutoPorNome();
                break;
            case 0:
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    private static void cadastrarProduto() {
        System.out.print("Digite o ID do produto: ");
        int id = entrada.nextInt();
        entrada.nextLine(); // Limpar buffer
        
        System.out.print("Digite o nome do produto: ");
        String nome = entrada.nextLine();
        
        System.out.print("Digite o preço do produto: ");
        double preco = entrada.nextDouble();
        entrada.nextLine(); // Limpar buffer
        
        System.out.print("Digite a quantidade em estoque: ");
        int quantidade = entrada.nextInt();
        entrada.nextLine(); // Limpar buffer

        Produto p = new Produto(id, nome, preco, quantidade);
        produtoRepo.adicionarProduto(p);
    }

    private static void listarProdutos() {
        ArrayList<Produto> produtos = produtoRepo.listarProdutos();
        
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("\n===== LISTA DE PRODUTOS =====");
            for (Produto p : produtos) {
                System.out.printf("ID: %d | Nome: %s | Preço: R$ %.2f | Estoque: %d\n", 
                    p.getId(), p.getNome(), p.getPreco(), p.getQuantidadeEmEstoque());
            }
        }
    }

    private static void buscarProdutoPorId() {
        System.out.print("Digite o ID do produto: ");
        int id = entrada.nextInt();
        entrada.nextLine(); // Limpar buffer
        
        Produto p = produtoRepo.buscarPorIdProduto(id);
        if (p != null) {
            System.out.printf("Produto encontrado: ID: %d | Nome: %s | Preço: R$ %.2f | Estoque: %d\n", 
                p.getId(), p.getNome(), p.getPreco(), p.getQuantidadeEmEstoque());
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void buscarProdutoPorNome() {
        System.out.print("Digite o nome do produto: ");
        String nome = entrada.nextLine();
        
        Produto p = produtoRepo.buscarPorNomeProduto(nome);
        if (p != null) {
            System.out.printf("Produto encontrado: ID: %d | Nome: %s | Preço: R$ %.2f | Estoque: %d\n", 
                p.getId(), p.getNome(), p.getPreco(), p.getQuantidadeEmEstoque());
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void atualizarProdutoPorId() {
        System.out.print("Digite o ID do produto a atualizar: ");
        int id = entrada.nextInt();
        entrada.nextLine(); // Limpar buffer
        
        System.out.print("Digite o novo nome: ");
        String novoNome = entrada.nextLine();
        
        System.out.print("Digite o novo preço: ");
        double novoPreco = entrada.nextDouble();
        entrada.nextLine(); // Limpar buffer

        boolean atualizado = produtoRepo.atualizarPorIdProduto(id, novoNome, novoPreco);
        if (atualizado) {
            System.out.println("Produto atualizado com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void excluirProdutoPorId() {
        System.out.print("Digite o ID do produto a excluir: ");
        int id = entrada.nextInt();
        entrada.nextLine(); // Limpar buffer
        
        boolean removido = produtoRepo.removerPorIdProduto(id);
        if (removido) {
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void excluirProdutoPorNome() {
        System.out.print("Digite o nome do produto a excluir: ");
        String nome = entrada.nextLine();
        
        boolean removido = produtoRepo.removerPorNomeProduto(nome);
        if (removido) {
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    // ======================== MENU CLIENTES ========================
    private static void menuClientes() {
        int opcao;
        System.out.println("\n=========== MENU CLIENTES ===========");
        System.out.println("1) Cadastrar Cliente");
        System.out.println("2) Listar Clientes");
        System.out.println("3) Buscar Cliente por ID");
        System.out.println("4) Atualizar Cliente por ID");
        System.out.println("5) Excluir Cliente por ID");
        System.out.println("0) Voltar ao menu principal");
        System.out.print("Digite a sua opção: ");
        
        opcao = entrada.nextInt();
        entrada.nextLine(); // Limpar buffer

        switch (opcao) {
            case 1:
                cadastrarCliente();
                break;
            case 2:
                listarClientes();
                break;
            case 3:
                buscarClientePorId();
                break;
            case 4:
                atualizarClientePorId();
                break;
            case 5:
                excluirClientePorId();
                break;
            case 0:
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    private static void cadastrarCliente() {
        System.out.print("Digite o nome do cliente: ");
        String nome = entrada.nextLine();
        
        System.out.print("Digite o telefone do cliente: ");
        String telefone = entrada.nextLine();
        
        System.out.print("Digite o email do cliente: ");
        String email = entrada.nextLine();

        Cliente c = new Cliente(0, nome, telefone, email);
        Cliente clienteAdicionado = clienteRepo.adicionar(c);
        System.out.printf("Cliente %s cadastrado com sucesso com ID: %d\n", 
            clienteAdicionado.getNome(), clienteAdicionado.getId());
    }

    private static void listarClientes() {
        ArrayList<Cliente> clientes = clienteRepo.listar();
        
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.println("\n===== LISTA DE CLIENTES =====");
            for (Cliente c : clientes) {
                System.out.printf("ID: %d | Nome: %s | Telefone: %s | Email: %s\n", 
                    c.getId(), c.getNome(), c.getTelefone(), c.getEmail());
            }
        }
    }

    private static void buscarClientePorId() {
        System.out.print("Digite o ID do cliente: ");
        int id = entrada.nextInt();
        entrada.nextLine(); // Limpar buffer
        
        Cliente c = clienteRepo.buscarPorId(id);
        if (c != null) {
            System.out.printf("Cliente encontrado: ID: %d | Nome: %s | Telefone: %s | Email: %s\n", 
                c.getId(), c.getNome(), c.getTelefone(), c.getEmail());
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private static void atualizarClientePorId() {
        System.out.print("Digite o ID do cliente a atualizar: ");
        int id = entrada.nextInt();
        entrada.nextLine(); // Limpar buffer
        
        System.out.print("Digite o novo nome: ");
        String novoNome = entrada.nextLine();
        
        System.out.print("Digite o novo telefone: ");
        String novoTelefone = entrada.nextLine();
        
        System.out.print("Digite o novo email: ");
        String novoEmail = entrada.nextLine();

        boolean atualizado = clienteRepo.atualizar(id, novoNome, novoTelefone, novoEmail);
        if (atualizado) {
            System.out.println("Cliente atualizado com sucesso!");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private static void excluirClientePorId() {
        System.out.print("Digite o ID do cliente a excluir: ");
        int id = entrada.nextInt();
        entrada.nextLine(); // Limpar buffer
        
        boolean removido = clienteRepo.removerPorId(id);
        if (removido) {
            System.out.println("Cliente removido com sucesso!");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}