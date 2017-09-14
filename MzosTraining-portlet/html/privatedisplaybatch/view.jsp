<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/batchschedule/header.jsp" %>

<liferay-ui:search-container>
	<liferay-ui:search-container-results
		results="<%= BatchScheduleLocalServiceUtil.getBatchSchedules(searchContainer.getStart(), searchContainer.getEnd()) %>"
		total="<%= BatchScheduleLocalServiceUtil.getBatchSchedulesCount() %>"
	/>

	<liferay-ui:search-container-row
		className="com.test.model.BatchSchedule"
		modelVar="aBatchSchedule"
	>
		<liferay-ui:search-container-column-text property="batchSchedule_Id" name="Sr.No."/>
		
		<liferay-ui:search-container-column-text property="batchName" name="Batch"/>
		
		<liferay-ui:search-container-column-text property="batchcCat" name="Course" />

		<liferay-ui:search-container-column-text property="batchteacher" name="Faculty"/>

		<liferay-ui:search-container-column-text property="batchTime" name="Timings"/>
		
		<liferay-ui:search-container-column-text property="batchDay" name="Day"/>
		
		<liferay-ui:search-container-column-jsp name="Actions" path="<%= Constants.ACTIONS_ON_BATCH_SCHEDULE %>" />
		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>
