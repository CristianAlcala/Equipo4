package proyecto.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="country")

public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="country_id")
	private Integer countryId;
	
	private String country;
	
	
	@DateTimeFormat(pattern="MM/dd/yyyy")
	private java.sql.Timestamp last_update;


	public Integer getCountryId() {
		return countryId;
	}


	public String getCountry() {
		return country;
	}


	public java.sql.Timestamp getLast_update() {
		return last_update;
	}


	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public void setLast_update(java.sql.Timestamp last_update) {
		this.last_update = last_update;
	}
	
	
	
		
}
