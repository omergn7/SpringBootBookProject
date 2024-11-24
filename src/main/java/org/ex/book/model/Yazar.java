package org.ex.book.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "yazar")
public class Yazar {
    @Id
    @Column(name = "yazar_id", nullable = false)
    private Integer id;

    @Column(name = "yazar_adi", length = 50)
    private String yazarAdi;

    @Column(name = "yazar_soyadi", length = 50)
    private String yazarSoyadi;

    @Column(name = "yas")
    private Integer yas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public String getYazarSoyadi() {
        return yazarSoyadi;
    }

    public void setYazarSoyadi(String yazarSoyadi) {
        this.yazarSoyadi = yazarSoyadi;
    }

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }

}