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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.test.model.BatchSchedule;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing BatchSchedule in entity cache.
 *
 * @author mzos
 * @see BatchSchedule
 * @generated
 */
public class BatchScheduleCacheModel implements CacheModel<BatchSchedule>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{BatchSchedule_Id=");
		sb.append(BatchSchedule_Id);
		sb.append(", batchcCat=");
		sb.append(batchcCat);
		sb.append(", batchName=");
		sb.append(batchName);
		sb.append(", batchteacher=");
		sb.append(batchteacher);
		sb.append(", batchTime=");
		sb.append(batchTime);
		sb.append(", batchDay=");
		sb.append(batchDay);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BatchSchedule toEntityModel() {
		BatchScheduleImpl batchScheduleImpl = new BatchScheduleImpl();

		batchScheduleImpl.setBatchSchedule_Id(BatchSchedule_Id);

		if (batchcCat == null) {
			batchScheduleImpl.setBatchcCat(StringPool.BLANK);
		}
		else {
			batchScheduleImpl.setBatchcCat(batchcCat);
		}

		if (batchName == null) {
			batchScheduleImpl.setBatchName(StringPool.BLANK);
		}
		else {
			batchScheduleImpl.setBatchName(batchName);
		}

		if (batchteacher == null) {
			batchScheduleImpl.setBatchteacher(StringPool.BLANK);
		}
		else {
			batchScheduleImpl.setBatchteacher(batchteacher);
		}

		if (batchTime == null) {
			batchScheduleImpl.setBatchTime(StringPool.BLANK);
		}
		else {
			batchScheduleImpl.setBatchTime(batchTime);
		}

		if (batchDay == null) {
			batchScheduleImpl.setBatchDay(StringPool.BLANK);
		}
		else {
			batchScheduleImpl.setBatchDay(batchDay);
		}

		batchScheduleImpl.resetOriginalValues();

		return batchScheduleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		BatchSchedule_Id = objectInput.readLong();
		batchcCat = objectInput.readUTF();
		batchName = objectInput.readUTF();
		batchteacher = objectInput.readUTF();
		batchTime = objectInput.readUTF();
		batchDay = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(BatchSchedule_Id);

		if (batchcCat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(batchcCat);
		}

		if (batchName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(batchName);
		}

		if (batchteacher == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(batchteacher);
		}

		if (batchTime == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(batchTime);
		}

		if (batchDay == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(batchDay);
		}
	}

	public long BatchSchedule_Id;
	public String batchcCat;
	public String batchName;
	public String batchteacher;
	public String batchTime;
	public String batchDay;
}