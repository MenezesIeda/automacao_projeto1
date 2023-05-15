#language:pt
Funcionalidade: Login

  Contexto:
    Dado que a modal esteja aberta

  @fechaModal
  Cenario: Fechar a modal ao clicar fora da mesma
    Quando for realizado o clique fora da modal
    Então a janela modal deve ser fechada

  @fechaModalIcone
  Cenario: Fechar a modal realizando o clique no icone fechar
    Quando for realizado o clique no icone do fechar modal
    Então a janela modal deve ser fechada


  @createNewAccount
  Cenario: Link Create NewAccount
    Quando for realizado o clique no link Create NewAccount
    Então a pagina Create NewAccount deve ser exibida

  @loginComSucesso
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login sejam preenchidos da seguinte forma
      | usuario  | <usuario> |
      | senha    | <senha>   |
      | remember | <false>   |
    Quando for realizado o clique no botao sign in
    Entao deve ser possivel logar no sistema
    Exemplos:
      | identificacao       | usuario | senha   | remember |
      | campos obrigatorios | iedinha | 123Ieda | false    |
      | com todos os campos | iedinha | 123Ieda | false    |

  @loginComErro
  Esquema do Cenario: Realizar login com <identificacao>

    Quando os campos de login sejam preenchidos da seguinte forma
      | usuario  | <usuario> |
      | senha    | <senha>   |
      | remember | <false>   |
    Quando for realizado o clique no botao sign in
    Entao o sistema devera exibir uma mensagem de erro
    Exemplos:
      | identificacao    | usuario  | senha    | false |
      | usuario invalido | invalido | 123Ieda  | false |
      | senha invalida   | iedinha  | invalida | false |
  @dadosEmBranco
  Esquema do Cenario: Realizar login com <identificacao>

    Quando os campos de login sejam preenchidos da seguinte forma
      | usuario  | <usuario> |
      | senha    | <senha>   |
      | remember | <false>   |
    Entao o botao sign in deve permanecer desabilitado
    Exemplos:
      | identificacao     | usuario | senha   | remember |
      | usuario em branco |         | 123Ieda | false    |
      | senha em branco   | iedinha |         | false    |