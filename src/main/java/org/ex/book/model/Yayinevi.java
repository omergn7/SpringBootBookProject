package org.ex.book.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "yayinevi")
public class Yayinevi {
    @Id
    @Column(name = "yayinevi_id", nullable = false)
    private Integer id;

    @Column(name = "yayinevi_adi", length = 100)
    private String yayineviAdi;

    @Column(name = "yayinevi_telefon_no", length = 11)
    private String yayineviTelefonNo;

    @Column(name = "yayinevi_website", length = 50)
    private String yayineviWebsite;

    @Column(name = "yayinevi_adresi")
    private String yayineviAdresi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYayineviAdi() {
        return yayineviAdi;
    }

    public void setYayineviAdi(String yayineviAdi) {
        this.yayineviAdi = yayineviAdi;
    }

    public String getYayineviTelefonNo() {
        return yayineviTelefonNo;
    }

    public void setYayineviTelefonNo(String yayineviTelefonNo) {
        this.yayineviTelefonNo = yayineviTelefonNo;
    }

    public String getYayineviWebsite() {
        return yayineviWebsite;
    }

    public void setYayineviWebsite(String yayineviWebsite) {
        this.yayineviWebsite = yayineviWebsite;
    }

    public String getYayineviAdresi() {
        return yayineviAdresi;
    }

    public void setYayineviAdresi(String yayineviAdresi) {
        this.yayineviAdresi = yayineviAdresi;
    }

}