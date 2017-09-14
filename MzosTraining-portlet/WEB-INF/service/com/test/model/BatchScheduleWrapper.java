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

package com.test.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BatchSchedule}.
 * </p>
 *
 * @author mzos
 * @see BatchSchedule
 * @generated
 */
public class BatchScheduleWrapper implements BatchSchedule,
	ModelWrapper<BatchSchedule> {
	public BatchScheduleWrapper(BatchSchedule batchSchedule) {
		_batchSchedule = batchSchedule;
	}

	@Override
	public Class<?> getModelClass() {
		return BatchSchedule.class;
	}

	@Override
	public String getModelClassName() {
		return BatchSchedule.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("BatchSchedule_Id", getBatchSchedule_Id());
		attributes.put("batchcCat", getBatchcCat());
		attributes.put("batchName", getBatchName());
		attributes.put("batchteacher", getBatchteacher());
		attributes.put("batchTime", getBatchTime());
		attributes.put("batchDay", getBatchDay());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long BatchSchedule_Id = (Long)attributes.get("BatchSchedule_Id");

		if (BatchSchedule_Id != null) {
			setBatchSchedule_Id(BatchSchedule_Id);
		}

		String batchcCat = (String)attributes.get("batchcCat");

		if (batchcCat != null) {
			setBatchcCat(batchcCat);
		}

		String batchName = (String)attributes.get("batchName");

		if (batchName != null) {
			setBatchName(batchName);
		}

		String batchteacher = (String)attributes.get("batchteacher");

		if (batchteacher != null) {
			setBatchteacher(batchteacher);
		}

		String batchTime = (String)attributes.get("batchTime");

		if (batchTime != null) {
			setBatchTime(batchTime);
		}

		String batchDay = (String)attributes.get("batchDay");

		if (batchDay != null) {
			setBatchDay(batchDay);
		}
	}

	/**
	* Returns the primary key of this batch schedule.
	*
	* @return the primary key of this batch schedule
	*/
	@Override
	public long getPrimaryKey() {
		return _batchSchedule.getPrimaryKey();
	}

	/**
	* Sets the primary key of this batch schedule.
	*
	* @param primaryKey the primary key of this batch schedule
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_batchSchedule.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the batch schedule_ ID of this batch schedule.
	*
	* @return the batch schedule_ ID of this batch schedule
	*/
	@Override
	public long getBatchSchedule_Id() {
		return _batchSchedule.getBatchSchedule_Id();
	}

	/**
	* Sets the batch schedule_ ID of this batch schedule.
	*
	* @param BatchSchedule_Id the batch schedule_ ID of this batch schedule
	*/
	@Override
	public void setBatchSchedule_Id(long BatchSchedule_Id) {
		_batchSchedule.setBatchSchedule_Id(BatchSchedule_Id);
	}

	/**
	* Returns the batchc cat of this batch schedule.
	*
	* @return the batchc cat of this batch schedule
	*/
	@Override
	public java.lang.String getBatchcCat() {
		return _batchSchedule.getBatchcCat();
	}

	/**
	* Sets the batchc cat of this batch schedule.
	*
	* @param batchcCat the batchc cat of this batch schedule
	*/
	@Override
	public void setBatchcCat(java.lang.String batchcCat) {
		_batchSchedule.setBatchcCat(batchcCat);
	}

	/**
	* Returns the batch name of this batch schedule.
	*
	* @return the batch name of this batch schedule
	*/
	@Override
	public java.lang.String getBatchName() {
		return _batchSchedule.getBatchName();
	}

	/**
	* Sets the batch name of this batch schedule.
	*
	* @param batchName the batch name of this batch schedule
	*/
	@Override
	public void setBatchName(java.lang.String batchName) {
		_batchSchedule.setBatchName(batchName);
	}

	/**
	* Returns the batchteacher of this batch schedule.
	*
	* @return the batchteacher of this batch schedule
	*/
	@Override
	public java.lang.String getBatchteacher() {
		return _batchSchedule.getBatchteacher();
	}

	/**
	* Sets the batchteacher of this batch schedule.
	*
	* @param batchteacher the batchteacher of this batch schedule
	*/
	@Override
	public void setBatchteacher(java.lang.String batchteacher) {
		_batchSchedule.setBatchteacher(batchteacher);
	}

	/**
	* Returns the batch time of this batch schedule.
	*
	* @return the batch time of this batch schedule
	*/
	@Override
	public java.lang.String getBatchTime() {
		return _batchSchedule.getBatchTime();
	}

	/**
	* Sets the batch time of this batch schedule.
	*
	* @param batchTime the batch time of this batch schedule
	*/
	@Override
	public void setBatchTime(java.lang.String batchTime) {
		_batchSchedule.setBatchTime(batchTime);
	}

	/**
	* Returns the batch day of this batch schedule.
	*
	* @return the batch day of this batch schedule
	*/
	@Override
	public java.lang.String getBatchDay() {
		return _batchSchedule.getBatchDay();
	}

	/**
	* Sets the batch day of this batch schedule.
	*
	* @param batchDay the batch day of this batch schedule
	*/
	@Override
	public void setBatchDay(java.lang.String batchDay) {
		_batchSchedule.setBatchDay(batchDay);
	}

	@Override
	public boolean isNew() {
		return _batchSchedule.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_batchSchedule.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _batchSchedule.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_batchSchedule.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _batchSchedule.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _batchSchedule.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_batchSchedule.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _batchSchedule.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_batchSchedule.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_batchSchedule.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_batchSchedule.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BatchScheduleWrapper((BatchSchedule)_batchSchedule.clone());
	}

	@Override
	public int compareTo(com.test.model.BatchSchedule batchSchedule) {
		return _batchSchedule.compareTo(batchSchedule);
	}

	@Override
	public int hashCode() {
		return _batchSchedule.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.test.model.BatchSchedule> toCacheModel() {
		return _batchSchedule.toCacheModel();
	}

	@Override
	public com.test.model.BatchSchedule toEscapedModel() {
		return new BatchScheduleWrapper(_batchSchedule.toEscapedModel());
	}

	@Override
	public com.test.model.BatchSchedule toUnescapedModel() {
		return new BatchScheduleWrapper(_batchSchedule.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _batchSchedule.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _batchSchedule.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_batchSchedule.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BatchScheduleWrapper)) {
			return false;
		}

		BatchScheduleWrapper batchScheduleWrapper = (BatchScheduleWrapper)obj;

		if (Validator.equals(_batchSchedule, batchScheduleWrapper._batchSchedule)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public BatchSchedule getWrappedBatchSchedule() {
		return _batchSchedule;
	}

	@Override
	public BatchSchedule getWrappedModel() {
		return _batchSchedule;
	}

	@Override
	public void resetOriginalValues() {
		_batchSchedule.resetOriginalValues();
	}

	private BatchSchedule _batchSchedule;
}