# Autor Felipe Rincon
Feature: demoqa.com
  Como usuario de la pagina demoqa
  quiero entrar al apartado de "Alerts,
  Frame & Windows" ir a la opcion de
  Alerts y verificar las cuatro alertas


  @Alerts
  Scenario: Explorar el apartado de Alerts, Frame & Windows
    Given El usuario ingresa a la pagina demoqa
    When Valida las alertas
    Then Se validaron las alertas correctamente