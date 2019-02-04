package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseUtil;

public class ReleasePlanningPage {

	public BaseUtil base;

	public ReleasePlanningPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//input")
	public WebElement ClickonReleaseTextbox;

	@FindBy(how = How.XPATH, using = "//input")
	public WebElement EnterReleaseName;

	@FindBy(how = How.XPATH, using = "//div/app-release-planning/form/div[1]/div[2]/div/div[1]/div[3]/div/div/div")
	public WebElement ClickonProject;

	@FindBy(how = How.XPATH, using = "//kendo-list/div/ul/li[3]")
	public WebElement SelectProject;

	@FindBy(how = How.XPATH, using = "//div[2]/div/div/div/kendo-dropdownlist/span/span")
	public WebElement ClickonApplication;

	@FindBy(how = How.XPATH, using = "//kendo-list/div/ul/li")
	public WebElement SelectApplication;

	@FindBy(how = How.XPATH, using = "//div[2]/div/div/kendo-dropdownlist/span/span")
	public WebElement ClickReleaseVersion;

	@FindBy(how = How.XPATH, using = "//kendo-list/div/ul/li[2]")
	public WebElement SelectReleaseVersion;

	@FindBy(how = How.XPATH, using = "//kendo-datepicker/span/span/span")
	public WebElement ClickonDatePicker;

	@FindBy(how = How.XPATH, using = "//kendo-calendar-header/span[2]")
	public WebElement SelectToday;

	@FindBy(how = How.XPATH, using = "//textarea")
	public WebElement ClickDescription;
	
	@FindBy(how = How.XPATH, using = "//textarea")
	public WebElement EnterDescription;

	@FindBy(how = How.ID, using = "savereleaseAndnextStep")
	public WebElement ClickSaveNext;

	public WebElement ClickonReleaseTextbox() {
		return ClickonReleaseTextbox;
	}

	public WebElement EnterReleaseName() {
		return EnterReleaseName;
	}

	public WebElement ClickonProject() {
		return ClickonProject;
	}

	public WebElement SelectProject() {
		return SelectProject;
	}

	public WebElement ClickonApplication() {
		return ClickonApplication;
	}

	public WebElement SelectApplication() {
		return SelectApplication;
	}

	public WebElement ClickReleaseVersion() {

		return ClickReleaseVersion;
	}

	public WebElement SelectReleaseVersion() {
		return SelectReleaseVersion;
	}

	public WebElement ClickonDatePicker() {
		return ClickonDatePicker;
	}

	public WebElement SelectToday() {
		return SelectToday;
	}

	public WebElement ClickDescription() {
		return ClickDescription;
	}
	
	public WebElement EnterDescription() {
		return EnterDescription;
	}

	public WebElement ClickSaveNext() {
		return ClickSaveNext;
	}
	

}