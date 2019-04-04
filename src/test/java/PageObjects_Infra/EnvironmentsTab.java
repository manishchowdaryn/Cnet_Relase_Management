package PageObjects_Infra;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseUtil;

public class EnvironmentsTab extends BaseUtil {

	public BaseUtil base;

	
	public EnvironmentsTab(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(how = How.XPATH, using = "//li[2]/span")			 	 
	public WebElement ImpactedSystemsTab;



	public WebElement ImpactedSystemsTab() {
		return ImpactedSystemsTab;

	}
	
	
	@FindBy(how = How.XPATH, using = "//li[3]/span")			 	 
	public WebElement ClickEnvironmentsTab;



	public WebElement ClickEnvironmentsTab() {
		return ClickEnvironmentsTab;

	}
	
	@FindBy(how = How.XPATH, using = "//td[4]/span/button")
	public WebElement ClickInfraCreateWorkflowIcon;

	public WebElement ClickInfraCreateWorkflowIcon() {
		return ClickInfraCreateWorkflowIcon;
	}
	
	
}
