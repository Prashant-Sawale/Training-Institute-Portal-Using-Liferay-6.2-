/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.test.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.test.model.Courses;
import com.test.service.base.CoursesLocalServiceBaseImpl;
import com.test.service.persistence.CoursesUtil;

/**
 * The implementation of the courses local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.test.service.CoursesLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author mzos
 * @see com.test.service.base.CoursesLocalServiceBaseImpl
 * @see com.test.service.CoursesLocalServiceUtil
 */
public class CoursesLocalServiceImpl extends CoursesLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.test.service.CoursesLocalServiceUtil} to access the courses local service.
	 */
	public java.util.List<com.test.model.Courses> findByfinder1(String cCat)
			throws com.liferay.portal.kernel.exception.SystemException {
			return CoursesUtil.findByfinder1(cCat);
		}
	
	
	
	

	
}