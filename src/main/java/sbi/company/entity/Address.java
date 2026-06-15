package sbi.company.entity;


import jakarta.persistence.CascadeType;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.OneToOne;


@Entity
public class Address {

	 @Id
	    private int flatno;

	    private String area;

	    @ManyToOne
	    @JoinColumn(name = "country_id")
	    private Country country;

	    @ManyToOne
	    @JoinColumn(name = "state_id")
	    private State state;

	    @ManyToOne
	    @JoinColumn(name = "district_id")
	    private District district;

	    @ManyToOne
	    @JoinColumn(name = "taluka_id")
	    private Taluka taluka;

	    @ManyToOne
	    @JoinColumn(name = "town_id")
	    private Town town;

	    private int pincode;

   
    public Address(int flatno, String area, Admin admin, Town town, Taluka taluka, District district, State state,
			Country country, int pincode) {
		super();
		this.flatno = flatno;
		this.area = area;
	
		this.town = town;
		this.taluka = taluka;
		this.district = district;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

//	public Admin getAdmin() {
//		return admin;
//	}
//
//	public void setAdmin(Admin admin) {
//		this.admin = admin;
//	}

	@Override
	public String toString() {
		return "Address [flatno=" + flatno + ", area=" + area + ", town=" + town + ", taluka="
				+ taluka + ", district=" + district + ", state=" + state + ", country=" + country + ", pincode="
				+ pincode + "]";
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getFlatno() {
		return flatno;
	}

	public void setFlatno(int flatno) {
		this.flatno = flatno;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	

	public Taluka getTaluka() {
		return taluka;
	}

	public void setTaluka(Taluka taluka) {
		this.taluka = taluka;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	

	public Town getTown() {
		return town;
	}

	public void setTown(Town town) {
		this.town = town;
	}


}

