package automatizadosaucedemo.teste.test;

/**Classe responsável por armazenar variáveis utilizadas por todo o projeto. */
public class Constantes{
    
    /**Constante da página inicial de teste. */
     public static final String URL_BASE = "https://www.saucedemo.com/";

     /**Constante do caminho do chromedriver. */
     public static final String PATH_CHROME_DRIVER = "src/test/java/automatizadosaucedemo/resource/chromedriver-v103.0.5060.53.exe";

     /**Dados de usuário para fazer o login. */
     public final static String LOGIN = "performance_glitch_user";

     /**Dados de senha para fazer o login. */
     public final static String SENHA = "secret_sauce";

     /**Tempo máximo de espera de elementos. */
    public static final int TEMPO_MAXIMO_ESPERA = 10;
}
