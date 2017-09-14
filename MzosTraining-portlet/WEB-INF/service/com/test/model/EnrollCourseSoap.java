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
 * This class is used by SOAP remote services, specifically {@link com.test.service.http.EnrollCourseServiceSoap}.
 *
 * @author mzos
 * @see com.test.service.http.EnrollCourseServiceSoap
 * @generated
 */
public class EnrollCourseSoap implements Serializable {
	public static EnrollCourseSoap toSoapModel(EnrollCourse model) {
		EnrollCourseSoap soapModel = new EnrollCourseSoap();

		soapModel.setEId(model.getEId());
		soapModel.setEfName(model.getEfName());
		soapModel.setEgen(model.getEgen());
		soapModel.setEmail(model.getEmail());
		soapModel.setEcont(model.getEcont());
		soapModel.setEqual(model.getEqual());
		soapModel.setEcourse(model.getEcourse());
		soapModel.setEbatch(model.getEbatch());
		soapModel.setEstatus(model.getEstatus());

		return soapModel;
	}

	public static EnrollCourseSoap[] toSoapModels(EnrollCourse[] models) {
		EnrollCourseSoap[] soapModels = new EnrollCourseSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EnrollCourseSoap[][] toSoapModels(EnrollCourse[][] models) {
		EnrollCourseSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EnrollCourseSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EnrollCourseSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EnrollCourseSoap[] toSoapModels(List<EnrollCourse> models) {
		List<EnrollCourseSoap> soapModels = new ArrayList<EnrollCourseSoap>(models.size());

		for (EnrollCourse model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EnrollCourseSoap[soapModels.size()]);
	}

	public EnrollCourseSoap() {
	}

	public long getPrimaryKey() {
		return _eId;
	}

	public void setPrimaryKey(long pk) {
		setEId(pk);
	}

	public long getEId() {
		return _eId;
	}

	public void setEId(long eId) {
		_eId = eId;
	}

	public String getEfName() {
		return _efName;
	}

	public void setEfName(String efName) {
		_efName = efName;
	}

	public String getEgen() {
		return _egen;
	}

	public void setEgen(String egen) {
		_egen = egen;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public long getEcont() {
		return _econt;
	}

	public void setEcont(long econt) {
		_econt = econt;
	}

	public String getEqual() {
		return _equal;
	}

	public void setEqual(String equal) {
		_equal = equal;
	}

	public String getEcourse() {
		return _ecourse;
	}

	public void setEcourse(String ecourse) {
		_ecourse = ecourse;
	}

	public String getEbatch() {
		return _ebatch;
	}

	public void setEbatch(String ebatch) {
		_ebatch = ebatch;
	}

	public String getEstatus() {
		return _estatus;
	}

	public void setEstatus(String estatus) {
		_estatus = estatus;
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
}