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

	@FindBy(how = How.XPATH, using = "//span/span")
	public WebElement ClickonReleaseType;

	@FindBy(how = How.XPATH, using = "//kendo-list/div/ul/li")
	public WebElement SelectReleaseType;

	@FindBy(how = How.XPATH, using = "//input")
	public WebElement ClickonReleaseTextbox;

	@FindBy(how = How.XPATH, using = "//input")
	public WebElement EnterReleaseName;

	@FindBy(how = How.XPATH, using = "//div/kendo-dropdownlist/span/span")
	public WebElement ClickonGroup;

	@FindBy(how = How.XPATH, using = "//kendo-list/div/ul/li")
	public WebElement SelectGroup;

	@FindBy(how = How.XPATH, using = "//kendo-multiselect/div")
	public WebElement ClickonTeam;

	@FindBy(how = How.XPATH, using = "//kendo-list/div/ul/li")
	public WebElement SelectTeam;

	@FindBy(how = How.XPATH, using = "//div[3]/kendo-multiselect/div")
	public WebElement ClickonProduct;

	@FindBy(how = How.XPATH, using = "//kendo-list/div/ul/li")
	public WebElement SelectProduct;

	@FindBy(how = How.XPATH, using = "//div[4]/kendo-multiselect/div")
	public WebElement ClickonApplication;

	@FindBy(how = How.XPATH, using = "//kendo-list/div/ul/li[2]")
	public WebElement SelectApplication;

	@FindBy(how = How.XPATH, using = "//div[3]/div/kendo-dropdownlist/span")
	public WebElement ClickReleasePlan;

	@FindBy(how = How.XPATH, using = "//kendo-list/div/ul/li")
	public WebElement SelectReleasePlan;

	@FindBy(how = How.XPATH, using = "//div[2]/kendo-dropdownlist/span/span")
	public WebElement ClickonTemplate;

	@FindBy(how = How.XPATH, using = "//kendo-list/div/ul/li[3]")
	public WebElement SelectTemplate;

	@FindBy(how = How.XPATH, using = "//div/kendo-dropdownlist/span/span")
	public WebElement ClickInfraReleasePlan;

	@FindBy(how = How.XPATH, using = "//kendo-list/div/ul/li")
	public WebElement SelectInfraReleasePlan;

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

	@FindBy(how = How.XPATH, using = "//li[2]/span/div/b")
	public WebElement ClickonWorkflowTab;

	@FindBy(how = How.XPATH, using = "//kendo-multiselect/div")
	public WebElement ClickOnInfraPlatform;

	@FindBy(how = How.XPATH, using = "//kendo-list/div/ul/li")
	public WebElement SelectInfraPlatform;
	

	public WebElement ClickonReleaseType() {
		return ClickonReleaseType;
	}

	public WebElement SelectReleaseType() {
		return SelectReleaseType;
	}

	public WebElement ClickOnInfraPlatform() {
		return ClickOnInfraPlatform;
	}

	public WebElement SelectInfraPlatform() {
		return SelectInfraPlatform;
	}
	
	public WebElement ClickonReleaseTextbox() {
		return ClickonReleaseTextbox;
	}

	public WebElement EnterReleaseName() {
		return EnterReleaseName;
	}

	public WebElement ClickonGroup() {
		return ClickonGroup;
	}

	public WebElement SelectGroup() {
		return SelectGroup;
	}

	public WebElement ClickonTeam() {
		return ClickonTeam;
	}

	public WebElement SelectTeam() {
		return SelectTeam;
	}

	public WebElement ClickonProduct() {
		return ClickonProduct;
	}

	public WebElement SelectProduct() {
		return SelectProduct;
	}

	public WebElement ClickonApplication() {
		return ClickonApplication;
	}

	public WebElement SelectApplication() {
		return SelectApplication;
	}

	public WebElement ClickReleasePlan() {

		return ClickReleasePlan;
	}

	public WebElement SelectReleasePlan() {
		return SelectReleasePlan;
	}

	public WebElement ClickonTemplate() {

		return ClickonTemplate;
	}

	public WebElement SelectTemplate() {
		return SelectTemplate;
	}

	public WebElement ClickInfraReleasePlan() {

		return ClickInfraReleasePlan;
	}

	public WebElement SelectInfraReleasePlan() {
		return SelectInfraReleasePlan;
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

	public WebElement ClickonWorkflowTab() {
		return ClickonWorkflowTab;
	}

}