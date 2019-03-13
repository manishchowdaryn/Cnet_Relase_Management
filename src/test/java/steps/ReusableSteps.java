package steps;

import java.awt.AWTException;



import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import baseClass.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import pageObjects.Login;
import pageObjects.DashboardPage;
import pageObjects.ReleasePlanningPage;
import pageObjects.EnvironmentPage;
import pageObjects.WorkflowPage;
import pageObjects.ReleaselistSearchPage;
import pageObjects.PluginConfigurationsPage;

import reusableFunction.Abstract;
import runner.RunCukes;

public class ReusableSteps extends BaseUtil {

	private static final Logger logger = Logger.getLogger(ReusableSteps.class.getName());

	public BaseUtil base;
	public Login Login;
	public DashboardPage DashboardPage;
	public ReleasePlanningPage ReleasePlanningPage;
	public EnvironmentPage EnvironmentPage;
	public WorkflowPage WorkflowPage;
	public ReleaselistSearchPage ReleaselistSearchPage;
	public PluginConfigurationsPage PluginConfigurationsPage;
	public Abstract Abstract;
	static String folderName;

	Properties prop = new Properties();
	InputStream input = null;

	public ReusableSteps(BaseUtil base) {

		this.base = base;
		Login = new Login(base.driver);
		DashboardPage = new DashboardPage(base.driver);
		ReleasePlanningPage = new ReleasePlanningPage(base.driver);
		EnvironmentPage = new EnvironmentPage(base.driver);
		WorkflowPage = new WorkflowPage(base.driver);
		Abstract = new Abstract(base.driver);
		ReleaselistSearchPage = new ReleaselistSearchPage(base.driver);
		PluginConfigurationsPage = new PluginConfigurationsPage(base.driver);

	}

	@Given("^Launch Browser and access the Matilda URL$")
	public void launch_Browser_and_Navigate_to_CNet_Incident_URL() throws Throwable {
		input = new FileInputStream("resources//config//configuration.properties");
		prop.load(input);
		base.driver.manage().window().maximize();
		base.driver.get(prop.getProperty("BaseURL"));
		base.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		logger.info("Enter Matilda URL in the address bar of the browser");

	}

	@Then("^Verify whether Login page is correctly opened or not$")
	public void verify_whether_Login_page_is_correctly_opened_or_not() throws Throwable {

		String runTimePageTitle = base.driver.getTitle();

		String expectediMageHeaderText = "Matilda";

		boolean pageValidation = runTimePageTitle.equalsIgnoreCase(expectediMageHeaderText);
		base.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		if (pageValidation == false) {

			// Method to capture failed Screenshot
			Abstract.screenshotcapture();

			Assert.assertEquals(runTimePageTitle, expectediMageHeaderText);
			logger.info("Verify whether Login page is correctly opened or not");
		}

	}

//	@Then("^Switch to MainFrame$")
//	public void switch_to_MainFrame() throws Throwable {
//
//		try {
//			/*
//			 * WebDriverWait wait = new WebDriverWait(base.driver, 10);
//			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Login.
//			 * switch_to_Main_frame()));
//			 */
//
//			base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//			Thread.sleep(3000);
//			logger.info("Switch to MainFrame");
//
//		} catch (WebDriverException e) {
//
//			// Method to capture failed Screenshot
//			Abstract.screenshotcapture();
//
//		}
//	}

	@Then("^Enter Username and Password as \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_Username_and_Password_as_and(String Username, String Password) throws Throwable {

		base.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		WebElement userID = Abstract.waitUntilConditionSatisfy(base, Login.useridLocator());
		userID.clear();
		userID.sendKeys(Username);


		logger.info("Entered Username");

		WebElement password = Abstract.waitUntilConditionSatisfy(base, Login.passwordLocator());
		password.clear();
		password.sendKeys(Password);

		logger.info("Entered Password");

		WebElement loginButton = Abstract.waitUntilConditionSatisfy(base, Login.loginButton());
		loginButton.click();

		logger.info("Clicked on Sign In Button");

	}

//	@Then("^Switch to Multiple Window and Select value as \"([^\"]*)\"$")
//	public void HandleMultipleWindows(String lookupValue) throws IOException, InterruptedException, AWTException {
//		try {
//			String mainWindow = base.driver.getWindowHandle();
//			String windowTitle = base.driver.getTitle();
//			Set<String> allWindowHandles = base.driver.getWindowHandles();
//			for (String currentWindowHandle : allWindowHandles) {
//				if (!currentWindowHandle.equals(mainWindow)) {
//					base.driver.switchTo().window(currentWindowHandle);
//					base.driver.manage().window().maximize();
//					base.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//					try {
//						WebElement searchButton = Abstract.waitUntilConditionSatisfy(base,
//								ChangeRequest.searchButton());
//						searchButton.sendKeys(lookupValue);
//						base.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//						searchButton.sendKeys(Keys.ENTER);
//						Thread.sleep(4000);
//						base.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//						WebDriverWait wait = new WebDriverWait(base.driver, 10);
//						wait.until(ExpectedConditions.elementToBeClickable(By.linkText(lookupValue)));
//						base.driver.findElement(By.linkText(lookupValue)).click();
//						Thread.sleep(4000);
//						logger.info("Switch to Multiple Window and Select Text as :" + lookupValue);
//					} catch (WebDriverException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//			base.driver.switchTo().window(mainWindow);
//
//
//
//			logger.info("Switch to MainFrame");
//		} catch (WebDriverException e) {
//			e.printStackTrace();
//		}
//	}

//	@Then("^Switch to Multiple Window$")
//	public void switchToMultipleWindow() throws IOException, InterruptedException {
//		try {
//			String mainWindow = base.driver.getWindowHandle();
//			String windowTitle = base.driver.getTitle();
//			Set<String> allWindowHandles = base.driver.getWindowHandles();
//			for (String currentWindowHandle : allWindowHandles) {
//				if (!currentWindowHandle.equals(mainWindow)) {
//					base.driver.switchTo().window(currentWindowHandle);
//
//					base.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//				}
//			}
//			base.driver.switchTo().window(mainWindow);
//			base.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//			logger.info("Switch to Multiple Window");
//		} catch (NoSuchElementException exc) {
//			exc.printStackTrace();
//		} catch (WebDriverException e) {
//			e.printStackTrace();
//		}
//	}
//
}
