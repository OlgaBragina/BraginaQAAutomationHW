package CreateNewRestaurant;

import org.testng.annotations.*;
import org.openqa.selenium.By;


public class FillRegistrationForm {

    CreateLink createLink = new CreateLink();

    @BeforeTest
    public void precondition() throws InterruptedException {
        createLink.createDriver();
        createLink.loginAdmin();
        Thread.sleep(2000);
    }

        @DataProvider(name = "data-provider")
        public static Object[][] testDataProvider () throws Exception {
            return new Object[][]{
                    //positive case
                    {"autotest@gmail.com", "12345r", "TestUserName", "+14158976456", "Restaurant1"}
            };
        }

        @Test(dataProvider = "data-provider")
        public void fillForm (String email, String password, String yourName, String phone, String restaurantName) throws Exception {

            createLink.driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
            createLink.driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
            createLink.driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys(yourName);
            createLink.driver.findElement(By.xpath("//input[@placeholder='Your personal phone number']")).sendKeys(phone);
            createLink.driver.findElement(By.xpath("//input[@placeholder='Restaurant name']")).sendKeys(restaurantName);
            createLink.driver.findElement(By.xpath("//div[@class='dropdown-control dropdown']")).click();
            createLink.driver.findElement(By.xpath("//*[contains(text(),'Austin')]")).click();

        }

        @Test
    public void method1 (){
            System.out.println("Method 1 is running");
        }

    @Test
    public void method2(){
        System.out.println("Method 2 is running");
    }

    @Test
    public void method3(){
        System.out.println("Method 3 is running");
    }
    @Test
    public void mehod4(){
        System.out.println("Method 4 is running");
    }

    @AfterClass
    public void closeBrowser()

    {
        createLink.driver.quit();
    }


    }
