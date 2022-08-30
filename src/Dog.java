import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dog extends Animal{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    @Override
    public void getAnimalCat() {

    }

    public void getAnimalDog()  {
        System.out.println("Hello i'am Dog");
        System.out.println("Give me the name: ");

//        setAnimalName(animalName) = reader.readLine();
//        System.out.println("Merci, je m'appelle " + animalName);


    }

    @Override
    public void getAnimalName() {

    }

    @Override
    public void getAnimalAge() {

    }

}
