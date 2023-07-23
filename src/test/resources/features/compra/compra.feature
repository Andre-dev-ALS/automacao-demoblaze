#language: pt
 
 Funcionalidade: ações de compra
  
  
  Contexto: usuário conectado
  Dado que estou na página inicial 
  Quando clico  no link Log in em home
  E preencho o campo Username en login
  E preencho o campo Password en login
      E clico no botão Log in em login

@ID_0012
      Cenário: Finalizar o processo de compra com sucesso
Quando clico na categoria 'Laptops'
E seleciono um dos produtos  da lista de resultados
E clico no link Add to cart
E clico no link Home
Quando clico na categoria 'Monitors'
E seleciono um dos produtos  da lista de resultados
E clico no link Add to cart
E clico no link cart 
Quando clico no botão Place Order 
E preencho o campo Name:
E preencho o campo Country:
E preencho o campo City:
E preencho o campo Credit card:
E preencho o campo Month:
E preencho o campo Year:
Quando clico no botão Purchase
Então é mostrada uma mensagem de agradecimento pela compra