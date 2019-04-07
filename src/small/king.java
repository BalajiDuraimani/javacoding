package small;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class king {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HelioAxial\\eclipse-workspace\\Arakawa\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("http://www.google.com");
		driver.quit(); 
		//Laaa
	}

}
