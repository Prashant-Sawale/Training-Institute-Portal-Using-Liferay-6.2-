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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.test.NoSuchEnrollCourseException;

import com.test.model.EnrollCourse;
import com.test.model.impl.EnrollCourseImpl;
import com.test.model.impl.EnrollCourseModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the enroll course service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mzos
 * @see EnrollCoursePersistence
 * @see EnrollCourseUtil
 * @generated
 */
public class EnrollCoursePersistenceImpl extends BasePersistenceImpl<EnrollCourse>
	implements EnrollCoursePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EnrollCourseUtil} to access the enroll course persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EnrollCourseImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EnrollCourseModelImpl.ENTITY_CACHE_ENABLED,
			EnrollCourseModelImpl.FINDER_CACHE_ENABLED, EnrollCourseImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EnrollCourseModelImpl.ENTITY_CACHE_ENABLED,
			EnrollCourseModelImpl.FINDER_CACHE_ENABLED, EnrollCourseImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EnrollCourseModelImpl.ENTITY_CACHE_ENABLED,
			EnrollCourseModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EnrollCoursePersistenceImpl() {
		setModelClass(EnrollCourse.class);
	}

	/**
	 * Caches the enroll course in the entity cache if it is enabled.
	 *
	 * @param enrollCourse the enroll course
	 */
	@Override
	public void cacheResult(EnrollCourse enrollCourse) {
		EntityCacheUtil.putResult(EnrollCourseModelImpl.ENTITY_CACHE_ENABLED,
			EnrollCourseImpl.class, enrollCourse.getPrimaryKey(), enrollCourse);

		enrollCourse.resetOriginalValues();
	}

	/**
	 * Caches the enroll courses in the entity cache if it is enabled.
	 *
	 * @param enrollCourses the enroll courses
	 */
	@Override
	public void cacheResult(List<EnrollCourse> enrollCourses) {
		for (EnrollCourse enrollCourse : enrollCourses) {
			if (EntityCacheUtil.getResult(
						EnrollCourseModelImpl.ENTITY_CACHE_ENABLED,
						EnrollCourseImpl.class, enrollCourse.getPrimaryKey()) == null) {
				cacheResult(enrollCourse);
			}
			else {
				enrollCourse.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all enroll courses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EnrollCourseImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EnrollCourseImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the enroll course.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EnrollCourse enrollCourse) {
		EntityCacheUtil.removeResult(EnrollCourseModelImpl.ENTITY_CACHE_ENABLED,
			EnrollCourseImpl.class, enrollCourse.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<EnrollCourse> enrollCourses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EnrollCourse enrollCourse : enrollCourses) {
			EntityCacheUtil.removeResult(EnrollCourseModelImpl.ENTITY_CACHE_ENABLED,
				EnrollCourseImpl.class, enrollCourse.getPrimaryKey());
		}
	}

	/**
	 * Creates a new enroll course with the primary key. Does not add the enroll course to the database.
	 *
	 * @param eId the primary key for the new enroll course
	 * @return the new enroll course
	 */
	@Override
	public EnrollCourse create(long eId) {
		EnrollCourse enrollCourse = new EnrollCourseImpl();

		enrollCourse.setNew(true);
		enrollCourse.setPrimaryKey(eId);

		return enrollCourse;
	}

	/**
	 * Removes the enroll course with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param eId the primary key of the enroll course
	 * @return the enroll course that was removed
	 * @throws com.test.NoSuchEnrollCourseException if a enroll course with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EnrollCourse remove(long eId)
		throws NoSuchEnrollCourseException, SystemException {
		return remove((Serializable)eId);
	}

	/**
	 * Removes the enroll course with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the enroll course
	 * @return the enroll course that was removed
	 * @throws com.test.NoSuchEnrollCourseException if a enroll course with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EnrollCourse remove(Serializable primaryKey)
		throws NoSuchEnrollCourseException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EnrollCourse enrollCourse = (EnrollCourse)session.get(EnrollCourseImpl.class,
					primaryKey);

			if (enrollCourse == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEnrollCourseException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(enrollCourse);
		}
		catch (NoSuchEnrollCourseException nsee) {
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
	protected EnrollCourse removeImpl(EnrollCourse enrollCourse)
		throws SystemException {
		enrollCourse = toUnwrappedModel(enrollCourse);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(enrollCourse)) {
				enrollCourse = (EnrollCourse)session.get(EnrollCourseImpl.class,
						enrollCourse.getPrimaryKeyObj());
			}

			if (enrollCourse != null) {
				session.delete(enrollCourse);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (enrollCourse != null) {
			clearCache(enrollCourse);
		}

		return enrollCourse;
	}

	@Override
	public EnrollCourse updateImpl(com.test.model.EnrollCourse enrollCourse)
		throws SystemException {
		enrollCourse = toUnwrappedModel(enrollCourse);

		boolean isNew = enrollCourse.isNew();

		Session session = null;

		try {
			session = openSession();

			if (enrollCourse.isNew()) {
				session.save(enrollCourse);

				enrollCourse.setNew(false);
			}
			else {
				session.merge(enrollCourse);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(EnrollCourseModelImpl.ENTITY_CACHE_ENABLED,
			EnrollCourseImpl.class, enrollCourse.getPrimaryKey(), enrollCourse);

		return enrollCourse;
	}

	protected EnrollCourse toUnwrappedModel(EnrollCourse enrollCourse) {
		if (enrollCourse instanceof EnrollCourseImpl) {
			return enrollCourse;
		}

		EnrollCourseImpl enrollCourseImpl = new EnrollCourseImpl();

		enrollCourseImpl.setNew(enrollCourse.isNew());
		enrollCourseImpl.setPrimaryKey(enrollCourse.getPrimaryKey());

		enrollCourseImpl.setEId(enrollCourse.getEId());
		enrollCourseImpl.setEfName(enrollCourse.getEfName());
		enrollCourseImpl.setEgen(enrollCourse.getEgen());
		enrollCourseImpl.setEmail(enrollCourse.getEmail());
		enrollCourseImpl.setEcont(enrollCourse.getEcont());
		enrollCourseImpl.setEqual(enrollCourse.getEqual());
		enrollCourseImpl.setEcourse(enrollCourse.getEcourse());
		enrollCourseImpl.setEbatch(enrollCourse.getEbatch());
		enrollCourseImpl.setEstatus(enrollCourse.getEstatus());

		return enrollCourseImpl;
	}

	/**
	 * Returns the enroll course with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the enroll course
	 * @return the enroll course
	 * @throws com.test.NoSuchEnrollCourseException if a enroll course with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EnrollCourse findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEnrollCourseException, SystemException {
		EnrollCourse enrollCourse = fetchByPrimaryKey(primaryKey);

		if (enrollCourse == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEnrollCourseException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return enrollCourse;
	}

	/**
	 * Returns the enroll course with the primary key or throws a {@link com.test.NoSuchEnrollCourseException} if it could not be found.
	 *
	 * @param eId the primary key of the enroll course
	 * @return the enroll course
	 * @throws com.test.NoSuchEnrollCourseException if a enroll course with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EnrollCourse findByPrimaryKey(long eId)
		throws NoSuchEnrollCourseException, SystemException {
		return findByPrimaryKey((Serializable)eId);
	}

	/**
	 * Returns the enroll course with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the enroll course
	 * @return the enroll course, or <code>null</code> if a enroll course with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EnrollCourse fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EnrollCourse enrollCourse = (EnrollCourse)EntityCacheUtil.getResult(EnrollCourseModelImpl.ENTITY_CACHE_ENABLED,
				EnrollCourseImpl.class, primaryKey);

		if (enrollCourse == _nullEnrollCourse) {
			return null;
		}

		if (enrollCourse == null) {
			Session session = null;

			try {
				session = openSession();

				enrollCourse = (EnrollCourse)session.get(EnrollCourseImpl.class,
						primaryKey);

				if (enrollCourse != null) {
					cacheResult(enrollCourse);
				}
				else {
					EntityCacheUtil.putResult(EnrollCourseModelImpl.ENTITY_CACHE_ENABLED,
						EnrollCourseImpl.class, primaryKey, _nullEnrollCourse);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EnrollCourseModelImpl.ENTITY_CACHE_ENABLED,
					EnrollCourseImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return enrollCourse;
	}

	/**
	 * Returns the enroll course with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param eId the primary key of the enroll course
	 * @return the enroll course, or <code>null</code> if a enroll course with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EnrollCourse fetchByPrimaryKey(long eId) throws SystemException {
		return fetchByPrimaryKey((Serializable)eId);
	}

	/**
	 * Returns all the enroll courses.
	 *
	 * @return the enroll courses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EnrollCourse> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the enroll courses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.EnrollCourseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of enroll courses
	 * @param end the upper bound of the range of enroll courses (not inclusive)
	 * @return the range of enroll courses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EnrollCourse> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the enroll courses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.EnrollCourseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of enroll courses
	 * @param end the upper bound of the range of enroll courses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of enroll courses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EnrollCourse> findAll(int start, int end,
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

		List<EnrollCourse> list = (List<EnrollCourse>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ENROLLCOURSE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ENROLLCOURSE;

				if (pagination) {
					sql = sql.concat(EnrollCourseModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EnrollCourse>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EnrollCourse>(list);
				}
				else {
					list = (List<EnrollCourse>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the enroll courses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EnrollCourse enrollCourse : findAll()) {
			remove(enrollCourse);
		}
	}

	/**
	 * Returns the number of enroll courses.
	 *
	 * @return the number of enroll courses
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

				Query q = session.createQuery(_SQL_COUNT_ENROLLCOURSE);

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
	 * Initializes the enroll course persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.test.model.EnrollCourse")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EnrollCourse>> listenersList = new ArrayList<ModelListener<EnrollCourse>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EnrollCourse>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EnrollCourseImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ENROLLCOURSE = "SELECT enrollCourse FROM EnrollCourse enrollCourse";
	private static final String _SQL_COUNT_ENROLLCOURSE = "SELECT COUNT(enrollCourse) FROM EnrollCourse enrollCourse";
	private static final String _ORDER_BY_ENTITY_ALIAS = "enrollCourse.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EnrollCourse exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EnrollCoursePersistenceImpl.class);
	private static EnrollCourse _nullEnrollCourse = new EnrollCourseImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EnrollCourse> toCacheModel() {
				return _nullEnrollCourseCacheModel;
			}
		};

	private static CacheModel<EnrollCourse> _nullEnrollCourseCacheModel = new CacheModel<EnrollCourse>() {
			@Override
			public EnrollCourse toEntityModel() {
				return _nullEnrollCourse;
			}
		};
}