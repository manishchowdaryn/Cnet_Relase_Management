package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseUtil;

public class SummaryPage extends BaseUtil {

	public BaseUtil base;

	public SummaryPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//div[2]/a")
	public WebElement ClickonCreateReleaseScopeButton;

	public WebElement ClickonCreateReleaseScopeButton() {
		return ClickonCreateReleaseScopeButton;
	}

	@FindBy(how = How.XPATH, using = "//input")
	public WebElement ClickCRQNumber;

	public WebElement ClickCRQNumber() {
		return ClickCRQNumber;

	}

	@FindBy(how = How.XPATH, using = "//input")
	public WebElement EnterCRQNumber;

	public WebElement EnterCRQNumber() {
		return EnterCRQNumber;

	}

	@FindBy(how = How.XPATH, using = "//div[2]/div[2]/input")
	public WebElement ClickScopeItem;

	public WebElement ClickScopeItem() {
		return ClickScopeItem;

	}

	@FindBy(how = How.XPATH, using = "//div[2]/div[2]/input")
	public WebElement EnterScopeItem;

	public WebElement EnterScopeItem() {
		return EnterScopeItem; //

	}

	@FindBy(how = How.XPATH, using = "//textarea")
	public WebElement ClickHighLevelChanges;

	public WebElement ClickHighLevelChanges() {
		return ClickHighLevelChanges;

	}

	@FindBy(how = How.XPATH, using = "//textarea")
	public WebElement EnterHighLevelChanges;

	public WebElement EnterHighLevelChanges() {
		return EnterHighLevelChanges;
	}

	@FindBy(how = How.XPATH, using = "//div[4]/div[2]/input")
	public WebElement ClickNameOfImplementor;

	public WebElement ClickNameOfImplementor() {
		return ClickNameOfImplementor;

	}

	@FindBy(how = How.XPATH, using = "//div[4]/div[2]/input")
	public WebElement EnterNameOfImplementor;

	public WebElement EnterNameOfImplementor() {
		return EnterNameOfImplementor;
	}

	@FindBy(how = How.XPATH, using = "//div[5]/div[2]/input")
	public WebElement ClickImplementationTime;

	public WebElement ClickImplementationTime() {
		return ClickImplementationTime;

	}

	@FindBy(how = How.XPATH, using = "//div[5]/div[2]/input")
	public WebElement EnterImplementationTime;

	public WebElement EnterImplementationTime() {
		return EnterImplementationTime;

	}

	@FindBy(how = How.XPATH, using = "//div[6]/div[2]/input")
	public WebElement ClickTeam;

	public WebElement ClickTeam() {
		return ClickTeam;

	}

	@FindBy(how = How.XPATH, using = "//div[6]/div[2]/input")
	public WebElement EnterTeam;

	public WebElement EnterTeam() {
		return EnterTeam;

	}
	
	@FindBy(how = How.XPATH, using = "//div[2]/div/button")
	public WebElement ClickReleaseScopeSavebutton;

	public WebElement ClickReleaseScopeSavebutton() {
		return ClickReleaseScopeSavebutton;

	}
	
	@FindBy(how = How.XPATH, using = "//matilda-infra-task-list/div/div/div[2]/a")
	public WebElement ClickonInfraTaskButton;

	public WebElement ClickonInfraTaskButton() {
		return ClickonInfraTaskButton;
	}
	
	@FindBy(how = How.XPATH, using = "//input")
	public WebElement ClickImportantDates;

	public WebElement ClickImportantDates() {
		return ClickImportantDates;

	}

	@FindBy(how = How.XPATH, using = "//input")
	public WebElement EnterImportantDates;

	public WebElement EnterImportantDates() {
		return EnterImportantDates;

	}
	
	@FindBy(how = How.XPATH, using = "//div[2]/div[2]/input")
	public WebElement ClickTasks;

	public WebElement ClickTasks() {
		return ClickTasks;

	}

	@FindBy(how = How.XPATH, using = "//div[2]/div[2]/input")
	public WebElement EnterTasks;

	public WebElement EnterTasks() {
		return EnterTasks;

	}
	
	@FindBy(how = How.XPATH, using = "//div[2]/div/button")
	public WebElement ClickonInfraTaskSaveButton;

	public WebElement ClickonInfraTaskSaveButton() {
		return ClickonInfraTaskSaveButton;
		
		

	}
	
}