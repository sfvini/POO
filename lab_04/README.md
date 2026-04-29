# Diagramas UML

## Sistema de comércio eletrônico
> Um produto tem uma descrição, um preço e uma quantidade em estoque. Um cliente tem um nome, um
e-mail e um ou mais endereços de entrega. Um cliente pode fazer um ou mais pedidos. Um pedido tem uma
data, uma situação (pendente, pago, entregue, cancelado), um ou mais produtos, sendo que cada produto
tem uma quantidade e um preço unitário.

```mermaid
classDiagram
    direction BT

    Pedido"0..*" --* "1"Cliente
    Produto"0..*" --o "1"Pedido
    Endereco"1..*" --* "1"Cliente

    class Produto {
        - id: int
        - descricao: String
        - preco: double
        - quantidadeEst: int
        + Produto(descricao: String, preco: double, quantidadeEst: int)
    }

    class Cliente {
        - nome: String
        - email: String
        - enderecos: ArrayList~Endereco~
        - pedidos: ArrayList~Pedido~
        + addPedido(data: LocalDate, situacao: String) boolean
        + addProduto(idPedido: int, idProduto: int, quantidade: int) boolean
        + removeProduto(idPedido: int, idProduto: int, quantidade: int) boolean
        + addEndereco(cep: String, rua: String, numero: int, complemento: String) boolean
        + Cliente(nome: String, email: String)
    }

    class Pedido {
        - id: int
        - data: LocalDate
        - situacao: String
        - produtos: HashMap~Produto, Integer~
        + addProduto(id: int, quantidade: int) boolean
        + removeProduto(id: int, quantidade: int) boolean
        + Pedido(data: LocalDate, situacao: String)
    }

    class Endereco {
        - cep: String
        - rua: String
        - numero: int
        - complemento: String
        + Endereco(cep: String, rua: String, numero: int, complemento: String)
    }
```

## Sistema de avaliações de filmes
> Um filme tem um título, um ano de lançamento, um gênero, um diretor e um ou mais atores. Um ator tem
um nome e uma data de nascimento. Um filme pode ter uma ou mais avaliações, e cada avaliação está
associada a um único filme e a um único usuário. Um usuário tem um nome, um e-mail e uma senha. Um
usuário pode avaliar um ou mais filmes. Uma avaliação tem uma nota (de 1 a 5) e um comentário.

```mermaid
classDiagram
    direction LR

    Ator"1..*" --o "1"Filme
    Avalicao"0..*" --* "1"Usuario
    Avalicao"0..*" --* "1"Filme

    class Filme {
        - titulo: String
        - ano:  int
        - genero: String
        - diretor: String
        - atores: ArrayList~Ator~
        - avalicoes: ArrayList~Avalicao~
        + Filme(titulo: String, ano: int, genero: String, diretor: String) 
        + addAtor(nome: String) boolean
        + addAvaliacao()
    }
    
    class Ator {
        - nome: String
        - dataNasc: LocalDate
        + Ator(nome: String, dataNasc: LocalDate)
    }
    
    class Usuario {
        - nome: String
        - email: String
        - senha: String
        - avalicoes: ArrayList~Avalicao~
    }
    
    class Avalicao {
    }
```