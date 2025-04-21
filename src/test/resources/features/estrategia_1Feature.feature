Feature: Validar Estrategia

  Scenario: Validar que la estrategia X se ejecute correctamente
    Given el navegador está abierto en la página de inicio
    When ingreso al módulo de estrategia
    Then el módulo se carga correctamente
    When ejecuto la estrategia X
    Then los resultados se muestran en pantalla