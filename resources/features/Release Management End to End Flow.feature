Feature: Release Management Automation Scenarios

  @ReleaseManagement_Create_New_Release
  Scenario Outline: Release_Management(Create New Release) in Chrome
    Given Launch Browser and access the Matilda URL
    Then Verify whether Login page is correctly opened or not
    And Enter Username and Password as "<Username>" and "<Password>"
    Then Click on Release List Tab
    Then Click on Create New Release Button
    Then Click on Release Type and Select Release Type
    And Click on Release Name Text Box
    And Enter Release Name as "<ReleaseName>"
    And Click on Project Field and Select Project
    And Click on Application and Select Application
    And Click on Release Version and Select Release Version
    #And Click on Date picker and Select Today
    And Click Description
    And Enter Description as "<Description>"
    Then Click Save and Next
    Then Click on Create New Environment Button
    And Click on Environment Name Field
    And Enter Environment as "<EnvironmentName>"
    And Click on Environment Type and Select Environment Type
    Then Click on Save Button
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
    And Enter Bamboo Host and BambooUserName and BambooPassword and BambooPort and BambooPlanKey and BambooProjectKey and BambooBuildKey as "<BambooHost>" and "<BambooUserName>" and "<BambooPassword>" and "<BambooPort>" and "<BambooPlanKey>" and "<BambooProjectkey>" and "<BambooBuildKey>"
    Then Click on Save Workflow button
    Then Click on View Workflow Icon
    Then Click on Save as Template
    And Click on Template Name Text Box
    And Enter Template Name as "<TemplateName>"
    Then Click on Save Template button
    Then Click on Clone Environment Icon
    And Click on Target Environment Name Text box
    And Enter Target Environment Name as "<TargetEnvironmentName>"
    And Click on Target Environment Type
    And Select Target Environment Type
    Then Click to Save Clone Environment
    Then Click on Start Environment Release Icon
    Then Verify the Status as "<ApplicationStatus>"

    Examples: 
      | Username                | Password          | ReleaseName           | Description         | EnvironmentName        | WorkflowName | stageName | TaskName   | PathName | Host | AnsibleUserName | AnsiblePassword | BambooHost            | BambooUserName | BambooPassword | BambooPort | BambooPlanKey | BambooProjectkey | BambooBuildKey | TemplateName     | TargetEnvironmentName         | ApplicationStatus |
      | ananda@matildacloud.com | Ananda123@Matilda | March14_Release_ETE_4 | Release Description | New_Enironment_Version | NewWFNAB     | Maneesh   | BambooTask | Path     | 8080 | admin           | admin           | http://54.149.196.230 | matilda        | matilda        |       8050 | MAT-TEST      | MAT              | TEST           | Template_March14 | New_TargetEnvironment_March14 | InProgress        |

  @ReleaseManagement_Create_Release_Using_Existing_Template
  Scenario Outline: Release_Management(Create Release using Existing Template) in Chrome
    Then Click on Release List Tab
    Then Click on Create New Release Button
    Then Click on Release Type and Select Release Type
    And Click on Release Name Text Box
    And Enter Release Name as "<ReleaseName>"
    And Click on Project Field and Select Project
    And Click on Application and Select Application
    And Click on Release Version and Select Release Version
    #And Click on Date picker and Select Today
    And Click Description
    And Enter Description as "<Description>"
    Then Click Save and Next
    Then Click on Create New Environment Button
    And Click on Environment Name Field
    And Enter Environment as "<EnvironmentName>"
    And Click on Environment Type and Select Environment Type
    Then Click on Save Button
    Then Click on Create Workflow Icon
    And Click on Workflow Name Text Box
    And Enter Workflow Name as "<WorkflowName>"
    And Click on Use Template and Select Template
    And Click on Template version and Select Version
    And Click Frequency and Select Frequency
    Then Click on Save
    Then Click on Save Workflow button
    Then Click on Start Environment Release Icon
    Then Verify the Status as "<ApplicationStatus>"

    Examples: 
      | ReleaseName           | Description         | EnvironmentName        | WorkflowName | ApplicationStatus |
      | March14_Release_ETE_5 | Release Description | New_Enironment_Version | NewWFNAB     | Success           |

  @ReleaseManagement_Infra_Releas
  Scenario Outline: Release_Management_Infrastructure in Chrome
    Then Click on Release List Tab
    Then Click on Create New Release Button
    And Click on Release Name Text Box
    And Enter Release Name as "<ReleaseName>"
    And Click on Project Field and Select Project
    #And Click on Application and Select Application
    And Click on Release Version and Select Release Version
    #And Click on Date picker and Select Today
    And Click Description
    And Enter Description as "<Description>"
    Then Click Save and Next
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
    And Enter Bamboo Host and BambooUserName and BambooPassword and BambooPort and BambooPlanKey and BambooProjectKey and BambooBuildKey as "<BambooHost>" and "<BambooUserName>" and "<BambooPassword>" and "<BambooPort>" and "<BambooPlanKey>" and "<BambooProjectkey>" and "<BambooBuildKey>"
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
      | Username                | Password          | ReleaseName           | Description         | EnvironmentName        | WorkflowName | stageName | TaskName   | PathName | Host | AnsibleUserName | AnsiblePassword | BambooHost            | BambooUserName | BambooPassword | BambooPort | BambooPlanKey | BambooProjectkey | BambooBuildKey | TemplateName     | TargetEnvironmentName         | ApplicationStatus |
      | ananda@matildacloud.com | Ananda123@Matilda | March14_Release_ETE_6 | Release Description | New_Enironment_Version | NewWFNAB     | Maneesh   | BambooTask | Path     | 8080 | admin           | admin           | http://54.149.196.230 | matilda        | matilda        |       8050 | MAT-TEST      | MAT              | TEST           | Template_March14 | New_TargetEnvironment_March14 | InProgress        |
