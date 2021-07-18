package runners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TesteEcommerce {

    public static WebDriver driver;
    public WebDriverWait wait;

    @BeforeMethod
    public void inicializar(){
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    public void TestAdicionaApenasUmProdutoNoCarrinho() {
        List<WebElement> produtos = driver.findElements(By.cssSelector("#homefeatured li h5 a"));
        for(int i = 0; i < produtos.size(); i++){
            String nomes = produtos.get(i).getText();
            System.out.println(nomes);
            if(nomes.contains("Faded Short Sleeve T-shirts")){
                driver.findElements(By.cssSelector("#homefeatured li a.ajax_add_to_cart_button span")).get(i).click();
                break;
            }
        }
    }

    @Test
    public void TestAdicionaVariosProdutosNoCarrinho() {
        String[] produtosParaAdicionar = {"Faded Short Sleeve T-shirts","Blouse"};
        List<WebElement> produtos = driver.findElements(By.cssSelector("#homefeatured li h5 a"));
        for(int i = 0; i < produtos.size(); i++){
            String nomes = produtos.get(i).getText();
            List produtosParaAdicionarListar = Arrays.asList(produtosParaAdicionar);
            if(produtosParaAdicionarListar.contains(nomes)){
                driver.findElements(By.cssSelector("#homefeatured li a.ajax_add_to_cart_button span")).get(i).click();
                wait = new WebDriverWait(driver, 20);
                WebElement btnContinuarComprando = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span"));
                wait.until(ExpectedConditions.visibilityOf(btnContinuarComprando));
                btnContinuarComprando.click();
            }
        }
    }


    @AfterMethod
    public void fechar(){
        driver.quit();
    }

}
