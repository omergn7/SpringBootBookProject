package org.ex.book.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "siparis_detay")
public class SiparisDetay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "siparis_detay_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "siparis_id")
    private Siparis siparisId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kitap_id")
    private Kitap kitapId;

    @Column(name = "adet")
    private Integer adet;

    @Column(name = "fiyat", precision = 6, scale = 2)
    private BigDecimal fiyat;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Siparis getSiparisId() {
        return siparisId;
    }

    public void setSiparisId(Siparis siparisId) {
        this.siparisId = siparisId;
    }

    public Kitap getKitapId() {
        return kitapId;
    }

    public void setKitapId(Kitap kitapId) {
        this.kitapId = kitapId;
    }

    public Integer getAdet() {
        return adet;
    }

    public void setAdet(Integer adet) {
        this.adet = adet;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }

}