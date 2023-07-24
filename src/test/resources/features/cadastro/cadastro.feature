#language: pt
 
 Funcionalidade: ações de cadastro
 
 
Contexto: cadastro de novo usuário
  Dado que estou na página inicial
  Quando clico no link Sign up 
  
 @ID_0003 
   Cenário: Cadastro bem sucedido de um novo usuário
   E preencho o campo Username: 'novo' 
   E       preencho o campo Password: "novo" 
Quando clico no botão Sign up
         Então é mostrada uma mensagem de usuário cadastrado com sucesso
       

      @ID_0004
      Cenário: tentar cadastrar um usuário já existente
      E preencho o campo Username: "existente"
   E       preencho o campo Password: "existente" 
Quando clico no botão Sign up 
         Então é mostrada uma mensagem de usuário já cadastrado 