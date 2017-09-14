<%@ include file="/html/addcourse/header.jsp" %>
<portlet:defineObjects />


<% 

PortletURL EnrollNow=renderResponse.createRenderURL(); 
EnrollNow.setParameter("jspPage",Constants.PAGE_ENROLLNOW);

%>

<h3>Start Enrolling for a Course</h3>

<aui:button value="Start Enrolling"  href="<%=EnrollNow.toString() %>">



</aui:button>
