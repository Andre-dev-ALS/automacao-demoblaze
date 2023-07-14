#language: pt
 
 Funcionalidade: ações de filtro
  
  
  Contexto: usuário conectado
  Dado que estou na página inicial 
  Quando clico  no link Log in em home
  E preencho o campo Username en login
  E preencho o campo Password en login
      E clico no botão Log in em login

 @ID_0007
 Cenário: validar a aparição de um produto da marca dell
   	Quando clico na categoria "Laptops"
   	Então é feita a validação da aparição do produto