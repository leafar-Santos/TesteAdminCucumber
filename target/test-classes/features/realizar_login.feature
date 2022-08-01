Feature: Login no Admin da PEDE PRONTO

Como um usuário 
Gostaria de fazer login
Para que eu possa gerenciar meus Estabelecimentos comerciais

Background:
Given que desejo fazer login no admim

@Positivo
Scenario: Deve fazer Login com sucesso

When Adiciono o usuario "rafael.santos@meubifeacebolado.com"
And eu adiciono a senha "b1107C@rol"
Then eu devo acessar a tela de pedidos

@negativo
Scenario: Deve falhar ao tentar realizar login com o email icorreto
When Adiciono o usuario "rafaelsantos@meubifeacebolado.com"
And eu adiciono a senha "b1107C@rol"
Then devo receber uma mensagem de erro

@negativo
Scenario: Deve falhar ao tentar realizar login com a senha icorreta
When Adiciono o usuario "rafael.santos@meubifeacebolado.com"
And eu adiciono a senha "b1107Carol"
Then devo receber uma mensagem de erro

@negativo
Scenario: Deve falhar ao tentar realizar login sem informar o e-mail
When Adiciono o usuario ""
And eu adiciono a senha "b1107C@rol"
Then devo receber uma mensagem de erro


@negativo
Scenario: Deve falhar ao realizar login sem informar a senha
When Adiciono o usuario "rafaelsantos@meubifeacebolado.com"
And eu adiciono a senha "b1107C@rol"
Then devo receber uma mensagem de erro

@negativo
Scenario:
Deve falhar ao realizar login informando um e-mail invalido
When Adiciono o usuario "rafael.santosmeubifeacebolado.com"
And eu adiciono a senha "b1107C@rol"
Then devo receber a mensagem de erro na abaixo do campo e-mail "Insira um endereço de email válido"


@negativo
Scenario:
Deve falhar ao realizar login sem informar o e-mail e a senha
When Adiciono o usuario ""
And eu adiciono a senha ""
Then devo receber uma mensagem de erro



