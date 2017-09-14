<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ include file="/html/addcourse/header.jsp" %>
<%@ include file="/html/batchschedule/header.jsp" %>

<portlet:defineObjects />
<portlet:renderURL var="homeURL"></portlet:renderURL>

<a href="<%=homeURL.toString() %>">Home</a><br/>
<% 
PortletURL EnrollActionURL = renderResponse.createActionURL();
EnrollActionURL.setParameter( ActionRequest.ACTION_NAME,Constants.ENROLL_COURSE_METHOD); 

ThemeDisplay obj =(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
	User u = obj.getUser();
%>

<%
String cname = ParamUtil.getString(request, "cname");
long bid = ParamUtil.getLong(request, "coursebatch");
BatchSchedule bs = BatchScheduleLocalServiceUtil.fetchBatchSchedule(bid);

%>
<h3>Enrollment Form</h3><br>
<aui:form name="Add_Enrollment_Form" method="POST" action="<%= EnrollActionURL %>">

<aui:input name="fullname" label="First name" value="<%= u.getFullName() %>"></aui:input>


<%-- <% if(u.getMale()==true)
{
%>
<aui:select name="gender" label="Gender">
<option value="Male">Male</option>
<option value="Female">Female</option>
</aui:select>
<% }
else { %>
<aui:select name="gender" label="Gender">
<option value="Female">Female</option>
<option value="Male">Male</option>

</aui:select>
<% } %> --%>

Gender : <% if(u.getMale()==true) 
{ 
	out.print("Male"+"<br>");
} 
else { 
	out.print("Female"+"<br>");
	} %>


<aui:input name="email" label="Email id" value="<%= u.getEmailAddress() %>"></aui:input>

<aui:input name="contact" label="Contact Number"></aui:input>

<aui:select name="qualification" label="Qualification">
<aui:option value="BE/BTech">BE/BTech</aui:option>
<aui:option value="MCA">MCA</aui:option>
<aui:option value="MCS">MCS</aui:option>
<aui:option value="BCA/BCS">BCA/BCS</aui:option>
<aui:option value="Others">Others</aui:option>
</aui:select>

Selected Course Name : <%= cname %>
<br><br>
Selected Batch : <%= bs.getBatchDay()%> | <%= bs.getBatchTime()%>
<br><br><br>
<aui:input type="hidden" name="coursename" value="<%= cname %>"></aui:input>
<aui:input type="hidden" name="batch" value="<%= bs.getBatchName() %>"></aui:input>
<aui:button type="submit" value="Finish"></aui:button>

</aui:form>

<p>*Conditions Apply : Your status will be put on hold until you confirm the fees payment with Director of the MZOS.</p>

