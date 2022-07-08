package automatizadosaucedemo.teste.test;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**Classe base para todos os testes do projeto. Ao criar um novo teste deve se fazer a herança dessa classe. */
public abstract class BaseTest{
    
    /**Drive que será utilizado para os testes do sistema. */
    protected static WebDriver driver;

    /**Método responsável por iniciar todos os pontos necessários antes de executar qualquer teste. */
    @BeforeClass
    public static void abrirSite(){
        System.setProperty("webdriver.chrome.driver", Constantes.PATH_CHROME_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constantes.URL_BASE);
    }
}
