package org.ex.book.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "siparis")
public class Siparis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "siparis_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kullanici_id")
    private Kullanicilar kullaniciId;

    @Column(name = "durum", length = 100)
    private String durum;

    @Column(name = "siparis_tarihi")
    private LocalDate siparisTarihi;

    @Column(name = "toplam_tutar", precision = 5, scale = 2)
    private BigDecimal toplamTutar;

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

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public LocalDate getSiparisTarihi() {
        return siparisTarihi;
    }

    public void setSiparisTarihi(LocalDate siparisTarihi) {
        this.siparisTarihi = siparisTarihi;
    }

    public BigDecimal getToplamTutar() {
        return toplamTutar;
    }

    public void setToplamTutar(BigDecimal toplamTutar) {
        this.toplamTutar = toplamTutar;
    }

}