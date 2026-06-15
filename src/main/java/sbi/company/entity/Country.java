package sbi.company.entity;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class Country {

    @Id
    private int countryId;

    private String name;

    @OneToMany(mappedBy = "country")
    private List<State> states;

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }
}