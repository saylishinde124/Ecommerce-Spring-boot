package sbi.company.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToOne;



@Entity
public class Town {

    @Id
   
    private int townId;

    private String name;

    @ManyToOne
   
    private Taluka taluka;

   
    public Town() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Town [townId=" + townId + ", name=" + name + ", taluka=" + taluka + "]";
	}

	public int getTownId() {
        return townId;
    }

    public void setTownId(int townId) {
        this.townId = townId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Taluka getTaluka() {
        return taluka;
    }

    public void setTaluka(Taluka taluka) {
        this.taluka = taluka;
    }
}
