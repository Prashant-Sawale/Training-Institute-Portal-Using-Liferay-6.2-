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

import com.test.model.Courses;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Courses in entity cache.
 *
 * @author mzos
 * @see Courses
 * @generated
 */
public class CoursesCacheModel implements CacheModel<Courses>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{cId=");
		sb.append(cId);
		sb.append(", cName=");
		sb.append(cName);
		sb.append(", cCat=");
		sb.append(cCat);
		sb.append(", cDesc=");
		sb.append(cDesc);
		sb.append(", cPreq=");
		sb.append(cPreq);
		sb.append(", cDuration=");
		sb.append(cDuration);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Courses toEntityModel() {
		CoursesImpl coursesImpl = new CoursesImpl();

		coursesImpl.setCId(cId);

		if (cName == null) {
			coursesImpl.setCName(StringPool.BLANK);
		}
		else {
			coursesImpl.setCName(cName);
		}

		if (cCat == null) {
			coursesImpl.setCCat(StringPool.BLANK);
		}
		else {
			coursesImpl.setCCat(cCat);
		}

		if (cDesc == null) {
			coursesImpl.setCDesc(StringPool.BLANK);
		}
		else {
			coursesImpl.setCDesc(cDesc);
		}

		if (cPreq == null) {
			coursesImpl.setCPreq(StringPool.BLANK);
		}
		else {
			coursesImpl.setCPreq(cPreq);
		}

		coursesImpl.setCDuration(cDuration);

		coursesImpl.resetOriginalValues();

		return coursesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cId = objectInput.readLong();
		cName = objectInput.readUTF();
		cCat = objectInput.readUTF();
		cDesc = objectInput.readUTF();
		cPreq = objectInput.readUTF();
		cDuration = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(cId);

		if (cName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cName);
		}

		if (cCat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cCat);
		}

		if (cDesc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cDesc);
		}

		if (cPreq == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cPreq);
		}

		objectOutput.writeInt(cDuration);
	}

	public long cId;
	public String cName;
	public String cCat;
	public String cDesc;
	public String cPreq;
	public int cDuration;
}