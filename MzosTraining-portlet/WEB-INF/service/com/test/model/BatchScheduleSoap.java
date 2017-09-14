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
 * This class is used by SOAP remote services, specifically {@link com.test.service.http.BatchScheduleServiceSoap}.
 *
 * @author mzos
 * @see com.test.service.http.BatchScheduleServiceSoap
 * @generated
 */
public class BatchScheduleSoap implements Serializable {
	public static BatchScheduleSoap toSoapModel(BatchSchedule model) {
		BatchScheduleSoap soapModel = new BatchScheduleSoap();

		soapModel.setBatchSchedule_Id(model.getBatchSchedule_Id());
		soapModel.setBatchcCat(model.getBatchcCat());
		soapModel.setBatchName(model.getBatchName());
		soapModel.setBatchteacher(model.getBatchteacher());
		soapModel.setBatchTime(model.getBatchTime());
		soapModel.setBatchDay(model.getBatchDay());

		return soapModel;
	}

	public static BatchScheduleSoap[] toSoapModels(BatchSchedule[] models) {
		BatchScheduleSoap[] soapModels = new BatchScheduleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BatchScheduleSoap[][] toSoapModels(BatchSchedule[][] models) {
		BatchScheduleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BatchScheduleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BatchScheduleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BatchScheduleSoap[] toSoapModels(List<BatchSchedule> models) {
		List<BatchScheduleSoap> soapModels = new ArrayList<BatchScheduleSoap>(models.size());

		for (BatchSchedule model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BatchScheduleSoap[soapModels.size()]);
	}

	public BatchScheduleSoap() {
	}

	public long getPrimaryKey() {
		return _BatchSchedule_Id;
	}

	public void setPrimaryKey(long pk) {
		setBatchSchedule_Id(pk);
	}

	public long getBatchSchedule_Id() {
		return _BatchSchedule_Id;
	}

	public void setBatchSchedule_Id(long BatchSchedule_Id) {
		_BatchSchedule_Id = BatchSchedule_Id;
	}

	public String getBatchcCat() {
		return _batchcCat;
	}

	public void setBatchcCat(String batchcCat) {
		_batchcCat = batchcCat;
	}

	public String getBatchName() {
		return _batchName;
	}

	public void setBatchName(String batchName) {
		_batchName = batchName;
	}

	public String getBatchteacher() {
		return _batchteacher;
	}

	public void setBatchteacher(String batchteacher) {
		_batchteacher = batchteacher;
	}

	public String getBatchTime() {
		return _batchTime;
	}

	public void setBatchTime(String batchTime) {
		_batchTime = batchTime;
	}

	public String getBatchDay() {
		return _batchDay;
	}

	public void setBatchDay(String batchDay) {
		_batchDay = batchDay;
	}

	private long _BatchSchedule_Id;
	private String _batchcCat;
	private String _batchName;
	private String _batchteacher;
	private String _batchTime;
	private String _batchDay;
}