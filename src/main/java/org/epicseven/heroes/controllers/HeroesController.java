package org.epicseven.heroes.controllers;

import org.epicseven.heroes.models.Heroes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("heroes") // sets root path at /heroes
public class HeroesController {

    private static List<Heroes> heroes = new ArrayList<>();

    // lives in /heroes
    @GetMapping
    public String displayAllHeroes(Model model) {
        model.addAttribute("title", "Epic Seven: Heroes");
        model.addAttribute("heroes", heroes);
        return "heroes/index";
    }

    // lives in /heroes/create
    // change default <h1> with attributeValue
    @GetMapping("create")
    public String displayCreateHeroForm(Model model) {
        model.addAttribute("title", "Epic Seven: Create Heroes");
        return "heroes/create";
    }

    // lives in /heroes/create
    // Process the form after the user inputs a value.
    // user input --> controller --> value passes in object constructor --> added to ArrayList
    @PostMapping("create")
    public String processCreateHeroForm(@RequestParam String heroName,
                                        @RequestParam int heroLevel,
                                        @RequestParam int heroAtk,
                                        @RequestParam int heroHp,
                                        @RequestParam int heroDef,
                                        @RequestParam int heroCritHitChance,
                                        @RequestParam int heroCritHitDamage,
                                        @RequestParam int heroDualAttack,
                                        @RequestParam int heroEffectiveness,
                                        @RequestParam int heroEffectResist,
                                        @RequestParam int heroSpeed) {
        heroes.add(new Heroes(
                heroName,
                heroLevel,
                heroAtk,
                heroHp,
                heroDef,
                heroCritHitChance,
                heroCritHitDamage,
                heroDualAttack,
                heroEffectiveness,
                heroEffectResist,
                heroSpeed));
        return "redirect:";
    }

}
