package browserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserTest {
    public static void main(String[] args) {
        String baseUrl="https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get(baseUrl);
        //driver.manage().window().maximize();//Maximise window
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//we give implicite timeto driver
        String title= driver.getTitle();
        System.out.println("Page Title: " +title);
        System.out.println("Page Resource: " +driver.getPageSource());
        System.out.println("Current Url:" + driver.getCurrentUrl());
        WebElement emailField = driver.findElement(By.id("user[email]"));
        System.out.println(emailField);
        emailField.sendKeys("ab@yahoo.com");
        WebElement passwordField = driver.findElement(By.name("user[password]"));//sending password to password field element
        System.out.print(passwordField);
        passwordField.sendKeys("Welcome1");
        //driver.close();

    }
    }

