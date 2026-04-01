### Classe Fornecedor
```mermaid
classDiagram
  class Fornecedor{
    - idFornecedor: int
    - fornecedor: string
    - telefone: string
    - cnpj: string
    + saberTelefone() : string
    + solicitarOrcamento(Produto: string) : float
  }

```

