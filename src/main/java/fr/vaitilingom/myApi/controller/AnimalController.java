package fr.vaitilingom.myApi.controller;

import java.net.URI;
import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    
    @CrossOrigin
    @GetMapping("/animal")
    
    public ResponseEntity<?> getAnimal(@RequestParam int id) {

    Animal animal = animalService.getAnimal(id);

        if (animal != null) {
            return ResponseEntity.ok(animal);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Animal non trouvé");
        }
    }

    @PostMapping("/animal")

    public ResponseEntity<?> createAnimal(@RequestBody AnimalRequest body){

    Animal animal = animalService.createAnimal(body.getName(), body.getType(), body.getWeight());

        if (animal != null) {
            
            return ResponseEntity.created(URI.create("/Animal/" + animal.getId())).body(animal);
        
        } else {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Animal non créé");
        }

    }

    @PutMapping("/animal") 

    public ResponseEntity<?> updateAnimal(@RequestParam int id, @RequestBody AnimalRequest body){

    Animal animal = animalService.updateAnimal(id, body.getName(), body.getType(), body.getWeight());
        if (animal != null) {
            return ResponseEntity.ok(animal);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Animal non modifié");
        }
    }

    @DeleteMapping("/animal")
    
    public ResponseEntity<?> deleteAnimal(@RequestParam int id) {

    Animal animal = animalService.deleteAnimal(id);
        if (animal != null) {
            return ResponseEntity.ok(animal);
        } else {
            //return ResponseEntity.notFound().build();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Animal non supprimé");
        }
    }

    @GetMapping("/animals")
    
    public ResponseEntity<ArrayList<Animal>> getAnimals() {
        
        ArrayList<Animal> animals = animalService.getAnimals();

        if (animals != null) {
            return ResponseEntity.ok(animals);
        }
        return ResponseEntity.notFound().build();
    }

    
}

