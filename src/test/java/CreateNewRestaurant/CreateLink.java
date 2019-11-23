package CreateNewRestaurant;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class CreateLink {
    WebDriver driver = new ChromeDriver();
    String registationLink;

    @BeforeTest
    public void createDriver (){
        System.setProperty("webdriver.chrome.driver",
                "/Users/olgabragina/IdeaProjects/HomeTask12/src/main/resources/chromedriver 2");
        driver.navigate().to("https://st2.allsetnow.com/hogwarts/");

    }

    @Test
    //login
    public void loginAdmin (){
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("QQQ", Keys.ENTER);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("QQQQ");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

    // openMerchantTab
        driver.findElement(By.xpath("//a[@id='ui-id-71']")).click();
        driver.findElement(By.xpath("//div[@id='module_8_8']/div/ul/li/a")).click();

   // createLinck
        driver.findElement(By.xpath("//a[@class='addlink']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("AutotestLink", Keys.ENTER);
        registationLink = driver.findElement(By.xpath("//td[@class='field-link']")).getText();
        System.out.println(registationLink + " = registration");

       // openRegLinck
//        String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
        driver.navigate().to(registationLink);


    }


    }


