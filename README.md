# Selenium Webdriver automation task

This project aims to demostrate the use of Selenium webdriver to handle a typical test work flow through an e-commerce website.  The project leverages Maven, JUnit and Cucumber in order to develop a hybrid automation framework whilst adopting a POM approach.

This automation frame work aims to satisfy the following business case:

Business case - "A user should be able to successfully search for and add a product to the shopping cart"

###  Limitations and issues

This is a first attempt at creating an automation framework in Java and using the tools listed below.  The login test requires a manual first step to solve a CAPTCHA.  Ebay detects webdriver instances and fires the CAPTCHA.  Unfortunately selenium is not designed to solve them. 

### Tools used

<p>intellij idea (community edition) - https://www.jetbrains.com/</P>
<p>Maven - handling project builds and dependencies - https://www.jetbrains.com/help/idea/maven-support.html#maven_multi_module</p>
<p>WebDriver (Java bindings) - https://www.selenium.dev/</p>
<p>Junit - unit testing framework - https://junit.org/junit5/</p>
<p>Cucumber business driven development framework - https://cucumber.io/</p>

#  Defining manual test cases to satisfy business logic

### Test case 1 - A user can successfully navigate to the home page
### Required Steps:
1.  Open the chrome browser
2.  Navigate to the home page at https://www.ebay.com
3.  Verify the page title
4.  Verify that the search text box element is present on the page

### Test case 2 - A user can successfully Login to the website using valid login credentials
### Required Steps:
1.  Open the chrome browser
2.  Navigate to the sign in page at https://www.ebay.com/signin/
3.  Enter a valid user name and password and login to the website
4.  Verify the users login credentials are valid and the user has been logged into the website

### Test case 3 - A user can search for a car based on make, model, condition and zip code
### Required Steps:
1.  Open the chrome browser
2.  Navigate to the home page at https://www.ebay.com
3.  Click on the "Shop by category" dropdown located to the left of the site search
4.  Select "cars & trucks" from the available categories
5.  Select "Mercedes-Benz" in the make dropdown menu
6.  Select "C63 AMG S" in the model dropdown menu
7.  Enter "BT1 3NQ" in the zip code text box
8.  Select "Used" in the condition dropdown menu
9.  Click on the "Find Vehicle" button
10. Verify a user gets returned a list of cars based on search parameters 

### Test case 4 - A user should be able to add a product to the shopping cart
### Required Steps:
1.  Open the chrome browser
2.  Navigate to the home page at https://www.ebay.com
3.  Enter "outdoor pizza oven" into the site search text box
4.  Click on the "Search" button
5.  Click the first returned result and add it to the shopping cart
6.  Navigate to the shopping cart at https://cart.payments.ebay.com/
7.  Verify that the item has been added to the shopping cart

### Test case 5 - A user should be able to Logout of the website
### Required Steps:
1.  Open the chrome browser
2.  Navigate to the sign in page at https://www.ebay.com/signin/
3.  Enter valid login credentials and login to the website
4.  Logout of the website
5.  Verify a user can logout of the website

# Project structure

![Alt text](/FolderStructure.png?raw=true "Project Structure")

# Cucumber BDD result file

![Alt text](/CucumberResults.png?raw=true "Cucumber Results")



