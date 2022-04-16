package pages;


import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginAmzonPage extends BasePage{

    private By msn = By.cssSelector("#nav-link-accountList-nav-line-1");


    public void buscaPagina(){
        getDriver().navigate().to("https://www.amazon.com.br/");
    }

    public void botaoEntrar(){

        getDriver().findElement(By.cssSelector("#nav-link-accountList-nav-line-1")).click();

    }

    public void getEmail(String email){

        getDriver().findElement(By.cssSelector("#ap_email")).click();
        getDriver().findElement(By.cssSelector("#ap_email")).sendKeys(email);
        getDriver().findElement(By.cssSelector(".a-button-input")).click();
    }

    public void getSenha(String senha){
        getDriver().findElement(By.cssSelector("#ap_password")).click();
        getDriver().findElement(By.cssSelector("#ap_password")).sendKeys(senha);
        getDriver().findElement(By.id("signInSubmit")).click();
    }

    public void verificacaoLogado(){

        String msnLogin = getDriver().findElement(msn).getText();

        Assert.assertEquals(msnLogin, "Olá, Gustavo");

    }




}
