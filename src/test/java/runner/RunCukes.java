package runner;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;

import baseClass.BaseUtil;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import steps.Hook;

@CucumberOptions(features = {
		"resources/features/Release Management End to End Flow.feature" }, monochrome = true, glue = "steps", plugin = {
				"html:target/site/cucumber-report-html", "json:target/cucumber.json",
				"pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json",
				"com.cucumber.listener.ExtentCucumberFormatter:" })

public class RunCukes extends AbstractTestNGCucumberTests {

	private static BaseUtil base;
	public static final Logger logger = Logger.getLogger(Hook.class.getName());
	static String folderName;
	
	@BeforeClass
	public static void setup() {
	
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		extentProperties.getReportPath();
	}

	@AfterClass
	public static void teardown() throws IOException, AWTException {
		Reporter.loadXMLConfig(new File("extent-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Windows 10");

		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		String reportPath = extentProperties.getReportPath().replace("report.html", "");

		String sourceFile = System.getProperty("user.dir") + "\\" + reportPath;
		File srcDir = new File(sourceFile);

		String destinationFile = System.getProperty("user.dir") + "\\ExtentReport\\CurrentReport";
		File destinationDir = new File(destinationFile);

		PrintWriter writer = new PrintWriter(System.getProperty("user.dir") + "\\ExtentReport\\currentReport.bat",
				"UTF-8");
		writer.println("xcopy /s /y " + sourceFile + "*.* " + destinationDir);
		writer.close();
		
		BaseUtil.driver.quit();
		
		logger.info("Chrome Browser Closed Successfully");

	}
}
