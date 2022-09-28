import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {

    private WebDriver driver;

    @BeforeClass
    public void BeforeClass() {
        System.setProperty("webdriver.edge.driver","C:\\bootcamp\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
    }

    @AfterClass
    public void AfterClass() {
      //  driver.quit();
    }

    @BeforeMethod
    public void BeforeMethod(){
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

    }

    @Test
    public void testAddOperationTwoPositiveNumber () {

        String expectedResult = "15";
        WebElement firstNumberField = driver.findElement(By.id("number1Field"));
        firstNumberField.sendKeys("5");
        WebElement secondNumberField = driver.findElement(By.id("number2Field"));
        secondNumberField.sendKeys("10");
        WebElement btn = driver.findElement(By.xpath("//*[@id=\"calculateButton\"]"));
        btn.click();
        String actualResult = driver.findElement(By.id("numberAnswerField")).getAttribute("value");

        System.out.println(actualResult);

        Assert.assertEquals(actualResult,expectedResult);

    }



    @Test
    public void testAddOperationTwoNegativeNumber () {

        String expectedResult = "-12";
        WebElement firstNumberField = driver.findElement(By.id("number1Field"));
        firstNumberField.sendKeys("-5");
        WebElement secondNumberField = driver.findElement(By.id("number2Field"));
        secondNumberField.sendKeys("-7");
        WebElement btn = driver.findElement(By.xpath("//*[@id=\"calculateButton\"]"));
        btn.click();
        String actualResult = driver.findElement(By.id("numberAnswerField")).getAttribute("value");

        System.out.println(actualResult);

        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test
    public void testAddOperationOneNegativeOnePositive () {

        String expectedResult = "-6";
        WebElement firstNumberField = driver.findElement(By.id("number1Field"));
        firstNumberField.sendKeys("-9");
        WebElement secondNumberField = driver.findElement(By.id("number2Field"));
        secondNumberField.sendKeys("3");
        WebElement btn = driver.findElement(By.xpath("//*[@id=\"calculateButton\"]"));
        btn.click();
        String actualResult = driver.findElement(By.id("numberAnswerField")).getAttribute("value");

        System.out.println(actualResult);

        Assert.assertEquals(actualResult,expectedResult);

    }
    @Test
    public void testAddOperationZero () {

        String expectedResult = "6";
        WebElement firstNumberField = driver.findElement(By.id("number1Field"));
        firstNumberField.sendKeys("6");
        WebElement secondNumberField = driver.findElement(By.id("number2Field"));
        secondNumberField.sendKeys("0");
        WebElement btn = driver.findElement(By.xpath("//*[@id=\"calculateButton\"]"));
        btn.click();
        String actualResult = driver.findElement(By.id("numberAnswerField")).getAttribute("value");

        System.out.println(actualResult);

        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test
    public void testSubtractTwoPositiveNumber() {
        String expectedResult = "7";
        WebElement firstNumberField = driver.findElement(By.id("number1Field"));
        firstNumberField.sendKeys("12");
        WebElement secondNumberField = driver.findElement(By.id("number2Field"));
        secondNumberField.sendKeys("5");

        WebElement selecte1 = driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]"));
        Select select = new Select(selecte1);
        select.selectByVisibleText("Subtract");

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"calculateButton\"]"));
        btn.click();

        String actualResult = driver.findElement(By.id("numberAnswerField")).getAttribute("value");
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test
    public void testSubtractTwoNegativeNumber() {
        String expectedResult = "26";
        WebElement firstNumberField = driver.findElement(By.id("number1Field"));
        firstNumberField.sendKeys("-6");
        WebElement secondNumberField = driver.findElement(By.id("number2Field"));
        secondNumberField.sendKeys("-32");

        WebElement selecte1 = driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]"));
        Select select = new Select(selecte1);
        select.selectByVisibleText("Subtract");

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"calculateButton\"]"));
        btn.click();

        String actualResult = driver.findElement(By.id("numberAnswerField")).getAttribute("value");
        Assert.assertEquals(actualResult,expectedResult);

    }
    @Test
    public void testSubtractZero() {
        String expectedResult = "12";
        WebElement firstNumberField = driver.findElement(By.id("number1Field"));
        firstNumberField.sendKeys("12");
        WebElement secondNumberField = driver.findElement(By.id("number2Field"));
        secondNumberField.sendKeys("0");

        WebElement selecte1 = driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]"));
        Select select = new Select(selecte1);
        select.selectByVisibleText("Subtract");

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"calculateButton\"]"));
        btn.click();

        String actualResult = driver.findElement(By.id("numberAnswerField")).getAttribute("value");
        Assert.assertEquals(actualResult,expectedResult);

    }
  @Test
    public void testMultiplyTwoPositiveNumber() {
        String expectedResult = "210";
        WebElement firstNumberField = driver.findElement(By.id("number1Field"));
        firstNumberField.sendKeys("21");
        WebElement secondNumberField = driver.findElement(By.id("number2Field"));
        secondNumberField.sendKeys("10");

        WebElement selecte1 = driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]"));
        Select select = new Select(selecte1);
        select.selectByVisibleText("Multiply");

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"calculateButton\"]"));
        btn.click();

        String actualResult = driver.findElement(By.id("numberAnswerField")).getAttribute("value");
        Assert.assertEquals(actualResult,expectedResult);

    }
  @Test
    public void testMultiplyWithOnePositive() {
        String expectedResult = "16";
        WebElement firstNumberField = driver.findElement(By.id("number1Field"));
        firstNumberField.sendKeys("16");
        WebElement secondNumberField = driver.findElement(By.id("number2Field"));
        secondNumberField.sendKeys("1");

        WebElement selecte1 = driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]"));
        Select select = new Select(selecte1);
        select.selectByVisibleText("Multiply");

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"calculateButton\"]"));
        btn.click();

        String actualResult = driver.findElement(By.id("numberAnswerField")).getAttribute("value");
        Assert.assertEquals(actualResult,expectedResult);

    }
    @Test
    public void testMultiplyWithOneNegative() {
        String expectedResult = "-16";
        WebElement firstNumberField = driver.findElement(By.id("number1Field"));
        firstNumberField.sendKeys("16");
        WebElement secondNumberField = driver.findElement(By.id("number2Field"));
        secondNumberField.sendKeys("-1");

        WebElement selecte1 = driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]"));
        Select select = new Select(selecte1);
        select.selectByVisibleText("Multiply");

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"calculateButton\"]"));
        btn.click();

        String actualResult = driver.findElement(By.id("numberAnswerField")).getAttribute("value");
        Assert.assertEquals(actualResult,expectedResult);

    }
    @Test
    public void testMultiplyWithZero() {
        String expectedResult = "0";
        WebElement firstNumberField = driver.findElement(By.id("number1Field"));
        firstNumberField.sendKeys("17");
        WebElement secondNumberField = driver.findElement(By.id("number2Field"));
        secondNumberField.sendKeys("0");

        WebElement selecte1 = driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]"));
        Select select = new Select(selecte1);
        select.selectByVisibleText("Multiply");

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"calculateButton\"]"));
        btn.click();

        String actualResult = driver.findElement(By.id("numberAnswerField")).getAttribute("value");
        Assert.assertEquals(actualResult,expectedResult);

    }
    @Test
    public void testMultiplyWithTwoNegativeNumber() {
        String expectedResult = "15";
        WebElement firstNumberField = driver.findElement(By.id("number1Field"));
        firstNumberField.sendKeys("-3");
        WebElement secondNumberField = driver.findElement(By.id("number2Field"));
        secondNumberField.sendKeys("-5");

        WebElement selecte1 = driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]"));
        Select select = new Select(selecte1);
        select.selectByVisibleText("Multiply");

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"calculateButton\"]"));
        btn.click();

        String actualResult = driver.findElement(By.id("numberAnswerField")).getAttribute("value");
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test
    public void testDivideWithTwoPositiveNumber() {
        String expectedResult = "5";
        WebElement firstNumberField = driver.findElement(By.id("number1Field"));
        firstNumberField.sendKeys("15");
        WebElement secondNumberField = driver.findElement(By.id("number2Field"));
        secondNumberField.sendKeys("3");

        WebElement selecte1 = driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]"));
        Select select = new Select(selecte1);
        select.selectByVisibleText("Divide");

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"calculateButton\"]"));
        btn.click();

        String actualResult = driver.findElement(By.id("numberAnswerField")).getAttribute("value");
        Assert.assertEquals(actualResult,expectedResult);

    }
    @Test
    public void testDivideWithTwoNegativeNumber() {
        String expectedResult = "5";
        WebElement firstNumberField = driver.findElement(By.id("number1Field"));
        firstNumberField.sendKeys("-15");
        WebElement secondNumberField = driver.findElement(By.id("number2Field"));
        secondNumberField.sendKeys("-3");

        WebElement selecte1 = driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]"));
        Select select = new Select(selecte1);
        select.selectByVisibleText("Divide");

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"calculateButton\"]"));
        btn.click();

        String actualResult = driver.findElement(By.id("numberAnswerField")).getAttribute("value");
        Assert.assertEquals(actualResult,expectedResult);

    }
    @Test
    public void testDivideWithOne() {
        String expectedResult = "9";
        WebElement firstNumberField = driver.findElement(By.id("number1Field"));
        firstNumberField.sendKeys("9");
        WebElement secondNumberField = driver.findElement(By.id("number2Field"));
        secondNumberField.sendKeys("1");

        WebElement selecte1 = driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]"));
        Select select = new Select(selecte1);
        select.selectByVisibleText("Divide");

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"calculateButton\"]"));
        btn.click();

        String actualResult = driver.findElement(By.id("numberAnswerField")).getAttribute("value");
        Assert.assertEquals(actualResult,expectedResult);

    }
    @Test
    public void testDivideWithZero() {
        String expectedResult = "Divide by zero error!";
        WebElement firstNumberField = driver.findElement(By.id("number1Field"));
        firstNumberField.sendKeys("5  ");
        WebElement secondNumberField = driver.findElement(By.id("number2Field"));
        secondNumberField.sendKeys("0");

        WebElement selecte1 = driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]"));
        Select select = new Select(selecte1);
        select.selectByVisibleText("Divide");

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"calculateButton\"]"));
        btn.click();

        String actualResult = driver.findElement(By.id("errorMsgField")).getText();
        Assert.assertEquals(actualResult,expectedResult);

    }





}
