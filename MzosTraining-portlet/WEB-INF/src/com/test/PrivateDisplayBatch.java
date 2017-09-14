package com.test;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.test.service.BatchScheduleLocalServiceUtil;

/**
 * Portlet implementation class PrivateDisplayBatch
 */
public class PrivateDisplayBatch extends MVCPortlet {
	@ProcessAction(name="editBatch")
	public void editBatch(ActionRequest actionRequest,ActionResponse actionResponse) throws IOException, PortletException 
	{
		// TODO Auto-generated method stub
		System.out.println("im in eddit method");

		long batch_id =ParamUtil.getLong(actionRequest, "batch_id");

		String batch_name=ParamUtil.getString(actionRequest, "batchName");

		String teacher_name=ParamUtil.getString(actionRequest, "teacherName");

		String cource_category=ParamUtil.getString(actionRequest, "courseCategory");

		String batch_time=ParamUtil.getString(actionRequest, "batchTime");

		String batch_day=ParamUtil.getString(actionRequest, "batchDay");

		com.test.model.BatchSchedule obj=null;


		try 
		{
			obj=BatchScheduleLocalServiceUtil.fetchBatchSchedule(batch_id);
		} 
		catch (SystemException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}



		if(Validator.isNotNull(obj))
		{
			obj.setBatchName(batch_name);
			obj.setBatchteacher(teacher_name);
			obj.setBatchcCat(cource_category);
			obj.setBatchTime(batch_time);
			obj.setBatchDay(batch_day);

			try 
			{
				BatchScheduleLocalServiceUtil.updateBatchSchedule(obj);
			} 
			catch (SystemException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}//editBatch Method

	@ProcessAction (name = "deleteBatch")
	public void deleteDemoMethod(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException 
	{
		long batch_id = ParamUtil.getLong(actionRequest, "BatchId");
		if (batch_id > 0) 
		{ 
			try 
			{
				try 
				{
					BatchScheduleLocalServiceUtil.deleteBatchSchedule(batch_id);
				} 
				catch (SystemException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
			catch (PortalException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}//end of if  



	}//Delete Batch Method


}
