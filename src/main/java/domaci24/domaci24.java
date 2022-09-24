package domaci24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class domaci24 {
    public static void main(String[] args) {

        //Napisati program koji na sajtu:
        //http://automationpractice.com
        //dodaje najmanje 3 proizvoda u cart, nastavlja do cart-a,
        //izbacuje jedan proizvod, a drugom povecava kolicinu za 1.

        System.setProperty("webdriver.edge.driver","C:\\bootcamp\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("http://automationpractice.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

        WebElement addToCart1 = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]"));
        addToCart1.click();

        driver.navigate().to("http://automationpractice.com/index.php");

        WebElement addToCart2 = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[3]/div/div[2]/div[2]/a[1]"));
        addToCart2.click();

        driver.navigate().to("http://automationpractice.com/index.php");

        WebElement addToCart3 = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[5]/div/div[2]/div[2]/a[1]"));
        addToCart3.click();

        driver.navigate().to("http://automationpractice.com/index.php");

        WebElement goToCart = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
        goToCart.click();

        WebElement delete = driver.findElement(By.xpath("//*[@id=\"3_13_0_0\"]"));
        delete.click();

        WebElement quantityUp = driver.findElement(By.xpath("//*[@id=\"cart_quantity_up_1_1_0_0\"]"));
        quantityUp.click();

       // driver.quit();




    }
}
