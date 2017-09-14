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

package com.test.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.test.NoSuchCoursesException;

import com.test.model.Courses;
import com.test.model.impl.CoursesImpl;
import com.test.model.impl.CoursesModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the courses service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mzos
 * @see CoursesPersistence
 * @see CoursesUtil
 * @generated
 */
public class CoursesPersistenceImpl extends BasePersistenceImpl<Courses>
	implements CoursesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CoursesUtil} to access the courses persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CoursesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CoursesModelImpl.ENTITY_CACHE_ENABLED,
			CoursesModelImpl.FINDER_CACHE_ENABLED, CoursesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CoursesModelImpl.ENTITY_CACHE_ENABLED,
			CoursesModelImpl.FINDER_CACHE_ENABLED, CoursesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CoursesModelImpl.ENTITY_CACHE_ENABLED,
			CoursesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDER1 = new FinderPath(CoursesModelImpl.ENTITY_CACHE_ENABLED,
			CoursesModelImpl.FINDER_CACHE_ENABLED, CoursesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByfinder1",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDER1 =
		new FinderPath(CoursesModelImpl.ENTITY_CACHE_ENABLED,
			CoursesModelImpl.FINDER_CACHE_ENABLED, CoursesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByfinder1",
			new String[] { String.class.getName() },
			CoursesModelImpl.CCAT_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FINDER1 = new FinderPath(CoursesModelImpl.ENTITY_CACHE_ENABLED,
			CoursesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByfinder1",
			new String[] { String.class.getName() });

	/**
	 * Returns all the courseses where cCat = &#63;.
	 *
	 * @param cCat the c cat
	 * @return the matching courseses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Courses> findByfinder1(String cCat) throws SystemException {
		return findByfinder1(cCat, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the courseses where cCat = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.CoursesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param cCat the c cat
	 * @param start the lower bound of the range of courseses
	 * @param end the upper bound of the range of courseses (not inclusive)
	 * @return the range of matching courseses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Courses> findByfinder1(String cCat, int start, int end)
		throws SystemException {
		return findByfinder1(cCat, start, end, null);
	}

	/**
	 * Returns an ordered range of all the courseses where cCat = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.CoursesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param cCat the c cat
	 * @param start the lower bound of the range of courseses
	 * @param end the upper bound of the range of courseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching courseses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Courses> findByfinder1(String cCat, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDER1;
			finderArgs = new Object[] { cCat };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDER1;
			finderArgs = new Object[] { cCat, start, end, orderByComparator };
		}

		List<Courses> list = (List<Courses>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Courses courses : list) {
				if (!Validator.equals(cCat, courses.getCCat())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_COURSES_WHERE);

			boolean bindCCat = false;

			if (cCat == null) {
				query.append(_FINDER_COLUMN_FINDER1_CCAT_1);
			}
			else if (cCat.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FINDER1_CCAT_3);
			}
			else {
				bindCCat = true;

				query.append(_FINDER_COLUMN_FINDER1_CCAT_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CoursesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCCat) {
					qPos.add(cCat);
				}

				if (!pagination) {
					list = (List<Courses>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Courses>(list);
				}
				else {
					list = (List<Courses>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first courses in the ordered set where cCat = &#63;.
	 *
	 * @param cCat the c cat
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching courses
	 * @throws com.test.NoSuchCoursesException if a matching courses could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Courses findByfinder1_First(String cCat,
		OrderByComparator orderByComparator)
		throws NoSuchCoursesException, SystemException {
		Courses courses = fetchByfinder1_First(cCat, orderByComparator);

		if (courses != null) {
			return courses;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("cCat=");
		msg.append(cCat);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCoursesException(msg.toString());
	}

	/**
	 * Returns the first courses in the ordered set where cCat = &#63;.
	 *
	 * @param cCat the c cat
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching courses, or <code>null</code> if a matching courses could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Courses fetchByfinder1_First(String cCat,
		OrderByComparator orderByComparator) throws SystemException {
		List<Courses> list = findByfinder1(cCat, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last courses in the ordered set where cCat = &#63;.
	 *
	 * @param cCat the c cat
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching courses
	 * @throws com.test.NoSuchCoursesException if a matching courses could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Courses findByfinder1_Last(String cCat,
		OrderByComparator orderByComparator)
		throws NoSuchCoursesException, SystemException {
		Courses courses = fetchByfinder1_Last(cCat, orderByComparator);

		if (courses != null) {
			return courses;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("cCat=");
		msg.append(cCat);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCoursesException(msg.toString());
	}

	/**
	 * Returns the last courses in the ordered set where cCat = &#63;.
	 *
	 * @param cCat the c cat
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching courses, or <code>null</code> if a matching courses could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Courses fetchByfinder1_Last(String cCat,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByfinder1(cCat);

		if (count == 0) {
			return null;
		}

		List<Courses> list = findByfinder1(cCat, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the courseses before and after the current courses in the ordered set where cCat = &#63;.
	 *
	 * @param cId the primary key of the current courses
	 * @param cCat the c cat
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next courses
	 * @throws com.test.NoSuchCoursesException if a courses with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Courses[] findByfinder1_PrevAndNext(long cId, String cCat,
		OrderByComparator orderByComparator)
		throws NoSuchCoursesException, SystemException {
		Courses courses = findByPrimaryKey(cId);

		Session session = null;

		try {
			session = openSession();

			Courses[] array = new CoursesImpl[3];

			array[0] = getByfinder1_PrevAndNext(session, courses, cCat,
					orderByComparator, true);

			array[1] = courses;

			array[2] = getByfinder1_PrevAndNext(session, courses, cCat,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Courses getByfinder1_PrevAndNext(Session session,
		Courses courses, String cCat, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COURSES_WHERE);

		boolean bindCCat = false;

		if (cCat == null) {
			query.append(_FINDER_COLUMN_FINDER1_CCAT_1);
		}
		else if (cCat.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_FINDER1_CCAT_3);
		}
		else {
			bindCCat = true;

			query.append(_FINDER_COLUMN_FINDER1_CCAT_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CoursesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCCat) {
			qPos.add(cCat);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(courses);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Courses> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the courseses where cCat = &#63; from the database.
	 *
	 * @param cCat the c cat
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByfinder1(String cCat) throws SystemException {
		for (Courses courses : findByfinder1(cCat, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(courses);
		}
	}

	/**
	 * Returns the number of courseses where cCat = &#63;.
	 *
	 * @param cCat the c cat
	 * @return the number of matching courseses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByfinder1(String cCat) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FINDER1;

		Object[] finderArgs = new Object[] { cCat };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COURSES_WHERE);

			boolean bindCCat = false;

			if (cCat == null) {
				query.append(_FINDER_COLUMN_FINDER1_CCAT_1);
			}
			else if (cCat.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FINDER1_CCAT_3);
			}
			else {
				bindCCat = true;

				query.append(_FINDER_COLUMN_FINDER1_CCAT_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCCat) {
					qPos.add(cCat);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_FINDER1_CCAT_1 = "courses.cCat IS NULL";
	private static final String _FINDER_COLUMN_FINDER1_CCAT_2 = "courses.cCat = ?";
	private static final String _FINDER_COLUMN_FINDER1_CCAT_3 = "(courses.cCat IS NULL OR courses.cCat = '')";

	public CoursesPersistenceImpl() {
		setModelClass(Courses.class);
	}

	/**
	 * Caches the courses in the entity cache if it is enabled.
	 *
	 * @param courses the courses
	 */
	@Override
	public void cacheResult(Courses courses) {
		EntityCacheUtil.putResult(CoursesModelImpl.ENTITY_CACHE_ENABLED,
			CoursesImpl.class, courses.getPrimaryKey(), courses);

		courses.resetOriginalValues();
	}

	/**
	 * Caches the courseses in the entity cache if it is enabled.
	 *
	 * @param courseses the courseses
	 */
	@Override
	public void cacheResult(List<Courses> courseses) {
		for (Courses courses : courseses) {
			if (EntityCacheUtil.getResult(
						CoursesModelImpl.ENTITY_CACHE_ENABLED,
						CoursesImpl.class, courses.getPrimaryKey()) == null) {
				cacheResult(courses);
			}
			else {
				courses.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all courseses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CoursesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CoursesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the courses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Courses courses) {
		EntityCacheUtil.removeResult(CoursesModelImpl.ENTITY_CACHE_ENABLED,
			CoursesImpl.class, courses.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Courses> courseses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Courses courses : courseses) {
			EntityCacheUtil.removeResult(CoursesModelImpl.ENTITY_CACHE_ENABLED,
				CoursesImpl.class, courses.getPrimaryKey());
		}
	}

	/**
	 * Creates a new courses with the primary key. Does not add the courses to the database.
	 *
	 * @param cId the primary key for the new courses
	 * @return the new courses
	 */
	@Override
	public Courses create(long cId) {
		Courses courses = new CoursesImpl();

		courses.setNew(true);
		courses.setPrimaryKey(cId);

		return courses;
	}

	/**
	 * Removes the courses with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cId the primary key of the courses
	 * @return the courses that was removed
	 * @throws com.test.NoSuchCoursesException if a courses with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Courses remove(long cId)
		throws NoSuchCoursesException, SystemException {
		return remove((Serializable)cId);
	}

	/**
	 * Removes the courses with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the courses
	 * @return the courses that was removed
	 * @throws com.test.NoSuchCoursesException if a courses with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Courses remove(Serializable primaryKey)
		throws NoSuchCoursesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Courses courses = (Courses)session.get(CoursesImpl.class, primaryKey);

			if (courses == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCoursesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(courses);
		}
		catch (NoSuchCoursesException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Courses removeImpl(Courses courses) throws SystemException {
		courses = toUnwrappedModel(courses);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(courses)) {
				courses = (Courses)session.get(CoursesImpl.class,
						courses.getPrimaryKeyObj());
			}

			if (courses != null) {
				session.delete(courses);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (courses != null) {
			clearCache(courses);
		}

		return courses;
	}

	@Override
	public Courses updateImpl(com.test.model.Courses courses)
		throws SystemException {
		courses = toUnwrappedModel(courses);

		boolean isNew = courses.isNew();

		CoursesModelImpl coursesModelImpl = (CoursesModelImpl)courses;

		Session session = null;

		try {
			session = openSession();

			if (courses.isNew()) {
				session.save(courses);

				courses.setNew(false);
			}
			else {
				session.merge(courses);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CoursesModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((coursesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDER1.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { coursesModelImpl.getOriginalCCat() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDER1, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDER1,
					args);

				args = new Object[] { coursesModelImpl.getCCat() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDER1, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDER1,
					args);
			}
		}

		EntityCacheUtil.putResult(CoursesModelImpl.ENTITY_CACHE_ENABLED,
			CoursesImpl.class, courses.getPrimaryKey(), courses);

		return courses;
	}

	protected Courses toUnwrappedModel(Courses courses) {
		if (courses instanceof CoursesImpl) {
			return courses;
		}

		CoursesImpl coursesImpl = new CoursesImpl();

		coursesImpl.setNew(courses.isNew());
		coursesImpl.setPrimaryKey(courses.getPrimaryKey());

		coursesImpl.setCId(courses.getCId());
		coursesImpl.setCName(courses.getCName());
		coursesImpl.setCCat(courses.getCCat());
		coursesImpl.setCDesc(courses.getCDesc());
		coursesImpl.setCPreq(courses.getCPreq());
		coursesImpl.setCDuration(courses.getCDuration());

		return coursesImpl;
	}

	/**
	 * Returns the courses with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the courses
	 * @return the courses
	 * @throws com.test.NoSuchCoursesException if a courses with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Courses findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCoursesException, SystemException {
		Courses courses = fetchByPrimaryKey(primaryKey);

		if (courses == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCoursesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return courses;
	}

	/**
	 * Returns the courses with the primary key or throws a {@link com.test.NoSuchCoursesException} if it could not be found.
	 *
	 * @param cId the primary key of the courses
	 * @return the courses
	 * @throws com.test.NoSuchCoursesException if a courses with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Courses findByPrimaryKey(long cId)
		throws NoSuchCoursesException, SystemException {
		return findByPrimaryKey((Serializable)cId);
	}

	/**
	 * Returns the courses with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the courses
	 * @return the courses, or <code>null</code> if a courses with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Courses fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Courses courses = (Courses)EntityCacheUtil.getResult(CoursesModelImpl.ENTITY_CACHE_ENABLED,
				CoursesImpl.class, primaryKey);

		if (courses == _nullCourses) {
			return null;
		}

		if (courses == null) {
			Session session = null;

			try {
				session = openSession();

				courses = (Courses)session.get(CoursesImpl.class, primaryKey);

				if (courses != null) {
					cacheResult(courses);
				}
				else {
					EntityCacheUtil.putResult(CoursesModelImpl.ENTITY_CACHE_ENABLED,
						CoursesImpl.class, primaryKey, _nullCourses);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CoursesModelImpl.ENTITY_CACHE_ENABLED,
					CoursesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return courses;
	}

	/**
	 * Returns the courses with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cId the primary key of the courses
	 * @return the courses, or <code>null</code> if a courses with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Courses fetchByPrimaryKey(long cId) throws SystemException {
		return fetchByPrimaryKey((Serializable)cId);
	}

	/**
	 * Returns all the courseses.
	 *
	 * @return the courseses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Courses> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the courseses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.CoursesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of courseses
	 * @param end the upper bound of the range of courseses (not inclusive)
	 * @return the range of courseses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Courses> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the courseses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.CoursesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of courseses
	 * @param end the upper bound of the range of courseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of courseses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Courses> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Courses> list = (List<Courses>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_COURSES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_COURSES;

				if (pagination) {
					sql = sql.concat(CoursesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Courses>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Courses>(list);
				}
				else {
					list = (List<Courses>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the courseses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Courses courses : findAll()) {
			remove(courses);
		}
	}

	/**
	 * Returns the number of courseses.
	 *
	 * @return the number of courseses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_COURSES);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the courses persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.test.model.Courses")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Courses>> listenersList = new ArrayList<ModelListener<Courses>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Courses>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(CoursesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_COURSES = "SELECT courses FROM Courses courses";
	private static final String _SQL_SELECT_COURSES_WHERE = "SELECT courses FROM Courses courses WHERE ";
	private static final String _SQL_COUNT_COURSES = "SELECT COUNT(courses) FROM Courses courses";
	private static final String _SQL_COUNT_COURSES_WHERE = "SELECT COUNT(courses) FROM Courses courses WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "courses.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Courses exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Courses exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CoursesPersistenceImpl.class);
	private static Courses _nullCourses = new CoursesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Courses> toCacheModel() {
				return _nullCoursesCacheModel;
			}
		};

	private static CacheModel<Courses> _nullCoursesCacheModel = new CacheModel<Courses>() {
			@Override
			public Courses toEntityModel() {
				return _nullCourses;
			}
		};
}