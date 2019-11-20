#Author: Wilmar SAnchez
#Creacion de formulario
@tag
Feature: CP0010M Buscar un vuelvo de solo ida para 2 adultos y 3 niños,  validar el precio más barato del vuelo

  @tag2
  Scenario Outline: Title of your scenario outline
    Given Ingreso a navegador
    When seleccionar si el viaje es de "<Ida_y_Regreso>" o "<solo_ida>"
    And Buscar un vuelvo desde "<origen>" a "<destino>"
    And seleccionar el numero de <niños> y el numero de <adultos>
    Then validadr el vuelo mas barato

    Examples: 
      | origen | destino | Ida_y_Regreso | solo_ida | niños | adultos |
      | bogotá | Roma    | si            | no       |     3 |       2 |
