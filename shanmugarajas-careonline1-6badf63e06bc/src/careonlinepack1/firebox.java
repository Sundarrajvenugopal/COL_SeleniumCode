package careonlinepack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firebox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\M0124\\Downloads\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://google.com");
	driver.quit();

	}

}
