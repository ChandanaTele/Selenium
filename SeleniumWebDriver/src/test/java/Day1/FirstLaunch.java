package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstLaunch {

	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		
		driver.get("https://www.opencart.com/");
		
		String ActualTitle= driver.getTitle();
		
		System.out.println(ActualTitle);
		
		if (ActualTitle.equals("OpenCart - Open Source Shopping Cart Solution")) {
			
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		driver.close();
	}

}