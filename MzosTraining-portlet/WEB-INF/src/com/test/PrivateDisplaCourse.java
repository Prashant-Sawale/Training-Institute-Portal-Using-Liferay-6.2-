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
import com.test.model.Courses;
import com.test.service.CoursesLocalServiceUtil;

/**
 * Portlet implementation class PrivateDisplaCourse
 */
public class PrivateDisplaCourse extends MVCPortlet {
 
	@ProcessAction(name ="deleteCourseMethod")
	public void deleteCourseMethod(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
	    long cid = ParamUtil.getLong(actionRequest, "cid");
		//System.out.println("i am in delete method");
	    if (cid > 0) { 
				try {
					CoursesLocalServiceUtil.deleteCourses(cid);
				} catch (PortalException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	    }
	}
	
	@ProcessAction(name ="editCourseMethod")
	public void editCourseMethod(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		long cid = ParamUtil.getLong(actionRequest, "course_id");
		String cName = ParamUtil.getString(actionRequest, "course_name");
		String cCat = ParamUtil.getString(actionRequest, "course_cat");
		String cDesc = ParamUtil.getString(actionRequest, "course_desc");
		String cPreq = ParamUtil.getString(actionRequest, "course_preq");
		int cDuration = ParamUtil.getInteger(actionRequest, "course_duration");
		
		Courses tdd = null;
		try { 
			tdd = CoursesLocalServiceUtil.fetchCourses(cid); 
		} catch (SystemException e)
		{
			e.printStackTrace(); 
		}

		if (Validator.isNotNull(tdd)) 
		{ 

			tdd.setCName(cName);
			tdd.setCCat(cCat);
			tdd.setCDesc(cDesc);
			tdd.setCPreq(cPreq);
			tdd.setCDuration(cDuration);

			try {
				CoursesLocalServiceUtil.updateCourses(tdd); 
			}
			catch (SystemException e) 
			{ e.printStackTrace(); } 
		}


	}


}
