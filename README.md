# rep-01

# Front end test cases #

TC001 - Verify 100 results are displayed
 **Given** I open https://coinmarketcap.com/
 **When** I click ‘View all’
 **Then** I verify 100 results are displayed 

- Failed Test case, there are 200 results. 
Steps to follow up:
  - Raise bug with following information:
    * Title and quick description of issue 
    * Steps to reproduce
    * Environment info 
    * Expected vs actual behaviour
    * Test evidence 

TC002 - Select and watch between 5-10 cryptocurrencies and check values
 **Given** I navigate to https://coinmarketcap.com/
 **And** I select between 5-10 random cryptocurrencies 
 **And** I click the ellipsis 
 **And** I select ‘Add to watchlist'
 **And** I open the watchlist in a different browser tab
 **When** I view the watchlist
 **Then** I verify all the names that have been added to the watchlist 
 **And** their values
    
  - Pass test case 

TC003 - Record and check data
1. Open https://coinmarketcap.com/
2. Display the dropdown menu on the Cryptocurrencies tab.
3. Click any of the three Full List options on this menu.
4. Record the data on the current page.
5. Apply any combination of filters, displayed in the three dropdown menus above the tabs.
6. Check against the data recorded in Step 4.

> Point number 5 - Discuss.
> Apply any combination of filters, displayed in the three dropdown menus above the tabs.

Incorrect information given, at this point I would speak to (or comment on the ticket) about the criteria of these steps and have them corrected before writing a test case and not make assumptions which could lead to mistakes/incorrect tests.


# Back end test cases #

Unable to complete due to complexity of task
