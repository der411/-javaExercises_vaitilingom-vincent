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
        this.animals.add(new Animal(4, "Cobra", "Reptile", 15));

    }

      public Animal getAnimal(int id) {
  
        for (Animal animal : animals) {
            if (animal.getId() == id) {
        return animal;
            }
        }
        return null;
    }

    public Animal createAnimal(String name, String type, int weight){
        Animal animal = new Animal(this.animals.size() + 1, name, type, weight);
        this.animals.add(animal);
        return animal;
    }

    public Animal updateAnimal(int id, String name, String type, int weight){

        for (Animal animal : animals) {
            if (animal.getId() == id) {
            animal.setName(name);
            animal.setType(type);
            animal.setWeight(weight);
            return animal;
            }
         }
        return null;
    }

    public Animal deleteAnimal(int id){
        for(Animal animal: this.animals){
             if (animal.getId() == id) {
                int index = this.animals.indexOf(animal);
                return this.animals.remove(index);
             }
        }
        return null;
    }
    
}
