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

import com.test.model.Courses;

import java.util.List;

/**
 * The persistence utility for the courses service. This utility wraps {@link CoursesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mzos
 * @see CoursesPersistence
 * @see CoursesPersistenceImpl
 * @generated
 */
public class CoursesUtil {
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
	public static void clearCache(Courses courses) {
		getPersistence().clearCache(courses);
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
	public static List<Courses> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Courses> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Courses> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Courses update(Courses courses) throws SystemException {
		return getPersistence().update(courses);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Courses update(Courses courses, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(courses, serviceContext);
	}

	/**
	* Returns all the courseses where cCat = &#63;.
	*
	* @param cCat the c cat
	* @return the matching courseses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Courses> findByfinder1(
		java.lang.String cCat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfinder1(cCat);
	}

	/**
	* Returns a range of all the courseses where cCat = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.CoursesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cCat the c cat
	* @param start the lower bound of the range of courseses
	* @param end the upper bound of the range of courseses (not inclusive)
	* @return the range of matching courseses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Courses> findByfinder1(
		java.lang.String cCat, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfinder1(cCat, start, end);
	}

	/**
	* Returns an ordered range of all the courseses where cCat = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.CoursesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cCat the c cat
	* @param start the lower bound of the range of courseses
	* @param end the upper bound of the range of courseses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching courseses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Courses> findByfinder1(
		java.lang.String cCat, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfinder1(cCat, start, end, orderByComparator);
	}

	/**
	* Returns the first courses in the ordered set where cCat = &#63;.
	*
	* @param cCat the c cat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching courses
	* @throws com.test.NoSuchCoursesException if a matching courses could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Courses findByfinder1_First(
		java.lang.String cCat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchCoursesException {
		return getPersistence().findByfinder1_First(cCat, orderByComparator);
	}

	/**
	* Returns the first courses in the ordered set where cCat = &#63;.
	*
	* @param cCat the c cat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching courses, or <code>null</code> if a matching courses could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Courses fetchByfinder1_First(
		java.lang.String cCat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByfinder1_First(cCat, orderByComparator);
	}

	/**
	* Returns the last courses in the ordered set where cCat = &#63;.
	*
	* @param cCat the c cat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching courses
	* @throws com.test.NoSuchCoursesException if a matching courses could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Courses findByfinder1_Last(
		java.lang.String cCat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchCoursesException {
		return getPersistence().findByfinder1_Last(cCat, orderByComparator);
	}

	/**
	* Returns the last courses in the ordered set where cCat = &#63;.
	*
	* @param cCat the c cat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching courses, or <code>null</code> if a matching courses could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Courses fetchByfinder1_Last(
		java.lang.String cCat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByfinder1_Last(cCat, orderByComparator);
	}

	/**
	* Returns the courseses before and after the current courses in the ordered set where cCat = &#63;.
	*
	* @param cId the primary key of the current courses
	* @param cCat the c cat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next courses
	* @throws com.test.NoSuchCoursesException if a courses with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Courses[] findByfinder1_PrevAndNext(long cId,
		java.lang.String cCat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchCoursesException {
		return getPersistence()
				   .findByfinder1_PrevAndNext(cId, cCat, orderByComparator);
	}

	/**
	* Removes all the courseses where cCat = &#63; from the database.
	*
	* @param cCat the c cat
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByfinder1(java.lang.String cCat)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByfinder1(cCat);
	}

	/**
	* Returns the number of courseses where cCat = &#63;.
	*
	* @param cCat the c cat
	* @return the number of matching courseses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfinder1(java.lang.String cCat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByfinder1(cCat);
	}

	/**
	* Caches the courses in the entity cache if it is enabled.
	*
	* @param courses the courses
	*/
	public static void cacheResult(com.test.model.Courses courses) {
		getPersistence().cacheResult(courses);
	}

	/**
	* Caches the courseses in the entity cache if it is enabled.
	*
	* @param courseses the courseses
	*/
	public static void cacheResult(
		java.util.List<com.test.model.Courses> courseses) {
		getPersistence().cacheResult(courseses);
	}

	/**
	* Creates a new courses with the primary key. Does not add the courses to the database.
	*
	* @param cId the primary key for the new courses
	* @return the new courses
	*/
	public static com.test.model.Courses create(long cId) {
		return getPersistence().create(cId);
	}

	/**
	* Removes the courses with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cId the primary key of the courses
	* @return the courses that was removed
	* @throws com.test.NoSuchCoursesException if a courses with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Courses remove(long cId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchCoursesException {
		return getPersistence().remove(cId);
	}

	public static com.test.model.Courses updateImpl(
		com.test.model.Courses courses)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(courses);
	}

	/**
	* Returns the courses with the primary key or throws a {@link com.test.NoSuchCoursesException} if it could not be found.
	*
	* @param cId the primary key of the courses
	* @return the courses
	* @throws com.test.NoSuchCoursesException if a courses with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Courses findByPrimaryKey(long cId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchCoursesException {
		return getPersistence().findByPrimaryKey(cId);
	}

	/**
	* Returns the courses with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cId the primary key of the courses
	* @return the courses, or <code>null</code> if a courses with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Courses fetchByPrimaryKey(long cId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(cId);
	}

	/**
	* Returns all the courseses.
	*
	* @return the courseses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Courses> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.test.model.Courses> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the courseses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.CoursesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of courseses
	* @param end the upper bound of the range of courseses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of courseses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Courses> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the courseses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of courseses.
	*
	* @return the number of courseses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CoursesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CoursesPersistence)PortletBeanLocatorUtil.locate(com.test.service.ClpSerializer.getServletContextName(),
					CoursesPersistence.class.getName());

			ReferenceRegistry.registerReference(CoursesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CoursesPersistence persistence) {
	}

	private static CoursesPersistence _persistence;
}