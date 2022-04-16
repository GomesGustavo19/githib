#lenguage: en

  Feature: Listar 3 Televisao Samsung

    @Amazon
    Scenario: Listar site com pesquisa de marca de tv

      Given que usuario esteja logado
      When que usuario informe os parametros da pesquisa
      Then devera que realizar a pesquisa
      And Valida o retorno da pesquisa

    @CasasBahia
    Scenario: Listar site com pesquisa de marca de tv

      Given que usuario esteja logado
      When que usuario informe os parametros da pesquisa
      Then devera que realizar a pesquisa
      And Valida o retorno da pesquisa

    @Submarino
    Scenario: Listar site com pesquisa de marca de tv

      @Submarino
      Given que usuario esteja logado
      When que usuario informe os parametros da pesquisa
      Then devera que realizar a pesquisa
      And Valida o retorno da pesquisa


