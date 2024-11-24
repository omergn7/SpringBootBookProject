package org.ex.book.model;

import jakarta.persistence.*;

@Entity
@Table(name = "kullanicilar")
public class Kullanicilar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kullanici_id", nullable = false)
    private Integer id;

    @Column(name = "isim", length = 20)
    private String isim;

    @Column(name = "soyisim", length = 20, nullable = true)
    private String soyisim;

    @Column(name = "kimlik_no", length = 11, nullable = true)
    private String kimlikNo;

    @Column(name = "kullanici_turu", nullable = true)
    private Boolean kullaniciTuru;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "parola", length = 30)
    private String parola;

    @Column(name = "tel_no", length = 11, nullable = true)
    private String telNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public Boolean getKullaniciTuru() {
        return kullaniciTuru;
    }

    public void setKullaniciTuru(Boolean kullaniciTuru) {
        this.kullaniciTuru = kullaniciTuru;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

}