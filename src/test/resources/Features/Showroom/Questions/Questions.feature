Feature: I want to check questions 1 to 4 in showroom section

  Background:
    Given Open the homepage


  @Showroom @Question1 @QuestionContent @RET_70
  Scenario Outline: Verify the question 1 is shown correctly
    When Click calculate button in Homepage
    Then The "<question1>" is shown correctly
    Examples:
      | question1                                  |
      | What is the birth date of the main driver? |

  @Showroom @Question1 @WarningContent @RET_71
  Scenario Outline: Verify that the warning appears when the answer is younger than 26 years old
    When Enter "<age>" into birthday field
    Then The "<warning>" of question 1 is shown
    Examples:
      | age        | warning                                                                                                    |
      | 23-04-1997 | For drivers in this age range, we calculate a tailor-made premium. Please contact us at info@verzekerje.be |

  @Showroom @Question1 @WarningContent @RET_72
  Scenario Outline: Verify that the warning appears when the answer is 75 years old or more than
    When Enter "<age>" into birthday field
    Then The "<warning>" of question 1 is shown
    Examples:
      | age        | warning                                                                                                    |
      | 23-05-1947 | For drivers in this age range, we calculate a tailor-made premium. Please contact us at info@verzekerje.be |

  @Showroom @Question2 @QuestionContent @RET_73
  Scenario Outline: Verify the question 2 is shown correctly
    When Open question 2
    Then The "<content>" of question 2 is shown correctly
    Examples:
      | content                                                                                             |
      | Does the main driver have had their permanent driving license for a period longer than three years? |

  @Showroom @Question2 @WarningContent @RET_75
  Scenario Outline: Verify that the warning of question 2 appears when the answer is No
    When Open question 2
    And Choose No button
    Then The "<warning>" of question 2 is shown
    Examples:
      | warning                                                                                           |
      | We’re sorry, a valid and permanent driver’s licence issued more than three years ago is required. |

  @Showroom @Question3 @QuestionContent @RET_76
  Scenario Outline: Verify the question 3 is shown correctly
    When Open question 3
    Then The "<content>" of question 3 is shown correctly
    Examples:
      | content                                                                                                                      |
      | Over the last three years, did you incur no more than one accident as a driver where you caused the accident? (moto of auto) |

  @Showroom @Question3 @WarningContent @RET_78
  Scenario Outline: Verify that the warning of question 3 appears when the answer is No
    When Open question 3
    And Choose No button in question 3
    Then The "<warning>" of question 3 is shown
    Examples:
      | warning                                                                                                                |
      | We’re sorry, we can only offer you an insurance if you have had no more than one accident during the last three years. |

  @Showroom @Question4 @QuestionContent @RET_79
  Scenario Outline: Verify the question 4 is shown correctly
    When Open question 4
    Then The "<content>" of question 4 is shown correctly
    Examples:
      | content                                                                                                                  |
      | Is your motorcycle younger than two years old? Or do you have an active omnium motorcycle insurance (up to 8 years old)? |

  @Showroom @Question4 @WarningContent @RET_81
  Scenario Outline: Verify that the warning of question 4 appears when the answer is No
    When Open question 4
    And Choose No button in question 4
    Then The "<warning>" of question 4 is shown
    Examples:
      | warning                                                      |
      | We’re sorry, we cannot calculate a price for this motorcycle |

  @Showroom @Question5 @QuestionContent @RET_82
  Scenario Outline: Verify the question 5 is shown correctly
    When Open question 5
    Then The "<content>" of question 5 is shown correctly
    Examples:
      | content                           |
      | Choose what is applicable for you: |

  @Showroom @Question6 @QuestionContent @RET_85
  Scenario Outline: Verify the question 6 is shown correctly
    When Open question 6
    Then The "<content>" of question 6 is shown correctly
    Examples:
      | content                                                                                                              |
      | What is the catalog value of your motorcycle (excl. VAT and incl. options and accessories such as GPS or suitcases)? |

  @Showroom @Question6 @WarningContent @RET_118 @RET_229 @RET_120
  Scenario Outline: Verify that the warning of question 6 appears when the answer is invalid :
  Case 1: Number that less than 0
  Case 2: Number more than 40000
  Case 3: Number with more than 2 decimals
    When Open question 6
    And Enter invalid "<number>"
    Then The "<warning>" of question 6 is shown
    Examples:
      | number  | warning                                                                                             |
      | -10     | You can not enter a number less than 0 in the answer textbox of the question                        |
      | 40001   | You can not enter a number than 40000 in the answer textbox of the question                         |
      | 100.111 | You can not entering a number with more than 2 decimal places in the answer textbox of the question |

  @Showroom @Question6 @RET_86
  Scenario Outline: Verify that the user can enter only numbers in the answer textbox of the question 6
    When Open question 6
    And Enter "<letters>" into textbox
    Then The Next button is inactive
    Examples:
      | letters      |
      | Phuong@!Test |

  @Showroom @Question6 @RET_87
  Scenario: Verify that the user cannot take the next step when leaving blank the answer textbox of the question 6
    When Open question 6
    And Leave textbox blank
    Then The Next button is inactive

  @Showroom @Question7 @QuestionContent @RET_92
  Scenario Outline: Verify the question 7 is shown correctly
    When Open question 7
    Then The "<content>" of question 7 is shown correctly
    Examples:
      | content                                                  |
      | Please choose the type of motorcycle you want to insure: |

  @Showroom @Question7 @WarningContent @RET_94
  Scenario Outline: Verify that the warning of question 7 appears when the answer is b
    When Open question 7
    And Choose answer "<b>"
    Then The "<warning>" of question 7 is shown
    Examples:
      | b                                | warning                                                                       |
      | Quad, cross motorcycle or enduro | We’re sorry, but we can’t offer you an insurance for this type of motorcycle. |

  @Showroom @Question8 @QuestionContent @RET_88
  Scenario Outline: Verify the question 8 is shown correctly
    When Open question 8 to 12 (one Page)
    Then The "<content>" of question 8 is shown correctly
    Examples:
      | content                                                               |
      | Do you want to insure your equipment such as helmet or driving suit ? |

  @Showroom @Question9 @QuestionContent @RET_99
  Scenario Outline: Verify the question 9 is shown correctly
    When Open question 8 to 12 (one Page)
    Then The "<content>" of question 9 is shown correctly
    Examples:
      | content                                          |
      | Choose what coverage you prefer BA + Full omnium |

  @Showroom @Question10 @QuestionContent @RET_102
  Scenario Outline: Verify the question 10 is shown correctly
    When Open question 8 to 12 (one Page)
    Then The "<content>" of question 10 is shown correctly
    Examples:
      | content                                                          |
      | Would you like to insure possible physical damage to the driver? |

  @Showroom @Question11 @QuestionContent @RET_104
  Scenario Outline: Verify the question 11 is shown correctly
    When Open question 8 to 12 (one Page)
    Then The "<content>" of question 11 is shown correctly
    Examples:
      | content                                             |
      | Would you like to insure possible legal assistance? |

  @Showroom @Question12 @QuestionContent @RET_106
  Scenario Outline: Verify the question 12 is shown correctly
    When Open question 8 to 12 (one Page)
    Then The "<content>" of question 12 is shown correctly
    Examples:
      | content                                                    |
      | Would you like to enjoy roadside assistance for your bike? |

  @Showroom @ValidData @CalculatingInsurancePremium @smokeTest
  Scenario Outline: Verify calculating insurance premium correctly
    When Open question 8 to 12 (one Page)
    And Choose answer for question 8 with "<q8 answer 2>"
    And Choose answer for question 9 with "<q9 answer 1>"
    And Choose answer for question 10 with "<q10 answer 1>"
    And Choose answer for question 11 "<q11 answer 1>"
    And Choose answer for question 12 "<q12 answer 1>"
    Then The "<result>" is dislayed corectly
    Examples:
      | q8 answer 2 | q9 answer 1 | q10 answer 1 | q11 answer 1 | q12 answer 1 | result   |
      | No          | 12 Months   | Yes          | No           | Yes          | € 572.86 |

  @Showroom @MakeAnInsuranceButton @SmokeTest @OpenPurchasePageFromShowroomPage
  Scenario Outline: Verify navigating to the Purchase page
    When Open question 8 to 12 (one Page)
    And Choose answer for question 8 to 12 with "<q8 answer 2>", "<q9 answer 1>", "<q10 answer 1>", "<q11 answer 1>", "<q12 answer 1>" and click on the Make an insurance button
    Then The Purchase page is displayed with "<content>"
    Examples:
      | q8 answer 2  | q9 answer 1 | q10 answer 1 | q11 answer 1 | q12 answer 1 | content                   |
      | Up to €1.000 | 12 Months   | Yes          | Yes          | Yes          | Your Personal Information |


