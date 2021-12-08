package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    @Test
    public void checkAnimalToString() {
        //Given
        Animal animal = new Animal();
        animal.setName("Dog");

        //When
        String animalName = animal.toString();

        //Then
        assertEquals("Animal{name='Dog'}", animalName);
    }
}
