<%@page import="com.test.service.persistence.CoursesUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ include file="/html/addcourse/header.jsp" %>

<portlet:defineObjects />

<h3>All Asp .Net Courses</h3>
<% 
/* Select Course name from courses where ccat="Asp .net" */
List<Courses> courseList=CoursesLocalServiceUtil.findByfinder1("Asp .Net"); 
Iterator<Courses> it=courseList.iterator();


while(it.hasNext())
{
	
	long id = it.next().getCId();
Courses obj = CoursesLocalServiceUtil.fetchCourses(id);
out.println("Course Category: "+obj.getCCat()+"<br>");
out.println("Course Name: "+obj.getCName()+"<br>");
out.println("Course Description: "+obj.getCDesc()+"<br>");
out.println("Pre-Requisite: "+obj.getCPreq()+"<br>");
out.println("Course Duration: "+obj.getCDuration()+"<br>");

%>

<br><aui:button value='Enroll Now' href="http://localhost:8080/web/mzos/enroll"></aui:button>
<br><hr>
<% 

} %>
