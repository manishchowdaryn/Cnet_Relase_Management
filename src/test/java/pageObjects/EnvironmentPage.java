package pageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseUtil;

public class EnvironmentPage extends BaseUtil {

	public BaseUtil base;

	public EnvironmentPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//div/div[1]/div[2]/button/span/span")			 //div[2]/div[2]/div/div/div[2]/button	 
	public WebElement ClickCreateNewEnvironment;

	public WebElement ClickCreateNewEnvironment() {
		return ClickCreateNewEnvironment;

	}

	@FindBy(how = How.XPATH, using = "//div[2]/input")
	public WebElement ClickEnvironmentName;

	public WebElement ClickEnvironmentName() {
		return ClickEnvironmentName;
	}

	@FindBy(how = How.XPATH, using = "//div[2]/input")
	public WebElement EnterEnvironmentName;

	public WebElement EnterEnvironmentName() {
		return EnterEnvironmentName;
	}

	@FindBy(how = How.XPATH, using = "//div[2]/kendo-dropdownlist/span/span")
	public WebElement ClickEnvironmentType;

	public WebElement ClickEnvironmentType() {
		return ClickEnvironmentType;
	}

	@FindBy(how = How.XPATH, using = "//kendo-list/div/ul/li[3]")
	public WebElement SelectEnvironmentType;

	public WebElement SelectEnvironmentType() {
		return SelectEnvironmentType;
	}

	@FindBy(how = How.XPATH, using = "//div[2]/div/button")
	public WebElement ClickSave;

	public WebElement ClickSave() {
		return ClickSave;
	}

	@FindBy(how = How.XPATH, using = "//span/button")
	public WebElement ClickCreateWorkflowIcon;

	public WebElement ClickCreateWorkflowIcon() {
		return ClickCreateWorkflowIcon;
	}

	@FindBy(how = How.XPATH, using = "//kendo-grid-list/div/div[1]/table/tbody/tr/td[4]/button[2]")
	public WebElement ClickCloneEnvironmentIcon;

	public WebElement ClickCloneEnvironmentIcon() {
		return ClickCloneEnvironmentIcon;
	}

	@FindBy(how = How.XPATH, using = "//div[3]/div[2]/input")
	public WebElement ClickTargetEnvironmentName;

	public WebElement ClickTargetEnvironmentName() {
		return ClickTargetEnvironmentName;
	}

	@FindBy(how = How.XPATH, using = "//div[3]/div[2]/input")
	public WebElement EnterTargetEnvironmentName;

	public WebElement EnterTargetEnvironmentName() {
		return EnterTargetEnvironmentName;
	}

	@FindBy(how = How.XPATH, using = "//div[2]/kendo-dropdownlist/span/span")  //div[2]/kendo-dropdownlist/span/span  //div[2]/kendo-dropdownlist/span/span
	public WebElement ClickTargetEnvironmentType;

	public WebElement ClickTargetEnvironmentType() {
		return ClickTargetEnvironmentType;
	}

	@FindBy(how = How.XPATH, using = "//kendo-list/div/ul/li[3]")
	public WebElement SelectTargetEnvironmentType;

	public WebElement SelectTargetEnvironmentType() {
		return SelectTargetEnvironmentType;
	}

	@FindBy(how = How.XPATH, using = "//div[2]/div/button")
	public WebElement ClickSaveCloneEnvironment;

	public WebElement ClickSaveCloneEnvironment() {
		return ClickSaveCloneEnvironment;
	}

	@FindBy(how = How.XPATH, using = "//tr/td[4]/button[3]")
	public WebElement ClickStartEnvironmentRelease;

	public WebElement ClickStartEnvironmentRelease() {
		return ClickStartEnvironmentRelease;
	}
	
	
	@FindBy(how = How.XPATH, using = "//tr/td[3]/p/span")
	public WebElement VerifyStatus;

	public WebElement VerifyStatus() {
		return VerifyStatus;
	}

}