package steps;

import java.awt.AWTException;


import org.openqa.selenium.JavascriptExecutor;

import java.io.IOException;
import java.util.Properties;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.Assert;

import baseClass.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gherkin.deps.net.iharder.Base64.InputStream;
import pageObjects.Login;
import pageObjects.DashboardPage;
import pageObjects.ReleasePlanningPage;
import pageObjects.WorkflowPage;
import pageObjects.EnvironmentPage;
import pageObjects.ReleaselistSearchPage;
import pageObjects.PluginConfigurationsPage;
import reusableFunction.Abstract;

public class ReleaseManagementSteps extends BaseUtil {

	public BaseUtil base;
	public Login Login;
	public DashboardPage DashboardPage;
	public ReleasePlanningPage ReleasePlanningPage;
	public EnvironmentPage EnvironmentPage;
	public WorkflowPage WorkflowPage;
	public ReleaselistSearchPage ReleaselistSearchPage;
	public PluginConfigurationsPage PluginConfigurationsPage;
	Properties prop = new Properties();
	InputStream input = null;

	public ReleaseManagementSteps(BaseUtil base) {

		this.base = base;
		Login = new Login(base.driver);
		DashboardPage = new DashboardPage(base.driver);
		ReleasePlanningPage = new ReleasePlanningPage(base.driver);
		EnvironmentPage = new EnvironmentPage(base.driver);
		WorkflowPage = new WorkflowPage(base.driver);
		ReleaselistSearchPage = new ReleaselistSearchPage(base.driver);
		PluginConfigurationsPage = new PluginConfigurationsPage(base.driver);
	}

	@Then("^Click on Create New Release Button$")
	public void ClickCreateNewRelease() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		WebElement ClickCreateNewRelease = Abstract.waitUntilConditionSatisfy(base,
				DashboardPage.ClickCreateNewRelease());
		ClickCreateNewRelease.isEnabled();
		ClickCreateNewRelease.click();
		logger.info("Click on Create New Release Button");
	}

	@And("^Click on Release Name Text Box$")
	public void ClickonReleaseTextbox() throws Throwable {

		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		WebElement ClickonReleaseTextbox = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanningPage.ClickonReleaseTextbox());
		ClickonReleaseTextbox.isEnabled();
		ClickonReleaseTextbox.click();
		logger.info("Click on Release Textbox");

	}

	@And("^Enter Release Name as \"([^\"]*)\"$")
	public void EnterReleaseName(String ReleaseName) throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement EnterReleaseName = Abstract.waitUntilConditionSatisfy(base, ReleasePlanningPage.EnterReleaseName());
		EnterReleaseName.click();
		EnterReleaseName.sendKeys(ReleaseName);
	
		logger.info("Release Name :" + ReleaseName);

	}

	@And("^Click on Project Field and Select Project$")
	public void ClickonProject() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement ClickonProject = Abstract.waitUntilConditionSatisfy(base, ReleasePlanningPage.ClickonProject());

		ClickonProject.click();
		WebElement SelectProject = Abstract.waitUntilConditionSatisfy(base, ReleasePlanningPage.SelectProject());
		SelectProject.click();
		logger.info("Click on Project Field and Select Project");

	}

	@And("^Click on Application and Select Application$")
	public void ClickonApplication() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement ClickonApplication = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanningPage.ClickonApplication());
		ClickonApplication.click();
		WebElement SelectApplication = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanningPage.SelectApplication());
		SelectApplication.click();
		logger.info("Click on Application Field and Select Application");
	}

	@And("^Click on Release Version and Select Release Version$")
	public void ClickReleaseVersion() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement ClickReleaseVersion = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanningPage.ClickReleaseVersion());

		ClickReleaseVersion.click();
		WebElement SelectReleaseVersion = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanningPage.SelectReleaseVersion());
		SelectReleaseVersion.click();
		logger.info("Click on Release Version Field and Select Release Version");
	}

	@And("^Click on Date picker and Select Today$")

	public void ClickonDatePicker() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement ClickonDatePicker = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanningPage.ClickonDatePicker());
		ClickonDatePicker.click();
		WebElement SelectToday = Abstract.waitUntilConditionSatisfy(base, ReleasePlanningPage.SelectToday());
		SelectToday.click();
		logger.info("Click on Date picker and select today");
	}

	@And("^Click Description$")

	public void ClickDescription() throws Throwable {

		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement ClickDescription = Abstract.waitUntilConditionSatisfy(base, ReleasePlanningPage.ClickDescription());
		ClickDescription.click();

		logger.info("Click on Description");

	}

	@And("^Enter Description as \"([^\"]*)\"$")
	public void EnterDescription(String Description) throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement EnterDescription = Abstract.waitUntilConditionSatisfy(base, ReleasePlanningPage.EnterDescription());
		EnterDescription.click();
		EnterDescription.sendKeys(Description);
		logger.info("Description :" + Description);

	}

	@Then("^Click Save and Next$")
	public void ClickSaveNext() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement ClickSaveNext = Abstract.waitUntilConditionSatisfy(base, ReleasePlanningPage.ClickSaveNext());
		ClickSaveNext.click();
		
		logger.info("Click on Save and Next");
	}

	@Then("^Click on Create New Environment Button$")

	public void ClickCreateNewEnvironment() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

		WebElement ClickCreateNewEnvironment = Abstract.waitUntilConditionSatisfy(base,
				EnvironmentPage.ClickCreateNewEnvironment());
		ClickCreateNewEnvironment.click();
	
		logger.info("Click on Create New Environment Button");

	}

	@And("^Click on Environment Name Field$")

	public void ClickEnvironmentName() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

		WebElement ClickEnvironmentName = Abstract.waitUntilConditionSatisfy(base,
				EnvironmentPage.ClickEnvironmentName());
		ClickEnvironmentName.click();

		logger.info("Click on Environment Name Field");

	}

	@And("^Enter Environment as \"([^\"]*)\"$")
	public void EnterEnvironmentName(String EnvironmentName) throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement EnterEnvironmentName = Abstract.waitUntilConditionSatisfy(base,
				EnvironmentPage.EnterEnvironmentName());
		EnterEnvironmentName.sendKeys(EnvironmentName);
	
		logger.info("EnvironmentName :" + EnvironmentName);
	}

	@And("^Click on Environment Type and Select Environment Type$")

	public void ClickEnvironmentType() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

		WebElement ClickEnvironmentType = Abstract.waitUntilConditionSatisfy(base,
				EnvironmentPage.ClickEnvironmentType());
		ClickEnvironmentType.click();
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		logger.info("Click Environment Type");
		WebElement SelectEnvironmentType = Abstract.waitUntilConditionSatisfy(base,
				EnvironmentPage.SelectEnvironmentType());
		SelectEnvironmentType.click();

		logger.info("Select Environment Type");

	}

	@Then("^Click on Save Button$")

	public void ClickSave() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

		WebElement ClickSave = Abstract.waitUntilConditionSatisfy(base, EnvironmentPage.ClickSave());
		ClickSave.click();
		logger.info("Click Save");

	}

	@Then("^Click on Create Workflow Icon$")

	public void ClickCreateWorkflowIcon() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

		WebElement ClickCreateWorkflowIcon = Abstract.waitUntilConditionSatisfy(base,
				EnvironmentPage.ClickCreateWorkflowIcon());
		ClickCreateWorkflowIcon.click();
		logger.info("Click Create Workflow Icon");

	}

	@And("^Click on Workflow Name Text Box$")
	public void ClickWorkflowName() throws Throwable {

		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		WebElement ClickWorkflowName = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.ClickWorkflowName());
		ClickWorkflowName.isEnabled();
		ClickWorkflowName.click();
		logger.info("Click on Workflow Name Textbox");

	}

	@And("^Enter Workflow Name as \"([^\"]*)\"$")
	public void EnterWorkflowName(String WorkflowName) throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement EnterWorkflowName = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.EnterWorkflowName());
		EnterWorkflowName.click();
		EnterWorkflowName.sendKeys(WorkflowName);
		logger.info("WorkflowName :" + WorkflowName);

	}

	@And("^Click Frequency and Select Frequency$")
	public void ClickFrequency() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

		WebElement ClickFrequency = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.ClickFrequency());
		ClickFrequency.click();
		logger.info("Click Frequency");
		WebElement SelectFrequency = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.SelectFrequency());
		SelectFrequency.click();

		logger.info("Select Frequency");

	}

	@And("^Click on add stage and Enter stage Name as \"([^\"]*)\"$")
	public void clickOnStageAndEnterStageName(String stageName) throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement clickOnAddStage = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.clickOnStage());
		clickOnAddStage.isEnabled();
		clickOnAddStage.click();
		logger.info("Click on Add Stage");

		WebElement enterStageName = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.stageName());
		enterStageName.sendKeys(stageName);
		logger.info("Stage Name :" + stageName);

	}

	@Then("^Click on Tick Mark$")
	public void clickOnTickMark() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

		WebElement tickMark = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.tickMark());
		tickMark.click();
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		logger.info("Click on Tick Mark");

	}

	@Then("^Click on Icon to add task$")
	public void clickToAddTask() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

		WebElement clickToAddTask = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.clickToAddTask());
		clickToAddTask.click();
		logger.info("Click On Click To Task");

	}

	@And("^Click on execution and ansible and click on run play book host$")
	public void clickOnRunPlayBookHost() throws Throwable {

		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement execution = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.execution());
		Abstract.moveToElement(base, execution);
		logger.info("Mouse Over on Execution");
Thread.sleep(2000);
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement anisible = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.anisible());
		Abstract.moveToElement(base, anisible);
		logger.info("Mouse Over on Anisible");
		Thread.sleep(2000);

		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement clickOnPlayBookHost = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.clickOnPlayBookHost());
		Abstract.moveToElementAndClick(base, clickOnPlayBookHost);
		logger.info("Click On Run Play Book Host");

	}

	@And("^Click on Task Name and Enter Task Name as \"([^\"]*)\"$")
	public void clickOnTaskName(String TaskName) throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

		WebElement clickOnTaskName = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.clickOnTaskName());
		clickOnTaskName.isDisplayed();
		clickOnTaskName.click();
		logger.info("Click On Task Name");

		WebElement EnterTaskName = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.EnterTaskName());
		EnterTaskName.sendKeys(TaskName);
		logger.info("Task Name:" + TaskName);

	}

	@Then("^Click on Tick Mark to create task$")
	public void clickOntickmarktask() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		Thread.sleep(2000);

		WebElement clickOntickmarktask = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.clickOntickmarktask());
		clickOntickmarktask.click();
		logger.info("Click on Tick Mark to create task");

	}

	@Then("^Click on the vertical ellipses$")
	public void clickOnVeriticalEllipse() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

		WebElement clickOnVeriticalEllipse = Abstract.waitUntilConditionSatisfy(base,
				WorkflowPage.clickOnVeriticalEllipse());
		clickOnVeriticalEllipse.click();
		logger.info("Click on Vertical Ellipses");

	}

	@And("^Click on Edit Configuration for task$")
	public void clickEditConfigurations() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

		WebElement clickEditConfigurations = Abstract.waitUntilConditionSatisfy(base,
				WorkflowPage.clickEditConfigurations());
		clickEditConfigurations.click();
		logger.info("Click on Edit Configurations");

	}

	@And("^Enter PathName and Host and AnsibleUserName and AnsiblePassword as \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_PathName_and_Host_and_AnsibleUserName_and_AnsiblePassword_as_and_and_and(String PathName,
			String Host, String AnsibleUserName, String AnsiblePassword) throws Throwable {

		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement ClickonPath = Abstract.waitUntilConditionSatisfy(base, PluginConfigurationsPage.ClickonPath());
		ClickonPath.isEnabled();
		ClickonPath.click();
		logger.info("Click on Ansible Path");

		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement EnterPathName = Abstract.waitUntilConditionSatisfy(base, PluginConfigurationsPage.EnterPathName());
		EnterPathName.sendKeys(PathName);
		logger.info("PathName :" + PathName);

		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement ClickonSFTP = Abstract.waitUntilConditionSatisfy(base, PluginConfigurationsPage.ClickonSFTP());
		ClickonSFTP.isEnabled();
		ClickonSFTP.click();
		logger.info("Click on SFTP");

		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement ClickonHost = Abstract.waitUntilConditionSatisfy(base, PluginConfigurationsPage.ClickonHost());
		ClickonHost.isEnabled();
		ClickonHost.click();
		logger.info("Click on Host");

		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement EnterHost = Abstract.waitUntilConditionSatisfy(base, PluginConfigurationsPage.EnterHost());
		EnterHost.sendKeys(Host);
		logger.info("HostName :" + Host);

		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement ClickonUserName = Abstract.waitUntilConditionSatisfy(base, PluginConfigurationsPage.ClickonUserName());
		ClickonUserName.isEnabled();
		ClickonUserName.click();
		logger.info("Click on UserName");

		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement EnterUserName = Abstract.waitUntilConditionSatisfy(base, PluginConfigurationsPage.EnterUserName());
		EnterUserName.sendKeys(AnsibleUserName);
		logger.info("AnsibleUserName :" + AnsibleUserName);

		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement ClickonPassword = Abstract.waitUntilConditionSatisfy(base, PluginConfigurationsPage.ClickonPassword());
		ClickonPassword.isEnabled();
		ClickonPassword.click();
		logger.info("Click on UserName");

		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement EnterPassword = Abstract.waitUntilConditionSatisfy(base, PluginConfigurationsPage.EnterPassword());
		EnterPassword.sendKeys(AnsiblePassword);
		logger.info("AnsiblePassword :" + AnsiblePassword);

		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement ClickonBecomeYes = Abstract.waitUntilConditionSatisfy(base,
				PluginConfigurationsPage.ClickonBecomeYes());
		ClickonBecomeYes.isEnabled();
		ClickonBecomeYes.click();
		logger.info("Click on Become as Yes");

		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement ClickonPluginConfigSave = Abstract.waitUntilConditionSatisfy(base,
				PluginConfigurationsPage.ClickonPluginConfigSave());
		ClickonPluginConfigSave.isEnabled();
		ClickonPluginConfigSave.click();
		logger.info("Click on Ansible Configurations Save button");
	}

	@And("^Click on Use Template and Select Template$")
	public void clickOnUseTemplate() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

		WebElement clickOnUseTemplate = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.clickOnUseTemplate());
		clickOnUseTemplate.click();
		logger.info("Click Use Template");
		WebElement SelectUseTemplate = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.SelectUseTemplate());
		SelectUseTemplate.click();

		logger.info("Select Template");

	}

	@And("^Click on Template version and Select Version$")
	public void clickOnTemplateVersion() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

		WebElement clickOnTemplateVersion = Abstract.waitUntilConditionSatisfy(base,
				WorkflowPage.clickOnTemplateVersion());
		clickOnTemplateVersion.click();
		logger.info("Click on Template Version");
		WebElement SelectTemplateVersion = Abstract.waitUntilConditionSatisfy(base,
				WorkflowPage.SelectTemplateVersion());
		SelectTemplateVersion.click();

		logger.info("Select Template Version");

	}

	@Then("^Click on Save$")
	public void ClickonSave() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

		WebElement ClickonSave = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.ClickonSave());
		ClickonSave.click();
		logger.info("Click Save");

	}

	@Then("^Click on Save Workflow button$")
	public void clickOnSaveWorkflow() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		Thread.sleep(3000);
		WebElement clickOnSaveWorkflow = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.clickOnSaveWorkflow());
		clickOnSaveWorkflow.click();
		logger.info("Click Save Workflow");

	}

	@Then("^Click on View Workflow Icon$")
	public void clickOnViewWorkflow() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

		WebElement clickOnViewWorkflow = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.clickOnViewWorkflow());
		clickOnViewWorkflow.click();
		logger.info("Click on View Workflow Icon");

	}

	@Then("^Click on Save as Template$")
	public void clickOnSaveAsTemplate() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

		WebElement clickOnSaveAsTemplate = Abstract.waitUntilConditionSatisfy(base,
				WorkflowPage.clickOnSaveAsTemplate());
		clickOnSaveAsTemplate.click();
		logger.info("Click on View Workflow Icon");

	}

	@And("^Click on Template Name Text Box$")
	public void clickOnTemplateName() throws Throwable {

		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement clickOnTemplateName = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.clickOnTemplateName());
		clickOnTemplateName.isEnabled();
		clickOnTemplateName.click();
		logger.info("Click on Template Name Textbox");

	}

	@And("^Enter Template Name as \"([^\"]*)\"$")
	public void EnterTemplateName(String TemplateName) throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement EnterTemplateName = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.EnterTemplateName());
		EnterTemplateName.click();
		EnterTemplateName.sendKeys(TemplateName);
		logger.info("Template Name :" + TemplateName);

	}

	@Then("^Click on Save Template button$")
	public void clickOnSaveTemplate() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

		WebElement clickOnSaveTemplate = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.clickOnSaveTemplate());
		clickOnSaveTemplate.click();

		base.driver.navigate().back();
		logger.info("Click on Save Template button");

	}

	@Then("^Click on Release list Tab$")
	public void ClickonReleaselistTab() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

		WebElement ClickonReleaselistTab = Abstract.waitUntilConditionSatisfy(base,
				ReleaselistSearchPage.ClickonReleaselistTab());
		ClickonReleaselistTab.click();
		logger.info("Click on Release list Tab");

	}

	@Then("^Click on Release list Search Filter$")
	public void ClickonSearchRelease() throws Throwable {

		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement ClickonSearchRelease = Abstract.waitUntilConditionSatisfy(base,
				ReleaselistSearchPage.ClickonSearchRelease());
		ClickonSearchRelease.isEnabled();
		ClickonSearchRelease.click();
		logger.info("Click on Release list Search Filter");

	}

	@And("^Search Release Name as \"([^\"]*)\"$")
	public void EnterReleaseName1(String SearchRelease) throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement EnterReleaseName = Abstract.waitUntilConditionSatisfy(base,
				ReleaselistSearchPage.EnterReleaseName());
		EnterReleaseName.click();
		EnterReleaseName.sendKeys(SearchRelease);
		logger.info(" Search Release Name :" + SearchRelease);

	}

	@Then("^Click on View Icon$")
	public void ClickonViewIcon() throws Throwable {
		base.driver.getCurrentUrl();
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

		WebElement ClickonViewIcon = Abstract.waitUntilConditionSatisfy(base, ReleaselistSearchPage.ClickonViewIcon());
		ClickonViewIcon.click();
		logger.info("Click on View Icon");
	}

	@Then("^Click on Clone Environment Icon$")
	public void ClickCloneEnvironmentIcon() throws Throwable {

		base.driver.manage().timeouts().pageLoadTimeout(12, TimeUnit.SECONDS);

		Thread.sleep(2000);

		WebElement ClickCloneEnvironmentIcon = Abstract.waitUntilConditionSatisfy(base,
				EnvironmentPage.ClickCloneEnvironmentIcon());
		ClickCloneEnvironmentIcon.isDisplayed();
		ClickCloneEnvironmentIcon.click();

//		JavascriptExecutor js = (JavascriptExecutor) base.driver;
//		js.executeScript("arguments[0].click();", ClickCloneEnvironmentIcon);

		logger.info("Click on Clone Environment");

	}

	@And("^Click on Target Environment Name Text box$")
	public void ClickTargetEnvironmentName() throws Throwable {

		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		WebElement ClickTargetEnvironmentName = Abstract.waitUntilConditionSatisfy(base,
				EnvironmentPage.ClickTargetEnvironmentName());
		ClickTargetEnvironmentName.isEnabled();
		ClickTargetEnvironmentName.click();
		logger.info("Click on Template Name Textbox");

	}

	@And("^Enter Target Environment Name as \"([^\"]*)\"$")
	public void EnterTargetEnvironmentName(String TargetEnvironmentName) throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement EnterTargetEnvironmentName = Abstract.waitUntilConditionSatisfy(base,
				EnvironmentPage.EnterTargetEnvironmentName());
		EnterTargetEnvironmentName.click();
		EnterTargetEnvironmentName.sendKeys(TargetEnvironmentName);
		logger.info("Target Environment Name :" + TargetEnvironmentName);

	}

	@And("^Click on Target Environment Type$")
	public void ClickTargetEnvironmentType() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

		WebElement ClickTargetEnvironmentType = Abstract.waitUntilConditionSatisfy(base,
				EnvironmentPage.ClickTargetEnvironmentType());
		ClickTargetEnvironmentType.click();

		logger.info("Click on Target Environment Type");

	}

	@And("^Select Target Environment Type$")
	public void SelectTargetEnvironmentType() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

		WebElement SelectTargetEnvironmentType = Abstract.waitUntilConditionSatisfy(base,
				EnvironmentPage.SelectTargetEnvironmentType());
		SelectTargetEnvironmentType.click();

		logger.info("Select Target Environment Type");

	}

	@Then("^Click to Save Clone Environment$")
	public void ClickSaveCloneEnvironment() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

		WebElement ClickSaveCloneEnvironment = Abstract.waitUntilConditionSatisfy(base,
				EnvironmentPage.ClickSaveCloneEnvironment());
		ClickSaveCloneEnvironment.click();

		logger.info("Select Target Environment Type");

	}

	@Then("^Click on Start Environment Release Icon$")
	public void ClickStartEnvironmentRelease() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

		WebElement ClickStartEnvironmentRelease = Abstract.waitUntilConditionSatisfy(base,
				EnvironmentPage.ClickStartEnvironmentRelease());
		Thread.sleep(2000);
		ClickStartEnvironmentRelease.click();
		logger.info("Click on Start Environment Release Icon");

	}

	@Then("^Verify the Status as \"([^\"]*)\"$")
	public void VerifyStatus(String ApplicationStatus) throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		Thread.sleep(5000);
		WebElement ApplicationStatusLocation = Abstract.waitUntilConditionSatisfy(base, EnvironmentPage.VerifyStatus());
		String ApplicationStatusText = ApplicationStatusLocation.getText();
		Abstract.validation(ApplicationStatusText, ApplicationStatus);
		//Assert.assertEquals(ApplicationStatusText, ApplicationStatus);
		logger.info("Verify the statsu as :" + ApplicationStatus);

	}
	
	
	@Then("^Click on Release List Tab$")
	public void clickOnReleaseListTab() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		WebElement releaseList = Abstract.waitUntilConditionSatisfy(base,
				DashboardPage.releaseList());
		Thread.sleep(3000);
		releaseList.isEnabled();
		base.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		releaseList.click();
		logger.info("Click on Release List Tab");
	}


}
