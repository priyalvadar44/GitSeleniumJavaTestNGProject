package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScript {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        System.out.println("CurrentUrl :"+driver.getCurrentUrl());
        System.out.println("Titele :"+driver.getTitle());
        
//        driver.close();

	}

}
