package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("mac");
		driver.findElement(By.cssSelector("button.btn-light")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("input.form-control")).clear();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("samsung");
		driver.findElement(By.cssSelector("button.btn-light")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#input-search")).clear();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#input-search")).sendKeys("Asus");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#button-search")).click();
		driver.close();
	}

}
