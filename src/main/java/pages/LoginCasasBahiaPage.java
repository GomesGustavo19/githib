package pages;

import org.openqa.selenium.By;

public class LoginCasasBahiaPage extends BasePage{

    public void buscarPagina(){getDriver().navigate().to("https://www.casasbahia.com.br/");}

    public void btnLogar(){getDriver().findElement(By.id("lnkCadastreSe")).click();}

    public void getCpfCnpj(String cpfCnpj){

        getDriver().findElement(By.id("CpfCnpj")).click();
        getDriver().findElement(By.id("CpfCnpj")).sendKeys(cpfCnpj);
        getDriver().findElement(By.id("btnContinuarLogin")).click();

    }

}
