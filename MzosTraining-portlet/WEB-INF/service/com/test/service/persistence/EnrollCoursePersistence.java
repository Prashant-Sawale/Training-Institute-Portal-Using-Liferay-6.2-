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

import com.liferay.portal.service.persistence.BasePersistence;

import com.test.model.EnrollCourse;

/**
 * The persistence interface for the enroll course service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mzos
 * @see EnrollCoursePersistenceImpl
 * @see EnrollCourseUtil
 * @generated
 */
public interface EnrollCoursePersistence extends BasePersistence<EnrollCourse> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EnrollCourseUtil} to access the enroll course persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the enroll course in the entity cache if it is enabled.
	*
	* @param enrollCourse the enroll course
	*/
	public void cacheResult(com.test.model.EnrollCourse enrollCourse);

	/**
	* Caches the enroll courses in the entity cache if it is enabled.
	*
	* @param enrollCourses the enroll courses
	*/
	public void cacheResult(
		java.util.List<com.test.model.EnrollCourse> enrollCourses);

	/**
	* Creates a new enroll course with the primary key. Does not add the enroll course to the database.
	*
	* @param eId the primary key for the new enroll course
	* @return the new enroll course
	*/
	public com.test.model.EnrollCourse create(long eId);

	/**
	* Removes the enroll course with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param eId the primary key of the enroll course
	* @return the enroll course that was removed
	* @throws com.test.NoSuchEnrollCourseException if a enroll course with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.EnrollCourse remove(long eId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchEnrollCourseException;

	public com.test.model.EnrollCourse updateImpl(
		com.test.model.EnrollCourse enrollCourse)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the enroll course with the primary key or throws a {@link com.test.NoSuchEnrollCourseException} if it could not be found.
	*
	* @param eId the primary key of the enroll course
	* @return the enroll course
	* @throws com.test.NoSuchEnrollCourseException if a enroll course with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.EnrollCourse findByPrimaryKey(long eId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchEnrollCourseException;

	/**
	* Returns the enroll course with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param eId the primary key of the enroll course
	* @return the enroll course, or <code>null</code> if a enroll course with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.EnrollCourse fetchByPrimaryKey(long eId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the enroll courses.
	*
	* @return the enroll courses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.EnrollCourse> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.test.model.EnrollCourse> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.test.model.EnrollCourse> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the enroll courses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of enroll courses.
	*
	* @return the number of enroll courses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}