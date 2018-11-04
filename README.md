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

![framework-design-1](https://user-images.githubusercontent.com/42268009/47971416-d0a6a380-e099-11e8-8931-5bd5b2e45c48.png)

Framework consists of following modules / packages:
•	data_readers (contains class to excel read data source), 
•	driver_handlers (web & mobile driver initialization classes), 
•	pages (page factory for mobile and web applications), 
•	resources(mobile and web config.properties files, 
•	MobileEngine (for mobile tests) and WebEngine (for Web tests)

![framework-design-2](https://user-images.githubusercontent.com/42268009/47971417-d13f3a00-e099-11e8-9217-cdb219551a71.png)

TestNG annotations are used in both Web and Mobile tests following the same structure:

@BeforeClass – This is the precondition / setup of the test
@Test – the actual test steps
@AfterClass – Post condition / resetting the driver into its initial state before the test

```
## Running the tests with TestNG

```bash
Open Edit run/debug configuration dialog
 
![edit config-1](https://user-images.githubusercontent.com/42268009/47971408-cbe1ef80-e099-11e8-924b-1006c66153a1.png)

Select Ebay_SellItemTest Classfor executing Web Application tests. Other UMP_ViewSongListTest Class for executing Mobile App tests.

![edit config-2](https://user-images.githubusercontent.com/42268009/47971409-cc7a8600-e099-11e8-98b6-6e20418f76be.png)

To execute each Class, navigate to the respective class > right-click on it > run using the respective configuration set on previous step
![edit config-3](https://user-images.githubusercontent.com/42268009/47971410-cc7a8600-e099-11e8-90e6-854212f8c2aa.png)
 
Expected output

![expected-output-1](https://user-images.githubusercontent.com/42268009/47971412-cdabb300-e099-11e8-8c6d-bdb85ffc4eb6.png)

```

### To execute Mobile Tests

```1.	Open Appium Desktop and Start Appium Server

![appium-desktop](https://user-images.githubusercontent.com/42268009/47971404-cb495900-e099-11e8-84a9-36ea3a0708b7.png)
![appium-running](https://user-images.githubusercontent.com/42268009/47971406-cb495900-e099-11e8-8442-e7211f21e266.png)
 
2.	Connect Android device to your machine
3.	Type adb devices on your cmd to make sure that your device is connected
![adb-devices](https://user-images.githubusercontent.com/42268009/47971419-d2706700-e099-11e8-9b12-f2ab3cb7aa9b.png)
4.	Install the apk into your android device using adb install command and path to the apk
![adb-install](https://user-images.githubusercontent.com/42268009/47971420-d3a19400-e099-11e8-9f52-a97c7b756add.png)
5.	Change the Platform version in mobileconfig.properties file to match your device OS version
![config-prop-file](https://user-images.githubusercontent.com/42268009/47971407-cbe1ef80-e099-11e8-8f6c-aeb8b2c2c341.png)
Navigate to the UMP_ViewSongListTest class > Right-click and run using the TestNG

![mobile-class](https://user-images.githubusercontent.com/42268009/47971418-d1d7d080-e099-11e8-8fa4-8b1eb169542e.png)
Expected output
![expected-output-2](https://user-images.githubusercontent.com/42268009/47971414-cf757680-e099-11e8-9f26-e953dff2bc3f.png)



 

```
