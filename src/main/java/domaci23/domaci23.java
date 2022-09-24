package domaci23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class domaci23 {
    public static void main(String[] args) throws InterruptedException {

        //Napraviti aplikaciju pomocu Selenium-a koji ce otvoriti sajt kupujemprodajem.com,
        // izlistati sve kategorije (Stvari) sa leve strane i njihove linkove (kao spoken tekst “kategorija: link”),
        // kliknuti iz te liste na Bicikli (bez hardkodovanja, posto imate listu, iskoristiti element iz nje da se klikne),
        // kliknuti na Električni (mozete hardcodovati). Ostati na toj strani kao kraj zadatka.
        // Uspavati program na 5 sekundi kako bi se video rezultat i posle toga browser zatvoriti.
        //Obratiti paznju na "ad" koji kaze da se registrujete. Uzeti dugme x i kliknuti
        // ga pre svega da ne bi ste imali problem da ne mozete da kliknete na kategoriju.
        //Za 5+ nakon klika na kategoriju bicikli, treba izlistati sve kategorije koje pisu (Mountainbike, Gradski itd).

        System.setProperty("webdriver.edge.driver","C:\\bootcamp\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.kupujemprodajem.com/");

        WebElement izlazIzReklame = driver.findElement(By.xpath("//*[@id=\"bodyTag\"]/div[9]/div/div[2]"));

        izlazIzReklame.click();

        List<WebElement> stvari = driver.findElements(By.xpath("//*[@id=\"category-tree-content-goods\"]/a"));


        for (int i = 0; i < stvari.size(); i++) {
            System.out.println(stvari.get(i).getText() + ": " + stvari.get(i).getAttribute("href"));
        }


        for (int i = 0;  i < stvari.size(); i++) {
            if (stvari.get(i).getText().equals("Bicikli")) {
               driver.navigate().to(stvari.get(i).getAttribute("href"));
               break;
            }
        }

        List<WebElement> tipoviBiciklova = driver.findElements(By.xpath("//*[@id=\"realCategoriesHolder\"]/div/div/div/div/h2/a/span"));

        for (int i = 0; i < tipoviBiciklova.size(); i++) {
            System.out.println(tipoviBiciklova.get(i).getText());

        }


        WebElement elektricniBicikli = driver.findElement(By.xpath("//*[@id=\"groupBox1360\"]/div[1]/h2/a"));
        elektricniBicikli.click();
        Thread.sleep(5000);
        driver.close();
    }
}
