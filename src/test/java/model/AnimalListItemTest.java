package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListItemTest {

    @Test
    public void checkAnimalListItemToString() {
        //Given
        Animal animal = new Animal();
        animal.setName("Dog");
        AnimalListItem animalListItem = new AnimalListItem(animal);
        //When
        String animalName = animalListItem.toString();
        //Then
        assertEquals("AnimalListItem{value=Animal{name='Dog'}}", animalName);
    }
}