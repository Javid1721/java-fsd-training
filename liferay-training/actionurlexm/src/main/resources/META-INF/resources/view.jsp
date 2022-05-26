<%@ include file="/init.jsp" %>
<portlet:defineObjects/>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"  %>
<portlet:actionURL name="actionMethod" var="actionURL" />

<a href="${actionURL}">action url created by liferay</a>