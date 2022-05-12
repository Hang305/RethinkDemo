Feature: Your personal information section test cases
  I want to open the Purchase page successfully

  Background:
    Given Open Purchase page
    And Navigate to Your personal information section

  @Purchase @YourPersonalInformationSection @EnterAllTheFields @SmokeTest
  Scenario Outline: Verify that enter all the input valid data for Your personal information section
#    Given Open Purchase page from Showroom page
    When Enter valid data for all fields with "<birthdate>", "<name>", "<first name>", "<street>", "<number>", "<postal code>", "<city>", "<email>", "<box>", "<profession>", "<citizen number>", "<driving license since>", "<nationality>", "<driving licence number>" and "<number of claim in error in the past year>"
    Examples:
      | birthdate  | name | first name | street  | number     | postal code | city    | email                     | box | profession | citizen number | driving license since | nationality | driving licence number | number of claim in error in the past year |
      | 05/25/1992 | Hang | test       | Son Tra | 0992832342 | 293847923   | Da nang | hang.lethanh@smartdev.com | 234 | QA         | 984923523      | 03/27/2019            | VN    | 2837647823             | 1                                         |

  @Purchase @YourPersonalInformationSection @Title
  Scenario Outline: Verify that the title is displayed correctly
    Then The title is displayed correctly with "<title>"
    Examples:
      | title                     |
      | Your personal information |

  @Purchase @YourPersonalInformationSection @AllTheMandatoryFieldTextbox @BlankData @RET-
  Scenario Outline: Verify that the warning message appears when enters invalid data for all mandatory fields
    When Blank data for all the input the mandatory
    Then The warning is displayed correctly "<message>"
    Examples:
      | message  |
      | Required |

  @Purchase @YourPersonalInformationSection @TitleMr @Mr @RET-232
  Scenario Outline: Verify that the dropdown of Title is selected
    Then The dropdown of Title is selected with Mr. option has "<content>"
    Examples:
      | content |
      | Mr.     |

  @Purchase @YourPersonalInformationSection @TitleMs @Ms @RET-232
  Scenario Outline: Verify that the dropdown of Title is selected
    Then The dropdown of Title is selected with Ms. option has "<content>"
    Examples:
      | content |
      | Ms.     |

  @Purchase @YourPersonalInformationSection @Birthdate @InvalidData @RET-235-236
  Scenario Outline: Verify that The warning is displayed when enter less than or equal to 26 years old
    When Enter "<date>" with less than or equal to twenty six years old
    Then The warning is displayed correctly with "<content>" for the Birthdate field
    Examples:
      | date       | content                                                       |
      | 05/30/2007 | Your age must be greater than or equal to 26 and less than 75 |
      | 05/30/1997 | Your age must be greater than or equal to 26 and less than 75 |
      | 05/30/1996 | Your age must be greater than or equal to 26 and less than 75 |
      | 05/30/1946 | Your age must be greater than or equal to 26 and less than 75 |

  @Purchase @YourPersonalInformationSection @Name @InvalidLength @MinLength @RET-233
  Scenario Outline: Verify that warning message appears when enter 1 characters for Name textbox
    And Enter one character for Name text box with "<name>"
    Then The warning is displayed correctly with "<message>" for Name field
    Examples:
      | name | message   |
      | a    | Too Short |

  @Purchase @YourPersonalInformationSection @Name @InvalidLength @MaxLength @RET-233
  Scenario Outline:Verify that warning message appears when enter more than 50 characters for Name textbox
    And Enter one character for Name text box with "<name>"
    Then The warning is displayed correctly with "<message>" for Name field
    Examples:
      | name                                                 | message  |
      | xkdfhglsdhfgkskdfhksdhf893475934750slkdhjflsfksdfjsl | Too Long |

  @Purchase @YourPersonalInformationSection @FirstName @InvalidLength @MinLength @RET-233
  Scenario Outline: Verify that warning message appears when enter 1 characters for First Name textbox
    And Enter one character for First Name text box with "<name>"
    Then The warning is displayed correctly with "<message>" for First Name field
    Examples:
      | name | message   |
      | a    | Too Short |

  @Purchase @YourPersonalInformationSection @FirstName @InvalidLength @MaxLength @RET-2331
  Scenario Outline:Verify that warning message appears when enter more than 50 characters for First Name textbox
    And Enter one character for First Name text box with "<name>"
    Then The warning is displayed correctly with "<message>" for First Name field
    Examples:
      | name                                                 | message  |
      | xkdfhglsdhfgkskdfhksdhf893475934750slkdhjflsfksdfjsl | Too Long |




