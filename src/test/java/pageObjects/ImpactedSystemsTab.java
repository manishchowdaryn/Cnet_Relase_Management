package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseUtil;

public class ImpactedSystemsTab{

	public BaseUtil base;

	public ImpactedSystemsTab(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(how = How.XPATH, using = "//li[3]/span/div/b")
	public WebElement ClickonImpactedSystemsTab;
	
	public WebElement ClickonImpactedSystemsTab() {
		return ClickonImpactedSystemsTab;
	}
	
	
	@FindBy(how = How.XPATH, using = "//tr[2]/td/p/div/kendo-switch/span")
	public WebElement ClickonOptInApplication;
	
	public WebElement ClickonOptInApplication() {
		return ClickonOptInApplication;
	}
	
	@FindBy(how = How.XPATH, using = "//tr[32]/td/p/div/kendo-switch/span")
	public WebElement ClickonOptOutApplication;
	
	public WebElement ClickonOptOutApplication() {
		return ClickonOptOutApplication;
	}

}