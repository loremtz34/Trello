#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Seguimiento tablero Trello
  			 El usuario debe poder registrarse a la plataforma,
  			 autenticarse y crear un tablero de trabajo en la plataforma.

  @CasoExitoso
  Scenario: Registro exitoso del usuario a Trello
  					El usuario debe poder registrarse a la plataforma,
  					autenticarse y crear un tablero de trabajo en la plataforma.
  	
  					
    Given Registro en trello con usuario  "leromtz@yopmail.com"
    When Diligencio formulario de registro 
    |   Nombre     |   Password   |
    |   leromtz		 |	lero123     |
    Then Verifico ingreso exitoso

  @Escenario2
  Scenario: Title of your scenario outline
    Given Inicio sesion con correo "lero@yopmail.com" y contraseña "12345678"
    When Creo un tablero nuevo con nombre "tablero1"
    Then Verifico la creacion exitosa del tablero "tablero1"


      