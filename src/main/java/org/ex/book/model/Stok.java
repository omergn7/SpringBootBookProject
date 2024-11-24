package org.ex.book.model;

import jakarta.persistence.*;

@Entity
@Table(name = "stok")
public class Stok {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stok_id", nullable = false)
    private Long id;

    @Column(name = "miktar")
    private Integer miktar;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kitap_id")
    private Kitap kitapId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMiktar() {
        return miktar;
    }

    public void setMiktar(Integer miktar) {
        this.miktar = miktar;
    }

    public Kitap getKitapId() {
        return kitapId;
    }

    public void setKitapId(Kitap kitapId) {
        this.kitapId = kitapId;
    }

}