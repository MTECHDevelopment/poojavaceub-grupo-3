### Classe Pedido
```mermaid
classDiagram
  class Pedido{
    - idPedido: int
    - dataPedido: date
    - funcionario: string
    - cliente: string
    - status: string
    - dataPrevisaoEntrega: Date
    + cancelarPedido() : boolean
    + saberDataPrevisaoEntrega() : date
  }

```
