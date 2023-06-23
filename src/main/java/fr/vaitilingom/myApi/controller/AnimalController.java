package fr.vaitilingom.myApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.vaitilingom.myApi.model.Animal;
import fr.vaitilingom.myApi.service.AnimalService;




    @RestController
    public class AnimalController {
    
        private AnimalService animalService;


    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }
    
    
    @GetMapping("/animal")
    
    public Animal getAnimal(@RequestParam int id) {

    Animal animal = animalService.getAnimal(id);

        if (animal != null) {
            return animal;
        } else {
            return null;
        }
    }
}

