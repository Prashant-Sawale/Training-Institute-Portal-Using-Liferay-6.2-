<%@page import="com.liferay.counter.service.CounterLocalServiceUtil"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@include file="/html/addcourse/header.jsp" %>
<%@include file="/html/batchschedule/header.jsp" %>


<%  
  PortletURL addBatchActionURL =renderResponse.createActionURL();
  addBatchActionURL.setParameter(ActionRequest.ACTION_NAME ,Constants.BATCH_SCHEDULE);
%>
<portlet:renderURL var="homeURL"></portlet:renderURL>

<a href="<%=homeURL.toString() %>">Home</a><br/>

<h3>Add Batch Schedule</h3>
<aui:form name="add-Batch" method="post" action="<%=addBatchActionURL %>">

<aui:input name="batchName" label="Batch Name"> 
<aui:validator name="required" errorMessage="This field cannot be empty."></aui:validator></aui:input>

<aui:input name="teacherName" label="Faculty" >
<aui:validator name="required" errorMessage="This field cannot be empty." ></aui:validator></aui:input>


<aui:select name="courseCategory" label="Course">
<% 
 
List<Courses> courseList=CoursesLocalServiceUtil.getCourseses(0,CoursesLocalServiceUtil.getCoursesesCount());
Iterator<Courses> it=courseList.iterator();
while(it.hasNext())
{
	String str = it.next().getCName();

%>
<option value="<%= str%>" >  <%= str%>  </option>

<% } %>


</aui:select>



<aui:select name="batchTime" label="Batch Time">
<aui:option value="8am-11am">8am-11am</aui:option>
<aui:option value="11am-2pm">11am-2pm</aui:option>
<aui:option value="2pm-5pm">2pm-5pm</aui:option>
<aui:option value="5pm-8pm">5pm-8pm</aui:option>
</aui:select>

<aui:input  type="radio" name="batchDay" label="Weekday" value="Weekday"></aui:input>
<aui:input  type="radio" name="batchDay" label="weekend" value="Weekend"></aui:input>
<br>
<aui:button type="Submit" value="Add Batch"></aui:button>
</aui:form>