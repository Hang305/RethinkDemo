Feature: Purchase Overview test cases
  I want to open the Purchase page successfully

  Background:
    Given Open Purchase page

  @Purchase @PurchaseOverview @Url
  Scenario Outline:RET-20A: Verify that user open the Purchase page successfully
    Then The url address is displayed correctly with "<url>"
    Examples:
      | url                                      |
      | https://rethinkit.smartdev.vn/purchase |

  @Purchase @PurchaseOverview @Header @YourPersonalInformation
  Scenario Outline:RET-20A: Verify that user open the Purchase page successfully
    Then The navbar of your personal information link is displayed correctly with "<content>"
    Examples:
      | content |
      | Your Personal Information |

  @Purchase @PurchaseOverview @Header @DataOfYourMotorcycle
  Scenario Outline:RET-20A: Verify that user open the Purchase page successfully
    Then The navbar of data of your motorcycle link is displayed correctly with "<content>"
    Examples:
      | content |
      | Motorcycle |

  @Purchase @PurchaseOverview @Header @PolicyPreferences
  Scenario Outline:RET-20A: Verify that user open the Purchase page successfully
    Then The navbar of Policy preferences link is displayed correctly with "<content>"
    Examples:
      | content |
      | Policy Preferences |