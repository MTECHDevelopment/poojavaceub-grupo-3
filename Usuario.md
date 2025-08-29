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
  }
  class Funcionario{
    - matricula: string
    - salario: float
    - cargo: string
  }
  


  Usuario <|-- Cliente
  Usuario <|-- Funcionario

