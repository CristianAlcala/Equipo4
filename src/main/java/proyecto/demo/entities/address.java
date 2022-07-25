package proyecto.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="address")

public class address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="address_id")
	private Integer addressId;
	
	@Column(name="address")
	private String adress;
	
	@Column(name="address2")
	private String adress2;
	
	private String district;
	
	@Column(name="city_id")
	private Integer cityId;
	
	@Column(name="postal_code")
	private String postalCode ;
	
	private String phone;
	
	@DateTimeFormat(pattern="MM/dd/yyyy")
	private java.sql.Timestamp last_update;

	public Integer getAddressId() {
		return addressId;
	}

	public String getAdress() {
		return adress;
	}

	public String getAdress2() {
		return adress2;
	}

	public String getDistrict() {
		return district;
	}

	public Integer getCityId() {
		return cityId;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getPhone() {
		return phone;
	}

	public java.sql.Timestamp getLast_update() {
		return last_update;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void setAdress2(String adress2) {
		this.adress2 = adress2;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setLast_update(java.sql.Timestamp last_update) {
		this.last_update = last_update;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
