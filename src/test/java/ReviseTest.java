import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReviseTest{

    public static void main(String[]args){

        WebDriver driver= new ChromeDriver();
        driver.get("https://odel.lk/home");
        driver.quit();
    }
}
