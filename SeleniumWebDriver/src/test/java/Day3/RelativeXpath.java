package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/");
		
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//a[normalize-space()='Features']")).click();
		
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//a[normalize-space()='Download']")).click();
		
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg hidden-xs']")).click();
		
//		driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("Test699");
//		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Demo1");
	}

}
