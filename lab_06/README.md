```mermaid
classDiagram
    direction BT

    RelogioTextual --|> Cronometro
    RelogioAnalogico --|> Relogio
    RelogioDisplay --|> Cronometro

    Cronometro --|> Relogio

    RelogioDisplay "1" *-- "6" Display
    Display "1" *-- "7" Segmento

    class Relogio {
        <<abstract>>
        # hora: int
        # minuto: int
        # segundo: int
        # x: double
        # y: double
        + Relogio(x: double, y: double, h: int, m: int, s: int)
        + desenhar(desenho: Draw)* void
        + atualizarTempo()* void
    }

    class Cronometro {
        <<abstract>>
        # modo: int
        # Cronometro(x: double, y: double, h: int, m: int, s: int)
    }

    class RelogioDisplay {
        - displays: ArrayList~Display~
        - cor: Color
        + static final int TAM_PEQUENO
        + static final int TAM_MEDIO
        + static final int TAM_GRANDE
        + RelogioDisplay(x: double, y: double, tamanho: int, modo: int, h: int, m: int, s: int)
        + ligarDisplay() void
    }

    class RelogioTextual {
        - tFonte: int
        - cor: Color
        - fonte: Font
        + RelogioTextual(x: double, y: double, tFonte: int, modo: int, fonte: Font, h: int, m: int, s: int)

    }

    class RelogioAnalogico {
        + RelogioAnalogico(x: double, y: double)
    }

    class Display {
        - segmentos: ArrayList~Segmento~
        - numero: int
        + Display(x: double, y: double, tamanho: double)
        + setValor(numero: int) void
        + desenhar(desenho: Draw, cor: Color) void
    }

    class Segmento {
        - ligado: boolean
        - x: double[]
        - y: double[]
        + Segmento(x: double[], y: double[])
        + setLigado(ligado: boolean) void
        + desenhar(desenho: Draw, cor: Color) void
    }
```