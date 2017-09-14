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
 * This class is a wrapper for {@link EnrollCourse}.
 * </p>
 *
 * @author mzos
 * @see EnrollCourse
 * @generated
 */
public class EnrollCourseWrapper implements EnrollCourse,
	ModelWrapper<EnrollCourse> {
	public EnrollCourseWrapper(EnrollCourse enrollCourse) {
		_enrollCourse = enrollCourse;
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

	/**
	* Returns the primary key of this enroll course.
	*
	* @return the primary key of this enroll course
	*/
	@Override
	public long getPrimaryKey() {
		return _enrollCourse.getPrimaryKey();
	}

	/**
	* Sets the primary key of this enroll course.
	*
	* @param primaryKey the primary key of this enroll course
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_enrollCourse.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the e ID of this enroll course.
	*
	* @return the e ID of this enroll course
	*/
	@Override
	public long getEId() {
		return _enrollCourse.getEId();
	}

	/**
	* Sets the e ID of this enroll course.
	*
	* @param eId the e ID of this enroll course
	*/
	@Override
	public void setEId(long eId) {
		_enrollCourse.setEId(eId);
	}

	/**
	* Returns the ef name of this enroll course.
	*
	* @return the ef name of this enroll course
	*/
	@Override
	public java.lang.String getEfName() {
		return _enrollCourse.getEfName();
	}

	/**
	* Sets the ef name of this enroll course.
	*
	* @param efName the ef name of this enroll course
	*/
	@Override
	public void setEfName(java.lang.String efName) {
		_enrollCourse.setEfName(efName);
	}

	/**
	* Returns the egen of this enroll course.
	*
	* @return the egen of this enroll course
	*/
	@Override
	public java.lang.String getEgen() {
		return _enrollCourse.getEgen();
	}

	/**
	* Sets the egen of this enroll course.
	*
	* @param egen the egen of this enroll course
	*/
	@Override
	public void setEgen(java.lang.String egen) {
		_enrollCourse.setEgen(egen);
	}

	/**
	* Returns the email of this enroll course.
	*
	* @return the email of this enroll course
	*/
	@Override
	public java.lang.String getEmail() {
		return _enrollCourse.getEmail();
	}

	/**
	* Sets the email of this enroll course.
	*
	* @param email the email of this enroll course
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_enrollCourse.setEmail(email);
	}

	/**
	* Returns the econt of this enroll course.
	*
	* @return the econt of this enroll course
	*/
	@Override
	public long getEcont() {
		return _enrollCourse.getEcont();
	}

	/**
	* Sets the econt of this enroll course.
	*
	* @param econt the econt of this enroll course
	*/
	@Override
	public void setEcont(long econt) {
		_enrollCourse.setEcont(econt);
	}

	/**
	* Returns the equal of this enroll course.
	*
	* @return the equal of this enroll course
	*/
	@Override
	public java.lang.String getEqual() {
		return _enrollCourse.getEqual();
	}

	/**
	* Sets the equal of this enroll course.
	*
	* @param equal the equal of this enroll course
	*/
	@Override
	public void setEqual(java.lang.String equal) {
		_enrollCourse.setEqual(equal);
	}

	/**
	* Returns the ecourse of this enroll course.
	*
	* @return the ecourse of this enroll course
	*/
	@Override
	public java.lang.String getEcourse() {
		return _enrollCourse.getEcourse();
	}

	/**
	* Sets the ecourse of this enroll course.
	*
	* @param ecourse the ecourse of this enroll course
	*/
	@Override
	public void setEcourse(java.lang.String ecourse) {
		_enrollCourse.setEcourse(ecourse);
	}

	/**
	* Returns the ebatch of this enroll course.
	*
	* @return the ebatch of this enroll course
	*/
	@Override
	public java.lang.String getEbatch() {
		return _enrollCourse.getEbatch();
	}

	/**
	* Sets the ebatch of this enroll course.
	*
	* @param ebatch the ebatch of this enroll course
	*/
	@Override
	public void setEbatch(java.lang.String ebatch) {
		_enrollCourse.setEbatch(ebatch);
	}

	/**
	* Returns the estatus of this enroll course.
	*
	* @return the estatus of this enroll course
	*/
	@Override
	public java.lang.String getEstatus() {
		return _enrollCourse.getEstatus();
	}

	/**
	* Sets the estatus of this enroll course.
	*
	* @param estatus the estatus of this enroll course
	*/
	@Override
	public void setEstatus(java.lang.String estatus) {
		_enrollCourse.setEstatus(estatus);
	}

	@Override
	public boolean isNew() {
		return _enrollCourse.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_enrollCourse.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _enrollCourse.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_enrollCourse.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _enrollCourse.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _enrollCourse.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_enrollCourse.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _enrollCourse.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_enrollCourse.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_enrollCourse.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_enrollCourse.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EnrollCourseWrapper((EnrollCourse)_enrollCourse.clone());
	}

	@Override
	public int compareTo(com.test.model.EnrollCourse enrollCourse) {
		return _enrollCourse.compareTo(enrollCourse);
	}

	@Override
	public int hashCode() {
		return _enrollCourse.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.test.model.EnrollCourse> toCacheModel() {
		return _enrollCourse.toCacheModel();
	}

	@Override
	public com.test.model.EnrollCourse toEscapedModel() {
		return new EnrollCourseWrapper(_enrollCourse.toEscapedModel());
	}

	@Override
	public com.test.model.EnrollCourse toUnescapedModel() {
		return new EnrollCourseWrapper(_enrollCourse.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _enrollCourse.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _enrollCourse.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_enrollCourse.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EnrollCourseWrapper)) {
			return false;
		}

		EnrollCourseWrapper enrollCourseWrapper = (EnrollCourseWrapper)obj;

		if (Validator.equals(_enrollCourse, enrollCourseWrapper._enrollCourse)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EnrollCourse getWrappedEnrollCourse() {
		return _enrollCourse;
	}

	@Override
	public EnrollCourse getWrappedModel() {
		return _enrollCourse;
	}

	@Override
	public void resetOriginalValues() {
		_enrollCourse.resetOriginalValues();
	}

	private EnrollCourse _enrollCourse;
}