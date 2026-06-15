package sbi.company.entity;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class District {

    @Id
    private int districtId;

    private String name;

    @ManyToOne
    private State state;

    @OneToMany(mappedBy = "district")
    private List<Taluka> talukas;

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<Taluka> getTalukas() {
        return talukas;
    }

    public void setTalukas(List<Taluka> talukas) {
        this.talukas = talukas;
    }
}