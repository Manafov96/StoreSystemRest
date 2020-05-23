package com.SpringShopRest.entities;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "N_COUNTRIES")
public class Countries implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false, unique = true)
    private long id;

    @Column(name = "NAME")
    @Length(max = 30)
    private String name;

    @Column(name = "SORTING")
    private int sorting;

    public Countries() {

    }

    public Countries(long id, String name, int sorting) {
        this.id = id;
        this.name = name;
        this.sorting = sorting;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSorting() {
        return sorting;
    }

    public void setSorting(int sorting) {
        this.sorting = sorting;
    }
}
