# Mini-Sistema de Cadastro em Memória

## 📝 Descrição
Sistema de gerenciamento CRUD (Create, Read, Update, Delete) implementado em Java para gerenciar Funcionários, Produtos e Clientes usando ArrayList para armazenamento em memória.

## 🎯 Funcionalidades

### Entidades Gerenciadas:
- **Funcionários**: ID, Nome, Salário, Matrícula
- **Produtos**: ID, Nome, Preço, Quantidade em Estoque
- **Clientes**: ID, Nome, Telefone, Email

### Operações CRUD Disponíveis:
- ✅ **Criar**: Cadastrar novos registros
- ✅ **Ler**: Listar todos ou buscar por ID/Nome
- ✅ **Atualizar**: Modificar registros existentes
- ✅ **Deletar**: Remover registros por ID ou Nome

## 🚀 Como Executar

```bash
# 1. Compilar todos os arquivos Java
javac *.java

# 2. Executar o programa principal
java Loja
```

## 📋 Estrutura de Menus

### Menu Principal
```
1) Gerenciar Funcionários
2) Gerenciar Produtos
3) Gerenciar Clientes
4) Cadastrar Cliente
5) Cadastrar Produto
0) Sair
```

### Submenus
Cada entidade possui submenu com opções:
- Listar todos
- Buscar por ID
- Buscar por Nome
- Atualizar
- Excluir por ID
- Excluir por Nome
- Cadastrar (para Funcionários)

## 📂 Arquivos

- `Loja.java` - Classe principal com interface de usuário
- `Cliente.java` - Modelo da entidade Cliente
- `Funcionario.java` - Modelo da entidade Funcionário
- `Produto.java` - Modelo da entidade Produto
- `ClienteRepository.java` - Gerenciamento de Clientes
- `FuncionarioRepository.java` - Gerenciamento de Funcionários
- `ProdutoRepository.java` - Gerenciamento de Produtos

## ✅ Status do Código

**Todas as implementações foram revisadas e estão corretas:**
- ✅ Entidades corretamente implementadas
- ✅ Repositórios com CRUD completo
- ✅ Interface de usuário funcional
- ✅ Tratamento de erros implementado
- ✅ Mensagens de sucesso/erro adequadas

## 📖 Documentação Completa

Para análise detalhada das correções e implementações, consulte:
[`../Docs/SistemaCadastro.md`](../Docs/SistemaCadastro.md)

## 🎓 Conceitos Aplicados

- Programação Orientada a Objetos
- Encapsulamento
- ArrayList para armazenamento em memória
- Scanner para entrada de dados
- Estruturas de controle (switch-case, loops)
- Formatação de saída com printf
