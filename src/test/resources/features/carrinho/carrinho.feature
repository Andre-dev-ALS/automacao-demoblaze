#language: pt
 
 Funcionalidade: ações no carrinho
  
  
  Contexto: usuário conectado
  Dado que estou na página inicial 
  Quando clico  no link Log in em home
  E preencho o campo Username en login
  E preencho o campo Password en login
      E clico no botão Log in em login
 
 @ID_0008
 Cenário: adicionar um produto no carrinho com sucesso
Quando clico na categoria "Monitors"
E seleciono o primeiro produto da lista de resultados
E clico no link Add to cart
E clico no link cart
Então é validado se o produto foi adicionado