# Mini-Sistema de Cadastro em Memória (ArrayList)

## 🎯 Objetivo

Este projeto implementa um **Mini-Sistema de Cadastro** (CRUD completo) para **Funcionário**, **Produto** e **Cliente** em Java. O sistema é operado via **console** e utiliza o **`ArrayList`** como repositório de dados, com persistência exclusivamente em **memória**.

## 🛠️ Tecnologias e Estrutura

* **Linguagem:** Java
* **Estruturas de Dados:** `ArrayList`
* **Classe Principal:** `Loja.java`

Todos os arquivos (`.java` e `.class`) estão localizados na pasta raiz do projeto: **`pasta_poo`**.

---

## 🗃️ Entidades e Repositórios

* **Funcionário**
    * Campos: `nome`, `salario`, `matricula` (digitados pelo usuário)
    * Repositório: `FuncionarioRepository`
* **Produto**
    * Campos: `nome`, `preco`, `quantidadeEmEstoque` (digitados pelo usuário)
    * Repositório: `ProdutoRepository`
* **Cliente**
    * Campos: `nome`, `telefone`, `email` (digitados pelo usuário)
    * Repositório: `ClienteRepository`

*Observação: O campo `id` é gerado automaticamente pelo respectivo repositório.*

---

## 🚀 Como Executar

Para rodar o projeto, siga os passos abaixo.

### 1. Pré-requisito

Certifique-se de ter o **JDK (Java Development Kit)** instalado em sua máquina.

### 2. Compilação (Se necessário)

1.  **Navegue para a pasta do projeto:**
    ```bash
    cd pasta_poo
    ```

2.  **Compile o código-fonte (`.java`):**
    ```bash
    javac *.java -d .
    ```
    > O parâmetro **`-d .`** garante que os arquivos compilados (`.class`) sejam criados no **diretório atual** (`pasta_poo`).

### 3. Execução

Execute a classe principal (`Loja`) diretamente na pasta **`pasta_poo`**:
```bash
# Na pasta_poo
java Loja
```

# ✅ Sequência de Teste (Mínima)
### O fluxo de teste abaixo mostra a sequência de comandos de menu que devem ser digitados para realizar o CRUD completo, seguido por uma breve descrição da ação de confirmação esperada.

# Menu Principal (MP): 
1) Gerenciar Funcionários _ Submenu (SM): 1 = Cadastrar Funcionário, 2 = Listar Funcionário, 3 = Buscar Funcionário por id, 4 = Buscar Funcionário por nome, 5 = Atualizar Funcionário por id, 6 = Atualizar Funcionário por nome, 7 = Excluir Funcionário por id, 8 = Excluir Funcionário por nome, 0 = Voltar ao menu principal;
2) Gerenciar Produtos _ Submenu (SM): 1 = Listar Produto, 2 = Buscar Produto por id, 3 = Buscar Produto por nome, 4 = Atualizar Produto por id, 5 = Atualizar Produto por nome, 6 = Excluir Produto por id, 7 =  Excluir Produto por nome, 0 = Voltar ao menu principal;
3) Gerenciar Clientes _ Submenu (SM): 1 = Listar Cliente, 2 = Buscar Cliente por id, 3 = Buscar Cliente por nome, 4 = Atualizar Cliente por id, 5 = Atualizar Cliente por nome, 6 = Excluir Cliente por id, 7 =  Excluir Cliente por nome, 0 = Voltar ao menu principal;
4) Cadastrar Cliente _ Submenu (SM): 1 = Cadastrar cliente, 0 = Voltar ao menu principal
5) Cadastrar Produto _ Submenu (SM): 1 = Cadastrar produto, 0 = Voltar ao menu principal
0) Sair

# --- 1. CADASTRO MÍNIMO (CREATE) ---

# Cadastrar 2 Funcionários (ID 1 e ID 2)
MP: 1
SM: 1  # (Digitar dados do Funcionário 1)
MP: 1
SM: 1  # (Digitar dados do Funcionário 2)

# Cadastrar 2 Produtos (ID 1 e ID 2)
MP: 5
SM: 1  # (Digitar dados do Produto 1)
MP: 5
SM: 1  # (Digitar dados do Produto 2)

# Cadastrar 2 Clientes (ID 1 e ID 2)
MP: 4
SM: 1  # (Digitar dados do Cliente 1)
MP: 4
SM: 1  # (Digitar dados do Cliente 2)


# --- 2. LISTAGEM INICIAL (READ) ---
MP: 1 -> SM: 2 # (Confirmar Funcionários 1 e 2)
MP: 2 -> SM: 1 # (Confirmar Produtos 1 e 2)
MP: 3 -> SM: 1 # (Confirmar Clientes 1 e 2)


# --- 3. ATUALIZAÇÃO (UPDATE) ---

# Atualizar ID 1 de cada entidade
MP: 1 -> SM: 5 # (Digitar ID 1 e novos dados)
MP: 2 -> SM: 4 # (Digitar ID 1 e novos dados)
MP: 3 -> SM: 4 # (Digitar ID 1 e novos dados)

# Confirmação de Atualização
MP: 1 -> SM: 2 # (Confirmar alteração do Funcionário ID 1)
MP: 2 -> SM: 1 # (Confirmar alteração do Produto ID 1)
MP: 3 -> SM: 1 # (Confirmar alteração do Cliente ID 1)


# --- 4. BUSCA (READ por ID) ---
MP: 1 -> SM: 3 # (Digitar ID 2) -> Saída: Objeto encontrado
MP: 1 -> SM: 3 # (Digitar ID 99) -> Saída: ID não encontrado


# --- 5. REMOÇÃO (DELETE) ---

# Excluir ID 2 de cada entidade
MP: 1 -> SM: 7 # (Digitar ID 2) -> Saída: Funcionário excluído com sucesso
MP: 2 -> SM: 6 # (Digitar ID 2) -> Saída: Produto excluído com sucesso
MP: 3 -> SM: 6 # (Digitar ID 2) -> Saída: Cliente excluído com sucesso

# Confirmação de Exclusão (Apenas ID 1 deve sobrar)
MP: 1 -> SM: 2 # (Confirmar que só Funcionário ID 1 está na lista)
MP: 2 -> SM: 1 # (Confirmar que só Produto ID 1 está na lista)
MP: 3 -> SM: 1 # (Confirmar que só Cliente ID 1 está na lista)


# --- 6. SAIR ---
MP: 0 # Encerra o programa


