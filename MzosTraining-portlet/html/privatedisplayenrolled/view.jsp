<%@page import="javax.portlet.ActionRequest"%>
<%@include file="/html/addcourse/header.jsp" %>
<%@include file="/html/batchschedule/header.jsp" %>

<liferay-ui:search-container delta="5" emptyResultsMessage="No students have enrolled yet.">
	<liferay-ui:search-container-results
		results="<%= EnrollCourseLocalServiceUtil.getEnrollCourses(searchContainer.getStart(), searchContainer.getEnd()) %>"
		total="<%= EnrollCourseLocalServiceUtil.getEnrollCoursesCount() %>"
	/>

	<liferay-ui:search-container-row
		className="com.test.model.EnrollCourse"
		modelVar="aEnrollCourse"
	>
		<liferay-ui:search-container-column-text property="EId" />
		
		<liferay-ui:search-container-column-text property="efName" />
		
		
		
		<liferay-ui:search-container-column-text property="egen" />

		<liferay-ui:search-container-column-text property="econt" />
		
		<liferay-ui:search-container-column-text property="email" />
		
		<liferay-ui:search-container-column-text property="equal" />

		<liferay-ui:search-container-column-text property="ecourse" />

		<liferay-ui:search-container-column-text property="ebatch" />

		<liferay-ui:search-container-column-text property="estatus" />

		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>
