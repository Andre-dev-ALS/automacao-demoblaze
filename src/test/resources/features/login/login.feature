 #language: pt
 
 Funcionalidade: ações de login
  
  
  Contexto: usuário conectado
  Dado que estou na página inicial 
  Quando clico  no link Log in 
  E preencho o campo Username 
  E preencho o campo Password 
      E clico no botão Log in 
           
           
  @ID_0001
  Cenário: Realizar login bem sucedido
  Então na página é mostrada uma mensagem de bem vindo ao usuário    
  
  @ID_0002 
Cenário: realizar logout bem sucedido
Quando clico no link log out 
Então é mostrado o link para fazer o login novamente 