package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class PesquisaAmazonPage extends BasePage{

    private By msn = By.id("glow-ingress-line1");

    public void getPesquisr(String modeloTelevisao){

        getDriver().findElement(By.id("twotabsearchtextbox")).click();
        getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys(modeloTelevisao);

    }

    public void getBtnPesquisar(){

        getDriver().findElement(By.id("nav-search-submit-button")).click();

    }

    public void verificacaoPesquisa(){

        String verificaoPesquisa = getDriver().findElement(msn).getText();

        Assert.assertEquals(verificaoPesquisa, "Enviar para Gustavo");

    }
}
