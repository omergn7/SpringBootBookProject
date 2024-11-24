package org.ex.book.controller;

import org.ex.book.model.Yorum;
import org.ex.book.service.YorumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/yorumlar")
public class YorumController {

    @Autowired
    private YorumService yorumService;

    @PostMapping("/ekle")
    public Yorum ekleYorum(@ModelAttribute Yorum yorum) {
        return yorumService.saveYorum(yorum);
    }


    @PostMapping("/submit")
    public String handleFormSubmit(@RequestParam String field1, @RequestParam String field2) {
        // İşleme kodu
        return "resultPage";
    }

}
