package proyecto.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="rental")
public class Rental {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rental_id;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="customer_id") 
	private Customer client;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="staff_id")
	private Staff staff;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="inventory_id")
	private Inventory product;
	
	private Date rental_date;
	
	private Date return_date;

	public Integer getRental_id() {
		return rental_id;
	}

	public void setRental_id(Integer rental_id) {
		this.rental_id = rental_id;
	}

	public Customer getClient() {
		return client;
	}

	public void setClient(Customer client) {
		this.client = client;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Inventory getProduct() {
		return product;
	}

	public void setProduct(Inventory product) {
		this.product = product;
	}

	public Date getRental_date() {
		return rental_date;
	}

	public void setRental_date(Date rental_date) {
		this.rental_date = rental_date;
	}

	public Date getReturn_date() {
		return return_date;
	}

	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}

	@Override
	public String toString() {
		return "Rental [rental_id=" + rental_id + ", client=" + client + ", staff=" + staff + ", product=" + product
				+ ", rental_date=" + rental_date + ", return_date=" + return_date + "]";
	}

	public Rental() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
