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
 * This class is a wrapper for {@link Courses}.
 * </p>
 *
 * @author mzos
 * @see Courses
 * @generated
 */
public class CoursesWrapper implements Courses, ModelWrapper<Courses> {
	public CoursesWrapper(Courses courses) {
		_courses = courses;
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

	/**
	* Returns the primary key of this courses.
	*
	* @return the primary key of this courses
	*/
	@Override
	public long getPrimaryKey() {
		return _courses.getPrimaryKey();
	}

	/**
	* Sets the primary key of this courses.
	*
	* @param primaryKey the primary key of this courses
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_courses.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the c ID of this courses.
	*
	* @return the c ID of this courses
	*/
	@Override
	public long getCId() {
		return _courses.getCId();
	}

	/**
	* Sets the c ID of this courses.
	*
	* @param cId the c ID of this courses
	*/
	@Override
	public void setCId(long cId) {
		_courses.setCId(cId);
	}

	/**
	* Returns the c name of this courses.
	*
	* @return the c name of this courses
	*/
	@Override
	public java.lang.String getCName() {
		return _courses.getCName();
	}

	/**
	* Sets the c name of this courses.
	*
	* @param cName the c name of this courses
	*/
	@Override
	public void setCName(java.lang.String cName) {
		_courses.setCName(cName);
	}

	/**
	* Returns the c cat of this courses.
	*
	* @return the c cat of this courses
	*/
	@Override
	public java.lang.String getCCat() {
		return _courses.getCCat();
	}

	/**
	* Sets the c cat of this courses.
	*
	* @param cCat the c cat of this courses
	*/
	@Override
	public void setCCat(java.lang.String cCat) {
		_courses.setCCat(cCat);
	}

	/**
	* Returns the c desc of this courses.
	*
	* @return the c desc of this courses
	*/
	@Override
	public java.lang.String getCDesc() {
		return _courses.getCDesc();
	}

	/**
	* Sets the c desc of this courses.
	*
	* @param cDesc the c desc of this courses
	*/
	@Override
	public void setCDesc(java.lang.String cDesc) {
		_courses.setCDesc(cDesc);
	}

	/**
	* Returns the c preq of this courses.
	*
	* @return the c preq of this courses
	*/
	@Override
	public java.lang.String getCPreq() {
		return _courses.getCPreq();
	}

	/**
	* Sets the c preq of this courses.
	*
	* @param cPreq the c preq of this courses
	*/
	@Override
	public void setCPreq(java.lang.String cPreq) {
		_courses.setCPreq(cPreq);
	}

	/**
	* Returns the c duration of this courses.
	*
	* @return the c duration of this courses
	*/
	@Override
	public int getCDuration() {
		return _courses.getCDuration();
	}

	/**
	* Sets the c duration of this courses.
	*
	* @param cDuration the c duration of this courses
	*/
	@Override
	public void setCDuration(int cDuration) {
		_courses.setCDuration(cDuration);
	}

	@Override
	public boolean isNew() {
		return _courses.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_courses.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _courses.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_courses.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _courses.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _courses.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_courses.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _courses.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_courses.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_courses.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_courses.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CoursesWrapper((Courses)_courses.clone());
	}

	@Override
	public int compareTo(com.test.model.Courses courses) {
		return _courses.compareTo(courses);
	}

	@Override
	public int hashCode() {
		return _courses.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.test.model.Courses> toCacheModel() {
		return _courses.toCacheModel();
	}

	@Override
	public com.test.model.Courses toEscapedModel() {
		return new CoursesWrapper(_courses.toEscapedModel());
	}

	@Override
	public com.test.model.Courses toUnescapedModel() {
		return new CoursesWrapper(_courses.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _courses.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _courses.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_courses.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CoursesWrapper)) {
			return false;
		}

		CoursesWrapper coursesWrapper = (CoursesWrapper)obj;

		if (Validator.equals(_courses, coursesWrapper._courses)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Courses getWrappedCourses() {
		return _courses;
	}

	@Override
	public Courses getWrappedModel() {
		return _courses;
	}

	@Override
	public void resetOriginalValues() {
		_courses.resetOriginalValues();
	}

	private Courses _courses;
}