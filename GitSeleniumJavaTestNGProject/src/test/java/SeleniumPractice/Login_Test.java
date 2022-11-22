package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Test {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
				
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		WebElement url = driver.findElement(By.xpath("//a[text()='https://phptavels.net/login']"));
		url.click();
		
		if(driver.getCurrentUrl().equals("https://phptravels.net/login")) {
			
		WebElement username = driver.findElement(By.xpath("//div[@class='form-group']//descendant::input[1]"));
		username.sendKeys("user@phptravels.com");
		
		WebElement pwd = driver.findElement(By.xpath("//div[@class='form-group mb-2']//descendant::input[1]"));
		pwd.sendKeys("demouser");
		
		WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
		login.click();
		}

	}

}
