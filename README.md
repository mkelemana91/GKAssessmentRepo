# Selenium-Appium Hybrid Framework

The aim of this project is to create a test automation framework that will be used for testing Web and Mobile applications. This is a Selenium-Appium hybrid framework designed using Page Factory design pattern.

## Getting Started

This project is a Maven project. To access this project, import this project directly from github into your IntelliJ IDE or clone the Repository in your local machine and open the Maven project from your local directory into IntelliJ.

## Prerequisites

```bash
IntelliJ IDEA Community 2018.x
Android SDK (Studio)-v3.2.x
Appium desktop-v1.7.x
JRE-9.0.x
JDK-9.0.x
Chrome Web browser

```

## Framework
### Tools 
```bash
Web Testing Framework: Selenium Webdriver
Mobile Testing Framework: Appium
Build Tool: Maven
Testing Tool: TestNG
Programming Language: Java
```

### Design
```bash
APK, Excel file and drivers stored within framework for ease of access and use. Making the solution portable.

 

Framework consists of following modules / packages:
•	data_readers (contains class to excel read data source), 
•	driver_handlers (web & mobile driver initialization classes), 
•	pages (page factory for mobile and web applications), 
•	resources(mobile and web config.properties files, 
•	MobileEngine (for mobile tests) and WebEngine (for Web tests)


TestNG annotations are used in both Web and Mobile tests following the same structure:

@BeforeClass – This is the precondition / setup of the test
@Test – the actual test steps
@AfterClass – Post condition / resetting the driver into its initial state before the test

```
## Running the tests with TestNG

```bash
Open Edit run/debug configuration dialog
 
Select Ebay_SellItemTest Classfor executing Web Application tests. Other UMP_ViewSongListTest Class for executing Mobile App tests.
 
To execute each Class, navigate to the respective class > right-click on it > run using the respective configuration set on previous step
 
Expected output
 

```

### To execute Mobile Tests

```1.	Open Appium Desktop and Start Appium Server
 
 
2.	Connect Android device to your machine
3.	Type adb devices on your cmd to make sure that your device is connected
 
4.	Install the apk into your android device using adb install command and path to the apk
 
5.	Change the Platform version in mobileconfig.properties file to match your device OS version
 
Navigate to the UMP_ViewSongListTest class > Right-click and run using the TestNG
 
Expected output
 



 

```
