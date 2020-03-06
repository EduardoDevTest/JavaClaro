
#Feature Teste - Analista de Automação "CLARO"
@tag
Feature: Realizar agendamento de viagem 

Como usuario eu quero
Eu quero realizar um agendamento  
Para realização de um agendamento de viagem com sucesso.


  @tag1
  Scenario: Realizar login 
    Given que isiro dados validos de login 
    When  insiro os dados nos campos indicados 
    Then  consigo realizar o logon com sucesso tocando na opcao sign in 
    
    
  @tag2
  Scenario: Realizar validacao Select Flight
    Given dado que estou na tela Flight Finder
    When  realizo o preechimento das opçoes de viagem
    Then  seleciono a opcao continue com sucesso 

 
 
  @tag3
  Scenario: Realizar valaidaco do Summary
    Given dado quando estou na pagina de escolha de companhia area 
    When  seleciono com sucesso o dia de partida e de retorno 
    Then  toco em coninue com sucesso 
 
 

  @tag4
  Scenario: Realizar validacao do Flight confirmation NUMBER
    Given dado quando estou na pagina de escolha de companhia area 
    When  seleciono com sucesso o dia de partida e de retorno 
    Then  toco em coninue com sucesso 
 
 
 
 
 
 
 
 
 
