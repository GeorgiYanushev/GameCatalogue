package com.first.GameCatalogue.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Company {
    @Id
    @SequenceGenerator(
            name="company_sequence",
            sequenceName="company_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator="company_sequence"
    )
    private Long companyId;
    private String name;
    private String country;
    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private Set<Game> games= new HashSet<>();



    public Company() {
    }

    public Company(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + companyId +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Set<Game> getGames() {
        return games;
    }
}
