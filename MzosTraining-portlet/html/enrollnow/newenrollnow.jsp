<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ include file="/html/addcourse/header.jsp" %>
<%@ include file="/html/batchschedule/header.jsp" %>

<portlet:defineObjects />
<portlet:renderURL var="homeURL"></portlet:renderURL>

<a href="<%=homeURL.toString() %>">Home</a><br/>
<% 
PortletURL selectBatchRenderURL = renderResponse.createRenderURL();
selectBatchRenderURL.setParameter("jspPage",Constants.ENROLL_BATCH);
%>

<br>
<%
String cname = ParamUtil.getString(request, "coursename");
List<BatchSchedule> bList=BatchScheduleLocalServiceUtil.findByfinder2(cname) ;
if(bList.isEmpty()){
	out.print("Sorry, No batches are avaliable for the selected course.");
}
else{

%>
<h3>Step 2 : </h3>
<h5>Select a Batch Schedule</h5>
<br>
<aui:form name="enrollbatch" action="<%= selectBatchRenderURL.toString()%>" method="POST">
<aui:input type="hidden" name="cname" value="<%= cname %>"></aui:input>
<aui:select name="coursebatch" label="Select your course">
<% 
Iterator<BatchSchedule> it=bList.iterator();
while(it.hasNext())
{
	
long id = it.next().getBatchSchedule_Id();
BatchSchedule obj = BatchScheduleLocalServiceUtil.fetchBatchSchedule(id);



%>
<aui:option value="<%= obj.getBatchSchedule_Id()%>"> <%= obj.getBatchcCat()%> | <%= obj.getBatchDay()%> | <%= obj.getBatchTime()%></aui:option>

<% 

} %>
</aui:select>
<aui:button type="submit" value="Proceed to Step 3" href=''></aui:button>
</aui:form>
<% } %>