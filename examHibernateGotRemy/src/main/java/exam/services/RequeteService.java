package exam.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import exam.utils.HibernateUtils;

import exam.models.Car;
import exam.models.Color;

public class RequeteService {
	private SessionFactory sessionFactory;

	public RequeteService() {
		this.sessionFactory = HibernateUtils.getSessionFactory();
	}
	
	public List<Car> getCountVoitureByMarque(){
		List<Car> cars = new ArrayList<>();
		Session session = this.sessionFactory.getCurrentSession();
		session.beginTransaction();
		String hql = "Select marque, count(*) as nbVoiture FROM car group by marque";
		Query query = session.createQuery(hql);
		cars = query.getResultList();
		
		session.close();
		return cars;
	}
	
	public String countCar() {
		Session session = this.sessionFactory.getCurrentSession();

        session.beginTransaction();

        String hql = "SELECT COUNT(*) FROM car";
		Query query = session.createQuery(hql);
        String nombre = String.valueOf(query.getSingleResult());
        
        session.close();
        return nombre;
	}
	
	public List<Car> getLastTenCar(){
		List<Car> cars = new ArrayList<>();
		Session session = this.sessionFactory.getCurrentSession();
		session.beginTransaction();
		String hql = "FROM car ORDER BY id DESC";
		Query query = session.createQuery(hql);
		query = query.setMaxResults(10);
		cars = query.getResultList();
		session.close();
		
		return cars;
	}
}
