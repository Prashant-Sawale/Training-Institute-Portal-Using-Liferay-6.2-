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
 * Provides a wrapper for {@link BatchScheduleLocalService}.
 *
 * @author mzos
 * @see BatchScheduleLocalService
 * @generated
 */
public class BatchScheduleLocalServiceWrapper
	implements BatchScheduleLocalService,
		ServiceWrapper<BatchScheduleLocalService> {
	public BatchScheduleLocalServiceWrapper(
		BatchScheduleLocalService batchScheduleLocalService) {
		_batchScheduleLocalService = batchScheduleLocalService;
	}

	/**
	* Adds the batch schedule to the database. Also notifies the appropriate model listeners.
	*
	* @param batchSchedule the batch schedule
	* @return the batch schedule that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.BatchSchedule addBatchSchedule(
		com.test.model.BatchSchedule batchSchedule)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _batchScheduleLocalService.addBatchSchedule(batchSchedule);
	}

	/**
	* Creates a new batch schedule with the primary key. Does not add the batch schedule to the database.
	*
	* @param BatchSchedule_Id the primary key for the new batch schedule
	* @return the new batch schedule
	*/
	@Override
	public com.test.model.BatchSchedule createBatchSchedule(
		long BatchSchedule_Id) {
		return _batchScheduleLocalService.createBatchSchedule(BatchSchedule_Id);
	}

	/**
	* Deletes the batch schedule with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param BatchSchedule_Id the primary key of the batch schedule
	* @return the batch schedule that was removed
	* @throws PortalException if a batch schedule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.BatchSchedule deleteBatchSchedule(
		long BatchSchedule_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _batchScheduleLocalService.deleteBatchSchedule(BatchSchedule_Id);
	}

	/**
	* Deletes the batch schedule from the database. Also notifies the appropriate model listeners.
	*
	* @param batchSchedule the batch schedule
	* @return the batch schedule that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.BatchSchedule deleteBatchSchedule(
		com.test.model.BatchSchedule batchSchedule)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _batchScheduleLocalService.deleteBatchSchedule(batchSchedule);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _batchScheduleLocalService.dynamicQuery();
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
		return _batchScheduleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.BatchScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _batchScheduleLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.BatchScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _batchScheduleLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _batchScheduleLocalService.dynamicQueryCount(dynamicQuery);
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
		return _batchScheduleLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.test.model.BatchSchedule fetchBatchSchedule(
		long BatchSchedule_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _batchScheduleLocalService.fetchBatchSchedule(BatchSchedule_Id);
	}

	/**
	* Returns the batch schedule with the primary key.
	*
	* @param BatchSchedule_Id the primary key of the batch schedule
	* @return the batch schedule
	* @throws PortalException if a batch schedule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.BatchSchedule getBatchSchedule(long BatchSchedule_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _batchScheduleLocalService.getBatchSchedule(BatchSchedule_Id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _batchScheduleLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.test.model.BatchSchedule> getBatchSchedules(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _batchScheduleLocalService.getBatchSchedules(start, end);
	}

	/**
	* Returns the number of batch schedules.
	*
	* @return the number of batch schedules
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getBatchSchedulesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _batchScheduleLocalService.getBatchSchedulesCount();
	}

	/**
	* Updates the batch schedule in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param batchSchedule the batch schedule
	* @return the batch schedule that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.BatchSchedule updateBatchSchedule(
		com.test.model.BatchSchedule batchSchedule)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _batchScheduleLocalService.updateBatchSchedule(batchSchedule);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _batchScheduleLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_batchScheduleLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _batchScheduleLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.test.model.BatchSchedule> findByfinder2(
		java.lang.String bcCat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _batchScheduleLocalService.findByfinder2(bcCat);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public BatchScheduleLocalService getWrappedBatchScheduleLocalService() {
		return _batchScheduleLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedBatchScheduleLocalService(
		BatchScheduleLocalService batchScheduleLocalService) {
		_batchScheduleLocalService = batchScheduleLocalService;
	}

	@Override
	public BatchScheduleLocalService getWrappedService() {
		return _batchScheduleLocalService;
	}

	@Override
	public void setWrappedService(
		BatchScheduleLocalService batchScheduleLocalService) {
		_batchScheduleLocalService = batchScheduleLocalService;
	}

	private BatchScheduleLocalService _batchScheduleLocalService;
}