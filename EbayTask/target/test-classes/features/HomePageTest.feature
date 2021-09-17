Feature: A user can successfully navigate to the home page

  As a user, I should be able to successfully navigate to the home page

  Scenario: Navigate to the home page

    Given  A user initialises the chrome driver
    When   The user navigates to the home page
    Then   The title of the page should equal:
    Then   The search text box should be present on the home page