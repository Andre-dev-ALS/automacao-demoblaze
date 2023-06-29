 #language: pt
 
 Funcionalidade: ações de login
  
  
  Contexto: usuário conectado
  Dado que estou na página inicial 
  Quando clico  no link Log in em home
  E preencho o campo Username en login
  E preencho o campo Password en login
      E clico no botão Log in em login
           
    
  @ID_0001
  Cenário: Realizar login bem sucedido
  Então na página é mostrada uma mensagem de bem vindo ao usuário    em home
  
  
  @ID_0002 
Cenário: realizar logout bem sucedido
Quando clico no link log out em home
Então é mostrado o link para fazer o login novamente em home