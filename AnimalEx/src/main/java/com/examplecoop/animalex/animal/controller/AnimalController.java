package com.examplecoop.animalex.animal.controller;

import com.examplecoop.animalex.animal.dto.AnimalDTO;
import com.examplecoop.animalex.animal.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static java.lang.Integer.parseInt;

@Controller
public class AnimalController {
    @Autowired
    private AnimalService as;

    @GetMapping("/ins")
    public String moveView() {
        return "ins";
    }

    @PostMapping("/ins")
    public String insertAnimal(@ModelAttribute AnimalDTO adt) {
        as.insertAnimal(adt);
        return "redirect:/ani";
    }



    @GetMapping("/ani")
    public String allSelAnimal(Model m) {
        m.addAttribute("allSel", as.allSelAnimal());
        return "ani";
    }

    @GetMapping("/sel")
    public String selectAnimal(@RequestParam(defaultValue = "0") Long id, Model m) {
        if(id == 0) {
            return "redirect:/ani";
        }
        m.addAttribute("sel", as.selectAnimal(id));
        return "sel";
    }

    @GetMapping("/del")
    public String delReturn() {
        return "del";
    }

    @PostMapping("/del")
    public String delAnimal(@RequestParam(defaultValue="0") Long id) {
        if(id == 0) {
            return "redirect:/ani";
        }
        as.delAnimal(id);
        return "redirect:/ani";
    }
}


