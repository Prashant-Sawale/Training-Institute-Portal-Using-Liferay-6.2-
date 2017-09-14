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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the BatchSchedule service. Represents a row in the &quot;mz_BatchSchedule&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.test.model.impl.BatchScheduleModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.test.model.impl.BatchScheduleImpl}.
 * </p>
 *
 * @author mzos
 * @see BatchSchedule
 * @see com.test.model.impl.BatchScheduleImpl
 * @see com.test.model.impl.BatchScheduleModelImpl
 * @generated
 */
public interface BatchScheduleModel extends BaseModel<BatchSchedule> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a batch schedule model instance should use the {@link BatchSchedule} interface instead.
	 */

	/**
	 * Returns the primary key of this batch schedule.
	 *
	 * @return the primary key of this batch schedule
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this batch schedule.
	 *
	 * @param primaryKey the primary key of this batch schedule
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the batch schedule_ ID of this batch schedule.
	 *
	 * @return the batch schedule_ ID of this batch schedule
	 */
	public long getBatchSchedule_Id();

	/**
	 * Sets the batch schedule_ ID of this batch schedule.
	 *
	 * @param BatchSchedule_Id the batch schedule_ ID of this batch schedule
	 */
	public void setBatchSchedule_Id(long BatchSchedule_Id);

	/**
	 * Returns the batchc cat of this batch schedule.
	 *
	 * @return the batchc cat of this batch schedule
	 */
	@AutoEscape
	public String getBatchcCat();

	/**
	 * Sets the batchc cat of this batch schedule.
	 *
	 * @param batchcCat the batchc cat of this batch schedule
	 */
	public void setBatchcCat(String batchcCat);

	/**
	 * Returns the batch name of this batch schedule.
	 *
	 * @return the batch name of this batch schedule
	 */
	@AutoEscape
	public String getBatchName();

	/**
	 * Sets the batch name of this batch schedule.
	 *
	 * @param batchName the batch name of this batch schedule
	 */
	public void setBatchName(String batchName);

	/**
	 * Returns the batchteacher of this batch schedule.
	 *
	 * @return the batchteacher of this batch schedule
	 */
	@AutoEscape
	public String getBatchteacher();

	/**
	 * Sets the batchteacher of this batch schedule.
	 *
	 * @param batchteacher the batchteacher of this batch schedule
	 */
	public void setBatchteacher(String batchteacher);

	/**
	 * Returns the batch time of this batch schedule.
	 *
	 * @return the batch time of this batch schedule
	 */
	@AutoEscape
	public String getBatchTime();

	/**
	 * Sets the batch time of this batch schedule.
	 *
	 * @param batchTime the batch time of this batch schedule
	 */
	public void setBatchTime(String batchTime);

	/**
	 * Returns the batch day of this batch schedule.
	 *
	 * @return the batch day of this batch schedule
	 */
	@AutoEscape
	public String getBatchDay();

	/**
	 * Sets the batch day of this batch schedule.
	 *
	 * @param batchDay the batch day of this batch schedule
	 */
	public void setBatchDay(String batchDay);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(BatchSchedule batchSchedule);

	@Override
	public int hashCode();

	@Override
	public CacheModel<BatchSchedule> toCacheModel();

	@Override
	public BatchSchedule toEscapedModel();

	@Override
	public BatchSchedule toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}