package org.ex.book.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "odeme")
public class Odeme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "odeme_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "siparis_id")
    private Siparis siparisId;

    @Column(name = "odeme_yontemi", length = 50)
    private String odemeYontemi;

    @Column(name = "odeme_tutari", precision = 6, scale = 2)
    private BigDecimal odemeTutari;

    @Column(name = "odeme_tarihi")
    private LocalDate odemeTarihi;

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

    public String getOdemeYontemi() {
        return odemeYontemi;
    }

    public void setOdemeYontemi(String odemeYontemi) {
        this.odemeYontemi = odemeYontemi;
    }

    public BigDecimal getOdemeTutari() {
        return odemeTutari;
    }

    public void setOdemeTutari(BigDecimal odemeTutari) {
        this.odemeTutari = odemeTutari;
    }

    public LocalDate getOdemeTarihi() {
        return odemeTarihi;
    }

    public void setOdemeTarihi(LocalDate odemeTarihi) {
        this.odemeTarihi = odemeTarihi;
    }

}