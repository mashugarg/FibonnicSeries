package openBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openChrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mashu.garg\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mashu.garg\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://facebook.com");
		
		driver.get("http://10.200.208.237:9974/MCA_GUI");
		
		
		driver.findElement(By.xpath("[contains(@id,'mat-input')]")).sendKeys("admin");
		
		driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/app-root/app-login/app-common-login/form/mat-card/div/button")).click();
		
		driver.quit();
		
	}

}
