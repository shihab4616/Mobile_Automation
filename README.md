Prepare Appium Instance for Window


To Start Automation with Appium, we have to follow couple of steps. First we have to make your system ready then we can start our journey with appium.
1.	Download & Install JDK
2.	Download & Install IntelliJ IDEA Community Version
3.	Download & Install android studio Android SDK thourgh Android Studio
4.	Download & Install LTS Node Js
5.	Download & Install Vysor
6.	Set environment variable(path): Set JAVA_HOME & ANDROID_HOME
7.	Check if node.js, npm & Android SDK are installed: node --version, npm --version, adb --version
8.	Install appium : Appium Version 2 commands installation process
9.	Check if appium is installed: appium -v
10.	Plugin Device (turn on developer mode & USB debugging)
o	Find build number under settings and tap 7 times on build number.
o	Enter your pattern, PIN or password to enable the Developer options menu.
o	The "Developer options" menu will now appear in your Settings menu.
o	Turn On the "USB Debugging" option from "Developer Options"
11.	Indentify appPackage & appActivityName Open the app in your device. and use the command: adb shell "dumpsys activity activities | grep mResumedActivity"
12.	Create TestNG XML plugin install from Marketplace - File >> Settings >> plugin >> Marketplace >> search 'Create TestNG XML' & install
Appium Version 2 commands
1.	Install Appium: npm i --location=global appium
2.	Uninstall Appium: npm uninstall -g appium
3.	check drivers list: appium driver list
4.	Install uiautomator2 & execute-driver driver: appium driver install uiautomator2, appium plugin install execute-driver
5.	check plugin list: appium plugin list
6.	Install Plugin: appium plugin install plugin_name
7.	Run with path: appium --base-path /wd/hub
8.	Run Appium: appium
9.	Run Appium with plugin & path: appium --use-plugins=execute-driver --base-path /wd/hub
Related Resources
•	Appium NPM
•	Appium GitHub
Create Java(Gradle) Project in IntelliJ IDEA for Appium
1.	Create Java(Gradle) Project in IntelliJ IDEA
2.	Add Gradle Dependencies
o	Selenium
o	Appium CLient
o	TestNG
3.	Desired Capabilities
Open existing Java(Gradle) Project using IntelliJ IDEA
1.	Open existing Java(Gradle) Project using IntelliJ IDEA
2.	Identify Elements
3.	Start Writing Automation Code
4.	Run Test Cases
Appium Inspector to Identify Elements
1.	Appium Inspector download & install
2.	Configure Appium Inspector
•	Appium Inspector
o	Go to or Open Appium Inspector
	Remote host: localhost
	Port: 4723
	Path: /wd/hub
	Allow Unauthorized Certificates
3.	Set DesiredCapabilities
•	capabilities.setCapability("udid", "192.168.56.101:5555");
•	capabilities.setCapability("platformVersion", "12");
•	capabilities.setCapability("appPackage", "com.bng.calculator");
•	capabilities.setCapability("appActivity", "com.bng.calc.MainActivity");
•	capabilities.setCapability("platformName", "Android");
•	capabilities.setCapability("automationName", "UiAutomator2");
4.	Disable Permission Monitoring
•	Go to developer option.
•	Go to last option called --> Disable Permission Monitoring --> enable it.
Run Test Case
•	Run Test Case - Go to desired Java Class where has Test Case, Right click of mouse on Test Case >> click on Run
•	Run XML File - After create TestNG file, Right click of mouse on TestNG xml >> click on Run
Download Genymotion Emulator & Download Apk from Google Play
•	Download Genymotion Emulator
•	Downloads – Oracle VM VirtualBoxhttps://www.virtualbox.org/wiki/Downloads)
•	Download Apk from Google Play
Related Resources
•	Appium Command
•	Troubleshoot Activities Startup
•	Appium API Documentation
•	Selenium WebDriver
Create automated scripts to test EMI Calculator mobile app
Download & install EMI Calculator mobile app your device
Key functionalities, that have to be covered:
1.	Open EMI calculator
2.	Navigate to the EMI Calculator screen
3.	Enter <loan> in the amount field
4.	Enter <interest> percent rate in the interest field
5.	Enter <period> in the period field in years
6.	Enter <pFee> percent for the processing fee
7.	And tap on the calculate button
8.	Then Verify that the detail results are correct <mEMI>, <tInterest>, <tpFee> and <tPayment>
Examples:
loan	interest	period	pFee	mEMI	tInterest	tpFee	tPayment
100000	9.0	2	2.0	4568	9643	2000	109643
325000	9.5	5	1.5	6826	84536	4875	409536
450000	11.0	7	1.8	7705	197228	8100	647228
Additional functionalities, that may be covered:
1.	Please use Example table data to create excel/csv file as external test data provider and your automation script have the abitlity to read and write data from excel/csv

