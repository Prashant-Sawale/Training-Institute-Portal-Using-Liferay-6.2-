<%@ include file="/html/addcourse/header.jsp" %>
<h3>All Courses</h3>
<liferay-ui:search-container delta="5" emptyResultsMessage="There are no courses available">
	<liferay-ui:search-container-results
		results="<%= CoursesLocalServiceUtil.getCourseses(searchContainer.getStart(), searchContainer.getEnd()) %>"
		total="<%= CoursesLocalServiceUtil.getCoursesesCount() %>"
	/>

	<liferay-ui:search-container-row
		className="com.test.model.Courses"
		modelVar="aCourses"
	>
	
		<liferay-ui:search-container-column-text property="CId"/>
			
		<liferay-ui:search-container-column-text property="CCat" name="Category"/>
		
		<liferay-ui:search-container-column-text property="CName" name="Course" />

		<liferay-ui:search-container-column-text property="CDesc" name="Description" />
		
		<liferay-ui:search-container-column-text property="CPreq" name="Prerequisite" />

		<liferay-ui:search-container-column-text property="CDuration" name="Duration"/>

		<liferay-ui:search-container-column-jsp name="Actions" path="<%= Constants.COURSE_ACTIONS %>" />

		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>
