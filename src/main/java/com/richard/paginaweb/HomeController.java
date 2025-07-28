package com.richard.paginaweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        Usuario usuario = new Usuario("Richard", 70.0);
        usuario.mostrarInformacion();

        String nombre = usuario.getNombre();
        double peso = usuario.getPeso();
        model.addAttribute("nombre", nombre);
        model.addAttribute("peso", peso);
        return "index";
    }

    @PostMapping("/")
    public String recibirFormulario(
            @RequestParam("nombre") String nombre,
            @RequestParam("peso") double peso,
            Model model) {
        model.addAttribute("nombre", nombre);
        model.addAttribute("peso", peso);
        return "index";
    }
}