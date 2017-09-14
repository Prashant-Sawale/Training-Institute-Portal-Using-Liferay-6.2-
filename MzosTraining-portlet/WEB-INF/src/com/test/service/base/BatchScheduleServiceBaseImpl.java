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

package com.test.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import com.test.model.BatchSchedule;

import com.test.service.BatchScheduleService;
import com.test.service.persistence.BatchSchedulePersistence;
import com.test.service.persistence.CoursesPersistence;
import com.test.service.persistence.EnrollCoursePersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the batch schedule remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.test.service.impl.BatchScheduleServiceImpl}.
 * </p>
 *
 * @author mzos
 * @see com.test.service.impl.BatchScheduleServiceImpl
 * @see com.test.service.BatchScheduleServiceUtil
 * @generated
 */
public abstract class BatchScheduleServiceBaseImpl extends BaseServiceImpl
	implements BatchScheduleService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.test.service.BatchScheduleServiceUtil} to access the batch schedule remote service.
	 */

	/**
	 * Returns the batch schedule local service.
	 *
	 * @return the batch schedule local service
	 */
	public com.test.service.BatchScheduleLocalService getBatchScheduleLocalService() {
		return batchScheduleLocalService;
	}

	/**
	 * Sets the batch schedule local service.
	 *
	 * @param batchScheduleLocalService the batch schedule local service
	 */
	public void setBatchScheduleLocalService(
		com.test.service.BatchScheduleLocalService batchScheduleLocalService) {
		this.batchScheduleLocalService = batchScheduleLocalService;
	}

	/**
	 * Returns the batch schedule remote service.
	 *
	 * @return the batch schedule remote service
	 */
	public com.test.service.BatchScheduleService getBatchScheduleService() {
		return batchScheduleService;
	}

	/**
	 * Sets the batch schedule remote service.
	 *
	 * @param batchScheduleService the batch schedule remote service
	 */
	public void setBatchScheduleService(
		com.test.service.BatchScheduleService batchScheduleService) {
		this.batchScheduleService = batchScheduleService;
	}

	/**
	 * Returns the batch schedule persistence.
	 *
	 * @return the batch schedule persistence
	 */
	public BatchSchedulePersistence getBatchSchedulePersistence() {
		return batchSchedulePersistence;
	}

	/**
	 * Sets the batch schedule persistence.
	 *
	 * @param batchSchedulePersistence the batch schedule persistence
	 */
	public void setBatchSchedulePersistence(
		BatchSchedulePersistence batchSchedulePersistence) {
		this.batchSchedulePersistence = batchSchedulePersistence;
	}

	/**
	 * Returns the courses local service.
	 *
	 * @return the courses local service
	 */
	public com.test.service.CoursesLocalService getCoursesLocalService() {
		return coursesLocalService;
	}

	/**
	 * Sets the courses local service.
	 *
	 * @param coursesLocalService the courses local service
	 */
	public void setCoursesLocalService(
		com.test.service.CoursesLocalService coursesLocalService) {
		this.coursesLocalService = coursesLocalService;
	}

	/**
	 * Returns the courses remote service.
	 *
	 * @return the courses remote service
	 */
	public com.test.service.CoursesService getCoursesService() {
		return coursesService;
	}

	/**
	 * Sets the courses remote service.
	 *
	 * @param coursesService the courses remote service
	 */
	public void setCoursesService(
		com.test.service.CoursesService coursesService) {
		this.coursesService = coursesService;
	}

	/**
	 * Returns the courses persistence.
	 *
	 * @return the courses persistence
	 */
	public CoursesPersistence getCoursesPersistence() {
		return coursesPersistence;
	}

	/**
	 * Sets the courses persistence.
	 *
	 * @param coursesPersistence the courses persistence
	 */
	public void setCoursesPersistence(CoursesPersistence coursesPersistence) {
		this.coursesPersistence = coursesPersistence;
	}

	/**
	 * Returns the enroll course local service.
	 *
	 * @return the enroll course local service
	 */
	public com.test.service.EnrollCourseLocalService getEnrollCourseLocalService() {
		return enrollCourseLocalService;
	}

	/**
	 * Sets the enroll course local service.
	 *
	 * @param enrollCourseLocalService the enroll course local service
	 */
	public void setEnrollCourseLocalService(
		com.test.service.EnrollCourseLocalService enrollCourseLocalService) {
		this.enrollCourseLocalService = enrollCourseLocalService;
	}

	/**
	 * Returns the enroll course remote service.
	 *
	 * @return the enroll course remote service
	 */
	public com.test.service.EnrollCourseService getEnrollCourseService() {
		return enrollCourseService;
	}

	/**
	 * Sets the enroll course remote service.
	 *
	 * @param enrollCourseService the enroll course remote service
	 */
	public void setEnrollCourseService(
		com.test.service.EnrollCourseService enrollCourseService) {
		this.enrollCourseService = enrollCourseService;
	}

	/**
	 * Returns the enroll course persistence.
	 *
	 * @return the enroll course persistence
	 */
	public EnrollCoursePersistence getEnrollCoursePersistence() {
		return enrollCoursePersistence;
	}

	/**
	 * Sets the enroll course persistence.
	 *
	 * @param enrollCoursePersistence the enroll course persistence
	 */
	public void setEnrollCoursePersistence(
		EnrollCoursePersistence enrollCoursePersistence) {
		this.enrollCoursePersistence = enrollCoursePersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return BatchSchedule.class;
	}

	protected String getModelClassName() {
		return BatchSchedule.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = batchSchedulePersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.test.service.BatchScheduleLocalService.class)
	protected com.test.service.BatchScheduleLocalService batchScheduleLocalService;
	@BeanReference(type = com.test.service.BatchScheduleService.class)
	protected com.test.service.BatchScheduleService batchScheduleService;
	@BeanReference(type = BatchSchedulePersistence.class)
	protected BatchSchedulePersistence batchSchedulePersistence;
	@BeanReference(type = com.test.service.CoursesLocalService.class)
	protected com.test.service.CoursesLocalService coursesLocalService;
	@BeanReference(type = com.test.service.CoursesService.class)
	protected com.test.service.CoursesService coursesService;
	@BeanReference(type = CoursesPersistence.class)
	protected CoursesPersistence coursesPersistence;
	@BeanReference(type = com.test.service.EnrollCourseLocalService.class)
	protected com.test.service.EnrollCourseLocalService enrollCourseLocalService;
	@BeanReference(type = com.test.service.EnrollCourseService.class)
	protected com.test.service.EnrollCourseService enrollCourseService;
	@BeanReference(type = EnrollCoursePersistence.class)
	protected EnrollCoursePersistence enrollCoursePersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private BatchScheduleServiceClpInvoker _clpInvoker = new BatchScheduleServiceClpInvoker();
}