
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html" isELIgnored="false" %>

<portlet:actionURL var="formAction">
	<portlet:param name="action" value="save"/>
</portlet:actionURL>

<form:form commandName="contact" method="post" action="${formAction}">
	<table cellpadding="4">
		<tr>
			<td>Contact Id</td>
            <td><form:input path="contactId" size="30" maxlength="80"/></td>
		</tr>
		
		<td>Email</td>
				<td><form:input path="email" size="30" maxlength="80"/></td>
		</tr>
		
		
		<tr>
            <td><input type="submit" name="_finish" value="Save"/></td>

		</tr>
	</table>
</form:form>


<c:out value="${time}"/>


Hello World