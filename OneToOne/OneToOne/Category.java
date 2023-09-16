package OneToOne;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
public class Category {
@Id
private int CategoryId;
private String CategoryName;
public int getCategoryId() {
	return CategoryId;
}
public void setCategoryId(int categoryId) {
	CategoryId = categoryId;
}
public String getCategoryName() {
	return CategoryName;
}
public void setCategoryName(String categoryName) {
	CategoryName = categoryName;
}
public Category(int categoryId, String categoryName) {
	super();
	CategoryId = categoryId;
	CategoryName = categoryName;
}
public Category() {
	super();
	// TODO Auto-generated constructor stub
}@Override
public String toString() {
	return "Category [categoryid=" + CategoryId + ", categoryname=" + CategoryName + "]";
}
}