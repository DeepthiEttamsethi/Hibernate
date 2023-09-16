package OneToOne;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
public class Book {
@Id
private int bookid;
private String Name;
private String author;
@OneToOne
private Category category;
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public Book(int bookid, String name, String author) {
	super();
	this.bookid = bookid;
	Name = name;
	this.author = author;
	this.category = category;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Book [bookid=" + bookid + ", Name=" + Name + ", author=" + author + ", category=" + category + "]";
}
}
