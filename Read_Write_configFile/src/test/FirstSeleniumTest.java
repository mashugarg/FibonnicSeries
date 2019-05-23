package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {

	static String browser;
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\mashu.garg\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://gmail.com/");
		
		setBrowser();
		setBrowserConfig();
		RunTest();
	}

	public static void setBrowser() 
	{
		browser="Chrome";
		
	}
	public static void setBrowserConfig() {
		
		
		if(browser.contains("firefox"));
		{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\mashu.garg\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		//System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		driver = new FirefoxDriver();
	}
		if(browser.contains("Chrome"));
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mashu.garg\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	}

	public static void RunTest() {
		driver.get("https://gmail.com/");
		driver.quit();
	}
}