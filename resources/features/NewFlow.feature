Feature: Release Management New Flow

  @ReleaseManagement
  Scenario Outline: Release_Management in Chrome
    Given Launch Browser and access the Matilda URL
    Then Verify whether Login page is correctly opened or not
    And Enter Username and Password as "<Username>" and "<Password>"
    #Then Click on Create New Release Button
    #Then Click on Release Type and Select Release Type
    #And Click on Release Name Text Box
    #And Enter Release Name as "<ReleaseName>"
    #And Click on Group Field and Select Group
    #And Click on Team Field and Select Team
    #And Click on Product Field and Select Product
    #And Click on Application and Select Application
    #And Click on Release Plan and Select Release Plan
    #And Click on Template and Select Template
    #And Click Description
    #And Enter Description as "<Description>"
    #Then Click Save and Next
    #And Click on Create Release Scope Button
    #Then Enter CRQNumber and ScopeItem and HighLevelChanges and NameOfImplementor and ImplementationTime and Team as "<CRQNumber>" and "<ScopeItem>" and "<HighLevelChanges>" and "<NameOfImplementor>" and "<ImplementationTime>" and "<Team>"
    #And Click on Create Infra Task Button
    #And Enter ImportantDates and Tasks as "<ImportantDates>" and "<Tasks>"
    #Then Verify Release is Created or not
    #And Click on Workflow Tab
    #And Click on Start Release Button
    #And Click on View Workflow Button

    #Then Capture the Workflow Status as "<WorkflowStatus>"
    Examples: 
      | Username       | Password | ReleaseName                   | Description         | CRQNumber | ScopeItem | HighLevelChanges | NameOfImplementor | ImplementationTime | Team | ImportantDates | Tasks | WorkflowStatus |
      | maneesh@qa.com | matilda  | Jan_Phase1_Sprint1_Release_01 | Release Description |    423665 | Item 34   | None             | Maneesh           | 2 Hrs              | QA   | Dec 23 and 24  |     5 | SUCCESS        |

  @ReleaseManagement_Create_Infra_Release_Using_Existing_Template
  Scenario Outline: Release_Management in Chrome
    Then Click on Release Plan Link from Left Navigation Menu
    Then Click on Create Release Plan Button
    And Click and Select Release Type in Release Plan Window
    And Click on Date Picker and Select Release Plan Date
    And Enter RelasePlanName and Description and Owner as "<RelasePlanName>" and "<Description>" and "<Owner>"
    Then Click on Release List Link from Left Navigation Menu
    Then Click on Create New Release Button
    And Click on Release Name Text Box
    And Enter Release Name as "<ReleaseName>"
    And Click and Select Platform
    And Click Description
    And Enter Description as "<Description>"
    And Click and Select Infra Release Plan
    And Click on Template and Select Template
    Then Click Save and Next
    #And Click on Create Release Scope Button
    #Then Enter CRQNumber and ScopeItem and HighLevelChanges and NameOfImplementor and ImplementationTime and Team as "<CRQNumber>" and "<ScopeItem>" and "<HighLevelChanges>" and "<NameOfImplementor>" and "<ImplementationTime>" and "<Team>"
    #And Click on Create Infra Task Button
    #And Enter ImportantDates and Tasks as "<ImportantDates>" and "<Tasks>"
    #Then Click on Impacted Systems Tab
    #And Click on Opt In and Opt out for the Applications
    And Click on Workflow Tab
    And Click on Start Release Button
    And Click on View Workflow Button
    And Click on Pause Release Button
    #Then Capture the Paused Workflow Status as "<PausedWorkflowStatus>"
    And Click on Resume Release Button

    Examples: 
      | RelasePlanName        | Description        | Owner | ReleaseName                  | Description         | CRQNumber | ScopeItem | HighLevelChanges | NameOfImplementor | ImplementationTime | Team | ImportantDates | Tasks | PausedWorkflowStatus |
      | Release-Plan-Infra-03 | Infra Release Plan | QA    | Jan_Phase1_Sprint1_Release10 | Release Description |    536988 |     45698 |                2 | Maneesh           | 3 Hrs              | QA   | Dec 29 and 30  |     5 | PAUSED               |
