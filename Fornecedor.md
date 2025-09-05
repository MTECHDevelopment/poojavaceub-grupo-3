### Classe Fornecedor
```mermaid
classDiagram
  class Fornecedor{
    - idFormecedor: int
    - fornecedor: string
    - telefone: string
    - cnpj: string
    + saberTelefone() : string
    + solicitarOrcamento(Produto: string) : float
  }

```

