import model.Animal;
import model.AnimalList;

public class Main {
    public static void main(String[] args) {

        AnimalList animalList = new AnimalList();
        Animal animal = new Animal();
        animal.setName("Hund");
        System.out.println(animalList);
        animalList.add(animal);
        System.out.println(animalList);
        animal = new Animal();
        animal.setName("Katze");
        animalList.add(animal);
        System.out.println(animalList);
        animal = new Animal();
        animal.setName("Greif");
        animalList.add(animal);
        System.out.println(animalList);
        animal = new Animal();
        animal.setName("Stirnlappenbasilisk");
        animalList.add(animal);
        System.out.println(animalList);
        animal = new Animal();
        animal.setName("Galapagos-Schildkröte");
        animalList.add(animal);
        System.out.println(animalList);

    }
}
