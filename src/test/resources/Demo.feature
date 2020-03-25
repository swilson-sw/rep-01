Feature: Demo

Scenario: Demonstrating how Cucumber-JVM works
  Given I open https://coinmarketcap.com/
  When I click ‘View all’
  Then I verify 100 results are displayed
