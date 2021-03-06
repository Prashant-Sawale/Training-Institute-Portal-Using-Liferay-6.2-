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
 * Provides a wrapper for {@link CoursesLocalService}.
 *
 * @author mzos
 * @see CoursesLocalService
 * @generated
 */
public class CoursesLocalServiceWrapper implements CoursesLocalService,
	ServiceWrapper<CoursesLocalService> {
	public CoursesLocalServiceWrapper(CoursesLocalService coursesLocalService) {
		_coursesLocalService = coursesLocalService;
	}

	/**
	* Adds the courses to the database. Also notifies the appropriate model listeners.
	*
	* @param courses the courses
	* @return the courses that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.Courses addCourses(com.test.model.Courses courses)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _coursesLocalService.addCourses(courses);
	}

	/**
	* Creates a new courses with the primary key. Does not add the courses to the database.
	*
	* @param cId the primary key for the new courses
	* @return the new courses
	*/
	@Override
	public com.test.model.Courses createCourses(long cId) {
		return _coursesLocalService.createCourses(cId);
	}

	/**
	* Deletes the courses with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cId the primary key of the courses
	* @return the courses that was removed
	* @throws PortalException if a courses with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.Courses deleteCourses(long cId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _coursesLocalService.deleteCourses(cId);
	}

	/**
	* Deletes the courses from the database. Also notifies the appropriate model listeners.
	*
	* @param courses the courses
	* @return the courses that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.Courses deleteCourses(com.test.model.Courses courses)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _coursesLocalService.deleteCourses(courses);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _coursesLocalService.dynamicQuery();
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
		return _coursesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.CoursesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _coursesLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.CoursesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _coursesLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _coursesLocalService.dynamicQueryCount(dynamicQuery);
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
		return _coursesLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.test.model.Courses fetchCourses(long cId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _coursesLocalService.fetchCourses(cId);
	}

	/**
	* Returns the courses with the primary key.
	*
	* @param cId the primary key of the courses
	* @return the courses
	* @throws PortalException if a courses with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.Courses getCourses(long cId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _coursesLocalService.getCourses(cId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _coursesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the courseses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.CoursesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of courseses
	* @param end the upper bound of the range of courseses (not inclusive)
	* @return the range of courseses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.test.model.Courses> getCourseses(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _coursesLocalService.getCourseses(start, end);
	}

	/**
	* Returns the number of courseses.
	*
	* @return the number of courseses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCoursesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _coursesLocalService.getCoursesesCount();
	}

	/**
	* Updates the courses in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param courses the courses
	* @return the courses that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.Courses updateCourses(com.test.model.Courses courses)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _coursesLocalService.updateCourses(courses);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _coursesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_coursesLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _coursesLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.test.model.Courses> findByfinder1(
		java.lang.String cCat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _coursesLocalService.findByfinder1(cCat);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CoursesLocalService getWrappedCoursesLocalService() {
		return _coursesLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCoursesLocalService(
		CoursesLocalService coursesLocalService) {
		_coursesLocalService = coursesLocalService;
	}

	@Override
	public CoursesLocalService getWrappedService() {
		return _coursesLocalService;
	}

	@Override
	public void setWrappedService(CoursesLocalService coursesLocalService) {
		_coursesLocalService = coursesLocalService;
	}

	private CoursesLocalService _coursesLocalService;
}