package com.first.GameCatalogue.Classes;

import jakarta.persistence.*;

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
}
