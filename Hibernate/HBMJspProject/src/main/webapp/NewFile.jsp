<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html">
<head>
<title>Insert title here</title>
</head>
<h:body>
<h:form>
    student id:
    <h:inputText value="#{student.studentId}"  /><br></br>	
	<h:commandButton action="search" value="submit" />
	
  </h:form>
</h:body>
</html>