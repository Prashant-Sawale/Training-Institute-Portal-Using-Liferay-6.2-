<%@include file="/html/batchschedule/header.jsp" %>



<%
	PortletURL newBatchRenderUrl =renderResponse.createRenderURL();
    newBatchRenderUrl.setParameter("jspPage" , Constants.ADD_BATCH);
%>

<aui:button value="Add New Batch" href="<%=newBatchRenderUrl.toString()%>">


</aui:button>

