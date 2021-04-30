# AODocs Selenium technical test

This project is about assessing QA automation abilities.

## Getting Started

### Prerequisites
* Java JDK: 10 or higher
* Maven: 3.3.9 or higher

## Test Objectives
The marketing team ask you to write an automation test to validate how prospect access to our website, and the form to request a demo of the product.
 
The test steps are:
 1. Search AODocs in Google
 2. In the result, open the website www.aodocs.com
 3. Into the website click on the "Request a demo" button
 4. Fill the form with:
     * your first name
     * set empty in the "Last Name" field
     * fill a random string in the "Your Email" field
     * choose a value in Company Size
 5. Check the error messages

## Notes
In this project you can find a utility class "WebDriverUtility" to help you to start a browser locally.
To write the test, you need to use Junit 5 already configured in pom.xml

How to run tests:

Download project from git.

- Run test from command line with maven

1. Go to project directory
2. Run command line(windows) or terminal(mac os)
3. Type command:
     # Run all tests:
    - mvn clean test

    # Run a single test class.
    - mvn clean -Dtest=YourClassName test
4. Open console go to target folded and run next command for generating allure report
    - allure serve allure-results