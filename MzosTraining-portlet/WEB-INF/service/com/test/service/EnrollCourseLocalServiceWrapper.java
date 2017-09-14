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

package com.test.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EnrollCourseLocalService}.
 *
 * @author mzos
 * @see EnrollCourseLocalService
 * @generated
 */
public class EnrollCourseLocalServiceWrapper implements EnrollCourseLocalService,
	ServiceWrapper<EnrollCourseLocalService> {
	public EnrollCourseLocalServiceWrapper(
		EnrollCourseLocalService enrollCourseLocalService) {
		_enrollCourseLocalService = enrollCourseLocalService;
	}

	/**
	* Adds the enroll course to the database. Also notifies the appropriate model listeners.
	*
	* @param enrollCourse the enroll course
	* @return the enroll course that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.EnrollCourse addEnrollCourse(
		com.test.model.EnrollCourse enrollCourse)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _enrollCourseLocalService.addEnrollCourse(enrollCourse);
	}

	/**
	* Creates a new enroll course with the primary key. Does not add the enroll course to the database.
	*
	* @param eId the primary key for the new enroll course
	* @return the new enroll course
	*/
	@Override
	public com.test.model.EnrollCourse createEnrollCourse(long eId) {
		return _enrollCourseLocalService.createEnrollCourse(eId);
	}

	/**
	* Deletes the enroll course with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param eId the primary key of the enroll course
	* @return the enroll course that was removed
	* @throws PortalException if a enroll course with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.EnrollCourse deleteEnrollCourse(long eId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _enrollCourseLocalService.deleteEnrollCourse(eId);
	}

	/**
	* Deletes the enroll course from the database. Also notifies the appropriate model listeners.
	*
	* @param enrollCourse the enroll course
	* @return the enroll course that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.EnrollCourse deleteEnrollCourse(
		com.test.model.EnrollCourse enrollCourse)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _enrollCourseLocalService.deleteEnrollCourse(enrollCourse);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _enrollCourseLocalService.dynamicQuery();
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _enrollCourseLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _enrollCourseLocalService.dynamicQuery(dynamicQuery, start, end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _enrollCourseLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _enrollCourseLocalService.dynamicQueryCount(dynamicQuery);
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
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _enrollCourseLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.test.model.EnrollCourse fetchEnrollCourse(long eId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _enrollCourseLocalService.fetchEnrollCourse(eId);
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
	public com.test.model.EnrollCourse getEnrollCourse(long eId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _enrollCourseLocalService.getEnrollCourse(eId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _enrollCourseLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.test.model.EnrollCourse> getEnrollCourses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _enrollCourseLocalService.getEnrollCourses(start, end);
	}

	/**
	* Returns the number of enroll courses.
	*
	* @return the number of enroll courses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEnrollCoursesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _enrollCourseLocalService.getEnrollCoursesCount();
	}

	/**
	* Updates the enroll course in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param enrollCourse the enroll course
	* @return the enroll course that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.EnrollCourse updateEnrollCourse(
		com.test.model.EnrollCourse enrollCourse)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _enrollCourseLocalService.updateEnrollCourse(enrollCourse);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _enrollCourseLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_enrollCourseLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _enrollCourseLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EnrollCourseLocalService getWrappedEnrollCourseLocalService() {
		return _enrollCourseLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEnrollCourseLocalService(
		EnrollCourseLocalService enrollCourseLocalService) {
		_enrollCourseLocalService = enrollCourseLocalService;
	}

	@Override
	public EnrollCourseLocalService getWrappedService() {
		return _enrollCourseLocalService;
	}

	@Override
	public void setWrappedService(
		EnrollCourseLocalService enrollCourseLocalService) {
		_enrollCourseLocalService = enrollCourseLocalService;
	}

	private EnrollCourseLocalService _enrollCourseLocalService;
}