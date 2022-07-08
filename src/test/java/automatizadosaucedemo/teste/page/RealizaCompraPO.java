package automatizadosaucedemo.teste.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

/**Page object da página de compra do site. */
public class RealizaCompraPO{
    
    public RealizaCompraPO realizaCompraPO;

    /**
     * Construtor da classe.
     * @param driver Driver da página.
     */
    public RealizaCompraPO(WebDriver driver){
        super();
    }

    /**
     * Método responsável por percorrer e preencher campos para realizar uma compra.
     * @param driver
     */
    public void realizaCompra(WebDriver driver){

        WebElement clickCombobox = driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
        clickCombobox.click();

        WebElement selecionaProduto1 = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
        selecionaProduto1.click();

        WebElement selecionaProduto2 = driver.findElement(By.className("shopping_cart_link"));
        selecionaProduto2.click();

        WebElement clickCheckout = driver.findElement(By.id("checkout"));
        clickCheckout.click();

        WebElement inputNome = driver.findElement(By.id("first-name"));
        inputNome.sendKeys("Rafael Quinteiro");

        WebElement inputSobreNome = driver.findElement(By.id("last-name"));
        inputSobreNome.sendKeys("Quinteiro");

        WebElement inputCep = driver.findElement(By.id("postal-code"));
        inputCep.sendKeys("25956110");

        WebElement clickContinue = driver.findElement(By.id("continue"));
        clickContinue.click();

        WebElement clickFinaliza = driver.findElement(By.id("finish"));
        clickFinaliza.click();
    
        WebElement textoDesejado = driver.findElement(By.className("complete-header"));
        String textoSucesso = textoDesejado.getText();
        Assert.assertEquals("THANK YOU FOR YOUR ORDER", textoSucesso);  
    }
}
