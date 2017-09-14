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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.test.service.BatchScheduleLocalServiceUtil;
import com.test.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mzos
 */
public class BatchScheduleClp extends BaseModelImpl<BatchSchedule>
	implements BatchSchedule {
	public BatchScheduleClp() {
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

	@Override
	public long getBatchSchedule_Id() {
		return _BatchSchedule_Id;
	}

	@Override
	public void setBatchSchedule_Id(long BatchSchedule_Id) {
		_BatchSchedule_Id = BatchSchedule_Id;

		if (_batchScheduleRemoteModel != null) {
			try {
				Class<?> clazz = _batchScheduleRemoteModel.getClass();

				Method method = clazz.getMethod("setBatchSchedule_Id",
						long.class);

				method.invoke(_batchScheduleRemoteModel, BatchSchedule_Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBatchcCat() {
		return _batchcCat;
	}

	@Override
	public void setBatchcCat(String batchcCat) {
		_batchcCat = batchcCat;

		if (_batchScheduleRemoteModel != null) {
			try {
				Class<?> clazz = _batchScheduleRemoteModel.getClass();

				Method method = clazz.getMethod("setBatchcCat", String.class);

				method.invoke(_batchScheduleRemoteModel, batchcCat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBatchName() {
		return _batchName;
	}

	@Override
	public void setBatchName(String batchName) {
		_batchName = batchName;

		if (_batchScheduleRemoteModel != null) {
			try {
				Class<?> clazz = _batchScheduleRemoteModel.getClass();

				Method method = clazz.getMethod("setBatchName", String.class);

				method.invoke(_batchScheduleRemoteModel, batchName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBatchteacher() {
		return _batchteacher;
	}

	@Override
	public void setBatchteacher(String batchteacher) {
		_batchteacher = batchteacher;

		if (_batchScheduleRemoteModel != null) {
			try {
				Class<?> clazz = _batchScheduleRemoteModel.getClass();

				Method method = clazz.getMethod("setBatchteacher", String.class);

				method.invoke(_batchScheduleRemoteModel, batchteacher);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBatchTime() {
		return _batchTime;
	}

	@Override
	public void setBatchTime(String batchTime) {
		_batchTime = batchTime;

		if (_batchScheduleRemoteModel != null) {
			try {
				Class<?> clazz = _batchScheduleRemoteModel.getClass();

				Method method = clazz.getMethod("setBatchTime", String.class);

				method.invoke(_batchScheduleRemoteModel, batchTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBatchDay() {
		return _batchDay;
	}

	@Override
	public void setBatchDay(String batchDay) {
		_batchDay = batchDay;

		if (_batchScheduleRemoteModel != null) {
			try {
				Class<?> clazz = _batchScheduleRemoteModel.getClass();

				Method method = clazz.getMethod("setBatchDay", String.class);

				method.invoke(_batchScheduleRemoteModel, batchDay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getBatchScheduleRemoteModel() {
		return _batchScheduleRemoteModel;
	}

	public void setBatchScheduleRemoteModel(
		BaseModel<?> batchScheduleRemoteModel) {
		_batchScheduleRemoteModel = batchScheduleRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _batchScheduleRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_batchScheduleRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			BatchScheduleLocalServiceUtil.addBatchSchedule(this);
		}
		else {
			BatchScheduleLocalServiceUtil.updateBatchSchedule(this);
		}
	}

	@Override
	public BatchSchedule toEscapedModel() {
		return (BatchSchedule)ProxyUtil.newProxyInstance(BatchSchedule.class.getClassLoader(),
			new Class[] { BatchSchedule.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		BatchScheduleClp clone = new BatchScheduleClp();

		clone.setBatchSchedule_Id(getBatchSchedule_Id());
		clone.setBatchcCat(getBatchcCat());
		clone.setBatchName(getBatchName());
		clone.setBatchteacher(getBatchteacher());
		clone.setBatchTime(getBatchTime());
		clone.setBatchDay(getBatchDay());

		return clone;
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

		if (!(obj instanceof BatchScheduleClp)) {
			return false;
		}

		BatchScheduleClp batchSchedule = (BatchScheduleClp)obj;

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

	private long _BatchSchedule_Id;
	private String _batchcCat;
	private String _batchName;
	private String _batchteacher;
	private String _batchTime;
	private String _batchDay;
	private BaseModel<?> _batchScheduleRemoteModel;
}