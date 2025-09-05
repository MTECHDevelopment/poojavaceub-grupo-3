```mermaid
class Diagram
      class ItemVenda {
            - quantidade: int
            - subtotal: float
        }

Venda <|-- ItemVenda
Produto <|-- ItemVenda
```
