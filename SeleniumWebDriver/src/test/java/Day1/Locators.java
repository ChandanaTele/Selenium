package Day1;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement.*;

public class Locators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		
		//name
		driver.findElement(By.name("newsletter")).sendKeys("cart");
		
		List<WebElement> Links = driver.findElements(By.className("col-sm-2"));
		System.out.println("Number of links: "+Links.size());
		
		List<WebElement> TotalLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links: "+TotalLinks.size());
		
		List<WebElement> Images = driver.findElements(By.tagName("img"));
		
		System.out.println("Total Images are : "+Images.size());
	}

}
