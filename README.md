<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <h1>Framework Documentation</h1>

<!-- Table of Contents -->
<h2>Table of Contents:</h2>
<ol>
    <li><a href="#introduction">Introduction</a></li>
    <li><a href="#framework-components">Framework Components</a></li>
    <li><a href="#pom-classes-and-modules">POM Classes and Modules</a></li>
    <li><a href="#test-scripts">Test Scripts</a></li>
    <li><a href="#test-data">Test Data</a></li>
    <li><a href="#screen-shots">Screen Shots</a></li>
    <li><a href="#extent-report">Extent Report</a></li>
    <li><a href="#xml-files">XML Files</a></li>
    <li><a href="#pomxml">pom.xml</a></li>
    <li><a href="#conclusion">Conclusion</a></li>
</ol>

<!-- 1. Introduction -->
<h2 id="introduction">1. Introduction</h2>
<p>
    This document provides a comprehensive overview of the test automation framework designed for the Vtiger CRM Application. The framework follows industry best practices and leverages Selenium WebDriver, TestNG, and other technologies to ensure efficient and maintainable automated testing.
</p>

<!-- 2. Framework Components -->
<h2 id="framework-components">2. Framework Components</h2>
<p>
    The framework consists of the following key components:
</p>
<ul>
    <li><strong>Generic Utility:</strong> Utility classes containing reusable functions for handling common tasks, such as interacting with databases, working with Excel files, logging, etc.</li>
    <li><strong>POM Repository (Page Object Model):</strong> A collection of POM classes, each corresponding to a specific module in the Vtiger CRM application. These classes encapsulate the locators and methods related to the corresponding web pages.</li>
    <li><strong>Test Scripts:</strong> Automation scripts written in TestNG that leverage the methods defined in the POM classes to execute test scenarios.</li>
    <li><strong>Test Data:</strong> Externalized test data stored in Excel sheets. The framework utilizes this data for parameterization, allowing for easy modifications and data-driven testing.</li>
    <li><strong>Screen Shots:</strong> Utility to capture screenshots during test execution, aiding in debugging and documentation.</li>
    <li><strong>Extent Report:</strong> Integration with Extent Reports for generating detailed and visually appealing test reports.</li>
    <li><strong>XML Files:</strong> Configuration files specifying the test execution flow for different scenarios (e.g., Smoke Testing, Regression Testing).</li>
    <li><strong>pom.xml:</strong> Maven Project Object Model file containing project configuration details, dependencies, and build settings.</li>
</ul>

<!-- 3. POM Classes and Modules -->
<h2 id="pom-classes-and-modules">3. POM Classes and Modules</h2>
<p>
    The framework is organized into modules, each represented by a Page Object Model (POM) class. The following is a list of modules and their corresponding POM classes:
</p>
<ol>
    <li>
        <strong>Login Module</strong>
        <ul>
            <li><strong>POM Class:</strong> LoginPage</li>
            <li><strong>Description:</strong> Contains elements and methods related to the login functionality.</li>
        </ul>
    </li>
    <!-- Similar list items for other modules -->
</ol>

<!-- 4. Test Scripts -->
<h2 id="test-scripts">4. Test Scripts</h2>
<p>
    Test scripts are written using TestNG and are designed to interact with the POM classes, invoking methods to perform actions on the application and validate expected outcomes.
</p>
<code>
    <!-- Sample Test Script for Creating a Lead -->
    @Test(priority = 1, retryAnalyzer = genericUtility.RetryAnalyzerImplementationClass.class, groups = "smoke")
    public void toCreateALeadAndToVerifyTheLeadDetails() throws EncryptedDocumentException, FileNotFoundException, IOException, SQLException {
        // ... (Refer to individual test scripts for details)
    }
</code>

<!-- 5. Test Data -->
<h2 id="test-data">5. Test Data</h2>
<p>
    Test data is stored in external Excel sheets, facilitating easy maintenance and data-driven testing. Each module has its dedicated sheet within the Excel file.
</p>
<p>Example Excel File: <code>vtigerTestData.xlsx</code></p>

<!-- 6. Screen Shots -->
<h2 id="screen-shots">6. Screen Shots</h2>
<p>
    A utility captures screenshots during test execution. Screenshots are stored in a specified directory for debugging and documentation purposes.
</p>

<!-- 7. Extent Report -->
<h2 id="extent-report">7. Extent Report</h2>
<p>
    The framework integrates with Extent Reports to generate detailed and visually appealing test reports. These reports provide a comprehensive overview of test execution results.
</p>

<!-- 8. XML Files -->
<h2 id="xml-files">8. XML Files</h2>
<p>
    Configuration XML files (e.g., SmokeTesting.xml, RegressionTesting.xml) specify the test execution flow for different scenarios. They define which test scripts to run and with what parameters.
</p>

<!-- 9. pom.xml -->
<h2 id="pomxml">9. pom.xml</h2>
<p>
    The <code>pom.xml</code> file contains Maven project configuration details, dependencies, and build settings. It ensures consistency in the build process and facilitates easy dependency management.
</p>
<code>
    <!-- Example Dependencies -->
    <!-- Selenium WebDriver -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.16.1</version>
    </dependency>
    <!-- TestNG -->
    <!-- ... (Similar entries for other dependencies) -->
</code>

<!-- 10. Conclusion -->
<h2 id="conclusion">10. Conclusion</h2>
<p>
    The Vtiger CRM test automation framework provides a robust and scalable solution for testing various modules within the application. It adheres to industry best practices, ensuring maintainability, scalability, and ease of use. The framework's modular structure allows for easy integration of new modules and straightforward maintenance of existing ones.
</p>
<p>
    This documentation serves as a comprehensive guide for understanding the framework's architecture, components, and usage. It is recommended to follow the outlined conventions and practices when contributing to or maintaining the framework. Regular updates to this documentation are encouraged to reflect any changes or enhancements made to the framework.
</p>

</body>
</html>
