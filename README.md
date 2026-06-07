# E-Commerce Site Automation Framework

## Overview

This project is a Selenium Test Automation Framework developed using Java, Selenium WebDriver, TestNG, Maven, and the Page Object Model (POM) design pattern. The framework automates end-to-end user workflows on an e-commerce application and demonstrates industry-standard automation practices.

## Tech Stack

* Java 21
* Selenium WebDriver 4
* TestNG
* Maven
* Apache POI
* Log4j2
* Extent Reports

## Framework Features

* Page Object Model (POM)
* ThreadLocal WebDriver Management
* Data-Driven Testing using Excel
* Screenshot Capture on Failure
* TestNG Listeners
* Extent Reporting
* Log4j2 Logging
* Configurable Test Data using Properties File
* Maven-Based Build Management

## Automated Test Scenarios

### Login Test

* Valid User Login Verification

### Purchase Test

* Login to Application
* Add Product to Cart
* Validate Cart Item
* Complete Checkout Process
* Verify Order Confirmation

## Execute Tests

Run all tests using Maven:

```bash
mvn clean test
```

Or execute:

```text
testng.xml
```

as a TestNG Suite

## Reports

* TestNG Reports
* Extent Reports
* Log4j2 Execution Logs

## Author

Kiran Mankar
