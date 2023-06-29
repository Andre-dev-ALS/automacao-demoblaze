#language: pt
 
 Funcionalidade: ações de cadastro
  
  Contexto: navegar para página inicial
  Dado que estou na página inicial
  
  @ID_0003
   Cenário: Cadastro bem sucedido de um novo usuário
   Quando clico no link Sign up em home
   E preencho o campo Username: em Sign up
   E       preencho o campo Password: em Sign up 
   E clico no botão    Sign up em Sign up 
       Então é mostrada uma mensagem de usuário cadastrado com sucesso em Sign up 