```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecinarMusica(String musica)
    }

    class AparelhoTelefonico {
        +atender()
        +Ligar(String numero)
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
