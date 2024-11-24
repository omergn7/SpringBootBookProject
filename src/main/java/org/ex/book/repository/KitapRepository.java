package org.ex.book.repository;

import org.ex.book.model.Kitap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KitapRepository extends JpaRepository<Kitap, Integer> {

    // Kitap entity'si ile ilgili özel sorgular ekleyebilirsiniz
    // Örneğin, kitap adına göre arama
   /* List<Kitap> findByKitapAdiContaining(String kitapId);*/
}

