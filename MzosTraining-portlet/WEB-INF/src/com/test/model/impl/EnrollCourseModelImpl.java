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

import com.test.model.EnrollCourse;
import com.test.model.EnrollCourseModel;
import com.test.model.EnrollCourseSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the EnrollCourse service. Represents a row in the &quot;mz_EnrollCourse&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.test.model.EnrollCourseModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EnrollCourseImpl}.
 * </p>
 *
 * @author mzos
 * @see EnrollCourseImpl
 * @see com.test.model.EnrollCourse
 * @see com.test.model.EnrollCourseModel
 * @generated
 */
@JSON(strict = true)
public class EnrollCourseModelImpl extends BaseModelImpl<EnrollCourse>
	implements EnrollCourseModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a enroll course model instance should use the {@link com.test.model.EnrollCourse} interface instead.
	 */
	public static final String TABLE_NAME = "mz_EnrollCourse";
	public static final Object[][] TABLE_COLUMNS = {
			{ "eId", Types.BIGINT },
			{ "efName", Types.VARCHAR },
			{ "egen", Types.VARCHAR },
			{ "email", Types.VARCHAR },
			{ "econt", Types.BIGINT },
			{ "equal", Types.VARCHAR },
			{ "ecourse", Types.VARCHAR },
			{ "ebatch", Types.VARCHAR },
			{ "estatus", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table mz_EnrollCourse (eId LONG not null primary key,efName VARCHAR(75) null,egen VARCHAR(75) null,email VARCHAR(75) null,econt LONG,equal VARCHAR(75) null,ecourse VARCHAR(75) null,ebatch VARCHAR(75) null,estatus VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table mz_EnrollCourse";
	public static final String ORDER_BY_JPQL = " ORDER BY enrollCourse.eId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY mz_EnrollCourse.eId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.test.model.EnrollCourse"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.test.model.EnrollCourse"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static EnrollCourse toModel(EnrollCourseSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		EnrollCourse model = new EnrollCourseImpl();

		model.setEId(soapModel.getEId());
		model.setEfName(soapModel.getEfName());
		model.setEgen(soapModel.getEgen());
		model.setEmail(soapModel.getEmail());
		model.setEcont(soapModel.getEcont());
		model.setEqual(soapModel.getEqual());
		model.setEcourse(soapModel.getEcourse());
		model.setEbatch(soapModel.getEbatch());
		model.setEstatus(soapModel.getEstatus());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<EnrollCourse> toModels(EnrollCourseSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<EnrollCourse> models = new ArrayList<EnrollCourse>(soapModels.length);

		for (EnrollCourseSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.test.model.EnrollCourse"));

	public EnrollCourseModelImpl() {
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
	public Class<?> getModelClass() {
		return EnrollCourse.class;
	}

	@Override
	public String getModelClassName() {
		return EnrollCourse.class.getName();
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

	@JSON
	@Override
	public long getEId() {
		return _eId;
	}

	@Override
	public void setEId(long eId) {
		_eId = eId;
	}

	@JSON
	@Override
	public String getEfName() {
		if (_efName == null) {
			return StringPool.BLANK;
		}
		else {
			return _efName;
		}
	}

	@Override
	public void setEfName(String efName) {
		_efName = efName;
	}

	@JSON
	@Override
	public String getEgen() {
		if (_egen == null) {
			return StringPool.BLANK;
		}
		else {
			return _egen;
		}
	}

	@Override
	public void setEgen(String egen) {
		_egen = egen;
	}

	@JSON
	@Override
	public String getEmail() {
		if (_email == null) {
			return StringPool.BLANK;
		}
		else {
			return _email;
		}
	}

	@Override
	public void setEmail(String email) {
		_email = email;
	}

	@JSON
	@Override
	public long getEcont() {
		return _econt;
	}

	@Override
	public void setEcont(long econt) {
		_econt = econt;
	}

	@JSON
	@Override
	public String getEqual() {
		if (_equal == null) {
			return StringPool.BLANK;
		}
		else {
			return _equal;
		}
	}

	@Override
	public void setEqual(String equal) {
		_equal = equal;
	}

	@JSON
	@Override
	public String getEcourse() {
		if (_ecourse == null) {
			return StringPool.BLANK;
		}
		else {
			return _ecourse;
		}
	}

	@Override
	public void setEcourse(String ecourse) {
		_ecourse = ecourse;
	}

	@JSON
	@Override
	public String getEbatch() {
		if (_ebatch == null) {
			return StringPool.BLANK;
		}
		else {
			return _ebatch;
		}
	}

	@Override
	public void setEbatch(String ebatch) {
		_ebatch = ebatch;
	}

	@JSON
	@Override
	public String getEstatus() {
		if (_estatus == null) {
			return StringPool.BLANK;
		}
		else {
			return _estatus;
		}
	}

	@Override
	public void setEstatus(String estatus) {
		_estatus = estatus;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			EnrollCourse.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public EnrollCourse toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (EnrollCourse)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EnrollCourseImpl enrollCourseImpl = new EnrollCourseImpl();

		enrollCourseImpl.setEId(getEId());
		enrollCourseImpl.setEfName(getEfName());
		enrollCourseImpl.setEgen(getEgen());
		enrollCourseImpl.setEmail(getEmail());
		enrollCourseImpl.setEcont(getEcont());
		enrollCourseImpl.setEqual(getEqual());
		enrollCourseImpl.setEcourse(getEcourse());
		enrollCourseImpl.setEbatch(getEbatch());
		enrollCourseImpl.setEstatus(getEstatus());

		enrollCourseImpl.resetOriginalValues();

		return enrollCourseImpl;
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

		if (!(obj instanceof EnrollCourse)) {
			return false;
		}

		EnrollCourse enrollCourse = (EnrollCourse)obj;

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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<EnrollCourse> toCacheModel() {
		EnrollCourseCacheModel enrollCourseCacheModel = new EnrollCourseCacheModel();

		enrollCourseCacheModel.eId = getEId();

		enrollCourseCacheModel.efName = getEfName();

		String efName = enrollCourseCacheModel.efName;

		if ((efName != null) && (efName.length() == 0)) {
			enrollCourseCacheModel.efName = null;
		}

		enrollCourseCacheModel.egen = getEgen();

		String egen = enrollCourseCacheModel.egen;

		if ((egen != null) && (egen.length() == 0)) {
			enrollCourseCacheModel.egen = null;
		}

		enrollCourseCacheModel.email = getEmail();

		String email = enrollCourseCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			enrollCourseCacheModel.email = null;
		}

		enrollCourseCacheModel.econt = getEcont();

		enrollCourseCacheModel.equal = getEqual();

		String equal = enrollCourseCacheModel.equal;

		if ((equal != null) && (equal.length() == 0)) {
			enrollCourseCacheModel.equal = null;
		}

		enrollCourseCacheModel.ecourse = getEcourse();

		String ecourse = enrollCourseCacheModel.ecourse;

		if ((ecourse != null) && (ecourse.length() == 0)) {
			enrollCourseCacheModel.ecourse = null;
		}

		enrollCourseCacheModel.ebatch = getEbatch();

		String ebatch = enrollCourseCacheModel.ebatch;

		if ((ebatch != null) && (ebatch.length() == 0)) {
			enrollCourseCacheModel.ebatch = null;
		}

		enrollCourseCacheModel.estatus = getEstatus();

		String estatus = enrollCourseCacheModel.estatus;

		if ((estatus != null) && (estatus.length() == 0)) {
			enrollCourseCacheModel.estatus = null;
		}

		return enrollCourseCacheModel;
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

	private static ClassLoader _classLoader = EnrollCourse.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			EnrollCourse.class
		};
	private long _eId;
	private String _efName;
	private String _egen;
	private String _email;
	private long _econt;
	private String _equal;
	private String _ecourse;
	private String _ebatch;
	private String _estatus;
	private EnrollCourse _escapedModel;
}