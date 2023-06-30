#language: pt
 
 Funcionalidade: ações de cadastro
 
 
Contexto: cadastro de novo usuário
  Dado que estou na página inicial
  Quando clico no link Sign up em home
  
 @ID_0003 
   Cenário: Cadastro bem sucedido de um novo usuário
   E preencho o campo Username: 'novo'  em Sign up
   E       preencho o campo Password: "<novo>" em Sign up
Quando clico no botão    Sign up em Sign up   
         Então é mostrada uma mensagem de usuário cadastrado com sucesso em Sign up
       

      @ID_0004
      
      Cenário: tentar cadastrar um usuário já existente
      E preencho o campo Username: 'existente'  em Sign up
   E       preencho o campo Password: "<existente>" em Sign up
Quando clico no botão    Sign up em Sign up   
         Então é mostrada uma mensagem de usuário já cadastrado em Sign up