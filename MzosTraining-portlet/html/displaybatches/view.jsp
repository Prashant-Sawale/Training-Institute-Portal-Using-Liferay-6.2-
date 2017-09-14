<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ include file="/html/batchschedule/header.jsp" %>

<portlet:defineObjects />

<% 
List<BatchSchedule> courseList=BatchScheduleLocalServiceUtil.getBatchSchedules(0,BatchScheduleLocalServiceUtil.getBatchSchedulesCount());
Iterator<BatchSchedule> it=courseList.iterator();


while(it.hasNext())
{
	
	long id = it.next().getBatchSchedule_Id();
BatchSchedule obj = BatchScheduleLocalServiceUtil.fetchBatchSchedule(id);

out.println("Course Name: "+obj.getBatchcCat()+"<br>");
out.println("Batch Day: "+obj.getBatchDay()+"<br>");
out.println("Batch Time: "+obj.getBatchTime()+"<br>");

%>

<br><aui:button value="Enroll Now" href="http://localhost:8080/web/mzos/enroll"></aui:button>
<br><hr>
<% 

} %>
