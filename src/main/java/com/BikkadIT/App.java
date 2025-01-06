package com.BikkadIT;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.BikkadIT.entity.Department;
import com.BikkadIT.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {

    	Configuration cfg = new Configuration();
    	cfg.configure("com/BikkadIT/hibernate.cfg.xml");
    	
    	Session session = cfg.buildSessionFactory().openSession();
    	System.out.println(session);
    	
    	Transaction tx = session.beginTransaction();
    
//    	Student s = new Student(101,"kiran", 87, "pune");
//    	session.save(s);
//    	tx.commit();
    	
//    	Student std = session.get(Student.class, 10); // if id is not found then get nullpointer exception
//    	System.out.println(std.getSid()+" "+std.getName()+" "+std.getMarks()+" "+std.getCity());
    	
//    	Student std2 = session.load(Student.class, 101); // if id is not presenty then load method throws object nnot found exception
//    	System.out.println(std2.getSid()+" "+std2.getName()+" "+std2.getMarks()+" "+std2.getCity());
    	
    	
//    	Student s = session.get(Student.class, 101);
//    	s.setCity("RCB");
//    	session.saveOrUpdate(s);
//    	session.update(s);
    	
//    	session.delete(s);
    	
    	//Embedable annotation used to add column in existing table
    	
//    	Department dp = new Department(1001, "IT");
//    	
//    	Student s = new Student(101, "AK", 46, "Chausala", dp);
//    	session.save(s);
    	
    	//HQL
    	
    	//insert
//    	String hql="insert into Student(sid,name,marks,city) values(:sid,:name,:marks,:city)";
//    	
//    	Query query = session.createQuery(hql);
//    	
//    	query.setParameter("sid",105);
//    	query.setParameter("name","Rohit");
//    	query.setParameter("marks",99);
//    	query.setParameter("city","Delhi");
//    	
//    	int e = query.executeUpdate();
//    	System.out.println(e +" data is saved");
    	
    	//read
    	
//    	String hql="from Student";
//    	Query query = session.createQuery(hql);
//    	List<Student> list = query.getResultList();
//    	
//    	for(Student ss:list)
//    	{
//    		System.out.println(ss.getSid()+" "+ss.getName()+" "+ss.getMarks()+" "+ss.getCity());
//    	}
    	
    	//update
    	
//    	String hql="update Student set marks=:marks where sid=:sid";
//    	Query query = session.createQuery(hql);
//    	query.setParameter("marks", 44);
//    	query.setParameter("sid", 100);
//    	
//    	int i = query.executeUpdate();
//    	System.out.println(i+" data updated....");
    	
    	//delete
    	
//    	String hql="delete from Student where sid=:sid";
//    	Query query = session.createQuery(hql);
//    	query.setParameter("sid", 105);
//    	query.executeUpdate();
    	
    	tx.commit();
    	session.close();
    }
}
