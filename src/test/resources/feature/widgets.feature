# Autor Felipe Rincon
Feature: demoqa.com
  Como usuario de la pagina demoqa
  quiero entrar al apartado de "Widgets",
  ir a formulario de Auto Complete y llenar
  los campos con black y white, respectivamente

  @Widgets
  Scenario: Explorar el apartado de Widgets
    Given El usuario ingresa a la pagina demoqa
    When Resuelve el formulario Autocomplete
      | strMultiple | strOnly |
      | Black       | White   |
    Then El formulario se lleno correctamente
