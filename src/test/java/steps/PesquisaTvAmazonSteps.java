package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginAmzonPage;
import pages.PesquisaAmazonPage;

public class PesquisaTvAmazonSteps {

    LoginAmzonPage loginPage = new LoginAmzonPage();
    PesquisaAmazonPage pesquisaPage = new PesquisaAmazonPage();

    @Given("que usuario esteja logado")
    public void que_usuario_esteja_logado(){

        loginPage.buscaPagina();
        loginPage.botaoEntrar();
        loginPage.getEmail("Insira seu Email Aqui");
        loginPage.getSenha("Insira sua Senha aqui");
        loginPage.verificacaoLogado();

    }

    @When("que usuario informe os parametros da pesquisa")
    public void que_usuario_informe_os_parametros_da_pesquisa() {

        pesquisaPage.getPesquisr("Samsung 55q80q");
    }
    @Then("devera que realizar a pesquisa")
    public void devera_que_realizar_a_pesquisa() {
        pesquisaPage.getBtnPesquisar();
    }

    @Then("Valida o retorno da pesquisa")
    public void valida_o_retorno_da_pesquisa() {
        pesquisaPage.verificacaoPesquisa();
    }

}
