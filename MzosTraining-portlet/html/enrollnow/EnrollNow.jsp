<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ include file="/html/addcourse/header.jsp" %>

<portlet:defineObjects />
<portlet:renderURL var="homeURL"></portlet:renderURL>

<a href="<%=homeURL.toString() %>">Home</a><br/>
<% 

PortletURL selectCourseRenderURL = renderResponse.createRenderURL();
selectCourseRenderURL.setParameter("jspPage",Constants.ENROLL_COURSE);

%>

<%

 ThemeDisplay obj =(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
 if (obj.isSignedIn()) {

%>

<h3>Step 1 : </h3>

<h5>Select a course : </h5>

<br>

<aui:form name="enrollcourse" action="<%= selectCourseRenderURL.toString()%>" method="POST">

<aui:select name="coursename" label="Course Name">

<% 

List<Courses> courseList=CoursesLocalServiceUtil.getCourseses(0,CoursesLocalServiceUtil.getCoursesesCount());
Iterator<Courses> it=courseList.iterator();


while(it.hasNext())
{
	
	long id = it.next().getCId();
Courses obc = CoursesLocalServiceUtil.fetchCourses(id);
%>
<aui:option value="<%= obc.getCName() %>"><%= obc.getCName()%></aui:option>

<% 
} 
%>

</aui:select>
<br><aui:button type="submit" value="Proceed to step 2"></aui:button>
</aui:form>
<% 
} 
 else
{
%>
<p>Please Create-account/Sign-In to Enroll.</p>
<%} %>