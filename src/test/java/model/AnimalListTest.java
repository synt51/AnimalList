package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalListTest {

    @Test
    public void checkAnimalListToStringNull(){
        //Given
        AnimalList animalList = new AnimalList();

        //When
        String animalName = animalList.toString();

        //Then
        assertEquals("AnimalList{head=null}", animalName);
    }

    //Test for adding animal to list
    @Test
    public void checkAnimalListAddingAnimal(){
        //Given
        AnimalList animalList = new AnimalList();
        Animal animal = new Animal();
        animal.setName("Dog");
        //When
        animalList.add(animal);
        //Then
        assertEquals("AnimalList{head=AnimalListItem{value=Animal{name='Dog'}}}", animalList.toString());
    }

    //Test for tail
}
