<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://tile.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title><tiles:insertAttribute name="title" ignore="true"/></title>

<table>
	<tbody>
		<tr>
			<td><tiles:insertAttribute name="header"/></td>
		</tr>
		<tr>
			<td><tiles:insertAttribute name="menu"/></td>
			<td><tiles:insertAttribute name="body"/></td>
		</tr>
		<tr>
			<td><tiles:insertAttribute name="footer"/></td>
		</tr>
	</tbody>
</table>