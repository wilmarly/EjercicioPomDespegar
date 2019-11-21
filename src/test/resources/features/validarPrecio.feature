#Author: Wilmar SAnchez
#Creacion de formulario
@tag
Feature: CP0010M Buscar un vuelvo de solo ida para 2 adultos y 3 niños,  validar el precio más barato del vuelo

  @tag1
  Scenario Outline: CP0010M_Buscar un vuelvo de solo ida para 2 adultos y 3 niños y validar el precio más barato del vuelo.
    Given Ingreso a navegador
    When seleccionar si el viaje es de "<Ida_y_Regreso>" o "<solo_ida>"
    And Buscar un vuelvo desde "<origen>" a "<destino>" de solo ida
    And seleccionar el numero de <niños> y el numero de <adultos>
    Then validadr el vuelo mas barato

    Examples: 
      | origen | destino | Ida_y_Regreso | solo_ida | niños | adultos |
      | bogotá | Roma    | no            | si       |     3 |       2 |

  @tag2
  Scenario Outline: CP0020M_Buscar un vuelo de ida y vuelta para 4 adultos y 4 niños y validar el precio más barato del vuelo.
    Given Ingreso a navegador
    When seleccionar si el viaje es de "<Ida_y_Regreso>" o "<solo_ida>"
    And Buscar un vuelvo desde "<origen>" a "<destino>"
    And seleccionar el numero de <niños> y el numero de <adultos>
    Then validadr el vuelo mas barato

    Examples: 
      | origen | destino | Ida_y_Regreso | solo_ida | niños | adultos |
      | bogotá | Roma    | si            | no       |     4 |       4 |

  @tag3
  Scenario Outline: CP0030M_Buscar un vuelo para 3 niños 2 adultos sin decidir fecha validar el precio más alto del vuelo.
    Given Ingreso a navegador
    When seleccionar si el viaje es de "<Ida_y_Regreso>" o "<solo_ida>"
    And Buscar un vuelvo desde "<origen>" a "<destino>"
    And seleccionar el numero de <niños> y el numero de <adultos>
    Then validadr el vuelo mas barato

    Examples: 
      | origen | destino | Ida_y_Regreso | solo_ida | niños | adultos |
      | bogotá | Roma    | no            | no       |     3 |       2 |
