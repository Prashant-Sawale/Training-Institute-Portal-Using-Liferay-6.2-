<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ include file="/html/addcourse/header.jsp"%>

<portlet:defineObjects />

<%
	List<Courses> courseList = CoursesLocalServiceUtil.getCourseses(0,
			CoursesLocalServiceUtil.getCoursesesCount());
	Iterator<Courses> it = courseList.iterator();

	while (it.hasNext()) {

		long id = it.next().getCId();
		Courses obj = CoursesLocalServiceUtil.fetchCourses(id);

		out.println("Course Category: " + obj.getCCat() + "<br>");
		out.println("Course Name: " + obj.getCName() + "<br>");
		out.println("Course Description: " + obj.getCDesc() + "<br>");
		out.println("Pre-Requisite: " + obj.getCPreq() + "<br>");
		out.println("Course Duration: " + obj.getCDuration() + "<br>");
%>

<br>
<aui:button value='Enroll Now'
	href="http://localhost:8080/web/mzos/enroll"></aui:button>
<br>
<hr>
<%
	}
%>
