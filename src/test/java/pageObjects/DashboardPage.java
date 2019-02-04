package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseUtil;

public class DashboardPage {

	public BaseUtil base;

	public DashboardPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(how = How.XPATH, using = "//div[2]/button/span/span")
	public WebElement ClickCreateNewRelease;
	
	
	public WebElement ClickCreateNewRelease() {
		return ClickCreateNewRelease;

	}
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='m_header_menu']/ul/li[2]/a/span[2]")
	public WebElement releaseList;
	
	
	public WebElement releaseList() {
		return releaseList;

	}
	
	
	
}