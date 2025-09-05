```mermaid
classDiagram
   class Venda {
      - idVenda: int
      - dataVenda: date
      - quantidade: int
      - totalVenda: float
      - Produto: enumProduto
      + saberQtd(): int
      + saberTotalVenda(): float
}
```
