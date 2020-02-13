<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<%-- <%@ taglib uri="http://www.springframework.org/tags/form" prefix="Form"%> --%>
<html>
  <head>
    <title>Spring MVC login example.</title>
    <style>
		.error {
			color: #ff0000;
			font-style: italic;
			font-weight: bold;
		}
	</style>
  </head>
 
  <body>
    <form action="login" method="post" commandName="SpringWeb">  
   <input type="text" path="userName"/>
 
    <br/><br/>  
  <input type="password" path="password"/>
  
    <br/><br/>  
    <input type="submit" value="login"/>  
    </form>  
  </body>
</html>