package configurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	private static WebDriver driver;

	private DriverFactory() {}
	public static WebDriver getDriver(){
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Rafael Santos\\Documents\\Projetos_Java\\cucumber_java\\src\\test\\resources\\web-driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://admin.staging.pedepronto.com.br/");
		}
		return driver;
	}

	public static void killDriver() {
		if(driver !=null) {
		driver.quit();
		driver = null;
		}
	}
	


}
