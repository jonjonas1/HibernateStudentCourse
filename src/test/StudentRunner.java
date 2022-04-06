package test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.Course;
import com.Student;
import com.Teacher;

import comUtil.HibernateUtil;

public class StudentRunner {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Teacher teacher = new Teacher("Tavarali");
		session.save(teacher);

		Course math = new Course("math", teacher);
		session.save(math);

		List<Course> courses = new ArrayList<Course>();
		courses.add(math);
		
		Student student1 = new Student("Mansur", "Jasur", courses);
		session.save(student1);
		
		
		
		// Commit the transaction
		session.getTransaction().commit();
		HibernateUtil.shutdown();

	}

}
