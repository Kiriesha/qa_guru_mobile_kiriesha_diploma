# Test mobile automation project for [Litres](https://www.litres.ru/)

<p  align="center">
<img src="images/icons/LitLogo.png" alt="LitresLogo" width="900">
</p>


><img width="5%" title="IntelliJ IDEA" src="./images/icons/1f310.png"> LitRes is an international company that produces and distributes e-books and digital audiobooks.


# <a name="Description">Description</a>
+ [Technology stack](#Technology)
+ [Tests](#Tests)
+ [Gradle command](#GraleCommand)
+ [Jenkins](#Jenkins)
+ [Test results in Allure](#Allure)
+ [Telegram notification](#Telegram)


# <a name="Technology">Technology stack</a>
<p  align="center">

[<code><img width="5%" title="IntelliJ IDEA" src="./images/icons/IIdea.svg"></code>](https://www.jetbrains.com/idea/) - development environment

[<code><img width="5%" title="Java" src="./images/icons/java.svg"></code>](https://www.java.com/) - the programming language used to write the autotests

[<code><img width="5%" title="Github" src="./images/icons/GitHub.svg"></code>](https://github.com/) - a code hosting platform for version control and collaboration

[<code><img width="5%" title="Gradle" src="./images/icons/gradle.svg"></code>](https://gradle.org/) - a self-assembly system

[<code><img width="5%" title="Selenide" src="./images/icons/selenide.svg"></code>](https://ru.selenide.org/) - a framework for automated web application testing based on Selenium WebDriver

[<code><img width="5%" title="Selenoid" src="./images/icons/selenoid.svg"></code>](https://aerokube.com/selenoid/latest/) - a Selenium testing platform running browsers and mobile platforms in Docker containers

[<code><img width="5%" title="Browsersctack" src="./images/icons/Browserstack-logo-white-02-4.png"></code>](https://www.browserstack.com/) - is a cloud-based web and mobile testing platform that gives developers the ability to test their websites and mobile apps in browsers on demand

[<code><img width="5%" title="Selenoid" src="./images/icons/appium.svg"></code>](https://appium.io/) - is an open source test automation framework for use with native, hybrid and mobile web apps

[<code><img width="5%" title="Selenoid" src="./images/icons/Android_Studio.png"></code>](https://developer.android.com/studio) - integrated development environment to work with the Android platform

[<code><img width="5%" title="JUnit5" src="./images/icons/junit5.svg"></code>](https://junit.org/junit5/)  - a framework for unit testing.

[<code><img width="5%" title="Allure Report" src="./images/icons/Allure-Report.svg"></code>](https://qameta.io/allure-report/) - a flexible, lightweight multi-language test reporting tool

[<code><img width="5%" title="Allure TestOps" src="./images/icons/Allure-TestOps.svg"></code>](https://qameta.io/) - Next-gen Software Quality Management Platform for manual and automation testing

[<code><img width="5%" title="Jenkins" src="./images/icons/Jenkins.svg"></code>](https://www.jenkins.io/) - a system that ensures a process of continuous software integration

[<code><img width="5%" title="Jira" src="./images/icons/Jira.svg"></code>](https://www.atlassian.com/ru/software/jira) - a system for task tracking and project management

[<code><img width="5%" title="Telegram" src="./images/icons/Telegram.svg"></code>](https://web.telegram.org/z/) - a cloud-based mobile and desktop messaging app with a focus on security and speed.
</p>

[To Description](#Description)


# <a name="tests">Tests</a>
> - Test click on modules;
> - Search test:
  >    - Valid search;
  >    - Invalid search;


[To Description](#Description)

# <img width="5%" title="Gradle" src="./images/icons/gradle.svg"> <a name="GradleCommand">Gradle Command</a>
**To run the test locally from the terminal, run the command:**
>gradle clean test


[To Description](#Description)

# <img width="5%" title="Jenkins" src="./images/icons/Jenkins.svg"> <a name="Jenkins">Jenkins</a>
>**1. To start the build, you need to enter the parameters in the settings and then build with the specified parameters:**

[<code><img width="800" title="Jenkins" src="./images/icons/JenkinsMob.jpg"></code>](https://jenkins.autotests.cloud/job/litres_mobile_kiriesha/)


>**2. After assembly, you can watch the Allure report:**

[<code><img width="800" title="Jenkins" src="./images/icons/JenkinsMob2.jpg"></code>](https://jenkins.autotests.cloud/job/litres_mobile_kiriesha/)

[To Description](#Description)

# <img width="5%" title="Allure Report" src="./images/icons/Allure-Report.svg"> <a name="Allure">Test results in Allure</a>
>**Test run (Jenkins):**

[<code><img width="800" title="Allure Report" src="./images/icons/AllureMob.jpg"></code>](https://jenkins.autotests.cloud/job/Diploma_Kiriesha/2/allure/)


[<code><img width="800" title="Allure Report" src="./images/icons/AllureMob2.jpg"></code>](https://jenkins.autotests.cloud/job/Diploma_Kiriesha/2/allure/#graph)

[To Description](#Description)

# <img width="5%" title="BrowserStack" src="./images/icons/Browserstack-logo-white-02-4.png"> <a name="BrowserStack">Test results in BrowserStack</a>
>**Test run (BrowserStack):**
>
<code><img width="800" title="BrowserStack" src="./images/icons/Bwstck1.jpg"></code>

>**Analysis in the form of graphs:**
> 
<code><img width="800" title="BrowserStack" src="./images/icons/Bwstck2.jpg"></code>
<code><img width="800" title="BrowserStack" src="./images/icons/Bwstck3.jpg"></code>
> [To Description](#Description)

# <img width="5%" title="Telegram" src="./images/icons/Telegram.svg"> <a name="Telegram">Telegram notification</a>
> **After the build, a report comes in Telegram (using a pre-created bot):**

<code><img width="800" title="Jenkins" src="./images/icons/Telegram.jpg"></code>


[To Description](#Description)

**Mobile Test video:**

<p align="center">
  <img title="Selenoid Video" src="images/VideoMob.gif">
</p>

[To Description](#Description)