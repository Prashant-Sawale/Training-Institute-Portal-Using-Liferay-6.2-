<%@ include file="/html/addcourse/header.jsp" %>

<%
	PortletURL editCourseActionURL = renderResponse.createActionURL();
	editCourseActionURL.setParameter(ActionRequest.ACTION_NAME, Constants.ACTION_EDIT_COURSE_METHOD);

	Courses td = new CoursesImpl();
	long Cid = ParamUtil.getLong(request, "course_edit_id");
	if (Cid > 0) {
		td = CoursesLocalServiceUtil.fetchCourses(Cid);
	}
%>
<portlet:renderURL var="homeURL"></portlet:renderURL>

<a href="<%=homeURL.toString() %>">Home</a><br/>
<h2>Edit Course</h2>
<aui:form name="edit_course_form" method="POST" action="<%=editCourseActionURL%>">
	
	<aui:input name="course_id" type="hidden" value="<%=td.getCId()%>" />
	
	
	
	<aui:input name="course_name" label="Course Name" value="<%= td.getCName() %>">
	<aui:validator name="required" errorMessage="Please enter course name."></aui:validator>
	</aui:input>
	<% if(td.getCCat().equalsIgnoreCase("Java"))
	{
	%>
	<aui:select name="course_cat" label="Course Category">
	<option value="<%=td.getCCat()%>"><%=td.getCCat()%></option>
	<option value="Asp .Net">Asp .Net</option>
	<option value="Testing">Testing</option>
	<option value="Others">Others</option>
	</aui:select>
	<% } %>
	
	<% if(td.getCCat().equalsIgnoreCase("Asp .Net"))
	{
	%>
	<aui:select name="course_cat" label="Course Category">
	<option value="<%=td.getCCat()%>"><%=td.getCCat()%></option>
	<option value="Java">Java</option>
	<option value="Testing">Testing</option>
	<option value="Others">Others</option>
	</aui:select>
	<% } %>
	
	<% if(td.getCCat().equalsIgnoreCase("Testing"))
	{
	%>
	<aui:select name="course_cat" label="Course Category">
	<option value="<%=td.getCCat()%>"><%=td.getCCat()%></option>
	<option value="Java">Java</option>
	<option value="Asp .Net">Asp .Net</option>
	<option value="Others">Others</option>
	</aui:select>
	<% } %>
	
	<% if(td.getCCat().equalsIgnoreCase("Others"))
	{
	%>
	<aui:select name="course_cat" label="Course Category">
	<option value="<%=td.getCCat()%>"><%=td.getCCat()%></option>
	<option value="Java">Java</option>
	<option value="Asp .Net">Asp .Net</option>
	<option value="Testng">Others</option>
	</aui:select>
	<% } %>
	
	<aui:input type="textarea" rows="3" cols="80" name="course_desc" label="Course Description" value="<%= td.getCDesc() %>">
	<aui:validator name="required" errorMessage="Please enter description to course."></aui:validator>
	</aui:input>
	
	<aui:input name="course_preq" label="Pre-Requisite" value="<%= td.getCPreq() %>"></aui:input>
	
	<aui:input name="course_duration" label="Course Duration(Months)" value="<%= td.getCDuration() %>">
	<aui:validator name="required" errorMessage="Enter the duration in months."></aui:validator></aui:input>

	<aui:button type="submit" value="Edit Course"></aui:button>

</aui:form>
