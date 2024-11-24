package org.ex.book.repository;
import org.ex.book.model.Kullanicilar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KullaniciRepository extends JpaRepository<Kullanicilar, Long> {
    Kullanicilar findByEmail(String email);
}

