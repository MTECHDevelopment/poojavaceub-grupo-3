# Sistema de Cadastro em Memória

## Descrição
Sistema de gerenciamento em memória (usando ArrayList) para Funcionários, Produtos e Clientes, desenvolvido em Java com interface de console.

## Estrutura do Projeto

### Entidades
1. **Funcionario.java** - Classe que representa um funcionário
   - Atributos: id, nome, salario, matricula
   - Getters e Setters para todos os atributos

2. **Produto.java** - Classe que representa um produto
   - Atributos: id, nome, preco, quantidadeEmEstoque
   - Getters e Setters para todos os atributos
   - Método exibirInfo() para mostrar informações do produto

3. **Cliente.java** - Classe que representa um cliente
   - Atributos: id, nome, telefone, email
   - Getters e Setters para todos os atributos

### Repositórios (CRUD)
1. **FuncionarioRepository.java**
   - adicionarFuncionario(Funcionario f)
   - listarFuncionarios()
   - buscarPorIdFuncionario(int id)
   - buscarPorNomeFuncionario(String nome)
   - atualizarPorIdFuncionario(int id, String novoNome, double novoSalario)
   - removerPorIdFuncionario(int id)
   - removerPorNomeFuncionario(String nome)

2. **ProdutoRepository.java**
   - adicionarProduto(Produto p)
   - listarProdutos()
   - buscarPorIdProduto(int id)
   - buscarPorNomeProduto(String nome)
   - atualizarPorIdProduto(int id, String novoNome, double novoPreco)
   - removerPorIdProduto(int id)
   - removerPorNomeProduto(String nome)

3. **ClienteRepository.java**
   - adicionar(Cliente c) - Gera ID automaticamente
   - listar()
   - buscarPorId(int id)
   - atualizar(int id, String nome, String telefone, String email)
   - removerPorId(int id)

### Aplicação Principal
**Loja.java** - Classe principal com interface de menu para gerenciar todas as entidades

## Como Compilar

```bash
cd sistema_cadastro
javac *.java
```

## Como Executar

```bash
cd sistema_cadastro
java Loja
```

## Funcionalidades Implementadas

### Menu Principal
- Gerenciar Funcionários
- Gerenciar Produtos  
- Gerenciar Clientes
- Sair

### Operações de Funcionários
1. Cadastrar Funcionário
2. Listar Funcionários
3. Buscar Funcionário por ID
4. Buscar Funcionário por Nome
5. Atualizar Funcionário por ID
6. Excluir Funcionário por ID
7. Excluir Funcionário por Nome

### Operações de Produtos
1. Cadastrar Produto
2. Listar Produtos
3. Buscar Produto por ID
4. Buscar Produto por Nome
5. Atualizar Produto por ID
6. Excluir Produto por ID
7. Excluir Produto por Nome

### Operações de Clientes
1. Cadastrar Cliente (ID gerado automaticamente)
2. Listar Clientes
3. Buscar Cliente por ID
4. Atualizar Cliente por ID
5. Excluir Cliente por ID

## Características Técnicas

- **Armazenamento**: Em memória usando ArrayList
- **Interface**: Console com Scanner para entrada de dados
- **Mensagens**: Feedback de sucesso/erro para todas as operações
- **Validação**: Verifica se entidades existem antes de atualizar/remover
- **Buffer**: Tratamento correto do buffer do Scanner (nextLine após nextInt)

## Melhorias Implementadas

1. ✅ Removido código órfão e erros de compilação
2. ✅ Reorganização da estrutura com métodos privados separados
3. ✅ Implementação completa de todas as operações CRUD
4. ✅ Mensagens de sucesso/erro apropriadas
5. ✅ Separação de responsabilidades (Funcionario não gerencia Produtos)
6. ✅ Tratamento adequado do buffer do Scanner
7. ✅ Auto-incremento de ID para clientes
8. ✅ Menu intuitivo e navegação clara

## Status

✅ **IMPLEMENTAÇÃO COMPLETA E TESTADA**

Todas as funcionalidades foram implementadas e testadas com sucesso:
- Cadastro de Funcionário, Produto e Cliente funcionando
- Listagem de todas as entidades funcionando
- Busca por ID e Nome funcionando
- Atualização funcionando
- Remoção funcionando
- Sistema compila sem erros
- Navegação entre menus funcionando corretamente
