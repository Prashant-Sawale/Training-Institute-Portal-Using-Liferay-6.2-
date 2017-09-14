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

import com.test.NoSuchBatchScheduleException;

import com.test.model.BatchSchedule;
import com.test.model.impl.BatchScheduleImpl;
import com.test.model.impl.BatchScheduleModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the batch schedule service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mzos
 * @see BatchSchedulePersistence
 * @see BatchScheduleUtil
 * @generated
 */
public class BatchSchedulePersistenceImpl extends BasePersistenceImpl<BatchSchedule>
	implements BatchSchedulePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BatchScheduleUtil} to access the batch schedule persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BatchScheduleImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BatchScheduleModelImpl.ENTITY_CACHE_ENABLED,
			BatchScheduleModelImpl.FINDER_CACHE_ENABLED,
			BatchScheduleImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BatchScheduleModelImpl.ENTITY_CACHE_ENABLED,
			BatchScheduleModelImpl.FINDER_CACHE_ENABLED,
			BatchScheduleImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BatchScheduleModelImpl.ENTITY_CACHE_ENABLED,
			BatchScheduleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDER2 = new FinderPath(BatchScheduleModelImpl.ENTITY_CACHE_ENABLED,
			BatchScheduleModelImpl.FINDER_CACHE_ENABLED,
			BatchScheduleImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByfinder2",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDER2 =
		new FinderPath(BatchScheduleModelImpl.ENTITY_CACHE_ENABLED,
			BatchScheduleModelImpl.FINDER_CACHE_ENABLED,
			BatchScheduleImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByfinder2", new String[] { String.class.getName() },
			BatchScheduleModelImpl.BATCHCCAT_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FINDER2 = new FinderPath(BatchScheduleModelImpl.ENTITY_CACHE_ENABLED,
			BatchScheduleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByfinder2",
			new String[] { String.class.getName() });

	/**
	 * Returns all the batch schedules where batchcCat = &#63;.
	 *
	 * @param batchcCat the batchc cat
	 * @return the matching batch schedules
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BatchSchedule> findByfinder2(String batchcCat)
		throws SystemException {
		return findByfinder2(batchcCat, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the batch schedules where batchcCat = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.BatchScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param batchcCat the batchc cat
	 * @param start the lower bound of the range of batch schedules
	 * @param end the upper bound of the range of batch schedules (not inclusive)
	 * @return the range of matching batch schedules
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BatchSchedule> findByfinder2(String batchcCat, int start,
		int end) throws SystemException {
		return findByfinder2(batchcCat, start, end, null);
	}

	/**
	 * Returns an ordered range of all the batch schedules where batchcCat = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.BatchScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param batchcCat the batchc cat
	 * @param start the lower bound of the range of batch schedules
	 * @param end the upper bound of the range of batch schedules (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching batch schedules
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BatchSchedule> findByfinder2(String batchcCat, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDER2;
			finderArgs = new Object[] { batchcCat };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDER2;
			finderArgs = new Object[] { batchcCat, start, end, orderByComparator };
		}

		List<BatchSchedule> list = (List<BatchSchedule>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (BatchSchedule batchSchedule : list) {
				if (!Validator.equals(batchcCat, batchSchedule.getBatchcCat())) {
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

			query.append(_SQL_SELECT_BATCHSCHEDULE_WHERE);

			boolean bindBatchcCat = false;

			if (batchcCat == null) {
				query.append(_FINDER_COLUMN_FINDER2_BATCHCCAT_1);
			}
			else if (batchcCat.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FINDER2_BATCHCCAT_3);
			}
			else {
				bindBatchcCat = true;

				query.append(_FINDER_COLUMN_FINDER2_BATCHCCAT_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BatchScheduleModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindBatchcCat) {
					qPos.add(batchcCat);
				}

				if (!pagination) {
					list = (List<BatchSchedule>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BatchSchedule>(list);
				}
				else {
					list = (List<BatchSchedule>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first batch schedule in the ordered set where batchcCat = &#63;.
	 *
	 * @param batchcCat the batchc cat
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching batch schedule
	 * @throws com.test.NoSuchBatchScheduleException if a matching batch schedule could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BatchSchedule findByfinder2_First(String batchcCat,
		OrderByComparator orderByComparator)
		throws NoSuchBatchScheduleException, SystemException {
		BatchSchedule batchSchedule = fetchByfinder2_First(batchcCat,
				orderByComparator);

		if (batchSchedule != null) {
			return batchSchedule;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("batchcCat=");
		msg.append(batchcCat);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBatchScheduleException(msg.toString());
	}

	/**
	 * Returns the first batch schedule in the ordered set where batchcCat = &#63;.
	 *
	 * @param batchcCat the batchc cat
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching batch schedule, or <code>null</code> if a matching batch schedule could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BatchSchedule fetchByfinder2_First(String batchcCat,
		OrderByComparator orderByComparator) throws SystemException {
		List<BatchSchedule> list = findByfinder2(batchcCat, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last batch schedule in the ordered set where batchcCat = &#63;.
	 *
	 * @param batchcCat the batchc cat
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching batch schedule
	 * @throws com.test.NoSuchBatchScheduleException if a matching batch schedule could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BatchSchedule findByfinder2_Last(String batchcCat,
		OrderByComparator orderByComparator)
		throws NoSuchBatchScheduleException, SystemException {
		BatchSchedule batchSchedule = fetchByfinder2_Last(batchcCat,
				orderByComparator);

		if (batchSchedule != null) {
			return batchSchedule;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("batchcCat=");
		msg.append(batchcCat);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBatchScheduleException(msg.toString());
	}

	/**
	 * Returns the last batch schedule in the ordered set where batchcCat = &#63;.
	 *
	 * @param batchcCat the batchc cat
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching batch schedule, or <code>null</code> if a matching batch schedule could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BatchSchedule fetchByfinder2_Last(String batchcCat,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByfinder2(batchcCat);

		if (count == 0) {
			return null;
		}

		List<BatchSchedule> list = findByfinder2(batchcCat, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the batch schedules before and after the current batch schedule in the ordered set where batchcCat = &#63;.
	 *
	 * @param BatchSchedule_Id the primary key of the current batch schedule
	 * @param batchcCat the batchc cat
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next batch schedule
	 * @throws com.test.NoSuchBatchScheduleException if a batch schedule with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BatchSchedule[] findByfinder2_PrevAndNext(long BatchSchedule_Id,
		String batchcCat, OrderByComparator orderByComparator)
		throws NoSuchBatchScheduleException, SystemException {
		BatchSchedule batchSchedule = findByPrimaryKey(BatchSchedule_Id);

		Session session = null;

		try {
			session = openSession();

			BatchSchedule[] array = new BatchScheduleImpl[3];

			array[0] = getByfinder2_PrevAndNext(session, batchSchedule,
					batchcCat, orderByComparator, true);

			array[1] = batchSchedule;

			array[2] = getByfinder2_PrevAndNext(session, batchSchedule,
					batchcCat, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected BatchSchedule getByfinder2_PrevAndNext(Session session,
		BatchSchedule batchSchedule, String batchcCat,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BATCHSCHEDULE_WHERE);

		boolean bindBatchcCat = false;

		if (batchcCat == null) {
			query.append(_FINDER_COLUMN_FINDER2_BATCHCCAT_1);
		}
		else if (batchcCat.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_FINDER2_BATCHCCAT_3);
		}
		else {
			bindBatchcCat = true;

			query.append(_FINDER_COLUMN_FINDER2_BATCHCCAT_2);
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
			query.append(BatchScheduleModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindBatchcCat) {
			qPos.add(batchcCat);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(batchSchedule);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BatchSchedule> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the batch schedules where batchcCat = &#63; from the database.
	 *
	 * @param batchcCat the batchc cat
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByfinder2(String batchcCat) throws SystemException {
		for (BatchSchedule batchSchedule : findByfinder2(batchcCat,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(batchSchedule);
		}
	}

	/**
	 * Returns the number of batch schedules where batchcCat = &#63;.
	 *
	 * @param batchcCat the batchc cat
	 * @return the number of matching batch schedules
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByfinder2(String batchcCat) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FINDER2;

		Object[] finderArgs = new Object[] { batchcCat };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BATCHSCHEDULE_WHERE);

			boolean bindBatchcCat = false;

			if (batchcCat == null) {
				query.append(_FINDER_COLUMN_FINDER2_BATCHCCAT_1);
			}
			else if (batchcCat.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FINDER2_BATCHCCAT_3);
			}
			else {
				bindBatchcCat = true;

				query.append(_FINDER_COLUMN_FINDER2_BATCHCCAT_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindBatchcCat) {
					qPos.add(batchcCat);
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

	private static final String _FINDER_COLUMN_FINDER2_BATCHCCAT_1 = "batchSchedule.batchcCat IS NULL";
	private static final String _FINDER_COLUMN_FINDER2_BATCHCCAT_2 = "batchSchedule.batchcCat = ?";
	private static final String _FINDER_COLUMN_FINDER2_BATCHCCAT_3 = "(batchSchedule.batchcCat IS NULL OR batchSchedule.batchcCat = '')";

	public BatchSchedulePersistenceImpl() {
		setModelClass(BatchSchedule.class);
	}

	/**
	 * Caches the batch schedule in the entity cache if it is enabled.
	 *
	 * @param batchSchedule the batch schedule
	 */
	@Override
	public void cacheResult(BatchSchedule batchSchedule) {
		EntityCacheUtil.putResult(BatchScheduleModelImpl.ENTITY_CACHE_ENABLED,
			BatchScheduleImpl.class, batchSchedule.getPrimaryKey(),
			batchSchedule);

		batchSchedule.resetOriginalValues();
	}

	/**
	 * Caches the batch schedules in the entity cache if it is enabled.
	 *
	 * @param batchSchedules the batch schedules
	 */
	@Override
	public void cacheResult(List<BatchSchedule> batchSchedules) {
		for (BatchSchedule batchSchedule : batchSchedules) {
			if (EntityCacheUtil.getResult(
						BatchScheduleModelImpl.ENTITY_CACHE_ENABLED,
						BatchScheduleImpl.class, batchSchedule.getPrimaryKey()) == null) {
				cacheResult(batchSchedule);
			}
			else {
				batchSchedule.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all batch schedules.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(BatchScheduleImpl.class.getName());
		}

		EntityCacheUtil.clearCache(BatchScheduleImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the batch schedule.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BatchSchedule batchSchedule) {
		EntityCacheUtil.removeResult(BatchScheduleModelImpl.ENTITY_CACHE_ENABLED,
			BatchScheduleImpl.class, batchSchedule.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<BatchSchedule> batchSchedules) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (BatchSchedule batchSchedule : batchSchedules) {
			EntityCacheUtil.removeResult(BatchScheduleModelImpl.ENTITY_CACHE_ENABLED,
				BatchScheduleImpl.class, batchSchedule.getPrimaryKey());
		}
	}

	/**
	 * Creates a new batch schedule with the primary key. Does not add the batch schedule to the database.
	 *
	 * @param BatchSchedule_Id the primary key for the new batch schedule
	 * @return the new batch schedule
	 */
	@Override
	public BatchSchedule create(long BatchSchedule_Id) {
		BatchSchedule batchSchedule = new BatchScheduleImpl();

		batchSchedule.setNew(true);
		batchSchedule.setPrimaryKey(BatchSchedule_Id);

		return batchSchedule;
	}

	/**
	 * Removes the batch schedule with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param BatchSchedule_Id the primary key of the batch schedule
	 * @return the batch schedule that was removed
	 * @throws com.test.NoSuchBatchScheduleException if a batch schedule with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BatchSchedule remove(long BatchSchedule_Id)
		throws NoSuchBatchScheduleException, SystemException {
		return remove((Serializable)BatchSchedule_Id);
	}

	/**
	 * Removes the batch schedule with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the batch schedule
	 * @return the batch schedule that was removed
	 * @throws com.test.NoSuchBatchScheduleException if a batch schedule with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BatchSchedule remove(Serializable primaryKey)
		throws NoSuchBatchScheduleException, SystemException {
		Session session = null;

		try {
			session = openSession();

			BatchSchedule batchSchedule = (BatchSchedule)session.get(BatchScheduleImpl.class,
					primaryKey);

			if (batchSchedule == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBatchScheduleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(batchSchedule);
		}
		catch (NoSuchBatchScheduleException nsee) {
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
	protected BatchSchedule removeImpl(BatchSchedule batchSchedule)
		throws SystemException {
		batchSchedule = toUnwrappedModel(batchSchedule);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(batchSchedule)) {
				batchSchedule = (BatchSchedule)session.get(BatchScheduleImpl.class,
						batchSchedule.getPrimaryKeyObj());
			}

			if (batchSchedule != null) {
				session.delete(batchSchedule);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (batchSchedule != null) {
			clearCache(batchSchedule);
		}

		return batchSchedule;
	}

	@Override
	public BatchSchedule updateImpl(com.test.model.BatchSchedule batchSchedule)
		throws SystemException {
		batchSchedule = toUnwrappedModel(batchSchedule);

		boolean isNew = batchSchedule.isNew();

		BatchScheduleModelImpl batchScheduleModelImpl = (BatchScheduleModelImpl)batchSchedule;

		Session session = null;

		try {
			session = openSession();

			if (batchSchedule.isNew()) {
				session.save(batchSchedule);

				batchSchedule.setNew(false);
			}
			else {
				session.merge(batchSchedule);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !BatchScheduleModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((batchScheduleModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDER2.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						batchScheduleModelImpl.getOriginalBatchcCat()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDER2, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDER2,
					args);

				args = new Object[] { batchScheduleModelImpl.getBatchcCat() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDER2, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDER2,
					args);
			}
		}

		EntityCacheUtil.putResult(BatchScheduleModelImpl.ENTITY_CACHE_ENABLED,
			BatchScheduleImpl.class, batchSchedule.getPrimaryKey(),
			batchSchedule);

		return batchSchedule;
	}

	protected BatchSchedule toUnwrappedModel(BatchSchedule batchSchedule) {
		if (batchSchedule instanceof BatchScheduleImpl) {
			return batchSchedule;
		}

		BatchScheduleImpl batchScheduleImpl = new BatchScheduleImpl();

		batchScheduleImpl.setNew(batchSchedule.isNew());
		batchScheduleImpl.setPrimaryKey(batchSchedule.getPrimaryKey());

		batchScheduleImpl.setBatchSchedule_Id(batchSchedule.getBatchSchedule_Id());
		batchScheduleImpl.setBatchcCat(batchSchedule.getBatchcCat());
		batchScheduleImpl.setBatchName(batchSchedule.getBatchName());
		batchScheduleImpl.setBatchteacher(batchSchedule.getBatchteacher());
		batchScheduleImpl.setBatchTime(batchSchedule.getBatchTime());
		batchScheduleImpl.setBatchDay(batchSchedule.getBatchDay());

		return batchScheduleImpl;
	}

	/**
	 * Returns the batch schedule with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the batch schedule
	 * @return the batch schedule
	 * @throws com.test.NoSuchBatchScheduleException if a batch schedule with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BatchSchedule findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBatchScheduleException, SystemException {
		BatchSchedule batchSchedule = fetchByPrimaryKey(primaryKey);

		if (batchSchedule == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBatchScheduleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return batchSchedule;
	}

	/**
	 * Returns the batch schedule with the primary key or throws a {@link com.test.NoSuchBatchScheduleException} if it could not be found.
	 *
	 * @param BatchSchedule_Id the primary key of the batch schedule
	 * @return the batch schedule
	 * @throws com.test.NoSuchBatchScheduleException if a batch schedule with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BatchSchedule findByPrimaryKey(long BatchSchedule_Id)
		throws NoSuchBatchScheduleException, SystemException {
		return findByPrimaryKey((Serializable)BatchSchedule_Id);
	}

	/**
	 * Returns the batch schedule with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the batch schedule
	 * @return the batch schedule, or <code>null</code> if a batch schedule with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BatchSchedule fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		BatchSchedule batchSchedule = (BatchSchedule)EntityCacheUtil.getResult(BatchScheduleModelImpl.ENTITY_CACHE_ENABLED,
				BatchScheduleImpl.class, primaryKey);

		if (batchSchedule == _nullBatchSchedule) {
			return null;
		}

		if (batchSchedule == null) {
			Session session = null;

			try {
				session = openSession();

				batchSchedule = (BatchSchedule)session.get(BatchScheduleImpl.class,
						primaryKey);

				if (batchSchedule != null) {
					cacheResult(batchSchedule);
				}
				else {
					EntityCacheUtil.putResult(BatchScheduleModelImpl.ENTITY_CACHE_ENABLED,
						BatchScheduleImpl.class, primaryKey, _nullBatchSchedule);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(BatchScheduleModelImpl.ENTITY_CACHE_ENABLED,
					BatchScheduleImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return batchSchedule;
	}

	/**
	 * Returns the batch schedule with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param BatchSchedule_Id the primary key of the batch schedule
	 * @return the batch schedule, or <code>null</code> if a batch schedule with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BatchSchedule fetchByPrimaryKey(long BatchSchedule_Id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)BatchSchedule_Id);
	}

	/**
	 * Returns all the batch schedules.
	 *
	 * @return the batch schedules
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BatchSchedule> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the batch schedules.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.BatchScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of batch schedules
	 * @param end the upper bound of the range of batch schedules (not inclusive)
	 * @return the range of batch schedules
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BatchSchedule> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the batch schedules.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.BatchScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of batch schedules
	 * @param end the upper bound of the range of batch schedules (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of batch schedules
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BatchSchedule> findAll(int start, int end,
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

		List<BatchSchedule> list = (List<BatchSchedule>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BATCHSCHEDULE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BATCHSCHEDULE;

				if (pagination) {
					sql = sql.concat(BatchScheduleModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<BatchSchedule>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BatchSchedule>(list);
				}
				else {
					list = (List<BatchSchedule>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the batch schedules from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (BatchSchedule batchSchedule : findAll()) {
			remove(batchSchedule);
		}
	}

	/**
	 * Returns the number of batch schedules.
	 *
	 * @return the number of batch schedules
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

				Query q = session.createQuery(_SQL_COUNT_BATCHSCHEDULE);

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
	 * Initializes the batch schedule persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.test.model.BatchSchedule")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<BatchSchedule>> listenersList = new ArrayList<ModelListener<BatchSchedule>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<BatchSchedule>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(BatchScheduleImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_BATCHSCHEDULE = "SELECT batchSchedule FROM BatchSchedule batchSchedule";
	private static final String _SQL_SELECT_BATCHSCHEDULE_WHERE = "SELECT batchSchedule FROM BatchSchedule batchSchedule WHERE ";
	private static final String _SQL_COUNT_BATCHSCHEDULE = "SELECT COUNT(batchSchedule) FROM BatchSchedule batchSchedule";
	private static final String _SQL_COUNT_BATCHSCHEDULE_WHERE = "SELECT COUNT(batchSchedule) FROM BatchSchedule batchSchedule WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "batchSchedule.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BatchSchedule exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No BatchSchedule exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(BatchSchedulePersistenceImpl.class);
	private static BatchSchedule _nullBatchSchedule = new BatchScheduleImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<BatchSchedule> toCacheModel() {
				return _nullBatchScheduleCacheModel;
			}
		};

	private static CacheModel<BatchSchedule> _nullBatchScheduleCacheModel = new CacheModel<BatchSchedule>() {
			@Override
			public BatchSchedule toEntityModel() {
				return _nullBatchSchedule;
			}
		};
}