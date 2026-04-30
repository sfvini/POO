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
> > Um filme tem um título, um ano de lançamento, um gênero, um diretor e um ou mais atores. Um ator tem
um nome e uma data de nascimento. Um filme pode ter uma ou mais avaliações, e cada avaliação está
associada a um único filme e a um único usuário. Um usuário tem um nome, um e-mail e uma senha. Um
usuário pode avaliar um ou mais filmes. Uma avaliação tem uma nota (de 1 a 5) e um comentário.

```mermaid
classDiagram
    direction LR

    Ator"1..*" --o "1"Filme
    Avaliacao"0..*" --* "1"Usuario
    Avaliacao"0..*" --* "1"Filme

    class Filme {
        - titulo: String
        - ano:  int
        - genero: String
        - diretor: String
        - atores: ArrayList~Ator~
        - avalicoes: ArrayList~Avalicao~
        + Filme(titulo: String, ano: int, genero: String, diretor: String)
        + addAtor(ator: Ator) boolean
        + addAvaliacao(avaliacao: Avaliacao) boolean
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
        + Usuario(nome: String, email: String, senha: String)
        + addAvaliacao(avaliacao: Avaliacao) boolean
    }
    
    class Avaliacao {
        - nota: int
        - comentario: String
        - usuario: Usuario
        - filme: Filme
        + Avaliacao(nota: int, comentario: String, usuario: Usuario, filme: Filme) 
        }
```

## Sistema de gestão de frotas
> Uma empresa possui uma frota de veículos. Cada veículo tem um modelo, uma placa e um ano de fabricação. A empresa tem vários motoristas, e cada motorista pode dirigir um ou mais veículos. A empresa
registra o uso de cada veículo, incluindo a data, o motorista e a distância percorrida.

```mermaid
classDiagram
    direction BT

    Motorista"1..*" --o "1"Empresa
    Veiculo"1..*" --o "1"Empresa
    Corrida "0..*" --* "1" Empresa
    Corrida "0..*" --* "1" Motorista
    Corrida "0..*" --* "1" Veiculo

    class Empresa {
        - motoristas: ArrayList~Motorista~
        - veiculos: ArrayList~Veiculo~
        - corridas: ArrayList~Corrida~
        - cnpj: int
        + Empresa(cnpj: int)
        + addMotorista(motorista: Motorista): boolean
        + addVeiculo(veiculo: Veiculo): boolean
        + addCorrida(corrida: Corrida): boolean
    }
    
    class Corrida {
        - data: LocalDate
        - distancia: double
        - motorista: Motorista
        - veiculo: Veiculo
        + Corrida(data: LocalDate, distancia: double, motorista: Motorista, veiculo: Veiculo)
    }
 
    class Veiculo { 
        - modelo: String
        - placa: String
        - ano: int 
        + Veiculo(modelo: String, placa: String, ano: int)
     }
     
     class Motorista { 
         - nome: String 
         + Motorista(nome: String)
     }
```

## Sistema de reserva de passagens aéreas
> Uma companhia aérea oferece voos para diversos destinos. Cada voo tem um número de voo, um destino,
uma data e uma hora de partida, e uma capacidade máxima de passageiros. Os passageiros podem reservar
assentos em um voo, e cada reserva está associada a um único passageiro e a um único voo. Um passageiro
tem um nome, um e-mail e um número de telefone.

```mermaid
classDiagram
    direction BT

    Reserva "0..*" --* "1" Passageiro
    Reserva "0..*" --* "1" Voo
    
    class Passageiro {
        - nome: String
        - email: String
        - telefone: int
        - reservas: ArrayList~Reserva~
        + Passageiro(nome: String, email: String, telefone: int)
        + addReserva(reserva: Reserva) boolean
    }
    
    class Voo {
        - numero: int
        - destino: String
        - data: LocalDate
        - hora: int
        - capacidade: int
        - reservas: ArrayList~Reserva~
        + Voo(numero: int, destino: String, data: LocalDate, hora: int, capacidade: int)
        + addReserva(reserva: Reserva) boolean
    }
    
    class Reserva {
        - voo: Voo
        - passageiro: Passageiro
        - assento: String
        + Reserva(voo: Voo, passageiro: Passageiro, assento: String)
    }
```