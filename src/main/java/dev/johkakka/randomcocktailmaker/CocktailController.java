package dev.johkakka.randomcocktailmaker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cocktail")
public class CocktailController {
    private CocktailService service;

    public CocktailController(CocktailService service) {
        this.service = service;
    }

    @GetMapping({"/", "/index"})
    public String index(){
        return "index";
    }
}
