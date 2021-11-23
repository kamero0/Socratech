package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.List;

public class FindElementTest {

    private WebDriver driver;
    protected HomePage homePage;

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement link = driver.findElement(By.linkText("Shifting Content"));
        link.click();

        WebElement link2 = driver.findElement(By.linkText("Example 1: Menu Element"));
        link2.click();

        List<WebElement> links = driver.findElements(By.tagName("li"));
        System.out.println(links.size());



    }

}