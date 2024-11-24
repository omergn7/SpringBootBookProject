package org.ex.book.repository;
import org.ex.book.model.Yorum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface YorumRepository extends JpaRepository<Yorum, Integer> {
    List<Yorum> findByKitapKitapId(Integer kitapId);
}

