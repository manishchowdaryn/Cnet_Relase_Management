package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseUtil;

public class ReleasePlanPage extends BaseUtil {

	public BaseUtil base;

	public ReleasePlanPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//li[4]/a")
	public WebElement ClickonReleasePlanLink;

	public WebElement ClickonReleasePlanLink() {
		return ClickonReleasePlanLink;
	}
	
	@FindBy(how = How.XPATH, using = "//div[2]/a")
	public WebElement ClickonCreateReleasePlanButton;

	public WebElement ClickonCreateReleasePlanButton() {
		return ClickonCreateReleasePlanButton;
	}
	
	@FindBy(how = How.XPATH, using = "//span/span")
	public WebElement ClickReleaseTypeField;

	public WebElement ClickReleaseTypeField() {
		return ClickReleaseTypeField;
	}
	
	@FindBy(how = How.XPATH, using = "//kendo-list/div/ul/li[2]")
	public WebElement SelectReleaseType;

	public WebElement SelectReleaseType() {
		return SelectReleaseType;
	}
	
	@FindBy(how = How.XPATH, using = "//kendo-datepicker/span/span/span")
	public WebElement ClickReleasePlanDate;

	public WebElement ClickReleasePlanDate() {
		return ClickReleasePlanDate;
	}
	
	@FindBy(how = How.XPATH, using = "//kendo-calendar-header/span[2]")
	public WebElement SelectReleasePlanDate;

	public WebElement SelectReleasePlanDate() {
		return SelectReleasePlanDate;
	}
	
	@FindBy(how = How.XPATH, using = "//input")
	public WebElement ClickReleasePlanName;

	public WebElement ClickReleasePlanName() {
		return ClickReleasePlanName;
	}
	@FindBy(how = How.XPATH, using = "//input")
	public WebElement EnterReleasePlanName;

	public WebElement EnterReleasePlanName() {
		return EnterReleasePlanName;
	}
	@FindBy(how = How.XPATH, using = "//div[4]/div[2]/input")
	public WebElement ClickDescription;

	public WebElement ClickDescription() {
		return ClickDescription;
	}
	@FindBy(how = How.XPATH, using = "//div[4]/div[2]/input")
	public WebElement EnterDescription;

	public WebElement EnterDescription() {
		return EnterDescription;
	}
	
	@FindBy(how = How.XPATH, using = "//div[5]/div[2]/input")
	public WebElement ClickOwner;

	public WebElement ClickOwner() {
		return ClickOwner;
	}
	@FindBy(how = How.XPATH, using = "//div[5]/div[2]/input")
	public WebElement EnterOwner;

	public WebElement EnterOwner() {
		return EnterOwner;
	}
	
	@FindBy(how = How.XPATH, using = "//div[2]/div/button")
	public WebElement ClickReleasePlanSaveButton;

	public WebElement ClickReleasePlanSaveButton() {
		return ClickReleasePlanSaveButton;
	}
}