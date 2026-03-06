package seleniumTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestUI {
public static void main(String[] args) throws InterruptedException{
	  WebDriver driver = new ChromeDriver();

      driver.get("https://www.youtube.com");
      driver.manage().window().maximize();

      driver.findElement(By.name("search_query")).sendKeys("Selenium tutorial");
      driver.findElement(By.name("search_query")).submit();

      Thread.sleep(4000);

      driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();

      Thread.sleep(8000);

      driver.quit();
}
}
