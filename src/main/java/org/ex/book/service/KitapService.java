package org.ex.book.service;

import org.ex.book.dto.KitapDTO;
import org.ex.book.model.Kitap;
import org.ex.book.model.Yorum;
import org.ex.book.repository.KitapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class KitapService {

    @Autowired
    private KitapRepository kitapRepository;

    @Autowired
    private YorumService yorumService; // YorumService'i buraya enjekte ediyoruz


    public List<KitapDTO> getAllKitaplar() {
        List<Kitap> kitaplar = kitapRepository.findAll();
        return kitaplar.stream()
                .map(kitap -> {
                    KitapDTO dto = new KitapDTO();
                    dto.setKitapId(kitap.getKitapId());
                    dto.setKitapAdi(kitap.getKitapAdi());
                    dto.setYazarAdi(kitap.getYazar().getYazarAdi() + " " + kitap.getYazar().getYazarSoyadi());
                    dto.setKitapFiyat(kitap.getKitapFiyat());
                    dto.setKitapImageUrl(kitap.getKitapImageUrl());
                    // Varsa kitap imgUrl, burada set edebilirsiniz
                    return dto;
                })
                .collect(Collectors.toList());
    }


    public KitapDTO getKitapById(Integer id) {
        Kitap kitap = kitapRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Kitap bulunamadı!"));

        KitapDTO dto = new KitapDTO();
        dto.setKitapId(kitap.getKitapId());
        dto.setKitapAdi(kitap.getKitapAdi());
        dto.setYazarAdi(kitap.getYazar().getYazarAdi() + " " + kitap.getYazar().getYazarSoyadi());
        dto.setKitapFiyat(kitap.getKitapFiyat());
        dto.setKitapImageUrl(kitap.getKitapImageUrl());

        // Yorumları ekle
        List<Yorum> yorumlar = yorumService.getYorumlarByKitapId(id);
        dto.setYorumlar(yorumlar);

        return dto;
    }


}

