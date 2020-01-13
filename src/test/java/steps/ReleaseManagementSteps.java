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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;

import baseClass.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gherkin.deps.net.iharder.Base64.InputStream;
import pageObjects.Login;

import pageObjects.ReleasePlanningPage;
import pageObjects.ReleasePlanPage;
import pageObjects.WorkflowPage;
import pageObjects.ReleaseListPage;
import pageObjects.ImpactedSystemsTab;
import pageObjects.AnsiblePluginConfigurationsPage;
import pageObjects.BambooPluginConfigurationsPage;
import pageObjects.SummaryPage;
import reusableFunction.Abstract;

public class ReleaseManagementSteps extends BaseUtil {

	public BaseUtil base;
	public Login Login;

	public ReleasePlanningPage ReleasePlanningPage;
	public ReleasePlanPage ReleasePlanPage;
	public WorkflowPage WorkflowPage;
	public AnsiblePluginConfigurationsPage AnsiblePluginConfigurationsPage;
	public BambooPluginConfigurationsPage BambooPluginConfigurationsPage;
	public SummaryPage SummaryPage;
	public ImpactedSystemsTab ImpactedSystemsTab;
	public ReleaseListPage ReleaseListPage;

	Properties prop = new Properties();
	InputStream input = null;

	public ReleaseManagementSteps(BaseUtil base) {

		this.base = base;
		Login = new Login(base.driver);

		ReleasePlanningPage = new ReleasePlanningPage(base.driver);
		ReleasePlanPage = new ReleasePlanPage(base.driver);
		ImpactedSystemsTab = new ImpactedSystemsTab(base.driver);
		WorkflowPage = new WorkflowPage(base.driver);
		AnsiblePluginConfigurationsPage = new AnsiblePluginConfigurationsPage(base.driver);
		BambooPluginConfigurationsPage = new BambooPluginConfigurationsPage(base.driver);
		SummaryPage = new SummaryPage(base.driver);
		ReleaseListPage = new ReleaseListPage(base.driver);

	}

	@Then("^Click on Create New Release Button$")
	public void ClickonCreateNewReleaseButton() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonCreateNewReleaseButton = Abstract.waitUntilConditionSatisfy(base,
				ReleaseListPage.ClickonCreateNewReleaseButton());

		ClickonCreateNewReleaseButton.click();
	}

	@Then("^Click on Release List Link from Left Navigation Menu$")

	public void ClickonReleaseListLink() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		WebElement ClickonReleaseListLink = Abstract.waitUntilConditionSatisfy(base,
				ReleaseListPage.ClickonReleaseListLink());
		ClickonReleaseListLink.click();
	}

	@Then("^Click on Release Type and Select Release Type$")
	public void ClickonReleaseType() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickReleaseType = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanningPage.ClickonReleaseType());

		ClickReleaseType.click();
		WebElement SelectReleaseType = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanningPage.SelectReleaseType());
		SelectReleaseType.click();
		logger.info("Click and Select ReleaseType");
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
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterReleaseName = Abstract.waitUntilConditionSatisfy(base, ReleasePlanningPage.EnterReleaseName());
		EnterReleaseName.click();
		EnterReleaseName.sendKeys(ReleaseName);

		logger.info("Release Name :" + ReleaseName);

	}

	@And("^Click on Group Field and Select Group$")
	public void ClickonGroup() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonGroup = Abstract.waitUntilConditionSatisfy(base, ReleasePlanningPage.ClickonGroup());

		ClickonGroup.click();
		WebElement SelectGroup = Abstract.waitUntilConditionSatisfy(base, ReleasePlanningPage.SelectGroup());
		SelectGroup.click();
		logger.info("Click on Project Group and Select Group");

	}

	@And("^Click on Team Field and Select Team$")
	public void ClickonTeam() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonTeam = Abstract.waitUntilConditionSatisfy(base, ReleasePlanningPage.ClickonTeam());

		ClickonTeam.click();
		WebElement SelectTeam = Abstract.waitUntilConditionSatisfy(base, ReleasePlanningPage.SelectTeam());
		SelectTeam.click();
		logger.info("Click on Project Team and Select Team");

	}

	@And("^Click on Product Field and Select Product$")
	public void ClickonProduct() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonProduct = Abstract.waitUntilConditionSatisfy(base, ReleasePlanningPage.ClickonProduct());

		ClickonProduct.click();
		WebElement SelectProduct = Abstract.waitUntilConditionSatisfy(base, ReleasePlanningPage.SelectProduct());
		SelectProduct.click();
		logger.info("Click on Project Product and Select Product");

	}

	@And("^Click on Application and Select Application$")
	public void ClickonApplication() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonApplication = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanningPage.ClickonApplication());
		ClickonApplication.click();
		WebElement SelectApplication = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanningPage.SelectApplication());
		SelectApplication.click();
		logger.info("Click on Application Field and Select Application");
	}

	@And("^Click on Release Plan and Select Release Plan$")
	public void ClickReleaseVersion() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickReleasePlan = Abstract.waitUntilConditionSatisfy(base, ReleasePlanningPage.ClickReleasePlan());

		ClickReleasePlan.click();
		WebElement SelectReleasePlan = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanningPage.SelectReleasePlan());
		SelectReleasePlan.click();
		logger.info("Click on Release Plan Field and Select Release Plan");
	}

	@And("^Click on Template and Select Template$")
	public void ClickonTemplate() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonTemplate = Abstract.waitUntilConditionSatisfy(base, ReleasePlanningPage.ClickonTemplate());

		ClickonTemplate.click();
		WebElement SelectTemplate = Abstract.waitUntilConditionSatisfy(base, ReleasePlanningPage.SelectTemplate());
		SelectTemplate.click();
		logger.info("Click on Template Field and Select Template");
	}

	@And("^Click on Infra Release Plan and Select Infra Release Plan$")
	public void ClickInfraReleaseVersion() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickInfraReleasePlan = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanningPage.ClickInfraReleasePlan());

		ClickInfraReleasePlan.click();
		WebElement SelectInfraReleasePlan = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanningPage.SelectInfraReleasePlan());
		SelectInfraReleasePlan.click();
		logger.info("Click on Release Plan Field and Select Release Plan");
	}

//	@And("^Click on Date picker and Select Today$")
//
//	public void ClickonDatePicker() throws Throwable {
//		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
//		WebElement ClickonDatePicker = Abstract.waitUntilConditionSatisfy(base,
//				ReleasePlanningPage.ClickonDatePicker());
//		ClickonDatePicker.click();
//		WebElement SelectToday = Abstract.waitUntilConditionSatisfy(base, ReleasePlanningPage.SelectToday());
//		SelectToday.click();
//		logger.info("Click on Date picker and select today");
//	}

	@And("^Click Description$")

	public void ClickDescription() throws Throwable {

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickDescription = Abstract.waitUntilConditionSatisfy(base, ReleasePlanningPage.ClickDescription());
		ClickDescription.click();

		logger.info("Click on Description");

	}

	@And("^Enter Description as \"([^\"]*)\"$")
	public void EnterDescription(String Description) throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterDescription = Abstract.waitUntilConditionSatisfy(base, ReleasePlanningPage.EnterDescription());
		EnterDescription.click();
		EnterDescription.sendKeys(Description);
		logger.info("Description :" + Description);

	}

	@Then("^Click Save and Next$")
	public void ClickSaveNext() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickSaveNext = Abstract.waitUntilConditionSatisfy(base, ReleasePlanningPage.ClickSaveNext());
		ClickSaveNext.click();
		Thread.sleep(2000);

		logger.info("Click on Save and Next");
	}

	@Then("^Click on Create Release Scope Button$")
	public void ClickonCreateReleaseScopeButton() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonCreateReleaseScopeButton = Abstract.waitUntilConditionSatisfy(base,
				SummaryPage.ClickonCreateReleaseScopeButton());
		ClickonCreateReleaseScopeButton.click();
		logger.info("Click on Save and Next");
	}

	@And("^Click on Workflow Tab$")
	public void ClickOnWorkflowTab() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickOnWorkflowTab = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanningPage.ClickonWorkflowTab());

		ClickOnWorkflowTab.click();

		logger.info("Click on Workflow Tab");
	}

	@Then("^Enter CRQNumber and ScopeItem and HighLevelChanges and NameOfImplementor and ImplementationTime and Team as \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_CRQNumber_and_ScopeItem_and_HighLevelChanges_and_NameOfImplementor_and_ImplementationTime_and_Team_as(
			String CRQNumber, String ScopeItem, String HighLevelChanges, String NameOfImplementor,
			String ImplementationTime, String Team) throws Throwable {

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickCRQNumber = Abstract.waitUntilConditionSatisfy(base, SummaryPage.ClickCRQNumber());
		ClickCRQNumber.isEnabled();
		ClickCRQNumber.click();
		logger.info("Click on ClickScopeItem");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterCRQNumber1 = Abstract.waitUntilConditionSatisfy(base, SummaryPage.EnterCRQNumber());
		EnterCRQNumber1.sendKeys(CRQNumber);
		logger.info("EnterCRQNumber :" + CRQNumber);

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickScopeItem = Abstract.waitUntilConditionSatisfy(base, SummaryPage.ClickScopeItem());
		ClickScopeItem.isEnabled();
		ClickScopeItem.click();
		logger.info("Click on ScopeItem");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterScopeItem = Abstract.waitUntilConditionSatisfy(base, SummaryPage.EnterScopeItem());
		EnterScopeItem.sendKeys(ScopeItem);
		logger.info("ScopeItem :" + ScopeItem);

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickHighLevelChanges = Abstract.waitUntilConditionSatisfy(base,
				SummaryPage.ClickHighLevelChanges());
		ClickHighLevelChanges.isEnabled();
		ClickHighLevelChanges.click();
		logger.info("Click on HighLevelChanges");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterHighLevelChanges = Abstract.waitUntilConditionSatisfy(base,
				SummaryPage.EnterHighLevelChanges());
		EnterHighLevelChanges.sendKeys(HighLevelChanges);
		logger.info("HighLevelChanges :" + HighLevelChanges);

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickNameOfImplementor = Abstract.waitUntilConditionSatisfy(base,
				SummaryPage.ClickNameOfImplementor());
		ClickNameOfImplementor.isEnabled();
		ClickNameOfImplementor.click();
		logger.info("Click on NameOfImplementor");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterNameOfImplementor = Abstract.waitUntilConditionSatisfy(base,
				SummaryPage.EnterNameOfImplementor());
		EnterNameOfImplementor.sendKeys(NameOfImplementor);
		logger.info("NameOfImplementor :" + NameOfImplementor);

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickImplementationTime = Abstract.waitUntilConditionSatisfy(base,
				SummaryPage.ClickImplementationTime());
		ClickImplementationTime.isEnabled();
		ClickImplementationTime.click();
		logger.info("Click on ImplementationTime");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterImplementationTime = Abstract.waitUntilConditionSatisfy(base,
				SummaryPage.EnterImplementationTime());
		EnterImplementationTime.sendKeys(ImplementationTime);
		logger.info("ImplementationTime :" + ImplementationTime);

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickTeam = Abstract.waitUntilConditionSatisfy(base, SummaryPage.ClickTeam());
		ClickTeam.isEnabled();
		ClickTeam.click();
		logger.info("Click on Team");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterTeam = Abstract.waitUntilConditionSatisfy(base, SummaryPage.EnterTeam());
		EnterTeam.sendKeys(Team);
		logger.info("Team :" + Team);

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickReleaseScopeSavebutton = Abstract.waitUntilConditionSatisfy(base,
				SummaryPage.ClickReleaseScopeSavebutton());
		ClickReleaseScopeSavebutton.isEnabled();
		ClickReleaseScopeSavebutton.click();
		logger.info("Click on Release Scope Save button");

	}

	@And("^Click on Create Infra Task Button$")
	public void ClickonInfraTaskButton() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonInfraTaskButton = Abstract.waitUntilConditionSatisfy(base,
				SummaryPage.ClickonInfraTaskButton());
		ClickonInfraTaskButton.isEnabled();
		ClickonInfraTaskButton.click();
		logger.info("Click on Infra Task Button");
	}

	@And("^Enter ImportantDates and Tasks as \"([^\"]*)\" and \"([^\"]*)\"$")
	public void Enter_ImportantDates_and_Tasks_as(String ImportantDates, String Tasks) throws Throwable {

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickImportantDates = Abstract.waitUntilConditionSatisfy(base, SummaryPage.ClickImportantDates());
		ClickImportantDates.isEnabled();
		ClickImportantDates.click();
		logger.info("Click on ImportantDates");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterImportantDates = Abstract.waitUntilConditionSatisfy(base, SummaryPage.EnterImportantDates());
		EnterImportantDates.sendKeys(ImportantDates);
		logger.info("ImportantDates :" + ImportantDates);

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickTasks = Abstract.waitUntilConditionSatisfy(base, SummaryPage.ClickTasks());
		ClickTasks.isEnabled();
		ClickTasks.click();
		logger.info("Click on Tasks");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterTasks = Abstract.waitUntilConditionSatisfy(base, SummaryPage.EnterTasks());
		EnterTasks.sendKeys(Tasks);
		logger.info("Tasks :" + Tasks);

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonInfraTaskSaveButton = Abstract.waitUntilConditionSatisfy(base,
				SummaryPage.ClickonInfraTaskSaveButton());
		ClickonInfraTaskSaveButton.isEnabled();
		ClickonInfraTaskSaveButton.click();
		logger.info("Click on Infra Task Save Button");

	}

	@And("^Click on Start Release Button$")
	public void ClickOnStartReleaseButton() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickOnStartReleaseButton = Abstract.waitUntilConditionSatisfy(base,
				WorkflowPage.ClickOnStartReleaseButton());
		ClickOnStartReleaseButton.click();
		logger.info("Click on Start Release Button");
		Thread.sleep(4000);

	}

	@And("^Click on View Workflow Button$")
	public void ClickOnViewWorkflowButton() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickOnViewWorkflowButton = Abstract.waitUntilConditionSatisfy(base,
				WorkflowPage.ClickOnViewWorkflowButton());

		ClickOnViewWorkflowButton.click();

		logger.info("Click on View Workflow Button");
	}

//	@Then("^Verify Release is Created or not$")
//	public void VerifyReleaseCreation() throws Throwable {
//		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
//
//		WebElement Environmentbutton = Abstract.waitUntilConditionSatisfy(base, EnvironmentPage.Environmentbutton());
//		Boolean status = Environmentbutton.isEnabled();
//		logger.info("Verify whether Release is Created or not");
//		Assert.assertTrue(status);
//
//	}
//
//	@Then("^Click on Create New Environment Button$")
//
//	public void ClickCreateNewEnvironment() throws Throwable {
//		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
//
//		WebElement ClickCreateNewEnvironment = Abstract.waitUntilConditionSatisfy(base,
//				EnvironmentPage.ClickCreateNewEnvironment());
//		ClickCreateNewEnvironment.click();
//
//		logger.info("Click on Create New Environment Button");
//
//	}
//
//	@And("^Click on Environment Name Field$")
//
//	public void ClickEnvironmentName() throws Throwable {
//		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
//
//		WebElement ClickEnvironmentName = Abstract.waitUntilConditionSatisfy(base,
//				EnvironmentPage.ClickEnvironmentName());
//		ClickEnvironmentName.click();
//
//		logger.info("Click on Environment Name Field");
//
//	}
//
//	@And("^Enter Environment as \"([^\"]*)\"$")
//	public void EnterEnvironmentName(String EnvironmentName) throws Throwable {
//		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
//		WebElement EnterEnvironmentName = Abstract.waitUntilConditionSatisfy(base,
//				EnvironmentPage.EnterEnvironmentName());
//		EnterEnvironmentName.sendKeys(EnvironmentName);
//
//		logger.info("EnvironmentName :" + EnvironmentName);
//	}
//
//	@And("^Click on Environment Type and Select Environment Type$")
//
//	public void ClickEnvironmentType() throws Throwable {
//		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
//
//		WebElement ClickEnvironmentType = Abstract.waitUntilConditionSatisfy(base,
//				EnvironmentPage.ClickEnvironmentType());
//		ClickEnvironmentType.click();
//		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
//		logger.info("Click Environment Type");
//		WebElement SelectEnvironmentType = Abstract.waitUntilConditionSatisfy(base,
//				EnvironmentPage.SelectEnvironmentType());
//		SelectEnvironmentType.click();
//
//		logger.info("Select Environment Type");
//
//	}
//
//	@Then("^Click on Save Button$")
//
//	public void ClickSave() throws Throwable {
//		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
//
//		WebElement ClickSave = Abstract.waitUntilConditionSatisfy(base, EnvironmentPage.ClickSave());
//		ClickSave.click();
//		logger.info("Click Save");
//
//	}
//
//	@Then("^Verify Environment is Created or not$")
//	public void VerifyEnvironmentCreation() throws Throwable {
//		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
//
//		WebElement CreateWorkflowbutton = Abstract.waitUntilConditionSatisfy(base,
//				EnvironmentPage.CreateWorkflowbutton());
//		Boolean status = CreateWorkflowbutton.isEnabled();
//		logger.info("Verify whether Environment is Created or not");
//		Assert.assertTrue(status);
//
//	}

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
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterWorkflowName = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.EnterWorkflowName());
		EnterWorkflowName.click();
		EnterWorkflowName.sendKeys(WorkflowName);
		logger.info("WorkflowName :" + WorkflowName);

	}

	@And("^Click Frequency and Select Frequency$")
	public void ClickFrequency() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		WebElement ClickFrequency = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.ClickFrequency());
		ClickFrequency.click();
		logger.info("Click Frequency");
		WebElement SelectFrequency = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.SelectFrequency());
		SelectFrequency.click();

		logger.info("Select Frequency");

	}

	@And("^Click on add stage and Enter stage Name as \"([^\"]*)\"$")
	public void clickOnStageAndEnterStageName(String stageName) throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
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
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		WebElement tickMark = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.tickMark());
		tickMark.click();
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		logger.info("Click on Tick Mark");

	}

	@Then("^Click on Icon to add task$")
	public void clickToAddTask() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		WebElement clickToAddTask = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.clickToAddTask());
		clickToAddTask.click();
		logger.info("Click On Click To Task");

	}

	@And("^Click on tracking and bamboo and click on Queue Build$")
	public void clickOnRunPlayBookHost() throws Throwable {

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement tracking = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.tracking());
		Abstract.moveToElement(base, tracking);
		logger.info("Mouse Over on tracking");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement bamboo = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.bamboo());
		Abstract.moveToElement(base, bamboo);
		logger.info("Mouse Over on bamboo");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement clickOnQueueBuild = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.clickOnQueueBuild());
		Abstract.moveToElementAndClick(base, clickOnQueueBuild);
		logger.info("Click On Queue Build");

	}

	@And("^Click on Task Name and Enter Task Name as \"([^\"]*)\"$")
	public void clickOnTaskName(String TaskName) throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

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
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		WebElement clickOntickmarktask = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.clickOntickmarktask());
		clickOntickmarktask.click();
		logger.info("Click on Tick Mark to create task");

	}

	@Then("^Click on the vertical ellipses$")
	public void clickOnVeriticalEllipse() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		WebElement clickOnVeriticalEllipse = Abstract.waitUntilConditionSatisfy(base,
				WorkflowPage.clickOnVeriticalEllipse());
		clickOnVeriticalEllipse.click();
		logger.info("Click on Vertical Ellipses");

	}

	@And("^Click on Edit Configuration for task$")
	public void clickEditConfigurations() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		WebElement clickEditConfigurations = Abstract.waitUntilConditionSatisfy(base,
				WorkflowPage.clickEditConfigurations());
		clickEditConfigurations.click();
		logger.info("Click on Edit Configurations");

	}
	/*
	 * Ansible Plugin List
	 * 
	 * @And("^Enter PathName and Host and AnsibleUserName and AnsiblePassword as \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$"
	 * ) public void
	 * enter_PathName_and_Host_and_AnsibleUserName_and_AnsiblePassword_as_and_and_and
	 * (String PathName, String Host, String AnsibleUserName, String
	 * AnsiblePassword) throws Throwable {
	 * 
	 * base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	 * WebElement ClickonPath = Abstract.waitUntilConditionSatisfy(base,
	 * AnsiblePluginConfigurationsPage.ClickonPath()); ClickonPath.isEnabled();
	 * ClickonPath.click(); logger.info("Click on Ansible Path");
	 * 
	 * base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	 * WebElement EnterPathName = Abstract.waitUntilConditionSatisfy(base,
	 * AnsiblePluginConfigurationsPage.EnterPathName());
	 * EnterPathName.sendKeys(PathName); logger.info("PathName :" + PathName);
	 * 
	 * base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	 * WebElement ClickonSFTP = Abstract.waitUntilConditionSatisfy(base,
	 * AnsiblePluginConfigurationsPage.ClickonSFTP()); ClickonSFTP.isEnabled();
	 * ClickonSFTP.click(); logger.info("Click on SFTP");
	 * 
	 * base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	 * WebElement ClickonHost = Abstract.waitUntilConditionSatisfy(base,
	 * AnsiblePluginConfigurationsPage.ClickonHost()); ClickonHost.isEnabled();
	 * ClickonHost.click(); logger.info("Click on Host");
	 * 
	 * base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	 * WebElement EnterHost = Abstract.waitUntilConditionSatisfy(base,
	 * AnsiblePluginConfigurationsPage.EnterHost()); EnterHost.sendKeys(Host);
	 * logger.info("HostName :" + Host);
	 * 
	 * base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	 * WebElement ClickonUserName = Abstract.waitUntilConditionSatisfy(base,
	 * AnsiblePluginConfigurationsPage.ClickonUserName());
	 * ClickonUserName.isEnabled(); ClickonUserName.click();
	 * logger.info("Click on UserName");
	 * 
	 * base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	 * WebElement EnterUserName = Abstract.waitUntilConditionSatisfy(base,
	 * AnsiblePluginConfigurationsPage.EnterUserName());
	 * EnterUserName.sendKeys(AnsibleUserName); logger.info("AnsibleUserName :" +
	 * AnsibleUserName);
	 * 
	 * base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	 * WebElement ClickonPassword = Abstract.waitUntilConditionSatisfy(base,
	 * AnsiblePluginConfigurationsPage.ClickonPassword());
	 * ClickonPassword.isEnabled(); ClickonPassword.click();
	 * logger.info("Click on UserName");
	 * 
	 * base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	 * WebElement EnterPassword = Abstract.waitUntilConditionSatisfy(base,
	 * AnsiblePluginConfigurationsPage.EnterPassword());
	 * EnterPassword.sendKeys(AnsiblePassword); logger.info("AnsiblePassword :" +
	 * AnsiblePassword);
	 * 
	 * base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	 * WebElement ClickonBecomeYes = Abstract.waitUntilConditionSatisfy(base,
	 * AnsiblePluginConfigurationsPage.ClickonBecomeYes());
	 * ClickonBecomeYes.isEnabled(); ClickonBecomeYes.click();
	 * logger.info("Click on Become as Yes");
	 * 
	 * base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	 * WebElement ClickonPluginConfigSave = Abstract.waitUntilConditionSatisfy(base,
	 * AnsiblePluginConfigurationsPage.ClickonPluginConfigSave());
	 * ClickonPluginConfigSave.isEnabled(); ClickonPluginConfigSave.click();
	 * logger.info("Click on Ansible Configurations Save button"); }
	 */

	@And("^Enter Bamboo Host and BambooUserName and BambooPassword and BambooPort and BambooPlanKey and BambooProjectKey and BambooBuildKey and BambooJobKey as \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_BambooHost_and_BambooUserName_and_BambooPassword_and_BambooPort_and_BambooPlanKey_and_BambooProjectkey_and_BambooBuildKey_and_BambooJobKey_as(
			String BambooHost, String BambooUserName, String BambooPassword, String BambooPort, String BambooPlanKey,
			String BambooProjectkey, String BambooBuildKey, String BambooJobKey) throws Throwable {

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonBambooHost = Abstract.waitUntilConditionSatisfy(base,
				BambooPluginConfigurationsPage.ClickonBamboohost());
		ClickonBambooHost.isEnabled();
		ClickonBambooHost.click();
		logger.info("Click on BambooHost");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterBamboohost = Abstract.waitUntilConditionSatisfy(base,
				BambooPluginConfigurationsPage.EnterBamboohost());
		EnterBamboohost.sendKeys(BambooHost);
		logger.info("BambooHost :" + BambooHost);

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonBambooUsername = Abstract.waitUntilConditionSatisfy(base,
				BambooPluginConfigurationsPage.ClickonBambooUsername());
		ClickonBambooUsername.isEnabled();
		ClickonBambooUsername.click();
		logger.info("Click on Bamboo UserName");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterBambooUsername = Abstract.waitUntilConditionSatisfy(base,
				BambooPluginConfigurationsPage.EnterBambooUsername());
		EnterBambooUsername.sendKeys(BambooUserName);
		logger.info("BambooUsername :" + BambooUserName);

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonBambooPassword = Abstract.waitUntilConditionSatisfy(base,
				BambooPluginConfigurationsPage.ClickonBambooPassword());
		ClickonBambooPassword.isEnabled();
		ClickonBambooPassword.click();
		logger.info("Click on Bamboo Password");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterBambooPassword = Abstract.waitUntilConditionSatisfy(base,
				BambooPluginConfigurationsPage.EnterBambooPassword());
		EnterBambooPassword.sendKeys(BambooPassword);
		logger.info("BambooPassword :" + BambooPassword);

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonBambooPort = Abstract.waitUntilConditionSatisfy(base,
				BambooPluginConfigurationsPage.ClickonBambooPort());
		ClickonBambooPort.isEnabled();
		ClickonBambooPort.click();
		logger.info("Click on Bamboo Port");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterBambooPort = Abstract.waitUntilConditionSatisfy(base,
				BambooPluginConfigurationsPage.EnterBambooPort());
		EnterBambooPort.sendKeys(BambooPort);
		logger.info("BambooPort :" + BambooPort);

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonPlanKey = Abstract.waitUntilConditionSatisfy(base,
				BambooPluginConfigurationsPage.ClickonPlanKey());
		ClickonPlanKey.isEnabled();
		ClickonPlanKey.click();
		logger.info("Click on Bamboo Plan Key");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterPlanKey = Abstract.waitUntilConditionSatisfy(base,
				BambooPluginConfigurationsPage.EnterPlanKey());
		EnterPlanKey.sendKeys(BambooPlanKey);
		logger.info("BambooPlanKey :" + BambooPlanKey);

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonProjectKey = Abstract.waitUntilConditionSatisfy(base,
				BambooPluginConfigurationsPage.ClickonProjectKey());
		ClickonProjectKey.isEnabled();
		ClickonProjectKey.click();
		logger.info("Click on Bamboo Project Key");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterProjectKey = Abstract.waitUntilConditionSatisfy(base,
				BambooPluginConfigurationsPage.EnterProjectKey());
		EnterProjectKey.sendKeys(BambooProjectkey);
		logger.info("BambooProjectkey :" + BambooProjectkey);

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonBuildKey = Abstract.waitUntilConditionSatisfy(base,
				BambooPluginConfigurationsPage.ClickonBuildKey());
		ClickonBuildKey.isEnabled();
		ClickonBuildKey.click();
		logger.info("Click on Bamboo Build Key");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterBuildKey = Abstract.waitUntilConditionSatisfy(base,
				BambooPluginConfigurationsPage.EnterBuildKey());
		EnterBuildKey.sendKeys(BambooBuildKey);
		logger.info("BambooBuildKey :" + BambooBuildKey);

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonJobKey = Abstract.waitUntilConditionSatisfy(base,
				BambooPluginConfigurationsPage.ClickonJobKey);
		ClickonJobKey.isEnabled();
		ClickonJobKey.click();
		logger.info("Click on Bamboo Job Key");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterJobKey = Abstract.waitUntilConditionSatisfy(base, BambooPluginConfigurationsPage.EnterJobKey());
		EnterJobKey.sendKeys(BambooJobKey);
		logger.info("BambooJobKey :" + BambooJobKey);

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonBambooPluginSave = Abstract.waitUntilConditionSatisfy(base,
				BambooPluginConfigurationsPage.ClickonBambooPluginSave());
		ClickonBambooPluginSave.isEnabled();
		ClickonBambooPluginSave.click();
		logger.info("Click on Bamboo Build Key");

	}

	@And("^Click on Use Template and Select Template$")
	public void clickOnUseTemplate() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		WebElement clickOnUseTemplate = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.clickOnUseTemplate());
		clickOnUseTemplate.click();
		logger.info("Click Use Template");
		WebElement SelectUseTemplate = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.SelectUseTemplate());
		SelectUseTemplate.click();

		logger.info("Select Template");

	}

	@And("^Click on Template version and Select Version$")
	public void clickOnTemplateVersion() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

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
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		WebElement ClickonSave = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.ClickonSave());
		ClickonSave.click();
		logger.info("Click Save");

	}

	@Then("^Click on Save Workflow button$")
	public void clickOnSaveWorkflow() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) base.driver;
		js.executeScript("window.scrollBy(0,-500)");
		WebElement clickOnSaveWorkflow = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.clickOnSaveWorkflow());
		clickOnSaveWorkflow.click();
		logger.info("Click Save Workflow");

	}

	@Then("^Click on View Workflow Icon$")
	public void clickOnViewWorkflow() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		WebElement clickOnViewWorkflow = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.clickOnViewWorkflow());
		clickOnViewWorkflow.click();
		Thread.sleep(3000);
		logger.info("Click on View Workflow Icon");

	}

//	@Then("^Click on Release list Search Filter$")
//	public void ClickonSearchRelease() throws Throwable {
//
//		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
//		WebElement ClickonSearchRelease = Abstract.waitUntilConditionSatisfy(base,
//				ReleaselistSearchPage.ClickonSearchRelease());
//		ClickonSearchRelease.isEnabled();
//		ClickonSearchRelease.click();
//		logger.info("Click on Release list Search Filter");
//
//	}
//
//	@And("^Search Release Name as \"([^\"]*)\"$")
//	public void EnterReleaseName1(String SearchRelease) throws Throwable {
//		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
//		WebElement EnterReleaseName = Abstract.waitUntilConditionSatisfy(base,
//				ReleaselistSearchPage.EnterReleaseName());
//		EnterReleaseName.click();
//		EnterReleaseName.sendKeys(SearchRelease);
//		logger.info(" Search Release Name :" + SearchRelease);
//
//	}

	@Then("^Capture the Workflow Status as \"([^\"]*)\"$")
	public void CaptureWorkflowStatus(String WorkflowStatus) throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		WebElement CaptureWorkflowStatus = Abstract.waitForTextToAppear(base, WorkflowPage.CaptureWorkflowStatus);
		String Statustext = CaptureWorkflowStatus.getText();
		Assert.assertEquals(Statustext, WorkflowStatus);

		logger.info("CaptureWorkflowStatus as " + WorkflowStatus);

	}

	@Then("^Click on Release Plan Link from Left Navigation Menu$")

	public void ClickonReleasePlanLink() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		WebElement ClickonReleasePlanLink = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanPage.ClickonReleasePlanLink());
		ClickonReleasePlanLink.click();
		logger.info("Click Click on Release Plan Link");
		Thread.sleep(2000);

	}

	@Then("^Click on Create Release Plan Button$")

	public void ClickonCreateReleasePlanButton() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		WebElement ClickonCreateReleasePlanButton = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanPage.ClickonCreateReleasePlanButton());
		ClickonCreateReleasePlanButton.click();
		logger.info("Click Click on Click on Create Release Plan Button");

	}

	@And("^Click and Select Release Type in Release Plan Window$")
	public void ReleaseTypeInReleasePlan() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickReleaseTypeField = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanPage.ClickReleaseTypeField());
		ClickReleaseTypeField.click();

		WebElement SelectReleaseType = Abstract.waitUntilConditionSatisfy(base, ReleasePlanPage.SelectReleaseType());
		SelectReleaseType.click();
		logger.info("Click and Select ReleaseType");
	}

	@And("^Click on Date Picker and Select Release Plan Date$")
	public void ClickReleasePlanDate() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickReleasePlanDate = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanPage.ClickReleasePlanDate());
		ClickReleasePlanDate.click();

		WebElement SelectReleasePlanDate = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanPage.SelectReleasePlanDate());
		SelectReleasePlanDate.click();
		logger.info("Click on Date Picker and Select Release Plan Date");
	}

	@And("^Enter RelasePlanName and Description and Owner as \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_RelasePlanName_and_Description_and_Owner_as(String RelasePlanName, String Description,
			String Owner) throws Throwable {

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickReleasePlanName = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanPage.ClickReleasePlanName());
		ClickReleasePlanName.isEnabled();
		ClickReleasePlanName.click();
		logger.info("Click on Release Plan Name");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterReleasePlanName = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanPage.EnterReleasePlanName());
		EnterReleasePlanName.sendKeys(RelasePlanName);
		logger.info("RelasePlanName :" + RelasePlanName);

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickDescription = Abstract.waitUntilConditionSatisfy(base, ReleasePlanPage.ClickDescription());
		ClickDescription.isEnabled();
		ClickDescription.click();
		logger.info("Click on Description");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterDescription = Abstract.waitUntilConditionSatisfy(base, ReleasePlanPage.EnterDescription());
		EnterDescription.sendKeys(Description);
		logger.info("Description :" + Description);

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickOwner = Abstract.waitUntilConditionSatisfy(base, ReleasePlanPage.ClickOwner());
		ClickOwner.isEnabled();
		ClickOwner.click();
		logger.info("Click on Owner");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterOwner = Abstract.waitUntilConditionSatisfy(base, ReleasePlanPage.EnterOwner());
		EnterOwner.sendKeys(Owner);
		logger.info("Owner :" + Owner);

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickReleasePlanSaveButton = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanPage.ClickReleasePlanSaveButton());
		ClickReleasePlanSaveButton.isEnabled();
		ClickReleasePlanSaveButton.click();
		logger.info("Click on Owner");
		Thread.sleep(2000);

	}

	@And("^Click and Select Platform$")
	public void ClickOnInfraPlatform() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickOnInfraPlatform = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanningPage.ClickOnInfraPlatform());
		ClickOnInfraPlatform.click();

		WebElement SelectInfraPlatform = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanningPage.SelectInfraPlatform());
		SelectInfraPlatform.click();
		logger.info("Click and Select Platform");
	}

	@And("^Click and Select Infra Release Plan$")
	public void SelectInfraReleasePlan() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickInfraReleasePlan = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanningPage.ClickInfraReleasePlan());
		ClickInfraReleasePlan.click();

		WebElement SelectInfraReleasePlan = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanningPage.SelectInfraReleasePlan());
		SelectInfraReleasePlan.click();
		logger.info("Click and Select Infra Release Plan");
	}

	@Then("^Click on Impacted Systems Tab$")
	public void ClickonImpactedSystemsTab() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonImpactedSystemsTab = Abstract.waitUntilConditionSatisfy(base,
				ImpactedSystemsTab.ClickonImpactedSystemsTab());
		ClickonImpactedSystemsTab.click();
		logger.info("Click on Impacted Systems Tab");

	}

	@And("^Click on Opt In and Opt out for the Applications$")
	public void ClickonOptInApplication() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonOptInApplication = Abstract.waitUntilConditionSatisfy(base,
				ImpactedSystemsTab.ClickonOptInApplication());
		ClickonOptInApplication.click();
		Thread.sleep(2000);

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonOptOutApplication = Abstract.waitUntilConditionSatisfy(base,
				ImpactedSystemsTab.ClickonOptOutApplication());
		ClickonOptOutApplication.click();
		logger.info("Click on Opt In and Opt out for the Applications");

	}

	@And("^Click on Pause Release Button$")
	public void ClickPauseReleaseButton() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickPauseReleaseButton = Abstract.waitUntilConditionSatisfy(base,
				WorkflowPage.ClickPauseReleaseButton());
		ClickPauseReleaseButton.click();
//		JavascriptExecutor js = (JavascriptExecutor) base.driver;
//		js.executeScript("window.scrollBy(0,-500)");
		
	      Actions action = new Actions(driver);
	        WebElement btn = driver.findElement(By.xpath("//div[2]/div/div/div/div/div/span"));
	        action.moveToElement(btn).perform();
	         

		logger.info("Click on Pause Release Button");
		
		

	}

	@Then("^Capture the Paused Workflow Status as \"([^\"]*)\"$")
	public void CapturePausedWorkflowStatus(String PausedWorkflowStatus) throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		WebElement CapturePausedWorkflowStatus = Abstract.waitForTextToAppear(base,
				WorkflowPage.CapturePausedWorkflowStatus);
		String Statustext = CapturePausedWorkflowStatus.getText();
		Assert.assertEquals(CapturePausedWorkflowStatus, PausedWorkflowStatus);

		logger.info("CaptureWorkflowStatus as " + PausedWorkflowStatus);

	}

	@And("^Click on Resume Release Button$")
	public void ClickResumeReleaseButton() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		
		WebElement ClickResumeReleaseButton = Abstract.waitUntilConditionSatisfy(base,
				WorkflowPage.ClickResumeReleaseButton());
		ClickResumeReleaseButton.click();
		
		Thread.sleep(5000);
		logger.info("Click on Resume Release Button");
		
		
	}

}