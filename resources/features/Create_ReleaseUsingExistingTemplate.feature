Feature: Create Release using Existing Template

  @ReleaseManagement
  Scenario Outline: Release_Management
    Given Launch Browser and access the Matilda URL
    Then Verify whether Login page is correctly opened or not
    And Enter Username and Password as "<Username>" and "<Password>"
    Then Click on Create New Release Button
    And Click on Release Name Text Box
    And Enter Release Name as "<ReleaseName>"
    And Click on Project Field and Select Project
    And Click on Application and Select Application
    And Click on Release Version and Select Release Version
    And Click on Date picker and Select Today
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
      | Username               | Password | ReleaseName              | Description         | EnvironmentName        | WorkflowName | ApplicationStatus |
      | admin@matildacloud.com | matilda  | Jan_23_Release_version17 | Release Description | New_Enironment_Version | NewWFNAB     | InProgress        |
