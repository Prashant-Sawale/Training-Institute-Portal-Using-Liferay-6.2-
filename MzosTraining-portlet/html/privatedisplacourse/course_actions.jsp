<%@ include file="/html/addcourse/header.jsp" %>

<%
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Courses course_row = (Courses) row.getObject();

	PortletURL editCourseRenderURL = renderResponse.createRenderURL();
	editCourseRenderURL.setParameter("course_edit_id",
			Long.toString(course_row.getCId()));
	editCourseRenderURL.setParameter("jspPage",Constants.COURSE_EDIT);

	PortletURL deleteCourseActionURL = renderResponse.createActionURL();

	deleteCourseActionURL.setParameter("cid",
			Long.toString(course_row.getCId()));
	deleteCourseActionURL.setParameter(ActionRequest.ACTION_NAME,
			Constants.ACTION_DELETE_COURSE_METHOD);
%>

<liferay-ui:icon-menu>

	<liferay-ui:icon image="edit" message="Edit Course"
		url="<%=editCourseRenderURL.toString()%>" />

	<liferay-ui:icon image="delete" message="Delete Course"
		url="<%=deleteCourseActionURL.toString()%>" />


</liferay-ui:icon-menu>














