package dev.johkakka.randomcocktailmaker;

import dev.johkakka.randomcocktailmaker.domain.BaseIngredient;
import dev.johkakka.randomcocktailmaker.domain.Cocktail;
import dev.johkakka.randomcocktailmaker.domain.OtherIngredient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.stream.Collectors;

@Controller
public class CocktailController {
    private CocktailService service;

    public CocktailController(CocktailService service) {
        this.service = service;
    }

    @GetMapping({"/", "/index"})
    public String getIndex(ModelMap modelMap) {
        modelMap.addAttribute("baseList", BaseIngredient.values());
        modelMap.addAttribute("otherList", OtherIngredient.values());
        return "index";
    }

    @PostMapping({"/", "/index"})
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("baseList",
                Arrays.stream(BaseIngredient.values()).map(BaseIngredient::getName).collect(Collectors.toList()));
        modelMap.addAttribute("otherList",
                Arrays.stream(OtherIngredient.values()).map(OtherIngredient::getName).collect(Collectors.toList()));

        Cocktail cocktail = service.get();
//        model.addAttribute("base", cocktail.getBaseNames());
//        model.addAttribute("other", cocktail.getOtherNames());
        modelMap.addAttribute("cocktail", cocktail.getSimpleName());

        return "index";
    }
}
