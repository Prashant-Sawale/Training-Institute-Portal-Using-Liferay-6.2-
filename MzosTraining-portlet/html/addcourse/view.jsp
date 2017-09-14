<%@ include file="/html/addcourse/header.jsp" %>

<% PortletURL addCourse = renderResponse.createRenderURL();
addCourse.setParameter("jspPage", Constants.PAGE_ADD); %>

<aui:button value="Add New Course" href="<%=addCourse.toString() %>">

</aui:button>
