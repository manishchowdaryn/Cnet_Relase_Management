package steps;

import java.awt.AWTException
;

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
import pageObjects.AnsiblePluginConfigurationsPage;
import pageObjects.BambooPluginConfigurationsPage;
import reusableFunction.Abstract;
import PageObjects_Infra.EnvironmentsTab;

public class ReleaseManagementSteps extends BaseUtil {

	public BaseUtil base;
	public Login Login;
	public DashboardPage DashboardPage;
	public ReleasePlanningPage ReleasePlanningPage;
	public EnvironmentPage EnvironmentPage;
	public WorkflowPage WorkflowPage;
	public ReleaselistSearchPage ReleaselistSearchPage;
	public AnsiblePluginConfigurationsPage AnsiblePluginConfigurationsPage;
	public BambooPluginConfigurationsPage BambooPluginConfigurationsPage;
	public EnvironmentsTab EnvironmentsTab;
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
		AnsiblePluginConfigurationsPage = new AnsiblePluginConfigurationsPage(base.driver);
		BambooPluginConfigurationsPage = new BambooPluginConfigurationsPage(base.driver);
		EnvironmentsTab = new EnvironmentsTab(base.driver);
	}

	@Then("^Click on Release List Tab$")
	public void ClickonReleaseListTab() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		WebElement ClickReleaseList = Abstract.waitUntilConditionSatisfy(base,
				ReleaselistSearchPage.ClickonReleaselistTab());
		ClickReleaseList.isEnabled();
		ClickReleaseList.click();
		logger.info("Click on Release List Tab");
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

	@Then("^Click on Release Type and Select Release Type$")
	public void ClickonReleaseType() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickReleaseType = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanningPage.ClickonReleaseType());

		ClickReleaseType.click();
		WebElement SelectReleaseType = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanningPage.SelectReleaseType());
		SelectReleaseType.click();
		logger.info("Clcik and Select ReleaseType");
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

	@And("^Click on Project Field and Select Project$")
	public void ClickonProject() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonProject = Abstract.waitUntilConditionSatisfy(base, ReleasePlanningPage.ClickonProject());

		ClickonProject.click();
		WebElement SelectProject = Abstract.waitUntilConditionSatisfy(base, ReleasePlanningPage.SelectProject());
		SelectProject.click();
		logger.info("Click on Project Field and Select Project");

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
		WebElement ClickReleasePlan = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanningPage.ClickReleasePlan());

		ClickReleasePlan.click();
		WebElement SelectReleasePlan = Abstract.waitUntilConditionSatisfy(base,
				ReleasePlanningPage.SelectReleasePlan());
		SelectReleasePlan.click();
		logger.info("Click on Release Plan Field and Select Release Plan");
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
	
	@Then("^Verify Release is Created or not$")
	public void VerifyReleaseCreation() throws Throwable{
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		WebElement Environmentbutton = Abstract.waitUntilConditionSatisfy(base,
				EnvironmentPage.Environmentbutton());
		Boolean status = Environmentbutton.isEnabled();
		logger.info("Verify whether Release is Created or not");
		Assert.assertTrue(status);
		
		
	}

	@Then("^Click on Create New Environment Button$")

	public void ClickCreateNewEnvironment() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		WebElement ClickCreateNewEnvironment = Abstract.waitUntilConditionSatisfy(base,
				EnvironmentPage.ClickCreateNewEnvironment());
		ClickCreateNewEnvironment.click();

		logger.info("Click on Create New Environment Button");

	}

	@And("^Click on Environment Name Field$")

	public void ClickEnvironmentName() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		WebElement ClickEnvironmentName = Abstract.waitUntilConditionSatisfy(base,
				EnvironmentPage.ClickEnvironmentName());
		ClickEnvironmentName.click();

		logger.info("Click on Environment Name Field");

	}

	@And("^Enter Environment as \"([^\"]*)\"$")
	public void EnterEnvironmentName(String EnvironmentName) throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterEnvironmentName = Abstract.waitUntilConditionSatisfy(base,
				EnvironmentPage.EnterEnvironmentName());
		EnterEnvironmentName.sendKeys(EnvironmentName);

		logger.info("EnvironmentName :" + EnvironmentName);
	}

	@And("^Click on Environment Type and Select Environment Type$")

	public void ClickEnvironmentType() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		WebElement ClickEnvironmentType = Abstract.waitUntilConditionSatisfy(base,
				EnvironmentPage.ClickEnvironmentType());
		ClickEnvironmentType.click();
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		logger.info("Click Environment Type");
		WebElement SelectEnvironmentType = Abstract.waitUntilConditionSatisfy(base,
				EnvironmentPage.SelectEnvironmentType());
		SelectEnvironmentType.click();

		logger.info("Select Environment Type");

	}

	@Then("^Click on Save Button$")

	public void ClickSave() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		WebElement ClickSave = Abstract.waitUntilConditionSatisfy(base, EnvironmentPage.ClickSave());
		ClickSave.click();
		logger.info("Click Save");

	}
	
	@Then("^Verify Environment is Created or not$")
	public void VerifyEnvironmentCreation() throws Throwable{
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		WebElement CreateWorkflowbutton = Abstract.waitUntilConditionSatisfy(base,
				EnvironmentPage.CreateWorkflowbutton());
		Boolean status = CreateWorkflowbutton.isEnabled();
		logger.info("Verify whether Environment is Created or not");
		Assert.assertTrue(status);
		
		
	}

	@Then("^Click on Create Workflow Icon$")

	public void ClickCreateWorkflowIcon() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

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
/*Ansible Plugin List
 
	@And("^Enter PathName and Host and AnsibleUserName and AnsiblePassword as \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_PathName_and_Host_and_AnsibleUserName_and_AnsiblePassword_as_and_and_and(String PathName,
			String Host, String AnsibleUserName, String AnsiblePassword) throws Throwable {

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonPath = Abstract.waitUntilConditionSatisfy(base, AnsiblePluginConfigurationsPage.ClickonPath());
		ClickonPath.isEnabled();
		ClickonPath.click();
		logger.info("Click on Ansible Path");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterPathName = Abstract.waitUntilConditionSatisfy(base, AnsiblePluginConfigurationsPage.EnterPathName());
		EnterPathName.sendKeys(PathName);
		logger.info("PathName :" + PathName);

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonSFTP = Abstract.waitUntilConditionSatisfy(base, AnsiblePluginConfigurationsPage.ClickonSFTP());
		ClickonSFTP.isEnabled();
		ClickonSFTP.click();
		logger.info("Click on SFTP");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonHost = Abstract.waitUntilConditionSatisfy(base, AnsiblePluginConfigurationsPage.ClickonHost());
		ClickonHost.isEnabled();
		ClickonHost.click();
		logger.info("Click on Host");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterHost = Abstract.waitUntilConditionSatisfy(base, AnsiblePluginConfigurationsPage.EnterHost());
		EnterHost.sendKeys(Host);
		logger.info("HostName :" + Host);

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonUserName = Abstract.waitUntilConditionSatisfy(base,
				AnsiblePluginConfigurationsPage.ClickonUserName());
		ClickonUserName.isEnabled();
		ClickonUserName.click();
		logger.info("Click on UserName");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterUserName = Abstract.waitUntilConditionSatisfy(base, AnsiblePluginConfigurationsPage.EnterUserName());
		EnterUserName.sendKeys(AnsibleUserName);
		logger.info("AnsibleUserName :" + AnsibleUserName);

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonPassword = Abstract.waitUntilConditionSatisfy(base,
				AnsiblePluginConfigurationsPage.ClickonPassword());
		ClickonPassword.isEnabled();
		ClickonPassword.click();
		logger.info("Click on UserName");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterPassword = Abstract.waitUntilConditionSatisfy(base, AnsiblePluginConfigurationsPage.EnterPassword());
		EnterPassword.sendKeys(AnsiblePassword);
		logger.info("AnsiblePassword :" + AnsiblePassword);

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonBecomeYes = Abstract.waitUntilConditionSatisfy(base,
				AnsiblePluginConfigurationsPage.ClickonBecomeYes());
		ClickonBecomeYes.isEnabled();
		ClickonBecomeYes.click();
		logger.info("Click on Become as Yes");

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonPluginConfigSave = Abstract.waitUntilConditionSatisfy(base,
				AnsiblePluginConfigurationsPage.ClickonPluginConfigSave());
		ClickonPluginConfigSave.isEnabled();
		ClickonPluginConfigSave.click();
		logger.info("Click on Ansible Configurations Save button");
	}
*/

	@And("^Enter Bamboo Host and BambooUserName and BambooPassword and BambooPort and BambooPlanKey and BambooProjectKey and BambooBuildKey as \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_BambooHost_and_BambooUserName_and_BambooPassword_and_BambooPort_and_BambooPlanKey_and_BambooProjectkey_and_BambooBuildKey_as(String BambooHost,
			String BambooUserName, String BambooPassword, String BambooPort, String BambooPlanKey, String BambooProjectkey, String BambooBuildKey) throws Throwable {
		
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonBambooHost = Abstract.waitUntilConditionSatisfy(base, BambooPluginConfigurationsPage.ClickonBamboohost());
		ClickonBambooHost.isEnabled();
		ClickonBambooHost.click();
		logger.info("Click on BambooHost");
		
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterBamboohost = Abstract.waitUntilConditionSatisfy(base, BambooPluginConfigurationsPage.EnterBamboohost());
		EnterBamboohost.sendKeys(BambooHost);
		logger.info("BambooHost :" + BambooHost);
		
		
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonBambooUsername = Abstract.waitUntilConditionSatisfy(base, BambooPluginConfigurationsPage.ClickonBambooUsername());
		ClickonBambooUsername.isEnabled();
		ClickonBambooUsername.click();
		logger.info("Click on Bamboo UserName");
		
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterBambooUsername = Abstract.waitUntilConditionSatisfy(base, BambooPluginConfigurationsPage.EnterBambooUsername());
		EnterBambooUsername.sendKeys(BambooUserName);
		logger.info("BambooUsername :" + BambooUserName);
		
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonBambooPassword = Abstract.waitUntilConditionSatisfy(base, BambooPluginConfigurationsPage.ClickonBambooPassword());
		ClickonBambooPassword.isEnabled();
		ClickonBambooPassword.click();
		logger.info("Click on Bamboo Password");
		
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterBambooPassword = Abstract.waitUntilConditionSatisfy(base, BambooPluginConfigurationsPage.EnterBambooPassword());
		EnterBambooPassword.sendKeys(BambooPassword);
		logger.info("BambooPassword :" + BambooPassword);
		
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonBambooPort = Abstract.waitUntilConditionSatisfy(base, BambooPluginConfigurationsPage.ClickonBambooPort());
		ClickonBambooPort.isEnabled();
		ClickonBambooPort.click();
		logger.info("Click on Bamboo Port");
		
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterBambooPort = Abstract.waitUntilConditionSatisfy(base, BambooPluginConfigurationsPage.EnterBambooPort());
		EnterBambooPort.sendKeys(BambooPort);
		logger.info("BambooPort :" + BambooPort);
		
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonPlanKey = Abstract.waitUntilConditionSatisfy(base, BambooPluginConfigurationsPage.ClickonPlanKey());
		ClickonPlanKey.isEnabled();
		ClickonPlanKey.click();
		logger.info("Click on Bamboo Plan Key");
		
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterPlanKey = Abstract.waitUntilConditionSatisfy(base, BambooPluginConfigurationsPage.EnterPlanKey());
		EnterPlanKey.sendKeys(BambooPlanKey);
		logger.info("BambooPlanKey :" + BambooPlanKey);
	
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonProjectKey = Abstract.waitUntilConditionSatisfy(base, BambooPluginConfigurationsPage.ClickonProjectKey());
		ClickonProjectKey.isEnabled();
		ClickonProjectKey.click();
		logger.info("Click on Bamboo Project Key");
		
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterProjectKey = Abstract.waitUntilConditionSatisfy(base, BambooPluginConfigurationsPage.EnterProjectKey());
		EnterProjectKey.sendKeys(BambooProjectkey);
		logger.info("BambooProjectkey :" + BambooProjectkey);
		
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonBuildKey = Abstract.waitUntilConditionSatisfy(base, BambooPluginConfigurationsPage.ClickonBuildKey());
		ClickonBuildKey.isEnabled();
		ClickonBuildKey.click();
		logger.info("Click on Bamboo Build Key");
		
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterBuildKey = Abstract.waitUntilConditionSatisfy(base, BambooPluginConfigurationsPage.EnterBuildKey());
		EnterBuildKey.sendKeys(BambooBuildKey);
		logger.info("BambooBuildKey :" + BambooBuildKey);
		
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonBambooPluginSave = Abstract.waitUntilConditionSatisfy(base, BambooPluginConfigurationsPage.ClickonBambooPluginSave());
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

	@Then("^Click on Save as Template$")
	public void clickOnSaveAsTemplate() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		WebElement clickOnSaveAsTemplate = Abstract.waitUntilConditionSatisfy(base,
				WorkflowPage.clickOnSaveAsTemplate());
		clickOnSaveAsTemplate.click();
		logger.info("Click on Save as Template");

	}

	@And("^Click on Template Name Text Box$")
	public void clickOnTemplateName() throws Throwable {

		base.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		WebElement clickOnTemplateName = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.clickOnTemplateName());
		clickOnTemplateName.isEnabled();
		clickOnTemplateName.click();
		logger.info("Click on Template Name Textbox");

	}

	@And("^Enter Template Name as \"([^\"]*)\"$")
	public void EnterTemplateName(String TemplateName) throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		WebElement EnterTemplateName = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.EnterTemplateName());
		EnterTemplateName.click();
		EnterTemplateName.sendKeys(TemplateName);
		logger.info("Template Name :" + TemplateName);

	}

	@Then("^Click on Save Template button$")
	public void clickOnSaveTemplate() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		WebElement clickOnSaveTemplate = Abstract.waitUntilConditionSatisfy(base, WorkflowPage.clickOnSaveTemplate());
		clickOnSaveTemplate.click();
		base.driver.navigate().back();
		Thread.sleep(1000);
		logger.info("Click on Save Template button");

	}


	@Then("^Click on Release list Search Filter$")
	public void ClickonSearchRelease() throws Throwable {

		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ClickonSearchRelease = Abstract.waitUntilConditionSatisfy(base,
				ReleaselistSearchPage.ClickonSearchRelease());
		ClickonSearchRelease.isEnabled();
		ClickonSearchRelease.click();
		logger.info("Click on Release list Search Filter");

	}

	@And("^Search Release Name as \"([^\"]*)\"$")
	public void EnterReleaseName1(String SearchRelease) throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterReleaseName = Abstract.waitUntilConditionSatisfy(base,
				ReleaselistSearchPage.EnterReleaseName());
		EnterReleaseName.click();
		EnterReleaseName.sendKeys(SearchRelease);
		logger.info(" Search Release Name :" + SearchRelease);

	}

	@Then("^Click on View Icon$")
	public void ClickonViewIcon() throws Throwable {
		base.driver.getCurrentUrl();
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

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
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement EnterTargetEnvironmentName = Abstract.waitUntilConditionSatisfy(base,
				EnvironmentPage.EnterTargetEnvironmentName());
		EnterTargetEnvironmentName.click();
		EnterTargetEnvironmentName.sendKeys(TargetEnvironmentName);
		logger.info("Target Environment Name :" + TargetEnvironmentName);

	}

	@And("^Click on Target Environment Type$")
	public void ClickTargetEnvironmentType() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		WebElement ClickTargetEnvironmentType = Abstract.waitUntilConditionSatisfy(base,
				EnvironmentPage.ClickTargetEnvironmentType());
		ClickTargetEnvironmentType.click();

		logger.info("Click on Target Environment Type");

	}

	@And("^Select Target Environment Type$")
	public void SelectTargetEnvironmentType() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		WebElement SelectTargetEnvironmentType = Abstract.waitUntilConditionSatisfy(base,
				EnvironmentPage.SelectTargetEnvironmentType());
		SelectTargetEnvironmentType.click();

		logger.info("Select Target Environment Type");

	}

	@Then("^Click to Save Clone Environment$")
	public void ClickSaveCloneEnvironment() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		WebElement ClickSaveCloneEnvironment = Abstract.waitUntilConditionSatisfy(base,
				EnvironmentPage.ClickSaveCloneEnvironment());
		ClickSaveCloneEnvironment.click();

		logger.info("Select Target Environment Type");

	}

	@Then("^Click on Start Environment Release Icon$")
	public void ClickStartEnvironmentRelease() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

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
		// Assert.assertEquals(ApplicationStatusText, ApplicationStatus);
		logger.info("Verify the statsu as :" + ApplicationStatus);

	}

	@Then("^Verify Infrastructure Release is created or not$")
	public void VerifyInfraReleaseCreation() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement ImpactedSystemsTab = Abstract.waitUntilConditionSatisfy(base, EnvironmentsTab.ImpactedSystemsTab());
		Boolean status = ImpactedSystemsTab.isEnabled();
		logger.info("Verify whether Infrastructure Release is Created or not");
		Assert.assertTrue(status);
	}


	@Then("^Click on Environments Tab$")
	public void clickEnvironmentTab() throws Throwable {
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement EnvironmentTab = Abstract.waitUntilConditionSatisfy(base, EnvironmentsTab.ClickEnvironmentsTab());
		EnvironmentTab.isEnabled();
		base.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		EnvironmentTab.click();
		logger.info("Click on Environments Tab");
	}
}