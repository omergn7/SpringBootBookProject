package org.ex.book.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.ex.book.model.Yorum;

import java.util.List;

public class KitapDTO {

    private Integer kitapId;
    private String kitapAdi;
    private String yazarAdi;
    private String yazarSoyadi;
    private Double kitapFiyat;
    private List<Yorum> yorumlar;

    @JsonProperty("kitapImageUrl")
    private String kitapImageUrl;

    // Getter ve Setter metodları


    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public Double getKitapFiyat() {
        return kitapFiyat;
    }

    public void setKitapFiyat(Double kitapFiyat) {
        this.kitapFiyat = kitapFiyat;
    }

    public String getKitapImageUrl() {
        return kitapImageUrl;
    }

    public void setKitapImageUrl(String kitap_image_url) {
        this.kitapImageUrl = kitap_image_url;
    }

    public String getYazarSoyadi() {
        return yazarSoyadi;
    }

    public void setYazarSoyadi(String yazarSoyadi) {
        this.yazarSoyadi = yazarSoyadi;
    }

    public Integer getKitapId() {
        return kitapId;
    }

    public void setKitapId(Integer kitapId) {
        this.kitapId = kitapId;
    }

    public List<Yorum> getYorumlar() {
        return yorumlar;
    }

    public void setYorumlar(List<Yorum> yorumlar) {
        this.yorumlar = yorumlar;
    }
}
