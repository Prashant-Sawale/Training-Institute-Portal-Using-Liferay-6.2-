package com.test;

import java.io.IOException;
//import java.util.ArrayList;


import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
//import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import com.test.model.Courses;
import com.test.model.impl.CoursesImpl;
import com.test.service.CoursesLocalServiceUtil;

/**
 * Portlet implementation class AddCourse
 */
public class AddCourse extends MVCPortlet {
	
 @Override
public void init() throws PortletException {
	// TODO Auto-generated method stub
	super.init();
}
 
 @Override
	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		// TODO Auto-generated method stub
		super.render(request, response);
	}
 
 @Override
	public void processAction(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.processAction(actionRequest, actionResponse);
	}
 
 @ProcessAction(name ="addCourseMethod")
	public void addCourseMethod(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
	    String cname = ParamUtil.getString(actionRequest, "course_name");
	    String ccat = ParamUtil.getString(actionRequest, "course_cat");
		String cdesc = ParamUtil.getString(actionRequest, "course_desc");
		String cpreq = ParamUtil.getString(actionRequest, "course_preq");
		int cduration = ParamUtil.getInteger(actionRequest, "course_duration");
		
		
		Courses cobject = new CoursesImpl();
		cobject.setCName(cname);
		cobject.setCCat(ccat);
		cobject.setCDesc(cdesc);
		cobject.setCDuration(cduration);
		cobject.setCPreq(cpreq);
		try {
			CoursesLocalServiceUtil.addCourses(cobject);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

 

}
