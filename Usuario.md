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
  }
  class Cliente{
    - idCliente: int
    - endereco: string
    + fazerPedido(pedido: Pedido): void
  }
  class Funcionario{
    - matricula: string
    - salario: float
    - cargo: string
    + cadastrarProduto(produto: Produto): void
  }
  


  Usuario <|-- Cliente
  Usuario <|-- Funcionario

