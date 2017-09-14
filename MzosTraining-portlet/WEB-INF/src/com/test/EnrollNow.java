package com.test;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;

import com.liferay.portal.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.test.model.EnrollCourse;
import com.test.model.impl.EnrollCourseImpl;
import com.test.service.EnrollCourseLocalServiceUtil;

/**
 * Portlet implementation class EnrollNow
 */
public class EnrollNow extends MVCPortlet {
	
	@ProcessAction(name="addEnrollnow")
	public void addEnrollnow(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		String fname = ParamUtil.getString(actionRequest, "fullname");
	
		String gender = ParamUtil.getString(actionRequest, "gender");
		String email = ParamUtil.getString(actionRequest, "email");
		long    cnt = ParamUtil.getLong(actionRequest, "contact");
		String qual = ParamUtil.getString(actionRequest, "qualification");
	    String course = ParamUtil.getString(actionRequest, "coursename");
		String batch= ParamUtil.getString(actionRequest, "batch");
		String status = "On Hold";
		
	   EnrollCourse eobj=new EnrollCourseImpl();
		eobj.setEfName(fname);
		eobj.setEgen(gender);
		eobj.setEmail(email);
		eobj.setEcont(cnt);
		eobj.setEqual(qual);;
		eobj.setEcourse(course);
		eobj.setEbatch(batch);
		eobj.setEstatus(status);
		
		
			try {
				EnrollCourseLocalServiceUtil.addEnrollCourse(eobj);
			} catch (com.liferay.portal.kernel.exception.SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		
		
	}

}
