package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseUtil;

public class ReleaselistSearchPage extends BaseUtil {

	public BaseUtil base;

	public ReleaselistSearchPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
	
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='m_header_menu']/ul/li[2]/a/span[2]")
	public WebElement ClickonReleaselistTab;

	public WebElement ClickonReleaselistTab() {
		return ClickonReleaselistTab;

	}
	
	@FindBy(how = How.XPATH, using = "//*[@id='m_tabs_1_1']/matilda-grid/kendo-grid/div/div/div/table/thead/tr[2]/td[1]/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input")
			
	public WebElement ClickonSearchRelease;

	public WebElement ClickonSearchRelease() {
		return ClickonReleaselistTab;

	}
	@FindBy(how = How.XPATH, using = "//*[@id='m_tabs_1_1']/matilda-grid/kendo-grid/div/div/div/table/thead/tr[2]/td[1]/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input")
	public WebElement EnterReleaseName;

	public WebElement EnterReleaseName() {
		return EnterReleaseName;

	}
	
	@FindBy(how = How.XPATH, using = "//div[@id='m_tabs_1_1']/matilda-grid/kendo-grid/div/kendo-grid-list/div/div/table/tbody/tr/td[8]/div/button")
	public WebElement ClickonViewIcon;

	public WebElement ClickonViewIcon() {
		return ClickonViewIcon;

	}
}