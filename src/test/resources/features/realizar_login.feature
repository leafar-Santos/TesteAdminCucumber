#language: pt
Funcionalidade: Login no Admin da PEDE PRONTO

Como um usuário 
Gostaria de fazer login
Para que eu possa gerenciar meus Estabelecimentos comerciais

Contexto:
Dado que desejo fazer login no admim

@Positivo
Cenario: Deve fazer Login com sucesso

Quando Adiciono o usuario "rafael.santos@meubifeacebolado.com"
E eu adiciono a senha "b1107C@rol"
Então eu devo acessar a tela de pedidos

@negativo
Cenario: Deve falhar ao tentar realizar login com o email icorreto
Quando Adiciono o usuario "rafaelsantos@meubifeacebolado.com"
E eu adiciono a senha "b1107C@rol"
Então devo receber uma mensagem de erro

@negativo
Cenario: Deve falhar ao tentar realizar login com a senha icorreta
Quando Adiciono o usuario "rafael.santos@meubifeacebolado.com"
E eu adiciono a senha "b1107Carol"
Então devo receber uma mensagem de erro

@negativo
Cenario: Deve falhar ao tentar realizar login sem informar o e-mail
Quando Adiciono o usuario ""
E eu adiciono a senha "b1107C@rol"
Então devo receber uma mensagem de erro


@negativo
Cenario: Deve falhar ao realizar login sem informar a senha
Quando Adiciono o usuario "rafaelsantos@meubifeacebolado.com"
E eu adiciono a senha "b1107C@rol"
Então devo receber uma mensagem de erro

@negativo
Cenario: Deve falhar ao realizar login informando um e-mail invalido
Quando Adiciono o usuario "rafael.santosmeubifeacebolado.com"
E eu adiciono a senha "b1107C@rol"
Então devo receber a mensagem de erro na abaixo do campo e-mail "Insira um endereço de email válido"


@negativo
Cenario: Deve falhar ao realizar login sem informar o e-mail e a senha
Quando Adiciono o usuario ""
E eu adiciono a senha ""
Então devo receber uma mensagem de erro



