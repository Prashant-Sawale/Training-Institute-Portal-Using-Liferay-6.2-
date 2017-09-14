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

import com.test.model.BatchSchedule;

import java.util.List;

/**
 * The persistence utility for the batch schedule service. This utility wraps {@link BatchSchedulePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mzos
 * @see BatchSchedulePersistence
 * @see BatchSchedulePersistenceImpl
 * @generated
 */
public class BatchScheduleUtil {
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
	public static void clearCache(BatchSchedule batchSchedule) {
		getPersistence().clearCache(batchSchedule);
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
	public static List<BatchSchedule> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BatchSchedule> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BatchSchedule> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static BatchSchedule update(BatchSchedule batchSchedule)
		throws SystemException {
		return getPersistence().update(batchSchedule);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static BatchSchedule update(BatchSchedule batchSchedule,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(batchSchedule, serviceContext);
	}

	/**
	* Returns all the batch schedules where batchcCat = &#63;.
	*
	* @param batchcCat the batchc cat
	* @return the matching batch schedules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.BatchSchedule> findByfinder2(
		java.lang.String batchcCat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfinder2(batchcCat);
	}

	/**
	* Returns a range of all the batch schedules where batchcCat = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.BatchScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param batchcCat the batchc cat
	* @param start the lower bound of the range of batch schedules
	* @param end the upper bound of the range of batch schedules (not inclusive)
	* @return the range of matching batch schedules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.BatchSchedule> findByfinder2(
		java.lang.String batchcCat, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfinder2(batchcCat, start, end);
	}

	/**
	* Returns an ordered range of all the batch schedules where batchcCat = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.BatchScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param batchcCat the batchc cat
	* @param start the lower bound of the range of batch schedules
	* @param end the upper bound of the range of batch schedules (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching batch schedules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.BatchSchedule> findByfinder2(
		java.lang.String batchcCat, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfinder2(batchcCat, start, end, orderByComparator);
	}

	/**
	* Returns the first batch schedule in the ordered set where batchcCat = &#63;.
	*
	* @param batchcCat the batchc cat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching batch schedule
	* @throws com.test.NoSuchBatchScheduleException if a matching batch schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.BatchSchedule findByfinder2_First(
		java.lang.String batchcCat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchBatchScheduleException {
		return getPersistence().findByfinder2_First(batchcCat, orderByComparator);
	}

	/**
	* Returns the first batch schedule in the ordered set where batchcCat = &#63;.
	*
	* @param batchcCat the batchc cat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching batch schedule, or <code>null</code> if a matching batch schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.BatchSchedule fetchByfinder2_First(
		java.lang.String batchcCat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfinder2_First(batchcCat, orderByComparator);
	}

	/**
	* Returns the last batch schedule in the ordered set where batchcCat = &#63;.
	*
	* @param batchcCat the batchc cat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching batch schedule
	* @throws com.test.NoSuchBatchScheduleException if a matching batch schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.BatchSchedule findByfinder2_Last(
		java.lang.String batchcCat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchBatchScheduleException {
		return getPersistence().findByfinder2_Last(batchcCat, orderByComparator);
	}

	/**
	* Returns the last batch schedule in the ordered set where batchcCat = &#63;.
	*
	* @param batchcCat the batchc cat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching batch schedule, or <code>null</code> if a matching batch schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.BatchSchedule fetchByfinder2_Last(
		java.lang.String batchcCat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByfinder2_Last(batchcCat, orderByComparator);
	}

	/**
	* Returns the batch schedules before and after the current batch schedule in the ordered set where batchcCat = &#63;.
	*
	* @param BatchSchedule_Id the primary key of the current batch schedule
	* @param batchcCat the batchc cat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next batch schedule
	* @throws com.test.NoSuchBatchScheduleException if a batch schedule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.BatchSchedule[] findByfinder2_PrevAndNext(
		long BatchSchedule_Id, java.lang.String batchcCat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchBatchScheduleException {
		return getPersistence()
				   .findByfinder2_PrevAndNext(BatchSchedule_Id, batchcCat,
			orderByComparator);
	}

	/**
	* Removes all the batch schedules where batchcCat = &#63; from the database.
	*
	* @param batchcCat the batchc cat
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByfinder2(java.lang.String batchcCat)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByfinder2(batchcCat);
	}

	/**
	* Returns the number of batch schedules where batchcCat = &#63;.
	*
	* @param batchcCat the batchc cat
	* @return the number of matching batch schedules
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfinder2(java.lang.String batchcCat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByfinder2(batchcCat);
	}

	/**
	* Caches the batch schedule in the entity cache if it is enabled.
	*
	* @param batchSchedule the batch schedule
	*/
	public static void cacheResult(com.test.model.BatchSchedule batchSchedule) {
		getPersistence().cacheResult(batchSchedule);
	}

	/**
	* Caches the batch schedules in the entity cache if it is enabled.
	*
	* @param batchSchedules the batch schedules
	*/
	public static void cacheResult(
		java.util.List<com.test.model.BatchSchedule> batchSchedules) {
		getPersistence().cacheResult(batchSchedules);
	}

	/**
	* Creates a new batch schedule with the primary key. Does not add the batch schedule to the database.
	*
	* @param BatchSchedule_Id the primary key for the new batch schedule
	* @return the new batch schedule
	*/
	public static com.test.model.BatchSchedule create(long BatchSchedule_Id) {
		return getPersistence().create(BatchSchedule_Id);
	}

	/**
	* Removes the batch schedule with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param BatchSchedule_Id the primary key of the batch schedule
	* @return the batch schedule that was removed
	* @throws com.test.NoSuchBatchScheduleException if a batch schedule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.BatchSchedule remove(long BatchSchedule_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchBatchScheduleException {
		return getPersistence().remove(BatchSchedule_Id);
	}

	public static com.test.model.BatchSchedule updateImpl(
		com.test.model.BatchSchedule batchSchedule)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(batchSchedule);
	}

	/**
	* Returns the batch schedule with the primary key or throws a {@link com.test.NoSuchBatchScheduleException} if it could not be found.
	*
	* @param BatchSchedule_Id the primary key of the batch schedule
	* @return the batch schedule
	* @throws com.test.NoSuchBatchScheduleException if a batch schedule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.BatchSchedule findByPrimaryKey(
		long BatchSchedule_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchBatchScheduleException {
		return getPersistence().findByPrimaryKey(BatchSchedule_Id);
	}

	/**
	* Returns the batch schedule with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param BatchSchedule_Id the primary key of the batch schedule
	* @return the batch schedule, or <code>null</code> if a batch schedule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.BatchSchedule fetchByPrimaryKey(
		long BatchSchedule_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(BatchSchedule_Id);
	}

	/**
	* Returns all the batch schedules.
	*
	* @return the batch schedules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.BatchSchedule> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the batch schedules.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.BatchScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of batch schedules
	* @param end the upper bound of the range of batch schedules (not inclusive)
	* @return the range of batch schedules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.BatchSchedule> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the batch schedules.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.BatchScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of batch schedules
	* @param end the upper bound of the range of batch schedules (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of batch schedules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.BatchSchedule> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the batch schedules from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of batch schedules.
	*
	* @return the number of batch schedules
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static BatchSchedulePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (BatchSchedulePersistence)PortletBeanLocatorUtil.locate(com.test.service.ClpSerializer.getServletContextName(),
					BatchSchedulePersistence.class.getName());

			ReferenceRegistry.registerReference(BatchScheduleUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(BatchSchedulePersistence persistence) {
	}

	private static BatchSchedulePersistence _persistence;
}