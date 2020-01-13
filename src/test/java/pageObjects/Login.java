package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseUtil;

public class Login extends BaseUtil{

    public BaseUtil base;
    
       public Login(WebDriver driver) {

    	   PageFactory.initElements(driver, this);
    
       }
       
 
	    @FindBy(how = How.XPATH, using = "//input")     //input
	    public WebElement useridLocator;
	
	    @FindBy(how = How.XPATH, using = "//div[2]/div[2]/input")
	    public WebElement passwordLocator;
	    
	    @FindBy(how = How.XPATH, using = "//button")
	    public WebElement loginButton;
  


	  
	    public WebElement useridLocator() {
			return useridLocator;
		}
	
	    
	    
	    public WebElement passwordLocator() {
			return passwordLocator;
		}
	    
	    public WebElement loginButton() {
			return loginButton;
		}
    
	    

		}
 
   
