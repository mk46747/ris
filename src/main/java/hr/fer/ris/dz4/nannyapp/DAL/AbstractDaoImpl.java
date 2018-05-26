package hr.fer.ris.dz4.nannyapp.DAL;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class AbstractDaoImpl {
	@Autowired
	SessionFactory sessionFactory;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public <T extends Serializable> T getByProperty(String value, Class clazz,
			String propertyName) {
		Criteria cr = getCurrentSession().createCriteria(clazz);
		cr.add(Restrictions.eq(propertyName, value));
		return (T) cr.uniqueResult();

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public <T extends Serializable> T getByProperty(long value, Class clazz,
			String propertyName) {
		Criteria cr = getCurrentSession().createCriteria(clazz);
		cr.add(Restrictions.eq(propertyName, value));
		return (T) cr.uniqueResult();

	}

	@SuppressWarnings("unchecked")
	public <T extends Serializable> List<T> getAllByProperty(String value,
			@SuppressWarnings("rawtypes") Class clazz, String propertyName) {
		Criteria cr = getCurrentSession().createCriteria(clazz);
		cr.add(Restrictions.eq(propertyName, value));
		return cr.list();

	}

	@SuppressWarnings("unchecked")
	public <T extends Serializable> List<T> getAllByProperty(long value,
			@SuppressWarnings("rawtypes") Class clazz, String propertyName) {
		Criteria cr = getCurrentSession().createCriteria(clazz);
		cr.add(Restrictions.eq(propertyName, value));
		return cr.list();

	}

	public <T extends Serializable> void create(T entity) {
		getCurrentSession().persist(entity);
	}

	public <T extends Serializable> void update(T entity) {
		getCurrentSession().merge(entity);
	}

	public <T extends Serializable> void delete(T entity) {
		getCurrentSession().delete(entity);
	}

	protected final Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
}
