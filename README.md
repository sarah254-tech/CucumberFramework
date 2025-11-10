# 1️⃣ What is OOP in simple words?

**Simple logic:**
OOP (Object-Oriented Programming) means we build programs like we build real life.
Everything is treated like an object, each object has:

  - Properties (what it has)

  - Behaviors (what it can do)

**💡 Example:**
In real life, a car has properties like color and speed, and behaviors like drive() and brake().
In code, we can create that as a class and object.

In code (Java):

<img width="823" height="577" alt="image" src="https://github.com/user-attachments/assets/423566b9-6fab-45d5-bb3d-6d2c34e9dcab" />

✅ Output: The car is driving...

## 🧩 2️⃣ The Four OOP Concepts.

| Concept           | Simple Analogy                                                                                  | What It Means                                           | Code Example                                                                                                                                                | Where QA Uses It                                                                                   |
| ----------------- | ----------------------------------------------------------------------------------------------- | ------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| **Abstraction**   | Like using a remote control — you press a button without knowing the wires inside               | Hide complex details and only show what’s needed        | `java<br>interface Browser { void open(); }<br>class Chrome implements Browser { public void open(){ System.out.println("Opening Chrome"); } }`             | In Selenium, we only call `driver.get("URL")` — we don’t need to know how Chrome internally runs   |
| **Encapsulation** | Like keeping your money in a wallet — people can’t grab it directly, only through zips or cards | Protect data using private variables and public methods | `java<br>class Account { private int balance = 0;<br> public void deposit(int amount){ balance+=amount; }<br> public int getBalance(){ return balance; } }` | In frameworks, test data and credentials are kept private in config files — not exposed directly   |
| **Inheritance**   | Like a child inheriting traits (eye color, voice) from parents                                  | Share common features from parent class                 | `java<br>class Animal { void eat(){System.out.println("eating");} }<br>class Dog extends Animal { void bark(){System.out.println("barking");} }`            | In QA, we create a **BaseTest** class with setup/teardown that all test classes inherit            |
| **Polymorphism**  | Like one word meaning different things — “run” can mean running in a race or running a machine  | Same method name, different actions                     | `java<br>class Animal { void sound(){System.out.println("sound");} }<br>class Dog extends Animal { void sound(){System.out.println("bark");} }`             | In Selenium, `driver.click()` works for many elements — the behavior changes based on element type |


##  3️⃣ How OOP Fits Inside a QA Automation Framework
| Layer             | Example                                                 | OOP Concept Used                | Why                                                                        |
| ----------------- | ------------------------------------------------------- | ------------------------------- | -------------------------------------------------------------------------- |
| **Base Class**    | `BaseTest.java` — handles setup, teardown, browser init | **Inheritance**                 | So all test classes can reuse setup code                                   |
| **Page Objects**  | `LoginPage.java`, `HomePage.java`                       | **Encapsulation + Abstraction** | Pages hide locators and show only methods like `login()`                   |
| **Utilities**     | `WaitHelper.java`, `DataReader.java`                    | **Abstraction**                 | Helpers simplify complex logic                                             |
| **Test Classes**  | `LoginTest.java`                                        | **Polymorphism**                | The same method name `verify()` may behave differently for different pages |
| **Configuration** | `config.properties` + Data classes                      | **Encapsulation**               | Hides sensitive data and environment details                               |


##  Selenium Cucumber Framework — Tree Diagram

This is a representaion of how a typical Selenium Cucumber file system will look like.

SeleniumCucumberFramework/
-|
-├── pom.xml                              # Maven build file (dependencies)
<img width="724" height="926" alt="image" src="https://github.com/user-attachments/assets/cc6cc513-7e17-411d-bf3f-47ce877455bc" />



## 🧩 2️⃣ What Each Folder Does (Simple Breakdown)

| Folder/File           | What It Does                                         | OOP Concept                                |
| --------------------- | ---------------------------------------------------- | ------------------------------------------ |
| **base/**             | Common foundation — setup, teardown, driver handling | Inheritance (shared parent logic)          |
| **pages/**            | Represents each page of your app                     | Encapsulation (hides locators)             |
| **utils/**            | Helper functions (waits, screenshots, data reading)  | Abstraction (you just call helper methods) |
| **constants/**        | Fixed project-wide values                            | Encapsulation                              |
| **managers/**         | Creates/reuses Page Objects efficiently              | Polymorphism (dynamic behavior)            |
| **features/**         | Written in Gherkin (Given/When/Then)                 | Abstraction (business-level test logic)    |
| **stepDefinitions/**  | Connects feature steps to code                       | Encapsulation + Abstraction                |
| **runners/**          | Runs tests with reports                              | Polymorphism (supports multiple runners)   |
| **config.properties** | Stores environment data                              | Encapsulation (hidden from test logic)     |


### 🧠 3️⃣ How OOP Flows Inside

##### 1. BaseTest.java (Inheritance)

          - All test classes extend this to get browser setup, login hooks, etc.

##### 2. Page Objects (Encapsulation)

          - Each page class hides locators and exposes easy-to-use methods like login() or getProfileName().

##### 3.  Definitions (Abstraction)

          - Connect natural language (Given user logs in) to actual code actions.

##### 4. Polymorphism

          - Methods like clickElement() or navigateToPage() behave differently depending on which page or driver is used.

### 4️⃣ Optional Extras (Advanced Real-World Enhancements)

<img width="817" height="524" alt="image" src="https://github.com/user-attachments/assets/d1ad49a2-9e8e-4147-b835-236286995ed9" 

# 🥒 What is Cucumber?

**Cucumber** is a testing framework that supports **Behavior Driven Development (BDD)**.
It allows writing test cases in simple English sentences called Gherkin syntax (e.g., Given, When, Then).

**✅ Example of a Cucumber scenario:**
Feature: Login Functionality

 > Scenario: Successful login with valid credentials
    Given user is on the login page
    When user enters valid username and password
    Then user should be redirected to the homepage

### 💡 Why use Cucumber for a Framework?

  - **Readable tests**: Even non-technical stakeholders (like product owners) can understand the test steps.

  - **Collaboration**: Bridges the gap between business analysts, developers, and testers.

  - **Reusable steps**: Common actions like “user logs in” can be reused across multiple scenarios.

  - **Structured framework**: Encourages clean separation between test data, steps, and automation code.

  - **Integration friendly**: Works smoothly with **Selenium**, **Appium**, **Rest Assured**, and **JUnit/TestNG**.

    ---

   # 🧠 What is Selenium?

  **Selenium** is an open-source automation tool used for testing web applications across different browsers (Chrome, Firefox, Edge, Safari) and operating systems. 
  
### 🧩 Selenium’s Core Capabilities

| Capability                 | Description                                                               |
| -------------------------- | ------------------------------------------------------------------------- |
| **Cross-browser testing**  | Runs tests on multiple browsers automatically.                            |
| **Multi-language support** | Works with Java, Python, C#, JavaScript, etc.                             |
| **Real user simulation**   | Interacts with web elements — clicks, typing, scrolling, etc.             |
| **Integration**            | Works with tools like Jenkins (CI/CD), Maven (build), and Cucumber (BDD). |
| **Parallel testing**       | Can run tests in parallel using Selenium Grid.                            |

### ⚠️ Selenium’s Shortcomings

| Limitation                | Explanation                                                            |
| ------------------------- | ---------------------------------------------------------------------- |
| **Only for web apps**     | Can’t test mobile or desktop apps directly (needs Appium for that).    |
| **Dynamic elements**      | Struggles with elements that load asynchronously without proper waits. |
| **Maintenance Overhead** | Locators and scripts break easily when UI changes occur.                     |
| **No built-in reporting** | Needs integration with frameworks like ExtentReports or Allure.        |
| **Execution speed**       | UI-based testing is slower than API or unit tests.                     |

### 🧩 Putting It Together: Selenium + Cucumber Framework

| Layer                        | Description                                                             |
| ---------------------------- | ----------------------------------------------------------------------- |
| **Feature Files (.feature)** | Describe scenarios in Gherkin language.                                 |
| **Step Definitions**         | Connect each Gherkin step to Selenium Java code.                        |
| **Page Objects**             | Contain locators and reusable methods for each webpage.                 |
| **Runner Class**             | Executes all features and links reports.                                |
| **Test Reports**             | Generated automatically after test runs (e.g., HTML or Extent reports). |

### 🧠 Summary Analogy:
> Think of Cucumber as the storyteller (writing readable steps)
and Selenium as the robot (doing the clicking, typing, and verifying on the browser).
Together, they form an efficient and understandable automation team. 🤖📖
  



