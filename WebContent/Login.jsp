<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<title>Struts 2 - Login Application | ViralPatel.net</title>

<h2>Struts 2 - Login Application</h2>
<s:actionerror/>
<s:form action="login.action" method="post">
	<s:textfield name="username" key="label.username" size="20"/>
	<s:password name="password" key="label.password" size="20"/>
	<s:submit method="execute" key="label.login" align="center"/>
</s:form>
