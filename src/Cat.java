import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cat extends Animal{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void getAnimalCat() {
        Cat cat = new Cat();

        try {
            System.out.println("Hello i'am Cat");
            System.out.println("Give me the Name: ");
            cat.setAnimalName(reader.readLine());
            System.out.println("Merci, je m'appelle " + cat.animalName);
        }catch(IOException e) {
            System.out.println(e.getMessage());

        }
    }

    @Override
    public void getAnimalDog() {

    }

    @Override
    public void getAnimalName() {

    }

    @Override
    public void getAnimalAge() {

    }
}
