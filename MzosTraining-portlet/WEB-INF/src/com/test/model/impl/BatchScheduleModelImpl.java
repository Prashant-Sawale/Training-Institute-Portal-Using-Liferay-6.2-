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

package com.test.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.test.model.BatchSchedule;
import com.test.model.BatchScheduleModel;
import com.test.model.BatchScheduleSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the BatchSchedule service. Represents a row in the &quot;mz_BatchSchedule&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.test.model.BatchScheduleModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BatchScheduleImpl}.
 * </p>
 *
 * @author mzos
 * @see BatchScheduleImpl
 * @see com.test.model.BatchSchedule
 * @see com.test.model.BatchScheduleModel
 * @generated
 */
@JSON(strict = true)
public class BatchScheduleModelImpl extends BaseModelImpl<BatchSchedule>
	implements BatchScheduleModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a batch schedule model instance should use the {@link com.test.model.BatchSchedule} interface instead.
	 */
	public static final String TABLE_NAME = "mz_BatchSchedule";
	public static final Object[][] TABLE_COLUMNS = {
			{ "BatchSchedule_Id", Types.BIGINT },
			{ "batchcCat", Types.VARCHAR },
			{ "batchName", Types.VARCHAR },
			{ "batchteacher", Types.VARCHAR },
			{ "batchTime", Types.VARCHAR },
			{ "batchDay", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table mz_BatchSchedule (BatchSchedule_Id LONG not null primary key,batchcCat VARCHAR(75) null,batchName VARCHAR(75) null,batchteacher VARCHAR(75) null,batchTime VARCHAR(75) null,batchDay VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table mz_BatchSchedule";
	public static final String ORDER_BY_JPQL = " ORDER BY batchSchedule.BatchSchedule_Id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY mz_BatchSchedule.BatchSchedule_Id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.test.model.BatchSchedule"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.test.model.BatchSchedule"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.test.model.BatchSchedule"),
			true);
	public static long BATCHCCAT_COLUMN_BITMASK = 1L;
	public static long BATCHSCHEDULE_ID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static BatchSchedule toModel(BatchScheduleSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		BatchSchedule model = new BatchScheduleImpl();

		model.setBatchSchedule_Id(soapModel.getBatchSchedule_Id());
		model.setBatchcCat(soapModel.getBatchcCat());
		model.setBatchName(soapModel.getBatchName());
		model.setBatchteacher(soapModel.getBatchteacher());
		model.setBatchTime(soapModel.getBatchTime());
		model.setBatchDay(soapModel.getBatchDay());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<BatchSchedule> toModels(BatchScheduleSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<BatchSchedule> models = new ArrayList<BatchSchedule>(soapModels.length);

		for (BatchScheduleSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.test.model.BatchSchedule"));

	public BatchScheduleModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _BatchSchedule_Id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBatchSchedule_Id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _BatchSchedule_Id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@JSON
	@Override
	public long getBatchSchedule_Id() {
		return _BatchSchedule_Id;
	}

	@Override
	public void setBatchSchedule_Id(long BatchSchedule_Id) {
		_BatchSchedule_Id = BatchSchedule_Id;
	}

	@JSON
	@Override
	public String getBatchcCat() {
		if (_batchcCat == null) {
			return StringPool.BLANK;
		}
		else {
			return _batchcCat;
		}
	}

	@Override
	public void setBatchcCat(String batchcCat) {
		_columnBitmask |= BATCHCCAT_COLUMN_BITMASK;

		if (_originalBatchcCat == null) {
			_originalBatchcCat = _batchcCat;
		}

		_batchcCat = batchcCat;
	}

	public String getOriginalBatchcCat() {
		return GetterUtil.getString(_originalBatchcCat);
	}

	@JSON
	@Override
	public String getBatchName() {
		if (_batchName == null) {
			return StringPool.BLANK;
		}
		else {
			return _batchName;
		}
	}

	@Override
	public void setBatchName(String batchName) {
		_batchName = batchName;
	}

	@JSON
	@Override
	public String getBatchteacher() {
		if (_batchteacher == null) {
			return StringPool.BLANK;
		}
		else {
			return _batchteacher;
		}
	}

	@Override
	public void setBatchteacher(String batchteacher) {
		_batchteacher = batchteacher;
	}

	@JSON
	@Override
	public String getBatchTime() {
		if (_batchTime == null) {
			return StringPool.BLANK;
		}
		else {
			return _batchTime;
		}
	}

	@Override
	public void setBatchTime(String batchTime) {
		_batchTime = batchTime;
	}

	@JSON
	@Override
	public String getBatchDay() {
		if (_batchDay == null) {
			return StringPool.BLANK;
		}
		else {
			return _batchDay;
		}
	}

	@Override
	public void setBatchDay(String batchDay) {
		_batchDay = batchDay;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			BatchSchedule.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public BatchSchedule toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (BatchSchedule)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		BatchScheduleImpl batchScheduleImpl = new BatchScheduleImpl();

		batchScheduleImpl.setBatchSchedule_Id(getBatchSchedule_Id());
		batchScheduleImpl.setBatchcCat(getBatchcCat());
		batchScheduleImpl.setBatchName(getBatchName());
		batchScheduleImpl.setBatchteacher(getBatchteacher());
		batchScheduleImpl.setBatchTime(getBatchTime());
		batchScheduleImpl.setBatchDay(getBatchDay());

		batchScheduleImpl.resetOriginalValues();

		return batchScheduleImpl;
	}

	@Override
	public int compareTo(BatchSchedule batchSchedule) {
		long primaryKey = batchSchedule.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BatchSchedule)) {
			return false;
		}

		BatchSchedule batchSchedule = (BatchSchedule)obj;

		long primaryKey = batchSchedule.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		BatchScheduleModelImpl batchScheduleModelImpl = this;

		batchScheduleModelImpl._originalBatchcCat = batchScheduleModelImpl._batchcCat;

		batchScheduleModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<BatchSchedule> toCacheModel() {
		BatchScheduleCacheModel batchScheduleCacheModel = new BatchScheduleCacheModel();

		batchScheduleCacheModel.BatchSchedule_Id = getBatchSchedule_Id();

		batchScheduleCacheModel.batchcCat = getBatchcCat();

		String batchcCat = batchScheduleCacheModel.batchcCat;

		if ((batchcCat != null) && (batchcCat.length() == 0)) {
			batchScheduleCacheModel.batchcCat = null;
		}

		batchScheduleCacheModel.batchName = getBatchName();

		String batchName = batchScheduleCacheModel.batchName;

		if ((batchName != null) && (batchName.length() == 0)) {
			batchScheduleCacheModel.batchName = null;
		}

		batchScheduleCacheModel.batchteacher = getBatchteacher();

		String batchteacher = batchScheduleCacheModel.batchteacher;

		if ((batchteacher != null) && (batchteacher.length() == 0)) {
			batchScheduleCacheModel.batchteacher = null;
		}

		batchScheduleCacheModel.batchTime = getBatchTime();

		String batchTime = batchScheduleCacheModel.batchTime;

		if ((batchTime != null) && (batchTime.length() == 0)) {
			batchScheduleCacheModel.batchTime = null;
		}

		batchScheduleCacheModel.batchDay = getBatchDay();

		String batchDay = batchScheduleCacheModel.batchDay;

		if ((batchDay != null) && (batchDay.length() == 0)) {
			batchScheduleCacheModel.batchDay = null;
		}

		return batchScheduleCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{BatchSchedule_Id=");
		sb.append(getBatchSchedule_Id());
		sb.append(", batchcCat=");
		sb.append(getBatchcCat());
		sb.append(", batchName=");
		sb.append(getBatchName());
		sb.append(", batchteacher=");
		sb.append(getBatchteacher());
		sb.append(", batchTime=");
		sb.append(getBatchTime());
		sb.append(", batchDay=");
		sb.append(getBatchDay());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.test.model.BatchSchedule");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>BatchSchedule_Id</column-name><column-value><![CDATA[");
		sb.append(getBatchSchedule_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>batchcCat</column-name><column-value><![CDATA[");
		sb.append(getBatchcCat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>batchName</column-name><column-value><![CDATA[");
		sb.append(getBatchName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>batchteacher</column-name><column-value><![CDATA[");
		sb.append(getBatchteacher());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>batchTime</column-name><column-value><![CDATA[");
		sb.append(getBatchTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>batchDay</column-name><column-value><![CDATA[");
		sb.append(getBatchDay());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = BatchSchedule.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			BatchSchedule.class
		};
	private long _BatchSchedule_Id;
	private String _batchcCat;
	private String _originalBatchcCat;
	private String _batchName;
	private String _batchteacher;
	private String _batchTime;
	private String _batchDay;
	private long _columnBitmask;
	private BatchSchedule _escapedModel;
}