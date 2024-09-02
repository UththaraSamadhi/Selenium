import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;

public class LinkTestExample {
WebDriver driver;
    @BeforeMethod
    public void OpenLinkTestPage(){

        //pre preparation of the test
        driver=new ChromeDriver();
        driver.manage().window().maximize();//maximizing the window
        driver.get("https://leafground.com/link.xhtml;jsessionid=node0iyjjlrqpew1o1ebm9j2ryq8f75720643.node0");
    }

    @Test
    public void LinkTest(){
         //take me to the dashboard
        WebElement homelink = driver.findElement(By.linkText("Go to Dashboard"));
        homelink.click();
        driver.navigate().back();


        //find my destination
        WebElement wheretoGo= driver.findElement(By.partialLinkText("Find the URL"));
        String path =wheretoGo.getAttribute("href");
        System.out.println("This link is going to:"+path);

        //am i broken link
        WebElement brokenlink =driver.findElement(By.linkText("broken?"));
        brokenlink.click();
        driver.getTitle();

        String title=driver.getTitle();
        if(title.contains("404")){
            System.out.println("The link is broken");
        }
        else{
            System.out.println("Not broken");
        }


        driver.navigate().back();



    }


}