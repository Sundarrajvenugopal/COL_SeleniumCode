package careonlinepack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",
		          "C:\\Users\\M0124\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Thread.sleep(500);
	//driver.get("https://google.com");
	//driver.get("https://www.selenium.dev/downloads/");
	
	driver.get("http://192.168.1.177:8090/careonline-social/#/landingPage");
	
 

	}

}
