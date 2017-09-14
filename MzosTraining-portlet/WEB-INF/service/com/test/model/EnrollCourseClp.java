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
import com.test.service.EnrollCourseLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mzos
 */
public class EnrollCourseClp extends BaseModelImpl<EnrollCourse>
	implements EnrollCourse {
	public EnrollCourseClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return EnrollCourse.class;
	}

	@Override
	public String getModelClassName() {
		return EnrollCourse.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _eId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _eId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("eId", getEId());
		attributes.put("efName", getEfName());
		attributes.put("egen", getEgen());
		attributes.put("email", getEmail());
		attributes.put("econt", getEcont());
		attributes.put("equal", getEqual());
		attributes.put("ecourse", getEcourse());
		attributes.put("ebatch", getEbatch());
		attributes.put("estatus", getEstatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long eId = (Long)attributes.get("eId");

		if (eId != null) {
			setEId(eId);
		}

		String efName = (String)attributes.get("efName");

		if (efName != null) {
			setEfName(efName);
		}

		String egen = (String)attributes.get("egen");

		if (egen != null) {
			setEgen(egen);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Long econt = (Long)attributes.get("econt");

		if (econt != null) {
			setEcont(econt);
		}

		String equal = (String)attributes.get("equal");

		if (equal != null) {
			setEqual(equal);
		}

		String ecourse = (String)attributes.get("ecourse");

		if (ecourse != null) {
			setEcourse(ecourse);
		}

		String ebatch = (String)attributes.get("ebatch");

		if (ebatch != null) {
			setEbatch(ebatch);
		}

		String estatus = (String)attributes.get("estatus");

		if (estatus != null) {
			setEstatus(estatus);
		}
	}

	@Override
	public long getEId() {
		return _eId;
	}

	@Override
	public void setEId(long eId) {
		_eId = eId;

		if (_enrollCourseRemoteModel != null) {
			try {
				Class<?> clazz = _enrollCourseRemoteModel.getClass();

				Method method = clazz.getMethod("setEId", long.class);

				method.invoke(_enrollCourseRemoteModel, eId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEfName() {
		return _efName;
	}

	@Override
	public void setEfName(String efName) {
		_efName = efName;

		if (_enrollCourseRemoteModel != null) {
			try {
				Class<?> clazz = _enrollCourseRemoteModel.getClass();

				Method method = clazz.getMethod("setEfName", String.class);

				method.invoke(_enrollCourseRemoteModel, efName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEgen() {
		return _egen;
	}

	@Override
	public void setEgen(String egen) {
		_egen = egen;

		if (_enrollCourseRemoteModel != null) {
			try {
				Class<?> clazz = _enrollCourseRemoteModel.getClass();

				Method method = clazz.getMethod("setEgen", String.class);

				method.invoke(_enrollCourseRemoteModel, egen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_enrollCourseRemoteModel != null) {
			try {
				Class<?> clazz = _enrollCourseRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_enrollCourseRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEcont() {
		return _econt;
	}

	@Override
	public void setEcont(long econt) {
		_econt = econt;

		if (_enrollCourseRemoteModel != null) {
			try {
				Class<?> clazz = _enrollCourseRemoteModel.getClass();

				Method method = clazz.getMethod("setEcont", long.class);

				method.invoke(_enrollCourseRemoteModel, econt);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEqual() {
		return _equal;
	}

	@Override
	public void setEqual(String equal) {
		_equal = equal;

		if (_enrollCourseRemoteModel != null) {
			try {
				Class<?> clazz = _enrollCourseRemoteModel.getClass();

				Method method = clazz.getMethod("setEqual", String.class);

				method.invoke(_enrollCourseRemoteModel, equal);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEcourse() {
		return _ecourse;
	}

	@Override
	public void setEcourse(String ecourse) {
		_ecourse = ecourse;

		if (_enrollCourseRemoteModel != null) {
			try {
				Class<?> clazz = _enrollCourseRemoteModel.getClass();

				Method method = clazz.getMethod("setEcourse", String.class);

				method.invoke(_enrollCourseRemoteModel, ecourse);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEbatch() {
		return _ebatch;
	}

	@Override
	public void setEbatch(String ebatch) {
		_ebatch = ebatch;

		if (_enrollCourseRemoteModel != null) {
			try {
				Class<?> clazz = _enrollCourseRemoteModel.getClass();

				Method method = clazz.getMethod("setEbatch", String.class);

				method.invoke(_enrollCourseRemoteModel, ebatch);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEstatus() {
		return _estatus;
	}

	@Override
	public void setEstatus(String estatus) {
		_estatus = estatus;

		if (_enrollCourseRemoteModel != null) {
			try {
				Class<?> clazz = _enrollCourseRemoteModel.getClass();

				Method method = clazz.getMethod("setEstatus", String.class);

				method.invoke(_enrollCourseRemoteModel, estatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEnrollCourseRemoteModel() {
		return _enrollCourseRemoteModel;
	}

	public void setEnrollCourseRemoteModel(BaseModel<?> enrollCourseRemoteModel) {
		_enrollCourseRemoteModel = enrollCourseRemoteModel;
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

		Class<?> remoteModelClass = _enrollCourseRemoteModel.getClass();

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

		Object returnValue = method.invoke(_enrollCourseRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EnrollCourseLocalServiceUtil.addEnrollCourse(this);
		}
		else {
			EnrollCourseLocalServiceUtil.updateEnrollCourse(this);
		}
	}

	@Override
	public EnrollCourse toEscapedModel() {
		return (EnrollCourse)ProxyUtil.newProxyInstance(EnrollCourse.class.getClassLoader(),
			new Class[] { EnrollCourse.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EnrollCourseClp clone = new EnrollCourseClp();

		clone.setEId(getEId());
		clone.setEfName(getEfName());
		clone.setEgen(getEgen());
		clone.setEmail(getEmail());
		clone.setEcont(getEcont());
		clone.setEqual(getEqual());
		clone.setEcourse(getEcourse());
		clone.setEbatch(getEbatch());
		clone.setEstatus(getEstatus());

		return clone;
	}

	@Override
	public int compareTo(EnrollCourse enrollCourse) {
		long primaryKey = enrollCourse.getPrimaryKey();

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

		if (!(obj instanceof EnrollCourseClp)) {
			return false;
		}

		EnrollCourseClp enrollCourse = (EnrollCourseClp)obj;

		long primaryKey = enrollCourse.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{eId=");
		sb.append(getEId());
		sb.append(", efName=");
		sb.append(getEfName());
		sb.append(", egen=");
		sb.append(getEgen());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", econt=");
		sb.append(getEcont());
		sb.append(", equal=");
		sb.append(getEqual());
		sb.append(", ecourse=");
		sb.append(getEcourse());
		sb.append(", ebatch=");
		sb.append(getEbatch());
		sb.append(", estatus=");
		sb.append(getEstatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.test.model.EnrollCourse");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>eId</column-name><column-value><![CDATA[");
		sb.append(getEId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>efName</column-name><column-value><![CDATA[");
		sb.append(getEfName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>egen</column-name><column-value><![CDATA[");
		sb.append(getEgen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>econt</column-name><column-value><![CDATA[");
		sb.append(getEcont());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>equal</column-name><column-value><![CDATA[");
		sb.append(getEqual());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ecourse</column-name><column-value><![CDATA[");
		sb.append(getEcourse());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ebatch</column-name><column-value><![CDATA[");
		sb.append(getEbatch());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>estatus</column-name><column-value><![CDATA[");
		sb.append(getEstatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _eId;
	private String _efName;
	private String _egen;
	private String _email;
	private long _econt;
	private String _equal;
	private String _ecourse;
	private String _ebatch;
	private String _estatus;
	private BaseModel<?> _enrollCourseRemoteModel;
}