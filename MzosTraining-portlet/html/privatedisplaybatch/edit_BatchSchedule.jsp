
<%@page import="javax.portlet.ActionRequest"%>
<%@include file="/html/batchschedule/header.jsp" %>
<portlet:renderURL var="homeURL"></portlet:renderURL>

<a href="<%=homeURL.toString() %>">Home</a><br/>
<% 
  PortletURL editBatchScheduleActionURL =renderResponse.createActionURL();
  editBatchScheduleActionURL.setParameter(ActionRequest.ACTION_NAME,Constants.EDIT_BATCH);
		  
  long Bid = ParamUtil.getLong(request,"Batch_Id" );
  
  BatchSchedule obj = new BatchScheduleImpl();
  if (Bid > 0) 
    {
		obj = BatchScheduleLocalServiceUtil.fetchBatchSchedule(Bid);
	}
  
%>

<h3>Edit batch schedule</h3>
<aui:form name="Edit_Batch_schedule_Form" method="POST" action="<%=editBatchScheduleActionURL%>">


<aui:input name="batchName" label="Batch Name :" value="<%=obj.getBatchName()%>"> 
<aui:validator name="required" errorMessage="This field cannot be empty."></aui:validator></aui:input>

<aui:input name="teacherName" label="Faculty :" value="<%=obj.getBatchteacher() %>" >
<aui:validator name="required" errorMessage="This field cannot be empty." ></aui:validator></aui:input>

<aui:input name="courseCategory" label="Course :" value="<%=obj.getBatchcCat() %>">
<aui:validator name="required" errorMessage="This field cannot be empty."></aui:validator></aui:input>

<aui:select name="batchTime" value="">
<aui:option value="<%= obj.getBatchTime() %>"><%= obj.getBatchTime() %></aui:option>>
<aui:option value="8am-11am">8am-11am</aui:option>
<aui:option value="11am-2pm">11am-2pm</aui:option>
<aui:option value="2pm-5pm">2pm-5pm</aui:option>
<aui:option value="5pm-8pm">5pm-8pm</aui:option>
</aui:select>

<aui:input  type="radio" name="batchDay" label="Weekday" value="Weekday" ></aui:input>
<aui:input  type="radio" name="batchDay" label="weekend" value="Weekend" ></aui:input>

<aui:input name="batch_id" type="hidden" value="<%=obj.getBatchSchedule_Id()%>" />
<br>
<aui:button type="submit" value="Edit Batch Schedule "></aui:button>

</aui:form>