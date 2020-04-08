@web

  Feature: Hotels page features
    Background:
      Given I am on default location search locations screen

    @hotels2
    Scenario: List of all of hotel within 10 miles radius of downtown
      When I enter Cincinnati and select CityName field on the homepage page
      And I enter 05/07/20 and select CheckIn field on the homepage page
      And I enter 05/09/20 and select CheckOut field on the homepage page
      And I enter 1 and select Rooms field on the homepage page
      And I select system displays all hotels within 10 or less mile radius of downtown
      Then I select all Hilton hotels from previous list