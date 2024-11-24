package org.ex.book.controller;


import org.ex.book.model.Kitap;
import org.ex.book.model.Kullanicilar;
import org.ex.book.model.Yorum;
import org.ex.book.service.YorumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.ex.book.dto.KitapDTO;
import org.ex.book.service.KitapService;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;


@Controller
public class BookController {

    @Autowired
    private YorumService yorumService; // YorumService'i buraya enjekte ediyoruz

    @Autowired
    private KitapService kitapService; // Burada KitapService sınıfını enjekte ediyoruz


    @GetMapping("/")
    public String home() {
        return "index"; // index.html dosyasına yönlendirir
    }

    @GetMapping("/books")
    public ResponseEntity<String> getBooks() {
        String books = "[{\"title\":\"Book One\", \"author\":\"Author One\"}, {\"title\":\"Book Two\", \"author\":\"Author Two\"}]";
        return ResponseEntity.ok(books);
    }

    @GetMapping("/sepet")
    public String sepet() {
        return "sepet"; // sepet.html dosyasına yönlendirir
    }

    @GetMapping("/book-details/{kitapId}")
    public ModelAndView getBookDetailsPage(@PathVariable Integer kitapId, Model model) {
        KitapDTO kitap = kitapService.getKitapById(kitapId); // Kitap'ı servisten çekin
        List<Yorum> yorumlar = yorumService.getYorumlarByKitapId(kitapId);
        // Kullanıcı bilgilerini al ve model'e ekle
        ModelAndView modelAndView = new ModelAndView("KitapDetay");
        modelAndView.addObject("kitap", kitap);
        model.addAttribute("yorumlar", yorumlar);
        return modelAndView;
    }





}

