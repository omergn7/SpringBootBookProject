package org.ex.book.model;

import jakarta.persistence.*;

@Entity
@Table(name = "adres")
public class Adre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adres_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kullanici_id")
    private Kullanicilar kullaniciId;

    @Column(name = "adres_il", length = 20)
    private String adresIl;

    @Column(name = "adres_ilce", length = 20)
    private String adresIlce;

    @Column(name = "adres_detay", length = 100)
    private String adresDetay;

    @Column(name = "adres_turu")
    private Boolean adresTuru;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Kullanicilar getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(Kullanicilar kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public String getAdresIl() {
        return adresIl;
    }

    public void setAdresIl(String adresIl) {
        this.adresIl = adresIl;
    }

    public String getAdresIlce() {
        return adresIlce;
    }

    public void setAdresIlce(String adresIlce) {
        this.adresIlce = adresIlce;
    }

    public String getAdresDetay() {
        return adresDetay;
    }

    public void setAdresDetay(String adresDetay) {
        this.adresDetay = adresDetay;
    }

    public Boolean getAdresTuru() {
        return adresTuru;
    }

    public void setAdresTuru(Boolean adresTuru) {
        this.adresTuru = adresTuru;
    }

}