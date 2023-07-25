#language: pt
 
 Funcionalidade: ações no carrinho
  
  
  Contexto:
  Dado que estou na página inicial 
  Quando clico  no link Log in 
  E preencho o campo Username 
  E preencho o campo Password 
      E clico no botão Log in 
           
           
 @ID_0008
 Cenário: adicionar um produto no carrinho com sucesso
Quando clico na categoria "Monitors"
E seleciono um dos produtos  da lista de resultados
E clico no link Add to cart
E clico no link cart
Então é validado se o produto foi adicionado

@ID_0009
Cenário: adicionar múltiplos produtos no carrinho e validar o preço total
Quando clico na categoria 'Laptops'
E seleciono um dos produtos  da lista de resultados
E clico no link Add to cart
E clico no link Home
Quando clico na categoria 'Monitors'
E seleciono um dos produtos  da lista de resultados
E clico no link Add to cart
E clico no link cart 
Então é validado se a soma do preço dos produtos adicionados é correta

@ID_0010
Cenário: deletar um produto do carrinho
Quando clico na categoria 'Monitors'
E seleciono um dos produtos  da lista de resultados
E clico no link Add to cart
E clico no link cart
Quando clico no link Delete
Então é validado se o produto foi removido do carrinho

@ID_0011
Cenário: adicionar múltiplos itens no carrinho, remover um dos produtos e validar o preço final 
Quando clico na categoria 'Laptops'
E seleciono um dos produtos  da lista de resultados
E clico no link Add to cart
E clico no link Home
Quando clico na categoria 'Phones'
E seleciono um dos produtos  da lista de resultados
E clico no link Add to cart
E clico no link cart
Quando clico no link Delete
Então é validado se o preço total foi alterado após a remoção de um produto