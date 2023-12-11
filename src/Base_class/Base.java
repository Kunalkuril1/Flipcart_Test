package Base_class;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	

	System.setProperty("webdriver.chrome.driver",
			"F:\\Automation Project\\Software\\chromedriver-win64\\chromedriver.exe");

	driver = new ChromeDriver();
	driver.get("https://www.billingsmarketassoc.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

}
