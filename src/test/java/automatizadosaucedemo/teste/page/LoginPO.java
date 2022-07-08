package automatizadosaucedemo.teste.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automatizadosaucedemo.teste.test.Constantes;

public class LoginPO{
    
    public LoginPO loginPO;

    /**
     * Construtor da classe.
     * @param driver Driver da página.
     */
    public LoginPO(WebDriver driver){
        super();
    }

    /**
     * Método responsável por fazer login no site.
     */
    public void efetuaLogin(WebDriver driver){ 
        WebElement login = driver.findElement(By.id("user-name"));
        login.clear();
        login.sendKeys(Constantes.LOGIN);
        
        WebElement senha = driver.findElement(By.id("password"));
        senha.clear();
        senha.sendKeys(Constantes.SENHA);

        WebElement btnLogin = driver.findElement(By.id("login-button"));
        btnLogin.click();
    }
    
    /**
     * Método responsável aguardar o elemento de texto "Products fica disponível".
     */
    public void aguardaElementoVisivel(WebDriver driver) {		
        WebDriverWait wait = new WebDriverWait(driver, Constantes.TEMPO_MAXIMO_ESPERA);
        WebElement usuario = wait.until(ExpectedConditions.elementToBeClickable(By.className("product_sort_container")));
        usuario.sendKeys("product_sort_container");
    }
}
