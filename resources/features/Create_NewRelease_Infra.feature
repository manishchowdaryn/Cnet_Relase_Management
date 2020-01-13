Feature: Create New Infrastructure Release

  @ReleaseManagement
  Scenario Outline: Release_Management_Infrastructure in Chrome
    Given Launch Browser and access the Matilda URL
    Then Verify whether Login page is correctly opened or not
    And Enter Username and Password as "<Username>" and "<Password>"
    Then Click on Release List Tab
    Then Click on Create New Release Button
    And Click on Release Name Text Box
    And Enter Release Name as "<ReleaseName>"
    And Click on Project Field and Select Project
    #And Click on Application and Select Application
    And Click on Infra Release Plan and Select Infra Release Plan
    #And Click on Date picker and Select Today
    And Click Description
    And Enter Description as "<Description>"
    Then Click Save and Next
    Then Verify Infrastructure Release is created or not
    Then Click on Environments Tab
    #Then Click on Create New Environment Button
    #And Click on Environment Name Field
    #And Enter Environment as "<EnvironmentName>"
    #And Click on Environment Type and Select Environment Type
    #Then Click on Save Button
    Then Click on Create Workflow Icon
    And Click on Workflow Name Text Box
    And Enter Workflow Name as "<WorkflowName>"
    And Click Frequency and Select Frequency
    Then Click on Save
    And Click on add stage and Enter stage Name as "<stageName>"
    Then Click on Tick Mark
    Then Click on Icon to add task
    And Click on tracking and bamboo and click on Queue Build
    And Click on Task Name and Enter Task Name as "<TaskName>"
    Then Click on Tick Mark to create task
    Then Click on the vertical ellipses
    And Click on Edit Configuration for task
    #And Enter PathName and Host and AnsibleUserName and AnsiblePassword as "<PathName>" and "<Host>" and "<AnsibleUserName>" and "<AnsiblePassword>"
    #And Enter Bamboo Host and BambooUserName and BambooPassword and BambooPort and BambooPlanKey and BambooProjectKey and BambooBuildKey as "<BambooHost>" and "<BambooUserName>" and "<BambooPassword>" and "<BambooPort>" and "<BambooPlanKey>" and "<BambooProjectkey>" and "<BambooBuildKey>"
    Then Click on Save Workflow button
    Then Click on Environments Tab
    Then Click on View Workflow Icon
    Then Click on Save as Template
    And Click on Template Name Text Box
    And Enter Template Name as "<TemplateName>"
    Then Click on Save Template button
    Then Click on Environments Tab
    Then Click on Clone Environment Icon
    And Click on Target Environment Name Text box
    And Enter Target Environment Name as "<TargetEnvironmentName>"
    And Click on Target Environment Type
    And Select Target Environment Type
    Then Click to Save Clone Environment
    Then Click on Start Environment Release Icon
    Then Verify the Status as "<ApplicationStatus>"

    Examples: 
      | Username                | Password          | ReleaseName                | Description         | EnvironmentName        | WorkflowName | stageName | TaskName   | PathName | Host | AnsibleUserName | AnsiblePassword | BambooHost            | BambooUserName | BambooPassword | BambooPort | BambooPlanKey | BambooProjectkey | BambooBuildKey | TemplateName     | TargetEnvironmentName         | ApplicationStatus |
      | ananda@matildacloud.com | Ananda123@Matilda | TestMarch15_Infra_Version1 | Release Description | New_Enironment_Version | NewWFNAB     | Maneesh   | BambooTask | Path     | 8080 | admin           | admin           | http://54.149.196.230 | matilda        | matilda        |       8050 | MAT-TEST      | MAT              | TEST           | Template_March15 | New_TargetEnvironment_March15 | Success           |
