package modulos.produtos;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Product module web tests")
public class ProdutoTest {
    @Test
    @DisplayName("Teste não é permitido salvar produto com valor igual a zero")
    public void TestsIsNotAllowedToSaveProductWithValueEqualToZero(){
    //open the browser
        System.setProperty("webdriver.chrome.driver", "/home/bruno/Desktop/chromedriver_linux64/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();

        browser.get("http://165.227.93.41/lojinha-web/v2/");
        


    }
}
