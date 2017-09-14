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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for EnrollCourse. This utility wraps
 * {@link com.test.service.impl.EnrollCourseLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author mzos
 * @see EnrollCourseLocalService
 * @see com.test.service.base.EnrollCourseLocalServiceBaseImpl
 * @see com.test.service.impl.EnrollCourseLocalServiceImpl
 * @generated
 */
public class EnrollCourseLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.test.service.impl.EnrollCourseLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the enroll course to the database. Also notifies the appropriate model listeners.
	*
	* @param enrollCourse the enroll course
	* @return the enroll course that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.EnrollCourse addEnrollCourse(
		com.test.model.EnrollCourse enrollCourse)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addEnrollCourse(enrollCourse);
	}

	/**
	* Creates a new enroll course with the primary key. Does not add the enroll course to the database.
	*
	* @param eId the primary key for the new enroll course
	* @return the new enroll course
	*/
	public static com.test.model.EnrollCourse createEnrollCourse(long eId) {
		return getService().createEnrollCourse(eId);
	}

	/**
	* Deletes the enroll course with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param eId the primary key of the enroll course
	* @return the enroll course that was removed
	* @throws PortalException if a enroll course with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.EnrollCourse deleteEnrollCourse(long eId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEnrollCourse(eId);
	}

	/**
	* Deletes the enroll course from the database. Also notifies the appropriate model listeners.
	*
	* @param enrollCourse the enroll course
	* @return the enroll course that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.EnrollCourse deleteEnrollCourse(
		com.test.model.EnrollCourse enrollCourse)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEnrollCourse(enrollCourse);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.test.model.EnrollCourse fetchEnrollCourse(long eId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchEnrollCourse(eId);
	}

	/**
	* Returns the enroll course with the primary key.
	*
	* @param eId the primary key of the enroll course
	* @return the enroll course
	* @throws PortalException if a enroll course with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.EnrollCourse getEnrollCourse(long eId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getEnrollCourse(eId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.test.model.EnrollCourse> getEnrollCourses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEnrollCourses(start, end);
	}

	/**
	* Returns the number of enroll courses.
	*
	* @return the number of enroll courses
	* @throws SystemException if a system exception occurred
	*/
	public static int getEnrollCoursesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEnrollCoursesCount();
	}

	/**
	* Updates the enroll course in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param enrollCourse the enroll course
	* @return the enroll course that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.EnrollCourse updateEnrollCourse(
		com.test.model.EnrollCourse enrollCourse)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateEnrollCourse(enrollCourse);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static EnrollCourseLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					EnrollCourseLocalService.class.getName());

			if (invokableLocalService instanceof EnrollCourseLocalService) {
				_service = (EnrollCourseLocalService)invokableLocalService;
			}
			else {
				_service = new EnrollCourseLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(EnrollCourseLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(EnrollCourseLocalService service) {
	}

	private static EnrollCourseLocalService _service;
}