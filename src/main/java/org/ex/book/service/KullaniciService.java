package org.ex.book.service;
import org.ex.book.model.Kullanicilar;
import org.ex.book.repository.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KullaniciService {

    private final KullaniciRepository kullaniciRepository;

    @Autowired
    public KullaniciService(KullaniciRepository kullaniciRepository) {
        this.kullaniciRepository = kullaniciRepository;
    }

    public Kullanicilar findByKullaniciAdi(String email) {
        return kullaniciRepository.findByEmail(email);
    }
}
