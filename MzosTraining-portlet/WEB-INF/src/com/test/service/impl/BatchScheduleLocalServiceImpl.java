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

import com.test.service.base.BatchScheduleLocalServiceBaseImpl;
import com.test.service.persistence.BatchScheduleUtil;
import com.test.service.persistence.CoursesUtil;

/**
 * The implementation of the batch schedule local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.test.service.BatchScheduleLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author mzos
 * @see com.test.service.base.BatchScheduleLocalServiceBaseImpl
 * @see com.test.service.BatchScheduleLocalServiceUtil
 */
public class BatchScheduleLocalServiceImpl
	extends BatchScheduleLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.test.service.BatchScheduleLocalServiceUtil} to access the batch schedule local service.
	 */
	public java.util.List<com.test.model.BatchSchedule> findByfinder2(String bcCat) 
			throws com.liferay.portal.kernel.exception.SystemException {
			return BatchScheduleUtil.findByfinder2(bcCat);
		}
	
}