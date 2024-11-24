package org.ex.book.model;

import jakarta.persistence.*;

@Entity
public class Kitap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kitap_id")
    private Integer kitapId;

    private String kitapAdi;

    private Double kitapFiyat;

    @Column(name = "kitap_yayinyili")
    private Integer kitapYayinyili;

    @Column(name = "kitap_basim")
    private Integer kitapBasim;

    @Column(name = "kitap_sayfasayisi")
    private Integer kitapSayfasayisi;

    @Column(name = "kitap_image_url")
    private String kitapImageUrl;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "yayinevi_id")
    private Yayinevi yayinevi;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "yazar_id")
    private Yazar yazar;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "kategori_id")
    private Kategori kategori;

    // Getter ve Setter metodları

    public Integer getKitapId() {
        return kitapId;
    }

    public void setKitapId(Integer kitapId) {
        this.kitapId = kitapId;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public Double getKitapFiyat() {
        return kitapFiyat;
    }

    public void setKitapFiyat(Double kitapFiyat) {
        this.kitapFiyat = kitapFiyat;
    }

    public Integer getKitapYayinyili() {
        return kitapYayinyili;
    }

    public void setKitapYayinyili(Integer kitapYayinyili) {
        this.kitapYayinyili = kitapYayinyili;
    }

    public Integer getKitapBasim() {
        return kitapBasim;
    }

    public void setKitapBasim(Integer kitapBasim) {
        this.kitapBasim = kitapBasim;
    }

    public Integer getKitapSayfasayisi() {
        return kitapSayfasayisi;
    }

    public void setKitapSayfasayisi(Integer kitapSayfasayisi) {
        this.kitapSayfasayisi = kitapSayfasayisi;
    }

    public Yayinevi getYayinevi() {
        return yayinevi;
    }

    public void setYayinevi(Yayinevi yayinevi) {
        this.yayinevi = yayinevi;
    }

    public Yazar getYazar() {
        return yazar;
    }

    public void setYazar(Yazar yazar) {
        this.yazar = yazar;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public String getKitapImageUrl() {
        return kitapImageUrl;
    }

    public void setKitapImageUrl(String kitap_image_url) {
        this.kitapImageUrl = kitap_image_url;
    }
}
