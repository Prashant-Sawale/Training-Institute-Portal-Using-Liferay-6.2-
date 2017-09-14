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

package com.test.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.test.model.EnrollCourse;

import java.util.List;

/**
 * The persistence utility for the enroll course service. This utility wraps {@link EnrollCoursePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mzos
 * @see EnrollCoursePersistence
 * @see EnrollCoursePersistenceImpl
 * @generated
 */
public class EnrollCourseUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(EnrollCourse enrollCourse) {
		getPersistence().clearCache(enrollCourse);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<EnrollCourse> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EnrollCourse> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EnrollCourse> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static EnrollCourse update(EnrollCourse enrollCourse)
		throws SystemException {
		return getPersistence().update(enrollCourse);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static EnrollCourse update(EnrollCourse enrollCourse,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(enrollCourse, serviceContext);
	}

	/**
	* Caches the enroll course in the entity cache if it is enabled.
	*
	* @param enrollCourse the enroll course
	*/
	public static void cacheResult(com.test.model.EnrollCourse enrollCourse) {
		getPersistence().cacheResult(enrollCourse);
	}

	/**
	* Caches the enroll courses in the entity cache if it is enabled.
	*
	* @param enrollCourses the enroll courses
	*/
	public static void cacheResult(
		java.util.List<com.test.model.EnrollCourse> enrollCourses) {
		getPersistence().cacheResult(enrollCourses);
	}

	/**
	* Creates a new enroll course with the primary key. Does not add the enroll course to the database.
	*
	* @param eId the primary key for the new enroll course
	* @return the new enroll course
	*/
	public static com.test.model.EnrollCourse create(long eId) {
		return getPersistence().create(eId);
	}

	/**
	* Removes the enroll course with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param eId the primary key of the enroll course
	* @return the enroll course that was removed
	* @throws com.test.NoSuchEnrollCourseException if a enroll course with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.EnrollCourse remove(long eId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchEnrollCourseException {
		return getPersistence().remove(eId);
	}

	public static com.test.model.EnrollCourse updateImpl(
		com.test.model.EnrollCourse enrollCourse)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(enrollCourse);
	}

	/**
	* Returns the enroll course with the primary key or throws a {@link com.test.NoSuchEnrollCourseException} if it could not be found.
	*
	* @param eId the primary key of the enroll course
	* @return the enroll course
	* @throws com.test.NoSuchEnrollCourseException if a enroll course with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.EnrollCourse findByPrimaryKey(long eId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchEnrollCourseException {
		return getPersistence().findByPrimaryKey(eId);
	}

	/**
	* Returns the enroll course with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param eId the primary key of the enroll course
	* @return the enroll course, or <code>null</code> if a enroll course with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.EnrollCourse fetchByPrimaryKey(long eId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(eId);
	}

	/**
	* Returns all the enroll courses.
	*
	* @return the enroll courses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.EnrollCourse> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.test.model.EnrollCourse> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the enroll courses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.EnrollCourseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of enroll courses
	* @param end the upper bound of the range of enroll courses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of enroll courses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.EnrollCourse> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the enroll courses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of enroll courses.
	*
	* @return the number of enroll courses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static EnrollCoursePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EnrollCoursePersistence)PortletBeanLocatorUtil.locate(com.test.service.ClpSerializer.getServletContextName(),
					EnrollCoursePersistence.class.getName());

			ReferenceRegistry.registerReference(EnrollCourseUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(EnrollCoursePersistence persistence) {
	}

	private static EnrollCoursePersistence _persistence;
}