 #language: pt

 Funcionalidade: ações sessão contato
 
 
Contexto: usuário conectado
  Dado que estou na página inicial 
  Quando clico  no link Log in 
  E preencho o campo Username 
  E preencho o campo Password 
      E clico no botão Log in 
           
           
 @ID_0006
 Cenário: enviar uma mensagem bem sucedida 
 Quando clico no link Contact em home
 E preencho o campo Contact Email: em contato
 E preencho o campo Contact Name: em contato
 E preencho o campo Message: em contato
 E clico no botão    Send message em contato  
 Então recebo um alerta de       mensagem enviada com sucesso em contato