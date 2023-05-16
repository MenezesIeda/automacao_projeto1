#language:pt
@CRUD
Funcionalidade: Account CRUD

  @cadastroCRUD
  Cenario: Cadastro de nova conta
    Dado que a pagina CreatAccount esteja sendo exibida
    Quando os campos forem preenchidos da seguinte maneira
      | username | maria                    |
      | email    | ieda_menezes@htomail.com |
      | password | Maria123                 |
      | country  | Brazil                   |
    Entao deve ser possivel logar no sistema apos o cadastro

  @loginCRUD
  Cenario: Realizar login CRUD
    Dado que a modal esteja aberta
    Quando os campos de login sejam preenchidos da seguinte forma
      | usuario  | maria    |
      | senha    | Maria123 |
      | remember | <false>  |
    Quando for realizado o clique no botao sign in
    Entao deve ser possivel logar no sistema

  @alteracaoCRUD
  Cenario: Realizar alteracao CRUD
    Dado que esteja logado no sistema
      | usuario  | maria    |
      | senha    | Maria123 |
      | remember | false    |
    Dado que esteja na pagina de alteracao de conta
    Quando altero os valores dos seguintes campos
      | firstname | ieda  |
      | lastname  | maria |
    Quando realizo o clique em salvar
    Entao a alteracao foi exibida na pagina MyAccount

  @exclusaoCRUD
  Cenario: Realizar exclusao CRUD
    Dado que esteja logado no sistema
      | usuario  | maria    |
      | senha    | Maria123 |
      | remember | false    |
    Dado que esteja na pagina MyAccount
    Quando for efetuado o clique em Delete e Yes
    Entao o usuario deve ser deletado