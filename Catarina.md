## Estrutura Básica de uma Classe
```mermaid
classDiagram
  class Pessoa{
  - nome: string
  - idade: int
  + cumprimentar(): void
}
```
## Múltiplas Classes
```mermaid
classDiagram
  class Pessoa {
    - nome: string
    + cumprimentar(): void
  }

  class Aluno {
    - matricula: string
    + assistirAula(): void
  }

  class Professor {
    - salario: float
    + darAula(): void
  }
```

## Herança
```mermaid
classDiagram
  class Pessoa
  class Aluno
  class Professor

  Pessoa <|-- Aluno
  Pessoa <|-- Professor
```

## Herança com Múltiplos Métodos e Retorno
```mermaid
classDiagram
  class Pessoa {
    +nome: string
    +cumprimentar(): void
    +getIdade(): int
  }

  class Aluno {
    +matricula: string
    +assistirAula(): void
    +verNotas(): string
  }

  class Professor {
    +salario: float
    +darAula(): void
    +calcularHoras(): int
  }

  Pessoa <|-- Aluno
  Pessoa <|-- Professor
```

## Associação Simples
```mermaid
classDiagram
  class Professor
  class Turma

  Professor "1" --> "muitas" Turma : leciona
```

## Composição (forte)
```mermaid
classDiagram
  class Turma
  class Aluno

  Turma "1" *-- "*" Aluno : possui
```

## Agregação (fraca)
```mermaid
classDiagram
  class Curso
  class Disciplina

  Curso "1" o-- "*" Disciplina : contém
```

## Diagrama Completo de Exemplo
```mermaid
classDiagram
  class Pessoa {
    +nome: string
    +cpf: string
    +getDados(): string
  }

  class Aluno {
    +matricula: string
    +assistirAula(): void
    +verNotas(): string
  }

  class Professor {
    +salario: float
    +darAula(): void
    +calcularHoras(): int
  }

  class Turma {
    +codigo: string
    +listarAlunos(): string
  }

  class Curso {
    +nomeCurso: string
  }

  class Disciplina {
    +nomeDisciplina: string
  }

  Pessoa <|-- Aluno
  Pessoa <|-- Professor

  Professor "1" --> "*" Turma : leciona
  Aluno "*" --> "1" Turma : frequenta
  Curso "1" o-- "*" Disciplina : contém
  Disciplina "1" --> "*" Turma : compõe
```

