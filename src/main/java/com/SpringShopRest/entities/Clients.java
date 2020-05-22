package com.SpringShopRest.entities;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "CLIENTS")
public class Clients implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false, unique = true)
    private long id;

    @Column(name = "TYPE_ID")
    private int type;

    @Column(name = "PERSON")
    private int isPerson;

    @Column(name = "NAME")
    @Length(max = 100)
    private String name;

    @Column(name = "COUNTRY_ID")
    private int country;

    @Column(name = "CITY")
    @Length(max = 30)
    private String city;

    @Column(name = "ADDRESS")
    @Length(max = 100)
    private String address;

    @Column(name = "VAT_NUMBER")
    @Length(max = 20)
    private String vatNumber;

    @Column(name = "MOL")
    @Length(max = 30)
    private String mol;

    public Clients() {

    }

    public Clients(long id, int type, int isPerson, String name, int country,
                   String city, String address, String vatNumber, String mol) {
        super();
        this.id = id;
        this.type = type;
        this.isPerson = isPerson;
        this.name = name;
        this.country = country;
        this.city = city;
        this.address = address;
        this.vatNumber = vatNumber;
        this.mol = mol;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getIsPerson() {
        return isPerson;
    }

    public void setIsPerson(int isPerson) {
        this.isPerson = isPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public String getMol() {
        return mol;
    }

    public void setMol(String mol) {
        this.mol = mol;
    }
}
