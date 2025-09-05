```mermaid
class ItemVenda {
      -int quantidade
      -float subtotal
  }

Venda "1" -- "0..*" ItemVenda
Produto "1" -- "0..*" ItemVenda
```
