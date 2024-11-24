package org.ex.book.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "yorum")
public class Yorum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "yorum_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kitap_id")
    private Kitap kitap;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kullanici_id")
    private Kullanicilar kullaniciId;

    @Lob
    @Column(name = "yorum_metni")
    private String yorumMetni;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "yorum_tarihi")
    private Instant yorumTarihi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Kitap getKitapId() {
        return kitap;
    }

    public void setKitapId(Kitap kitapId) {
        this.kitap = kitapId;
    }

    public Kullanicilar getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(Kullanicilar kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public String getYorumMetni() {
        return yorumMetni;
    }

    public void setYorumMetni(String yorumMetni) {
        this.yorumMetni = yorumMetni;
    }

    public Instant getYorumTarihi() {
        return yorumTarihi;
    }

    public void setYorumTarihi(Instant yorumTarihi) {
        this.yorumTarihi = yorumTarihi;
    }

}