package com.test;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletURL;
import javax.portlet.ProcessAction;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.test.model.impl.BatchScheduleImpl;
import com.test.service.BatchScheduleLocalServiceUtil;

/**
 * Portlet implementation class BatchSchedule
 */
public class BatchSchedule extends MVCPortlet 
{
  
	@ProcessAction(name="addBatch")
	
	public void addBatch(ActionRequest actionRequest,ActionResponse actionResponse) throws IOException, PortletException 
	{
	  
	  
       com.test.model.BatchSchedule Batch =new BatchScheduleImpl();
       String BatchName  = ParamUtil.getString(actionRequest, "batchName");
       Batch.setBatchName(BatchName);
       
       
		
       String TeacherName  = ParamUtil.getString(actionRequest, "teacherName");
		Batch.setBatchteacher(TeacherName);
		
		String cat =ParamUtil.getString(actionRequest, "courseCategory");
		Batch.setBatchcCat(cat);
		
		String BatchTime  = ParamUtil.getString(actionRequest, "batchTime");
		Batch.setBatchTime(BatchTime);
		
		String BatchDay  = ParamUtil.getString(actionRequest, "batchDay");
		Batch.setBatchDay(BatchDay);
		
		
		try 
		{
			BatchScheduleLocalServiceUtil.addBatchSchedule(Batch);
		} 
		catch (SystemException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String b=actionRequest.getParameter("batchName");
		System.out.println("Mzos Wala batch schedule add");
		System.out.println(""+b);
		
    	
	}//addBatchMethod


	
	
	
	
}//main Class
