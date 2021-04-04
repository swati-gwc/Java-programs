# SPRING MVC LOGIN FORM EXAMPLE PROJECT

In this project, we are going to see how to implement Spring MVC framework to make a login form that verifies entered username and password. If the username and password is correct then Success page is shown telling that user has successfully logged in, otherwise it will display a message that details are not correct.

## HOW TO OPEN/ USE/ RUN THIS PROJECT ON NETBEANS?
If you want to run this (Spring MVC Form) whole project as it is on you local machine then after downloading this repository go to Netbeans IDE. From NetBeans ID >  go to open project and then select folder named as "Spring6" (which you will find inside the zip file, (Java Programs > SpringMVCFormExample> Spring6) that you will download. After opening Spring6 in Netbeans you only need to deploy and run the project.

## STEPS TO CREATE A NEW WEB APPLICATION WITH SPRING WEB MVC FRAMEOWORK IN NETBEANS
To create this project from scratch in Netbeans IDE follow the steps below:

- Step 1: Go to File 
- Step 2: Select New Project 
- Step 3: Select Java Web In Catagories and then select Web Application.  Press Next.
- Step 4: Enter any name for your web application e.g. "Spring6" . Note you don't need to write Spring6 you can write anything you like. Press Next.
  - Note: No need to check the checkbox which says, "use dedicated folder for storing libraries".
- Step 5: Now you will get four fields. In Add to enterprise application, I chose None. In server, I have selected GlassFish Server 4.1.1. and for Java EE version I chose Java EE 7 Web. In contextPath, it already comes prefilled. In case it is not written you need to write /nameOfApplication for e.g. your project name is Spring6 then write /Spring6. Press Next.
- Step 6: This step is most important, here don't forget to check the checkbox of Spring Web MVC. This will automatically add relevant libraries to your project. Don't check any other thing except Spring Web MVC.
- Step 7: Press Finish.


## Project Structure of this Project, "Spring6"

![Project Structure](/SpringMVCFormExample/ImagesSpringMVCFormExample/ProjectStructure.PNG)

## Main Files of this project 

- [login.jsp](/SpringMVCFormExample/Spring6/web/WEB-INF/jsp/login.jsp)
- [success.jsp](/SpringMVCFormExample/Spring6/web/WEB-INF/jsp/success.jsp)
- [redirect.jsp](/SpringMVCFormExample/Spring6/web/redirect.jsp)
- [dispatcher-servlet.xml](/SpringMVCFormExample/Spring6/web/WEB-INF/dispatcher-servlet.xml)
- [web.xml](/SpringMVCFormExample/Spring6/web/WEB-INF/web.xml)
- [MyController.java](/SpringMVCFormExample/Spring6/src/java/mypackage/MyController.java)
- [MyClass.java](/SpringMVCFormExample/Spring6/src/java/secondpackage/MyClass.java)

## OUTPUT OF THIS PROJECT 

### Form WebPage with correct details (Username and Password is swati and swati respectively, you can change it according to your choice in MyController.java)

![Project Structure](/SpringMVCFormExample/ImagesSpringMVCFormExample/FormWithCorrectDetails.PNG)

### success.jsp page is displayed after correct details are submitted in form 

![Project Structure](/SpringMVCFormExample/ImagesSpringMVCFormExample/successJSPOutput.PNG)

### Form WebPage with WRONG details (Username and Password except swati and swati respectively are all wrong and will display error message)

![Project Structure](/SpringMVCFormExample/ImagesSpringMVCFormExample/FormWithWrongDetails.PNG)

### Error Message Displayed after submitting wrong login form details

![Project Structure](/SpringMVCFormExample/ImagesSpringMVCFormExample/FormWrongDetailsOutput.PNG)

### Libraries that are added in this project

![Project Structure](/SpringMVCFormExample/ImagesSpringMVCFormExample/LibrariesAdded.PNG)








