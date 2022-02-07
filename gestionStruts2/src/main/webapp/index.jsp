<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Hello struts2!</title>
</head>
<body>
	<h1>
		<a href="<s:url action='hello'/>">Hello struts 2 !</a>
	</h1>
	
	<s:form action = "hello">
		<s:textfield  class="form-control" name="messageStore.message" label="Your Name"/>
		<s:submit value="Envoyer"/>
	</s:form>
	<h3><s:property value="getText('global.heading')"/></h3>
				
				<s:url action="locale" var="indexEN">
					<s:param name="request_locale">en</s:param>
				</s:url>
				<s:a href="%{indexEN}">English</s:a>
				
				<s:url action="locale" var="indexFR" >
					<s:param name="request_locale">fr</s:param>
				</s:url>
				<s:a href="%{indexFR}">Français</s:a>
				
				<br><br>
				<i><s:property value="getText('global.required')"/></i>
				<s:form action="hello">
	<h2>formulaire d'ajout personne</h2>
	
		<s:textfield   name="personne.firstName" key="global.firstname"/>
		
		<s:textfield   name="personne.lastName"  key="global.lastname"/>
		<s:textfield   name="personne.title" key="global.title"/>
		<s:textfield  name="personne.age" key="global.age"/>
		<s:textfield   name="personne.email" key="global.email" />
		<s:textfield  type="date"  name="personne.startDate" format="dd/MM/yyyy" key="global.startdate"/>
		<s:radio name="personne.gender" list="#{'Mr' :'Male','Mme' :' Female'}" key="global.gender"/>
		<s:radio key="global.place" name="personne.place" list="#{'Par' :'Paris','Lnd' :' London','Mad' :' Madrid','Ber' :' Berlin'}"/>
		<s:submit value="Envoyer"/>
	</s:form>
</body>
</html>

