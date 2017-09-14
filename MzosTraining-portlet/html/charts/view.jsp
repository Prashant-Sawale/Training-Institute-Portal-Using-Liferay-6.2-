<%@page import="com.test.service.BatchScheduleLocalServiceUtil"%>
<%@page import="com.test.service.CoursesLocalServiceUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/batchschedule/header.jsp" %>
<portlet:defineObjects />

<%
PortletURL chartRenderUrl =renderResponse.createRenderURL();
chartRenderUrl.setParameter("jspPage" , Constants.CHARTS_JSP);  

int a=0;
  a= CoursesLocalServiceUtil.getCoursesesCount();
 int b=0;
  b= BatchScheduleLocalServiceUtil.getBatchSchedulesCount();
%>



<h5>Total number of Courses :<%= a %> </h5>


<a  href="<%=chartRenderUrl.toString()%>" >Details</a>

<h5>Total number of Batches :<%= b %> </h5>


