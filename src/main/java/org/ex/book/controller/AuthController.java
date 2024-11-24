package org.ex.book.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.ex.book.model.Kullanicilar;
import org.ex.book.repository.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

    @Autowired
    private KullaniciRepository kullaniciRepository;

    // /login-signup sayfasını gösteren GetMapping
    @GetMapping("/login-signup")
    public String showLoginSignupPage() {
        return "login-signup"; // login-signup.html sayfasına yönlendirme
    }



    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate(); // Oturumu sonlandır
        }
        return "index"; // Giriş sayfasına yönlendirme
    }


    // /login işlemi için PostMapping
    @PostMapping("/login")
    public String login(@RequestParam("email") String email,
                        @RequestParam("parola") String parola,
                        HttpServletRequest request) {

        Kullanicilar kullanici = kullaniciRepository.findByEmail(email);
        if (kullanici == null || !kullanici.getParola().equals(parola)) {

            request.setAttribute("loginError", "Geçersiz email veya parola!");
            return "login-signup"; // Yönlendirme
        }
        HttpSession session = request.getSession();
        session.setAttribute("loggedInUser", kullanici);

        return "redirect:/"; // Ana sayfaya yönlendirme
    }

    // /signup işlemi için PostMapping
    @PostMapping("/signup")
    public String signup(@RequestParam("isim") String isim,
                         @RequestParam("email") String email,
                         @RequestParam("parola") String parola) {
        Kullanicilar kullanici = new Kullanicilar();
        kullanici.setIsim(isim);
        kullanici.setEmail(email);
        kullanici.setParola(parola);

        kullanici.setSoyisim(null);
        kullanici.setKimlikNo(null);
        kullanici.setKullaniciTuru(false);
        kullanici.setTelNo(null);

        kullaniciRepository.save(kullanici);

        return "index.html";
    }
}
