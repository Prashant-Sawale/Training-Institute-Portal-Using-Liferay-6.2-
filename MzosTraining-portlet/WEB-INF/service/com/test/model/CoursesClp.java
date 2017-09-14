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

import com.test.service.ClpSerializer;
import com.test.service.CoursesLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mzos
 */
public class CoursesClp extends BaseModelImpl<Courses> implements Courses {
	public CoursesClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Courses.class;
	}

	@Override
	public String getModelClassName() {
		return Courses.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _cId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cId", getCId());
		attributes.put("cName", getCName());
		attributes.put("cCat", getCCat());
		attributes.put("cDesc", getCDesc());
		attributes.put("cPreq", getCPreq());
		attributes.put("cDuration", getCDuration());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cId = (Long)attributes.get("cId");

		if (cId != null) {
			setCId(cId);
		}

		String cName = (String)attributes.get("cName");

		if (cName != null) {
			setCName(cName);
		}

		String cCat = (String)attributes.get("cCat");

		if (cCat != null) {
			setCCat(cCat);
		}

		String cDesc = (String)attributes.get("cDesc");

		if (cDesc != null) {
			setCDesc(cDesc);
		}

		String cPreq = (String)attributes.get("cPreq");

		if (cPreq != null) {
			setCPreq(cPreq);
		}

		Integer cDuration = (Integer)attributes.get("cDuration");

		if (cDuration != null) {
			setCDuration(cDuration);
		}
	}

	@Override
	public long getCId() {
		return _cId;
	}

	@Override
	public void setCId(long cId) {
		_cId = cId;

		if (_coursesRemoteModel != null) {
			try {
				Class<?> clazz = _coursesRemoteModel.getClass();

				Method method = clazz.getMethod("setCId", long.class);

				method.invoke(_coursesRemoteModel, cId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCName() {
		return _cName;
	}

	@Override
	public void setCName(String cName) {
		_cName = cName;

		if (_coursesRemoteModel != null) {
			try {
				Class<?> clazz = _coursesRemoteModel.getClass();

				Method method = clazz.getMethod("setCName", String.class);

				method.invoke(_coursesRemoteModel, cName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCCat() {
		return _cCat;
	}

	@Override
	public void setCCat(String cCat) {
		_cCat = cCat;

		if (_coursesRemoteModel != null) {
			try {
				Class<?> clazz = _coursesRemoteModel.getClass();

				Method method = clazz.getMethod("setCCat", String.class);

				method.invoke(_coursesRemoteModel, cCat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCDesc() {
		return _cDesc;
	}

	@Override
	public void setCDesc(String cDesc) {
		_cDesc = cDesc;

		if (_coursesRemoteModel != null) {
			try {
				Class<?> clazz = _coursesRemoteModel.getClass();

				Method method = clazz.getMethod("setCDesc", String.class);

				method.invoke(_coursesRemoteModel, cDesc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCPreq() {
		return _cPreq;
	}

	@Override
	public void setCPreq(String cPreq) {
		_cPreq = cPreq;

		if (_coursesRemoteModel != null) {
			try {
				Class<?> clazz = _coursesRemoteModel.getClass();

				Method method = clazz.getMethod("setCPreq", String.class);

				method.invoke(_coursesRemoteModel, cPreq);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCDuration() {
		return _cDuration;
	}

	@Override
	public void setCDuration(int cDuration) {
		_cDuration = cDuration;

		if (_coursesRemoteModel != null) {
			try {
				Class<?> clazz = _coursesRemoteModel.getClass();

				Method method = clazz.getMethod("setCDuration", int.class);

				method.invoke(_coursesRemoteModel, cDuration);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCoursesRemoteModel() {
		return _coursesRemoteModel;
	}

	public void setCoursesRemoteModel(BaseModel<?> coursesRemoteModel) {
		_coursesRemoteModel = coursesRemoteModel;
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

		Class<?> remoteModelClass = _coursesRemoteModel.getClass();

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

		Object returnValue = method.invoke(_coursesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CoursesLocalServiceUtil.addCourses(this);
		}
		else {
			CoursesLocalServiceUtil.updateCourses(this);
		}
	}

	@Override
	public Courses toEscapedModel() {
		return (Courses)ProxyUtil.newProxyInstance(Courses.class.getClassLoader(),
			new Class[] { Courses.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CoursesClp clone = new CoursesClp();

		clone.setCId(getCId());
		clone.setCName(getCName());
		clone.setCCat(getCCat());
		clone.setCDesc(getCDesc());
		clone.setCPreq(getCPreq());
		clone.setCDuration(getCDuration());

		return clone;
	}

	@Override
	public int compareTo(Courses courses) {
		long primaryKey = courses.getPrimaryKey();

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

		if (!(obj instanceof CoursesClp)) {
			return false;
		}

		CoursesClp courses = (CoursesClp)obj;

		long primaryKey = courses.getPrimaryKey();

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

		sb.append("{cId=");
		sb.append(getCId());
		sb.append(", cName=");
		sb.append(getCName());
		sb.append(", cCat=");
		sb.append(getCCat());
		sb.append(", cDesc=");
		sb.append(getCDesc());
		sb.append(", cPreq=");
		sb.append(getCPreq());
		sb.append(", cDuration=");
		sb.append(getCDuration());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.test.model.Courses");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>cId</column-name><column-value><![CDATA[");
		sb.append(getCId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cName</column-name><column-value><![CDATA[");
		sb.append(getCName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cCat</column-name><column-value><![CDATA[");
		sb.append(getCCat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cDesc</column-name><column-value><![CDATA[");
		sb.append(getCDesc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cPreq</column-name><column-value><![CDATA[");
		sb.append(getCPreq());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cDuration</column-name><column-value><![CDATA[");
		sb.append(getCDuration());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _cId;
	private String _cName;
	private String _cCat;
	private String _cDesc;
	private String _cPreq;
	private int _cDuration;
	private BaseModel<?> _coursesRemoteModel;
}