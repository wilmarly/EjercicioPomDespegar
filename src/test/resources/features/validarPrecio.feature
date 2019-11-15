#Author: Wilmar SAnchez
#Creacion de formulario
@tag
Feature: CP0010M Buscar un vuelvo de solo ida para 2 adultos y 3 niños,  validar el precio más barato del vuelo
  

  @tag2
  Scenario Outline: Title of your scenario outline
    Given Ingreso a navegador
    When Buscar un vuelvo <ida-regreso>
    Then validadr el menor valor de vuelo
   

    Examples: 
      | ida-regreso  | 
      | True         |  
      
