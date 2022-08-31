import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dog extends Animal{
    public void getAnimalName() {
        System.out.println("Merci, je m'appelle " + super.animalName);
    }

    @Override
    public void getAnimalType() {
        System.out.println("Hello I'm Dog");
    }
}
