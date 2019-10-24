package site;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    WebDriver driver = new ChromeDriver();

    @Before
    public void runDriver() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "/Users/olgabragina/IdeaProjects/ClassWork/src/main/resources/chromedriver");
        driver.navigate().to("https://sandbox2.allsetnow.com");
        Thread.sleep(10000);

    }

    @Test
    public void login() throws InterruptedException {
        runDriver();
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='phone']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input")).sendKeys("4158888888");
        driver.findElement(By.xpath("//span[@class='text-base white text-bold-l']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input")).sendKeys("7777");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.close();

    }

}
