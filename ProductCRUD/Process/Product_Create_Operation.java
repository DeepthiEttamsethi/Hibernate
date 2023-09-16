 package Product.Process;
import java.util.Date;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Product_Create_Operation {
	
	private static SessionFactory factory;
	
	public static void main(String[] args) {
		
		
		try {
	 factory = new AnnotationConfiguration().
	 configure().
	
	 addAnnotatedClass(Product.class).
	 buildSessionFactory();
	 } catch (Throwable ex) {
	 System.err.println("Failed to create sessionFactory object." + ex);
	 throw new ExceptionInInitializerError(ex);
	 }
	
		
		Product_Create_Operation obj = new Product_Create_Operation();
		Integer pid = obj.addProduct("Samsung a30", new Date());
		Integer pid1 = obj.addProduct("LG refrrigrator", new Date());
		Integer pid2 = obj.addProduct("Samsung a20", new Date());
		
		System.out.println(pid);
		System.out.println(pid1);
		System.out.println(pid2);
	}
	
	
	public Integer addProduct(String description, Date m_date){
	 Session session = factory.openSession();
	 Transaction tx = null;
	 Integer IDNO=null;
	
	 try {
	 tx = session.beginTransaction();
	 Product prd = new Product(description, m_date);
	
	 IDNO = (Integer) session.save(prd);
	 tx.commit();
	 } catch (HibernateException e) {
	 if (tx!=null) tx.rollback();
	 e.printStackTrace();
	 } finally {
	 session.close();
	 }
	 return IDNO;
	 }
}