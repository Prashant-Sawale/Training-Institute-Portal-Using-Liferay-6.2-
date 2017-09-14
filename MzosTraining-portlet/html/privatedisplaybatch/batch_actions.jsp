<%@include file="/html/batchschedule/header.jsp" %>

<% 
  ResultRow row =(ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
  BatchSchedule obj = (BatchSchedule) row.getObject();
   
  
  PortletURL editRenderURL =renderResponse.createRenderURL();
  editRenderURL.setParameter("Batch_Id", Long.toString(obj.getBatchSchedule_Id()));
  editRenderURL.setParameter("jspPage",Constants.EDIT_BATCH_SCHEDULE_JSP);
  
  PortletURL deleteactionURL=renderResponse.createActionURL();
  deleteactionURL.setParameter("BatchId", Long.toString( obj.getBatchSchedule_Id()));
  deleteactionURL.setParameter(actionRequest.ACTION_NAME, Constants.DELETE_BATCH);
  
%>


<liferay-ui:icon-menu>

	<liferay-ui:icon image="edit" message="Edit Batch Schedule"
		url="<%=editRenderURL.toString()%>" />

	<liferay-ui:icon image="delete" message="Delete Batch Schedule"
		url="<%=deleteactionURL.toString()%>" />
		
</liferay-ui:icon-menu>
