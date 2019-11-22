package site.CartTest;
import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class Cart {

    WebDriver driver = new ChromeDriver();

    @Before
    public void runDriver() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "/Users/olgabragina/IdeaProjects/ClassWork/src/main/resources/chromedriver");
        driver.navigate().to("http:/automationpractice.com");
        //driver.get("https://automationpractice.com");

    }
    @Test
    public void search () throws InterruptedException {
       // runDriver();
        //System.out.println("Drivaer " + driver);
        //driver.get("https://automationpractice.com/");
        driver.findElement(By.xpath("//input[@id='search_query_top']")).click();
        driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Blouse", Keys.ENTER);
        driver.findElement(By.xpath("//i[@class='icon-th-list']")).click();

        WebDriverWait wait = new WebDriverWait (driver, 1000);
                wait.until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']")));

        driver.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']")).click();
        WebDriverWait waitElement = new WebDriverWait (driver, 1000);
        wait.until(ExpectedConditions.presenceOfElementLocated
                (By.xpath("//span[@class='ajax_cart_product_txt_s  unvisible']")));
        Thread.sleep(3000);


        driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();
        driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
        Thread.sleep(2000);

        String totalItem =driver.findElement(By.xpath("//span[@class='price']/span")).getText();
        System.out.println("totalitem " + totalItem);
        assertEquals(totalItem, "$27.00");


        String totalProducts = driver.findElement(By.xpath("//td[@id='total_product']")).getText();
        System.out.println("totalproduct " + totalProducts);
        assertEquals("$54.00", totalProducts);

        String totalShiping = driver.findElement(By.xpath("//td[@id='total_shipping']")).getText();
        assertEquals(totalShiping, "$2.00");

        String totalItemsNoTax = driver.findElement(By.xpath("//td[@id='total_price_without_tax']")).getText();
        assertEquals(totalItemsNoTax, "$56.00");

        String tax = driver.findElement(By.xpath("//td[@id='total_tax']")).getText();
        assertEquals(tax, "$0.00");

        String total = driver.findElement(By.xpath("//span[@id='total_price']")).getText();
        assertEquals(total,"$56.00");

        driver.findElement(By.xpath("//i[@class='icon-trash']")).click();
        Thread.sleep(500);

        String cart = driver.findElement(By.xpath("//span[@class='ajax_cart_no_product']")).getText();
        assertEquals(cart, "(empty)");

        driver.quit();







    }
}
