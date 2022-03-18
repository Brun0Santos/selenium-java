package modulos.produtos;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
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

        browser.findElement(By.cssSelector("label[for='usuario']")).click();
        browser.findElement(By.id("usuario")).sendKeys("brunonoptqs");

        browser.findElement(By.cssSelector("label[for='senha']")).click();
        browser.findElement(By.id("senha")).sendKeys("123456");

        browser.findElement(By.cssSelector("button[type=\"submit\"]")).click();





    }
}
