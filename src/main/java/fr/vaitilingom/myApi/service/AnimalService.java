package fr.vaitilingom.myApi.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import fr.vaitilingom.myApi.model.Animal;


@Service
public class AnimalService {

        private ArrayList<Animal> animals;

    public AnimalService(){

        this.animals = new ArrayList<Animal>();

        this.animals.add(new Animal(1, "Lion", "Mammifere", 200));
        this.animals.add(new Animal(2, "Requin", "Poisson", 1500));
        this.animals.add(new Animal(3, "Aigle", "Oiseau", 7));

    }

      public Animal getAnimal(int id) {
  
        for (Animal animal : animals) {
            if (animal.getId() == id) {
        return animal;
            }
        }
        return null;
    }
    
}
