### Classe Usuário
```mermaid
classDiagram
  class Usuario{
    - cpf: string
    - nome: string
    - telefone: string
    - email: string
    - dtNascimento: date
    - sexo: string
    + atualizarEmail(novoEmail: string) : boolean
    + atualizarTelefone(novoTelefone: string) : boolean
  }
  class Cliente{
    - idCliente: int
    - endereco: string
    + fazerPedido(pedido: Pedido) : void
    + atualizarEndereco(novoEndereco: string) : boolean
  }
  class Funcionario{
    - matricula: string
    - salario: float
    - cargo: string
    + cadastrarProduto(produto: Produto) : void
    + consultarCliente(idCliente: int) : string
    + fazerVenda(venda: Venda) : void
  }
  


  Usuario <|-- Cliente
  Usuario <|-- Funcionario

