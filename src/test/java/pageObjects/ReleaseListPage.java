package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseUtil;

public class ReleaseListPage extends BaseUtil{

    public BaseUtil base;
    
       public ReleaseListPage(WebDriver driver) {

    	   PageFactory.initElements(driver, this);
    
       }
       
   	@FindBy(how = How.XPATH, using = "//div[2]/a")               
   	public WebElement ClickonCreateNewReleaseButton;

   	public WebElement ClickonCreateNewReleaseButton() {
   		return ClickonCreateNewReleaseButton;

   	}											
   	   	
  	@FindBy(how = How.LINK_TEXT, using = "Release List")               
   	public WebElement ClickonReleaseListLink;

   	public WebElement ClickonReleaseListLink() {
   		return ClickonReleaseListLink;

   	}
       
}