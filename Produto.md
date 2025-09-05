```mermaid
classDiagram
  class Produto {
    - id: int
    - nome: string
    - preco: float
}
  class Instrumento {
    - cor: string
    - marca: string
    - modelo: string
    - estado: string
    - saberPreco(): float
}
  class Corda {
    - numeroCordas: int
    - tipoMadeira: string
}
  class Metal {
    - tipoBocal: string
}
  class Percussao {
    - material: string
}
  class Acessorio {
    - funcao: string
}

Produto <|-- Instrumento
Produto <|-- Acessorio
Instrumento <|-- Corda
Instrumento <|-- Metal
Instrumento <|-- Percussao
```



