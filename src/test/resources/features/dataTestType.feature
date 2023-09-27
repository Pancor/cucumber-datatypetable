Feature: DataTestType annotation tests

    Scenario: Test @DataTestType annotation
        When user receives PERMISSION_ONE
        Then user has PERMISSION_ONE permission

    Scenario: Test @ParameterType annotation
        When user gets hold on PERMISSION_TWO
        Then user got PERMISSION_TWO permission