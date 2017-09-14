<%@ include file="/html/addcourse/header.jsp"%>

<portlet:renderURL var="homeURL"></portlet:renderURL>
<% PortletURL addCourseActionURL = renderResponse.createActionURL();
addCourseActionURL.setParameter( ActionRequest.ACTION_NAME,Constants.ACTION_ADD_COURSE_METHOD); 
%>
<a href="<%=homeURL.toString() %>">Home</a><br/>

<h2>Add New Course</h2>
<aui:form name="add_course_form" method="POST" action="<%=addCourseActionURL%>">
	
	
	
	<aui:input name="course_name" label="Course Name">
	<aui:validator name="required" errorMessage="Please enter course name."></aui:validator>
	</aui:input>
	
	<aui:select name="course_cat" label="Course Category">
	<option value="Java">Java</option>
	<option value="Asp .Net">Asp .Net</option>
	<option value="Testing">Testing</option>
	<option value="Others">Others</option>
	</aui:select>
	
	<aui:input type="textarea" rows="3" cols="80" name="course_desc" label="Course Description">
	<aui:validator name="required" errorMessage="Please enter description to course."></aui:validator>
	</aui:input>
	
	<aui:input name="course_preq" label="Pre-Requisite"></aui:input>
	
	<aui:input name="course_duration" label="Course Duration(Months)">
	<aui:validator name="required" errorMessage="Enter the duration in months."></aui:validator></aui:input>

	<aui:button type="submit" value="Add Course"></aui:button>

</aui:form>