package org.ex.book.service;

import org.ex.book.model.Yorum;
import org.ex.book.repository.YorumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YorumService {

    @Autowired
    private YorumRepository yorumRepository;

    public Yorum saveYorum(Yorum yorum) {
        return yorumRepository.save(yorum);
    }

    public List<Yorum> getYorumlarByKitapId(Integer kitapId) {
        return yorumRepository.findByKitapKitapId(kitapId);
    }
}
