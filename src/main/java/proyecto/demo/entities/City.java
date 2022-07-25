package proyecto.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="city")

public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="city_id")
	private Integer cityId;
	
	
	private String city;
	
	@Column(name="country_id")
	private Integer countryId;
	
	@DateTimeFormat(pattern="MM/dd/yyyy")
	private java.sql.Timestamp last_update;

	
	public Integer getCityId() {
		return cityId;
	}

	public String getCity() {
		return city;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public java.sql.Timestamp getLast_update() {
		return last_update;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public void setLast_update(java.sql.Timestamp last_update) {
		this.last_update = last_update;
	}

	
	
	
	
	
	
}
