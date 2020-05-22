package com.SpringShopRest.entities;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ARTICLE_GROUPS")
public class ArticleGroups implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false, unique = true)
    private long id;

    @Length(max = 30)
    @Column(name = "NAME_DE")
    private String name_de;

    @Length(max = 30)
    @Column(name = "NAME_EN")
    private String name_en;

    @Length(max = 30)
    @Column(name = "NAME_BG")
    private String name_bg;

    public ArticleGroups() {

    }

    public ArticleGroups(long id, String name_de, String name_en, String name_bg) {
        super();
        this.id = id;
        this.name_de = name_de;
        this.name_en = name_en;
        this.name_bg = name_bg;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_de() {
        return name_de;
    }

    public void setName_de(String name_de) {
        this.name_de = name_de;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public String getName_bg() {
        return name_bg;
    }

    public void setName_bg(String name_bg) {
        this.name_bg = name_bg;
    }
}
