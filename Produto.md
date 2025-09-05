```mermaid
classDiagram
  class Produto {
    - idProduto: int
    - nome: string
    - preco: float
    - cor: string
    - marca: string
    - modelo: string
    - descricao: string
    - estoque: int
    + saberNome(): string
    + saberPreco(): float
    + saberCor(): string
    + saberMarca(): string
    + saberModelo(): string
    + saberDescricao(): string
    + verificarEstoque(): int
}
  class Instrumento {
    - estado: string
    - tamanho: float
    + saberEstado(): string
    + saberTamanho(): float
}
  class Corda {
    - numeroCordas: int
    - tipoMadeira: string
    + saberNumeroCordas(): int
    + saberTipoMadeira(): string
}
  class Metal {
    - tipoBocal: string
    - tamanhoBocal: float
    + saberTipoBocal(): string
    + saberTamanhoBocal(): string
}
  class Percussao {
    - material: string
    - qtdPeles: int
    + saberMaterial(): string
    + saberQtdPeles(): int
}
  class Acessorio {
    - funcao: string
    - tamanho: float
    + saberFuncao(): string
    + saberTamanho(): float
}

Produto <|-- Instrumento
Produto <|-- Acessorio
Instrumento <|-- Corda
Instrumento <|-- Metal
Instrumento <|-- Percussao
```



