package reusableFunction;

import java.awt.AWTException;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.cucumber.listener.Reporter;

import baseClass.BaseUtil;
import ru.yandex.qatools.allure.annotations.Step;

public class Abstract extends BaseUtil {

	public static final Logger logg = LoggerFactory.getLogger(Abstract.class);
	public static String folderName;

	public BaseUtil base;

	public Abstract(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

//	@Step("Method to select by text from drop down")
//	public static void selectTheDropDownList(BaseUtil base, WebElement dropDown, String text) {
//		try {
//			Select select = new Select(dropDown);
//			select.selectByVisibleText(text);
//			base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//		} catch (NoSuchElementException exc) {
//			exc.printStackTrace();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//
//		}
//	}

	@Step("Method to select by text from drop down")
	public static void moveToElement(BaseUtil base, WebElement menulink) {
		try {

			Actions actions = new Actions(base.driver);
			//WebElement mainMenu = base.driver.findElement(By.xpath(menulink));
			actions.moveToElement(menulink).build().perform();
			base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		} catch (NoSuchElementException exc) {
			exc.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	@Step("Method to select by text from drop down")
	public static void moveToElementAndClick(BaseUtil base, WebElement subLinklocator) {
		try {

			Actions actions = new Actions(base.driver);
			//WebElement subMenu = base.driver.findElement(By.xpath(subLinklocator));
			actions.moveToElement(subLinklocator);
			actions.click().build().perform();
			base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		} catch (NoSuchElementException exc) {
			exc.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	

	@Step("Method to wait until condition is satisfied")
	public static WebElement waitUntilConditionSatisfy(BaseUtil base, WebElement webElement)
			throws IOException, AWTException, InterruptedException {
		//base.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		try {
			FluentWait<WebDriver> waitforelement = new FluentWait<WebDriver>(base.driver)
					.withTimeout(30, TimeUnit.SECONDS).pollingEvery(60, TimeUnit.MILLISECONDS)
					.ignoring(NoSuchElementException.class);
			waitforelement.until(ExpectedConditions.elementToBeClickable(webElement));
			base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		} catch (NoSuchElementException exc) {
			exc.printStackTrace();

		} catch (WebDriverException e) {
			e.printStackTrace();
			// Method to capture failed Screenshot
		
			screenshotcapture();
			
		}
		return webElement;
	}
	
	public static void validation(String ApplicationStatusText, String ApplicationStatus) throws IOException, AWTException {
		try {
		
			
			if(!ApplicationStatusText.equalsIgnoreCase(ApplicationStatus))
			{
				screenshotcapture();
				
			}
			
			Assert.assertEquals(ApplicationStatusText, ApplicationStatus);
		
		} catch (NoSuchElementException exc) {
			exc.printStackTrace();
			
		}
		
	}

	public void scrolldown(BaseUtil base) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) base.driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
        js.executeScript("window.scrollTo(0, Math.max(document.documentElement.scrollHeight, document.body.scrollHeight, document.documentElement.clientHeight));");
 
        
	}

	public static void screenshotcapture() throws IOException, AWTException {
		folderName = Reporter.getFolder();
		int i = Reporter.takescreenshot();
		Reporter.addScreenCaptureFromPath("./FailedScreenshot" + i + ".jpg");

	}

}
