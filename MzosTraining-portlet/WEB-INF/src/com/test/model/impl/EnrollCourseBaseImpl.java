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

package com.test.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.test.model.EnrollCourse;

import com.test.service.EnrollCourseLocalServiceUtil;

/**
 * The extended model base implementation for the EnrollCourse service. Represents a row in the &quot;mz_EnrollCourse&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EnrollCourseImpl}.
 * </p>
 *
 * @author mzos
 * @see EnrollCourseImpl
 * @see com.test.model.EnrollCourse
 * @generated
 */
public abstract class EnrollCourseBaseImpl extends EnrollCourseModelImpl
	implements EnrollCourse {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a enroll course model instance should use the {@link EnrollCourse} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EnrollCourseLocalServiceUtil.addEnrollCourse(this);
		}
		else {
			EnrollCourseLocalServiceUtil.updateEnrollCourse(this);
		}
	}
}