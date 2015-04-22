<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<title>Customer Form - Struts2 Demo | ViralPatel.net</title>
 
 
 
<h2>Customer Form</h2>
 
<s:form action="customer.action" method="post" validate="true">
    <s:textfield name="name" key="label.name" size="20" />
    <s:textfield name="age" key="label.age" size="20" />
    <s:textfield name="email" key="label.email" size="20" />
    <s:textfield name="telephone" key="label.telephone" size="20" />
    <s:submit method="addCustomer" key="label.add.customer" align="center" />
</s:form>