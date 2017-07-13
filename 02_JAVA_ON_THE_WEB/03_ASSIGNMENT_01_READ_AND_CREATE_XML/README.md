## XML Assignment

In this assignment, you will be reading and describing two XML files.

## Creating

In your preferred directory, create a restaurant.xml file. Your task is to add a breakfast and a dinner menu along with the lunch menu that we have from the previous lesson. Note, the <lunchMenu> tag will no longer be the root tag of your file. Instead, create the appropriate root element for this assignment.

## Reading

Below is a sample web.xml file that we use to configure servlets. Your task is to analyze this file and hypothesize the purpose of each tag.

● display-name
    
    *Guess:*
    
    Name displayed in either the browser tab or the top of the page

● servlet

    *Guess:*
    
    overall project

● servlet-name

    *Guess:*
    
    name to call if you want to do/use/alter that piece

● servlet-class

    *Guess:*
    
    this is very similar in syntax to the package of a java project.  So I'd say something similar

● servlet-mapping
    
    *Guess:*
    
    looks like a component which contains a class and route

● url-pattern

    *Guess:*
    
    looks like routing information to me

● welcome-file

    *Guess:*
    
    the setter for the initial page to load

<?xml version="1.0" encoding="UTF-8"?>
<web-app>
  <display-name>SimpleServletProject</display-name>
  <servlet>
    <servlet-name>simpleServlet</servlet-name>
    <servlet-class>org.codingdojo.tutorial.SimpleServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>simpleServlet</servlet-name>
    <url-pattern>/simpleServlet</url-pattern>
  </servlet-mapping>
  <servlet>
    <servlet-name>xmlServlet</servlet-name>
    <servlet-class>org.codingdojo.tutorial.XmlServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>xmlServlet</servlet-name>
    <url-pattern>/xmlServletpath</url-pattern>
  </servlet-mapping>
  <welcome-file-list>
    <welcome-file>index.html</welcome-file>
  </welcome-file-list>
</web-app>

## Topics:

● XML

## Tasks:

● Create a breakfast and dinner menu for a restaurant.

● Analyze and hypothesize each tag in the sample web.xml file