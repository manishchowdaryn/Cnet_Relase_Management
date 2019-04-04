package steps;

import java.awt.AWTException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import atu.testrecorder.ATUTestRecorder;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import baseClass.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseUtil {

	private static final Logger logger = Logger.getLogger(Hook.class.getName());
	public static BaseUtil base;
	static String folderName;
	

	public Hook(BaseUtil base) {
		this.base = base;
	}

	public static String scenarioName;
	Properties prop = new Properties();
	InputStream input = null;

	@Before
	public void InitializeTest(Scenario scenario) throws Exception {

		input = new FileInputStream("resources//config//configuration.properties");
		prop.load(input);

		scenarioName = scenario.getName();
		System.out.println(scenarioName);
		System.out.println(prop.getProperty("BaseURL"));

			
		try {
			if (scenarioName.contains("FireFox")) {

				File file = new File("driver//geckodriver.exe");
				System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
				
		
				if (base.driver == null) {

					BaseUtil.driver = new FirefoxDriver();
					BaseUtil.driver.manage().window().maximize();
					logger.info("Firefox Browser Launched Successfully");

				}

			} else if (scenarioName.contains("Chrome")) {

				File file = new File("driver//chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
				
				if (base.driver == null) {

					base.driver = new ChromeDriver();
					base.driver.manage().window().maximize();
					logger.info("Chrome Browser Launched Successfully");
					
				}

			} else if (scenarioName.contains("Microsoft Edge")) {
				File file = new File("driver//MicrosoftWebDriver.exe");
				System.setProperty("webdriver.edge.driver", file.getAbsolutePath());

				if (base.driver == null) {

					base.driver = new InternetExplorerDriver();
					base.driver.manage().window().maximize();
					logger.info("Microsoft Edge Browser Launched Successfully");
				}

			} else {

				throw new IllegalArgumentException("The Browser Type is Undefined");

			}
			
			
		} catch (Exception e) {
			System.out.println(e + "Exception handeled");

		}
	}

	 
}
