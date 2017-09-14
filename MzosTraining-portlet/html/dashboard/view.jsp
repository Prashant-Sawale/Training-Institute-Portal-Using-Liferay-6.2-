<%@page import="com.test.service.EnrollCourseLocalServiceUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@page import="com.test.service.BatchScheduleLocalServiceUtil"%>
<%@page import="com.test.service.CoursesLocalServiceUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/batchschedule/header.jsp" %>
<portlet:defineObjects />

<%


int a=0;
  a= CoursesLocalServiceUtil.getCoursesesCount();
 int b=0;
  b= BatchScheduleLocalServiceUtil.getBatchSchedulesCount();
int c=0;
c= EnrollCourseLocalServiceUtil.getEnrollCoursesCount();


%>
<h4>Dashboard</h4>
<hr>
<h5>Total number of Courses : <a  href="http://localhost:8080/group/mzos/cources"><%= a %></a></h5>
<hr>
<h5>Total number of Batches : <a  href="http://localhost:8080/web/mzos/batch-schedule"><%= b %></a></h5>
<hr>
<h5>Total number of Students  : <%= c %> </h5>
<hr>
