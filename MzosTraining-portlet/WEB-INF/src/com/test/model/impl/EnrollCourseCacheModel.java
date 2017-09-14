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

import com.test.model.EnrollCourse;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EnrollCourse in entity cache.
 *
 * @author mzos
 * @see EnrollCourse
 * @generated
 */
public class EnrollCourseCacheModel implements CacheModel<EnrollCourse>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{eId=");
		sb.append(eId);
		sb.append(", efName=");
		sb.append(efName);
		sb.append(", egen=");
		sb.append(egen);
		sb.append(", email=");
		sb.append(email);
		sb.append(", econt=");
		sb.append(econt);
		sb.append(", equal=");
		sb.append(equal);
		sb.append(", ecourse=");
		sb.append(ecourse);
		sb.append(", ebatch=");
		sb.append(ebatch);
		sb.append(", estatus=");
		sb.append(estatus);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EnrollCourse toEntityModel() {
		EnrollCourseImpl enrollCourseImpl = new EnrollCourseImpl();

		enrollCourseImpl.setEId(eId);

		if (efName == null) {
			enrollCourseImpl.setEfName(StringPool.BLANK);
		}
		else {
			enrollCourseImpl.setEfName(efName);
		}

		if (egen == null) {
			enrollCourseImpl.setEgen(StringPool.BLANK);
		}
		else {
			enrollCourseImpl.setEgen(egen);
		}

		if (email == null) {
			enrollCourseImpl.setEmail(StringPool.BLANK);
		}
		else {
			enrollCourseImpl.setEmail(email);
		}

		enrollCourseImpl.setEcont(econt);

		if (equal == null) {
			enrollCourseImpl.setEqual(StringPool.BLANK);
		}
		else {
			enrollCourseImpl.setEqual(equal);
		}

		if (ecourse == null) {
			enrollCourseImpl.setEcourse(StringPool.BLANK);
		}
		else {
			enrollCourseImpl.setEcourse(ecourse);
		}

		if (ebatch == null) {
			enrollCourseImpl.setEbatch(StringPool.BLANK);
		}
		else {
			enrollCourseImpl.setEbatch(ebatch);
		}

		if (estatus == null) {
			enrollCourseImpl.setEstatus(StringPool.BLANK);
		}
		else {
			enrollCourseImpl.setEstatus(estatus);
		}

		enrollCourseImpl.resetOriginalValues();

		return enrollCourseImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		eId = objectInput.readLong();
		efName = objectInput.readUTF();
		egen = objectInput.readUTF();
		email = objectInput.readUTF();
		econt = objectInput.readLong();
		equal = objectInput.readUTF();
		ecourse = objectInput.readUTF();
		ebatch = objectInput.readUTF();
		estatus = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(eId);

		if (efName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(efName);
		}

		if (egen == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(egen);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeLong(econt);

		if (equal == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(equal);
		}

		if (ecourse == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ecourse);
		}

		if (ebatch == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ebatch);
		}

		if (estatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(estatus);
		}
	}

	public long eId;
	public String efName;
	public String egen;
	public String email;
	public long econt;
	public String equal;
	public String ecourse;
	public String ebatch;
	public String estatus;
}