package automatizadosaucedemo.teste.test;

import org.junit.BeforeClass;
import org.junit.Test;
import automatizadosaucedemo.teste.page.LoginPO;
import automatizadosaucedemo.teste.page.RealizaCompraPO;

/**Método responsável por realizar compra dentro do site. */
public class TestCompra extends BaseTest{

    private static LoginPO loginPO;
    private static RealizaCompraPO realizaCompraPO;
    
    /**Método responsável por iniciar as instâncias das classes necessárias para executar os testes. */
    @BeforeClass
    public static void iniciarTeste(){
        loginPO = new LoginPO(driver);
        realizaCompraPO = new RealizaCompraPO(driver);
    }

    /**Método responsável por realizar compra dentro do site. */    
    @Test
    public void deveRealizarCompra(){
        abrirSite();
        loginPO.efetuaLogin(driver);
        loginPO.aguardaElementoVisivel(driver);
        realizaCompraPO.realizaCompra(driver);
        driver.quit();
    } 
}
