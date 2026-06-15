package sbi.company.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToOne;


@Entity
public class Taluka {

    @Id
   
    private int talukaId;

    @Override
	public String toString() {
		return "Taluka [talukaId=" + talukaId + ", name=" + name + ", district=" + district + "]";
	}

	public Taluka() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTalukaId() {
		return talukaId;
	}

	public void setTalukaId(int talukaId) {
		this.talukaId = talukaId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	private String name;

    @ManyToOne
   
    private District district;

}
