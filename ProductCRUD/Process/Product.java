package Product.Process;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "product")
public class Product {
	
	//constructor with args
	public Product(int id, String description, Date manufact_date) {
		super(); // Object
		Id = id;
		Description = description;
		this.manufact_date = manufact_date;
	}
	
	public Product(String description, Date manufact_date) {
		Description = description;
		this.manufact_date = manufact_date;
	}

	@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
	private int Id; //fields
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	@Column (name="description")
	private String Description; //fields
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	@Column (name="manufact_date")
	private Date manufact_date; //fields
	public Date getManufact_date() {
		return manufact_date;
	}
	public void setManufact_date(Date manufact_date) {
		this.manufact_date = manufact_date;
	}
	
}
