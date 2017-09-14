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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.test.service.http.CoursesServiceSoap}.
 *
 * @author mzos
 * @see com.test.service.http.CoursesServiceSoap
 * @generated
 */
public class CoursesSoap implements Serializable {
	public static CoursesSoap toSoapModel(Courses model) {
		CoursesSoap soapModel = new CoursesSoap();

		soapModel.setCId(model.getCId());
		soapModel.setCName(model.getCName());
		soapModel.setCCat(model.getCCat());
		soapModel.setCDesc(model.getCDesc());
		soapModel.setCPreq(model.getCPreq());
		soapModel.setCDuration(model.getCDuration());

		return soapModel;
	}

	public static CoursesSoap[] toSoapModels(Courses[] models) {
		CoursesSoap[] soapModels = new CoursesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CoursesSoap[][] toSoapModels(Courses[][] models) {
		CoursesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CoursesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CoursesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CoursesSoap[] toSoapModels(List<Courses> models) {
		List<CoursesSoap> soapModels = new ArrayList<CoursesSoap>(models.size());

		for (Courses model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CoursesSoap[soapModels.size()]);
	}

	public CoursesSoap() {
	}

	public long getPrimaryKey() {
		return _cId;
	}

	public void setPrimaryKey(long pk) {
		setCId(pk);
	}

	public long getCId() {
		return _cId;
	}

	public void setCId(long cId) {
		_cId = cId;
	}

	public String getCName() {
		return _cName;
	}

	public void setCName(String cName) {
		_cName = cName;
	}

	public String getCCat() {
		return _cCat;
	}

	public void setCCat(String cCat) {
		_cCat = cCat;
	}

	public String getCDesc() {
		return _cDesc;
	}

	public void setCDesc(String cDesc) {
		_cDesc = cDesc;
	}

	public String getCPreq() {
		return _cPreq;
	}

	public void setCPreq(String cPreq) {
		_cPreq = cPreq;
	}

	public int getCDuration() {
		return _cDuration;
	}

	public void setCDuration(int cDuration) {
		_cDuration = cDuration;
	}

	private long _cId;
	private String _cName;
	private String _cCat;
	private String _cDesc;
	private String _cPreq;
	private int _cDuration;
}