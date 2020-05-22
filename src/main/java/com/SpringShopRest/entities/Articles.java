package com.SpringShopRest.entities;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "ARTICLES")
public class Articles implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false, unique = true)
    private long id;

    @Column(name = "CODE")
    @Length(max = 10)
    private String code;

    @Column(name = "ARTICLE_GROUPS_ID")
    private long groupID;

    @Column(name = "NAME_DE")
    @Length(max = 100)
    private String nameDe;

    @Column(name = "NAME_EN")
    @Length(max = 100)
    private String nameEn;

    @Column(name = "NAME_BG")
    @Length(max = 100)
    private String nameBg;

    @Column(name = "NOTES")
    @Length(max = 100)
    private String notes;

    @Column(name = "MEASURE_ID")
    private long measureID;

    @Column(name = "MIN_QUANTITY")
    private int minQty;

    public Articles() {

    }

    public Articles(long id, String code, long groupID, String nameDe, String nameEn,
                    String nameBg, String notes, long measureID, int minQty) {
        this.id = id;
        this.code = code;
        this.groupID = groupID;
        this.nameDe = nameDe;
        this.nameEn = nameEn;
        this.nameBg = nameBg;
        this.notes = notes;
        this.measureID = measureID;
        this.minQty = minQty;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getGroupID() {
        return groupID;
    }

    public void setGroupID(long groupID) {
        this.groupID = groupID;
    }

    public String getNameDe() {
        return nameDe;
    }

    public void setNameDe(String nameDe) {
        this.nameDe = nameDe;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameBg() {
        return nameBg;
    }

    public void setNameBg(String nameBg) {
        this.nameBg = nameBg;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public long getMeasureID() {
        return measureID;
    }

    public void setMeasureID(long measureID) {
        this.measureID = measureID;
    }

    public int getMinQty() {
        return minQty;
    }

    public void setMinQty(int minQty) {
        this.minQty = minQty;
    }
}
