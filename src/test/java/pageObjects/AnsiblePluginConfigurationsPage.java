package pageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseUtil;

public class AnsiblePluginConfigurationsPage extends BaseUtil {

	public BaseUtil base;

	public AnsiblePluginConfigurationsPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(how = How.XPATH, using = "//*[@id='playbook']")
	public WebElement ClickonPath;

	public WebElement ClickonPath() {
		return ClickonPath;

	}

	@FindBy(how = How.XPATH, using = "//*[@id='playbook']")
	public WebElement EnterPathName;

	public WebElement EnterPathName() {
		return EnterPathName;

	}
	
	@FindBy(how = How.XPATH, using = "//*[@id='SFTP']")
	public WebElement ClickonSFTP;

	public WebElement ClickonSFTP() {
		return ClickonSFTP;

	}

	
	@FindBy(how = How.XPATH, using = "//*[@id='source_host']")
	public WebElement ClickonHost;

	public WebElement ClickonHost() {
		return ClickonHost;

	}

	@FindBy(how = How.XPATH, using = "//*[@id='source_host']")
	public WebElement EnterHost;

	public WebElement EnterHost() {
		return EnterHost;

	}
	
	@FindBy(how = How.XPATH, using = "//*[@id='source_user']")
	public WebElement ClickonUserName;

	public WebElement ClickonUserName() {
		return ClickonUserName;

	}

	@FindBy(how = How.XPATH, using = "//*[@id='source_user']")
	public WebElement EnterUserName;

	public WebElement EnterUserName() {
		return EnterUserName;

	}
	
	@FindBy(how = How.XPATH, using = "//*[@id='password']")
	public WebElement ClickonPassword;

	public WebElement ClickonPassword() {
		return ClickonPassword;

	}

	@FindBy(how = How.XPATH, using = "//*[@id='password']")
	public WebElement EnterPassword;

	public WebElement EnterPassword() {
		return EnterPassword;

	}
	
	@FindBy(how = How.XPATH, using = "//*[@id='Yes']")
	public WebElement ClickonBecomeYes;

	public WebElement ClickonBecomeYes() {
		return ClickonBecomeYes;

	}
	@FindBy(how = How.XPATH, using = "//div[2]/button[1]")
	public WebElement ClickonPluginConfigSave;

	public WebElement ClickonPluginConfigSave() {
		return ClickonPluginConfigSave;

	}

}