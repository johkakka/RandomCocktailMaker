package dev.johkakka.randomcocktailmaker;

import dev.johkakka.randomcocktailmaker.domain.Cocktail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
public class CocktailController {
    private CocktailService service;

    public CocktailController(CocktailService service) {
        this.service = service;
    }

    @GetMapping({"/", "/index"})
    public String index(){
        return "index";
    }

    @PostMapping({"/", "/index"})
    public String index(ModelMap model) {
        Cocktail cocktail = service.get();
        model.addAttribute("base", cocktail.getBaseNames());
        model.addAttribute("other", cocktail.getOtherNames());
        model.addAttribute("cocktail", cocktail.getSimpleName());

        return "index";
    }
}
