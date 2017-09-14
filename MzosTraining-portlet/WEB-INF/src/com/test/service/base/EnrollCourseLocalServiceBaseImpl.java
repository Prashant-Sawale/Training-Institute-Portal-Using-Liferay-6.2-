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
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.test.model.EnrollCourse;

import com.test.service.EnrollCourseLocalService;
import com.test.service.persistence.BatchSchedulePersistence;
import com.test.service.persistence.CoursesPersistence;
import com.test.service.persistence.EnrollCoursePersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the enroll course local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.test.service.impl.EnrollCourseLocalServiceImpl}.
 * </p>
 *
 * @author mzos
 * @see com.test.service.impl.EnrollCourseLocalServiceImpl
 * @see com.test.service.EnrollCourseLocalServiceUtil
 * @generated
 */
public abstract class EnrollCourseLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements EnrollCourseLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.test.service.EnrollCourseLocalServiceUtil} to access the enroll course local service.
	 */

	/**
	 * Adds the enroll course to the database. Also notifies the appropriate model listeners.
	 *
	 * @param enrollCourse the enroll course
	 * @return the enroll course that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public EnrollCourse addEnrollCourse(EnrollCourse enrollCourse)
		throws SystemException {
		enrollCourse.setNew(true);

		return enrollCoursePersistence.update(enrollCourse);
	}

	/**
	 * Creates a new enroll course with the primary key. Does not add the enroll course to the database.
	 *
	 * @param eId the primary key for the new enroll course
	 * @return the new enroll course
	 */
	@Override
	public EnrollCourse createEnrollCourse(long eId) {
		return enrollCoursePersistence.create(eId);
	}

	/**
	 * Deletes the enroll course with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param eId the primary key of the enroll course
	 * @return the enroll course that was removed
	 * @throws PortalException if a enroll course with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public EnrollCourse deleteEnrollCourse(long eId)
		throws PortalException, SystemException {
		return enrollCoursePersistence.remove(eId);
	}

	/**
	 * Deletes the enroll course from the database. Also notifies the appropriate model listeners.
	 *
	 * @param enrollCourse the enroll course
	 * @return the enroll course that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public EnrollCourse deleteEnrollCourse(EnrollCourse enrollCourse)
		throws SystemException {
		return enrollCoursePersistence.remove(enrollCourse);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(EnrollCourse.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return enrollCoursePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.EnrollCourseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return enrollCoursePersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.EnrollCourseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return enrollCoursePersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return enrollCoursePersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return enrollCoursePersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public EnrollCourse fetchEnrollCourse(long eId) throws SystemException {
		return enrollCoursePersistence.fetchByPrimaryKey(eId);
	}

	/**
	 * Returns the enroll course with the primary key.
	 *
	 * @param eId the primary key of the enroll course
	 * @return the enroll course
	 * @throws PortalException if a enroll course with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EnrollCourse getEnrollCourse(long eId)
		throws PortalException, SystemException {
		return enrollCoursePersistence.findByPrimaryKey(eId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return enrollCoursePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the enroll courses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.EnrollCourseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of enroll courses
	 * @param end the upper bound of the range of enroll courses (not inclusive)
	 * @return the range of enroll courses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EnrollCourse> getEnrollCourses(int start, int end)
		throws SystemException {
		return enrollCoursePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of enroll courses.
	 *
	 * @return the number of enroll courses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getEnrollCoursesCount() throws SystemException {
		return enrollCoursePersistence.countAll();
	}

	/**
	 * Updates the enroll course in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param enrollCourse the enroll course
	 * @return the enroll course that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public EnrollCourse updateEnrollCourse(EnrollCourse enrollCourse)
		throws SystemException {
		return enrollCoursePersistence.update(enrollCourse);
	}

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

		PersistedModelLocalServiceRegistryUtil.register("com.test.model.EnrollCourse",
			enrollCourseLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.test.model.EnrollCourse");
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
		return EnrollCourse.class;
	}

	protected String getModelClassName() {
		return EnrollCourse.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = enrollCoursePersistence.getDataSource();

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
	private EnrollCourseLocalServiceClpInvoker _clpInvoker = new EnrollCourseLocalServiceClpInvoker();
}