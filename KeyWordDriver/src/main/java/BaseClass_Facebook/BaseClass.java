package BaseClass_Facebook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;

	public WebDriver init_driver(String browserName) {
		System.setProperty("webdriver.chrome.driver",
				"G:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public Properties inti_properties() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(
					"G:\\Workspace directory\\KeyWordDriver\\src\\main\\java\\Fb_KeyWord_Config\\ConfigProperties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return prop;
	}
}
