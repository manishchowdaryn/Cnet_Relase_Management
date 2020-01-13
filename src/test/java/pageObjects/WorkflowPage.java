package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseUtil;

public class WorkflowPage extends BaseUtil {

	public BaseUtil base;

	public WorkflowPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//input")
	public WebElement ClickWorkflowName;

	public WebElement ClickWorkflowName() {
		return ClickWorkflowName;

	}

	@FindBy(how = How.XPATH, using = "//input")
	public WebElement EnterWorkflowName;

	public WebElement EnterWorkflowName() {
		return EnterWorkflowName;

	}

	@FindBy(how = How.XPATH, using = "//div[2]/div/kendo-dropdownlist/span/span")
	public WebElement ClickFrequency;

	public WebElement ClickFrequency() {
		return ClickFrequency;

	}

	@FindBy(how = How.XPATH, using = "//kendo-list/div/ul/li")
	public WebElement SelectFrequency;

	public WebElement SelectFrequency() {
		return SelectFrequency;				

	}
	
	@FindBy(how = How.XPATH, using = "//div[3]/div/button")
	public WebElement ClickonSave;

	public WebElement ClickonSave() {
		return ClickonSave;

	}
	
	
	@FindBy(how = How.XPATH, using = "//div[2]/app-workflow-list-item/div/div/a")
	public WebElement clickOnStage;

	public WebElement clickOnStage() {
		return clickOnStage;

	}
	
	@FindBy(how = How.XPATH, using = "//div/form/div/div/div/div/input")
	public WebElement stageName;

	public WebElement stageName() {
		return stageName;

	}
	
		
	@FindBy(how = How.XPATH, using = "//div/form/div/div/div/button")
	public WebElement tickMark;

	public WebElement tickMark() {
		return tickMark;

	}
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='dropdownMenu1']/i")
	public WebElement clickToAddTask;

	public WebElement clickToAddTask() {
		return clickToAddTask;

	}
	
	
	@FindBy(how = How.XPATH, using = "//div/li/a/span")			//div[1]/div/div[2]/div/div/ul/div[5]/li
	public WebElement tracking;

	public WebElement tracking() {
		return tracking;

	}
	
	
	@FindBy(how = How.XPATH, using = "//div/ul/div/li/ul/div[4]/li/a")			   //div[2]/div/div/ul/div[5]/li/ul/div[3]/li
	public WebElement bamboo;

	public WebElement bamboo() {
		return bamboo;

	}
	
	
	@FindBy(how = How.XPATH, using = "//div[16]/li/a")   //div[2]/div/div/ul/div[5]/li/ul/div[3]/li/ul/div[1]/li
	public WebElement clickOnQueueBuild;

	public WebElement clickOnQueueBuild() {
		return clickOnQueueBuild;

	}
	
	
//	//div[2]/div/kendo-dropdownlist/span/span
	
	@FindBy(how = How.XPATH, using = "//app-edit-task-name/div/span/input")
	public WebElement clickOnTaskName;

	public WebElement clickOnTaskName() {
		return clickOnTaskName;

	}
	
	@FindBy(how = How.XPATH, using = "//form/div/div/input")
	public WebElement EnterTaskName;

	public WebElement EnterTaskName() {
		return EnterTaskName;

	}

	
	@FindBy(how = How.XPATH, using = "//kendo-dropdownlist/span/span")
	public WebElement clickOnUseTemplate;

	public WebElement clickOnUseTemplate() {
		return clickOnUseTemplate;

	}
	
	
	@FindBy(how = How.XPATH, using = "//li[9]")	//kendo-list/div/ul/li[6]  //4e90818f-7096-4f3f-8254-d440828d418b-bamboo_test_template
	public WebElement SelectUseTemplate;

	public WebElement SelectUseTemplate() {				
		return SelectUseTemplate;

	}
	
	@FindBy(how = How.XPATH, using = "//div[3]/div/div/kendo-dropdownlist/span/span")
	public WebElement clickOnTemplateVersion;

	public WebElement clickOnTemplateVersion() {
		return clickOnTemplateVersion;

	}
	
	@FindBy(how = How.XPATH, using = "//kendo-list/div/ul/li")
	public WebElement SelectTemplateVersion;

	public WebElement SelectTemplateVersion() {
		return SelectTemplateVersion;

	}
	
	
	
	@FindBy(how = How.XPATH, using = "//div[2]/div/button/span/span")
	public WebElement clickOnSaveWorkflow;

	public WebElement clickOnSaveWorkflow() {
		return clickOnSaveWorkflow;

	}
	
	
	
	@FindBy(how = How.XPATH, using = "//td[4]/button")               
	public WebElement clickOnViewWorkflow;

	public WebElement clickOnViewWorkflow() {
		return clickOnViewWorkflow;

	}
	
	@FindBy(how = How.XPATH, using = "//div[1]/div/div[2]/button/span/span")       
	public WebElement clickOnSaveAsTemplate;

	public WebElement clickOnSaveAsTemplate() {
		return clickOnSaveAsTemplate;

	}
	
	
	@FindBy(how = How.XPATH, using = "//div[2]/input")
	public WebElement clickOnTemplateName;

	public WebElement clickOnTemplateName() {
		return clickOnTemplateName;

	}
	
	@FindBy(how = How.XPATH, using = "//div[2]/input")
	public WebElement EnterTemplateName;

	public WebElement EnterTemplateName() {
		return EnterTemplateName;

	}
	
	@FindBy(how = How.XPATH, using = "//div[2]/div/button")   
	public WebElement clickOnSaveTemplate;

	public WebElement clickOnSaveTemplate() {
		return clickOnSaveTemplate;

	}
	@FindBy(how = How.XPATH, using = "//div[2]/div/button")
	public WebElement clickOnSaveWorkflowAfterCreatingTemplate;

	public WebElement clickOnSaveWorkflowAfterCreatingTemplate() {
		return clickOnSaveWorkflowAfterCreatingTemplate;

	}
	
	
	@FindBy(how = How.XPATH, using = "//div[1]/div/div[1]/app-edit-task-name/form/div[1]/button[1]")
	public WebElement clickOntickmarktask;


	public WebElement clickOntickmarktask() {
		return clickOntickmarktask;

	}
	
	@FindBy(how = How.XPATH, using = "//*[@id='dropdownMenu2']")
	public WebElement clickOnVeriticalEllipse;


	public WebElement clickOnVeriticalEllipse() {
		return clickOnVeriticalEllipse;

	}
	
	
	@FindBy(how = How.XPATH, using = "//div[2]/div/div[2]/div/ul/li[2]/a")
	public WebElement clickEditConfigurations;


	public WebElement clickEditConfigurations() {
		return clickEditConfigurations;

	}
	
	@FindBy(how = How.XPATH, using = "//span/span")
	public WebElement ClickOnStartReleaseButton;


	public WebElement ClickOnStartReleaseButton() {
		return ClickOnStartReleaseButton;

	}
	
	@FindBy(how = How.XPATH, using = "//button[2]/span/span")
	public WebElement ClickOnViewWorkflowButton;


	public WebElement ClickOnViewWorkflowButton() {
		return ClickOnViewWorkflowButton;

	}
	
	@FindBy(how = How.XPATH, using = "//span/span")
	public WebElement CaptureWorkflowStatus;

	public WebElement CaptureWorkflowStatus() {
		return CaptureWorkflowStatus;
	}
	
	
	@FindBy(how = How.XPATH, using = "/html/body/app-root/app-full-layout/div/div[2]/div/div/div/matilda-workflow/div[1]/div[2]/button[2]")
	public WebElement ClickPauseReleaseButton;

	public WebElement ClickPauseReleaseButton() {
		return ClickPauseReleaseButton;
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/app-root/app-full-layout/div/div[2]/div/div/div/matilda-workflow/div[2]/div/div[3]/div/div/div/div[1]/div[1]/span/span")
	public WebElement CapturePausedWorkflowStatus;

	public WebElement CapturePausedWorkflowStatus() {
		return CapturePausedWorkflowStatus;
	}
	
	@FindBy(how = How.CSS, using = "//button[2]")
	public WebElement ClickResumeReleaseButton;

	public WebElement ClickResumeReleaseButton() {
		return ClickResumeReleaseButton;
	}
}