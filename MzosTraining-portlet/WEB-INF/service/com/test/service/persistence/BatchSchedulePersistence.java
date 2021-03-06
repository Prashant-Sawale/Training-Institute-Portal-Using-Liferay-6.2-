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

import com.test.model.BatchSchedule;

/**
 * The persistence interface for the batch schedule service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mzos
 * @see BatchSchedulePersistenceImpl
 * @see BatchScheduleUtil
 * @generated
 */
public interface BatchSchedulePersistence extends BasePersistence<BatchSchedule> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BatchScheduleUtil} to access the batch schedule persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the batch schedules where batchcCat = &#63;.
	*
	* @param batchcCat the batchc cat
	* @return the matching batch schedules
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.BatchSchedule> findByfinder2(
		java.lang.String batchcCat)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.test.model.BatchSchedule> findByfinder2(
		java.lang.String batchcCat, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.test.model.BatchSchedule> findByfinder2(
		java.lang.String batchcCat, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first batch schedule in the ordered set where batchcCat = &#63;.
	*
	* @param batchcCat the batchc cat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching batch schedule
	* @throws com.test.NoSuchBatchScheduleException if a matching batch schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.BatchSchedule findByfinder2_First(
		java.lang.String batchcCat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchBatchScheduleException;

	/**
	* Returns the first batch schedule in the ordered set where batchcCat = &#63;.
	*
	* @param batchcCat the batchc cat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching batch schedule, or <code>null</code> if a matching batch schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.BatchSchedule fetchByfinder2_First(
		java.lang.String batchcCat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last batch schedule in the ordered set where batchcCat = &#63;.
	*
	* @param batchcCat the batchc cat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching batch schedule
	* @throws com.test.NoSuchBatchScheduleException if a matching batch schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.BatchSchedule findByfinder2_Last(
		java.lang.String batchcCat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchBatchScheduleException;

	/**
	* Returns the last batch schedule in the ordered set where batchcCat = &#63;.
	*
	* @param batchcCat the batchc cat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching batch schedule, or <code>null</code> if a matching batch schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.BatchSchedule fetchByfinder2_Last(
		java.lang.String batchcCat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.test.model.BatchSchedule[] findByfinder2_PrevAndNext(
		long BatchSchedule_Id, java.lang.String batchcCat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchBatchScheduleException;

	/**
	* Removes all the batch schedules where batchcCat = &#63; from the database.
	*
	* @param batchcCat the batchc cat
	* @throws SystemException if a system exception occurred
	*/
	public void removeByfinder2(java.lang.String batchcCat)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of batch schedules where batchcCat = &#63;.
	*
	* @param batchcCat the batchc cat
	* @return the number of matching batch schedules
	* @throws SystemException if a system exception occurred
	*/
	public int countByfinder2(java.lang.String batchcCat)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the batch schedule in the entity cache if it is enabled.
	*
	* @param batchSchedule the batch schedule
	*/
	public void cacheResult(com.test.model.BatchSchedule batchSchedule);

	/**
	* Caches the batch schedules in the entity cache if it is enabled.
	*
	* @param batchSchedules the batch schedules
	*/
	public void cacheResult(
		java.util.List<com.test.model.BatchSchedule> batchSchedules);

	/**
	* Creates a new batch schedule with the primary key. Does not add the batch schedule to the database.
	*
	* @param BatchSchedule_Id the primary key for the new batch schedule
	* @return the new batch schedule
	*/
	public com.test.model.BatchSchedule create(long BatchSchedule_Id);

	/**
	* Removes the batch schedule with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param BatchSchedule_Id the primary key of the batch schedule
	* @return the batch schedule that was removed
	* @throws com.test.NoSuchBatchScheduleException if a batch schedule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.BatchSchedule remove(long BatchSchedule_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchBatchScheduleException;

	public com.test.model.BatchSchedule updateImpl(
		com.test.model.BatchSchedule batchSchedule)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the batch schedule with the primary key or throws a {@link com.test.NoSuchBatchScheduleException} if it could not be found.
	*
	* @param BatchSchedule_Id the primary key of the batch schedule
	* @return the batch schedule
	* @throws com.test.NoSuchBatchScheduleException if a batch schedule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.BatchSchedule findByPrimaryKey(long BatchSchedule_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchBatchScheduleException;

	/**
	* Returns the batch schedule with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param BatchSchedule_Id the primary key of the batch schedule
	* @return the batch schedule, or <code>null</code> if a batch schedule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.BatchSchedule fetchByPrimaryKey(long BatchSchedule_Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the batch schedules.
	*
	* @return the batch schedules
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.BatchSchedule> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.test.model.BatchSchedule> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.test.model.BatchSchedule> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the batch schedules from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of batch schedules.
	*
	* @return the number of batch schedules
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}