package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseUtil;

public class BambooPluginConfigurationsPage extends BaseUtil{

    public BaseUtil base;
    
       public BambooPluginConfigurationsPage(WebDriver driver) {

    	   PageFactory.initElements(driver, this);
    
       }

   	@FindBy(how = How.XPATH, using = "//input[@id='host']")
   	public WebElement ClickonBamboohost;

   	public WebElement ClickonBamboohost() {
   		return ClickonBamboohost;

   	}
   	
	@FindBy(how = How.XPATH, using = "//input[@id='host']")
	public WebElement EnterBamboohost;

	public WebElement EnterBamboohost() {
		return EnterBamboohost;

	}
	
	@FindBy(how = How.XPATH, using = "//div[2]/app-release-form-template/div/div/div/input")
	public WebElement ClickonBambooUsername;

	public WebElement ClickonBambooUsername() {
		return ClickonBambooUsername;

	}
	@FindBy(how = How.XPATH, using = "//div[2]/app-release-form-template/div/div/div/input")
	public WebElement EnterBambooUsername;

	public WebElement EnterBambooUsername() {
		return EnterBambooUsername;

	}
	@FindBy(how = How.XPATH, using = "//div[3]/app-release-form-template/div/div/div/input")
	public WebElement ClickonBambooPassword;

	public WebElement ClickonBambooPassword() {
		return ClickonBambooPassword;

	}
	@FindBy(how = How.XPATH, using = "//div[3]/app-release-form-template/div/div/div/input")
	public WebElement EnterBambooPassword;

	public WebElement EnterBambooPassword() {
		return EnterBambooPassword;

	}
	
	@FindBy(how = How.XPATH, using = "//div[4]/app-release-form-template/div/div/div/input")
	public WebElement ClickonBambooPort;

	public WebElement ClickonBambooPort() {
		return ClickonBambooPort;

	}
	@FindBy(how = How.XPATH, using = "//div[4]/app-release-form-template/div/div/div/input")
	public WebElement EnterBambooPort;

	public WebElement EnterBambooPort() {
		return EnterBambooPort;
		
	}
	
	@FindBy(how = How.XPATH, using = "//div[5]/app-release-form-template/div/div/div/input")
	public WebElement ClickonPlanKey;

	public WebElement ClickonPlanKey() {
		return ClickonPlanKey;

	}	
	
	@FindBy(how = How.XPATH, using = "//div[5]/app-release-form-template/div/div/div/input")
	public WebElement EnterPlanKey;

	public WebElement EnterPlanKey() {
		return EnterPlanKey;

	}
	
	@FindBy(how = How.XPATH, using = "//div[6]/app-release-form-template/div/div/div/input")
	public WebElement ClickonProjectKey;

	public WebElement ClickonProjectKey() {
		return ClickonPlanKey;

	}	
	@FindBy(how = How.XPATH, using = "//div[6]/app-release-form-template/div/div/div/input")
	public WebElement EnterProjectKey;

	public WebElement EnterProjectKey() {
		return EnterProjectKey;

	}	
	
	@FindBy(how = How.XPATH, using = "//div[7]/app-release-form-template/div/div/div/input")
	public WebElement ClickonBuildKey;

	public WebElement ClickonBuildKey() {
		return ClickonBuildKey;

	}
	@FindBy(how = How.XPATH, using = "//div[7]/app-release-form-template/div/div/div/input")
	public WebElement EnterBuildKey;

	public WebElement EnterBuildKey() {
		return EnterBuildKey;

	}

	@FindBy(how = How.XPATH, using = "//div[2]/button")
	public WebElement ClickonBambooPluginSave;

	public WebElement ClickonBambooPluginSave() {
		return ClickonBambooPluginSave;

	}
}

