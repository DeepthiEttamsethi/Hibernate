package OneToOne;
import OneToOne.Book;
import OneToOne.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
	
public class Main {
	public static void main(String[] args)
	{
		Book book = new Book();
		 book.setBookid(3);
		 book.setName("TOPLINk");
		 book.setAuthor("James");
		
		 Category cat = new Category();
		 cat.setCategoryId(1);
		 cat.setCategoryName("JAVA ORM FrameWork");
		 book.setCategory(cat);
	
	SessionFactory sf = new Configuration().configure().addAnnotatedClass(Book.class).addAnnotatedClass(Category.class ).buildSessionFactory();
	Session ses = sf.getCurrentSession();
	 ses.beginTransaction();
	ses.save(cat);
    ses.save(book);
  //Book book1 = (Book)ses.get(Book.class,1);
   //	System.out.println(book1);
	ses.getTransaction().commit();
}
}
