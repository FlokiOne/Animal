import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Animal animal;

        boolean systemIsRun = true;

        do {
            System.out.println("Make choice: 1 - Кот | 2 - Собака | another - FOR EXIT: ");
            String option = reader.readLine();


            switch (option){
                case "1":
                    animal = new Cat();
                    animal.getAnimalCat();
                    break;
                case "2":
                    animal = new Dog();
                    animal.getAnimalDog();
                    break;
                default:
                    systemIsRun = false;
            }
        }while (systemIsRun);


    }
}
