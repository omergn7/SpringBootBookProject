package org.ex.book.controller;

import org.ex.book.dto.KitapDTO;
import org.ex.book.service.KitapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/kitaplar")
public class KitapController {

    @Autowired
    private KitapService kitapService;

    @GetMapping
    public List<KitapDTO> getKitaplar() {
        return kitapService.getAllKitaplar();
    }
}