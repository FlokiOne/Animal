import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        AnimalType animalChoice = new AnimalType();


        boolean systemIsRun = true;

        do {
            System.out.println("1 - Кот | 2 - Собака. Сделайте выбор 3 - FOR EXIT: ");
            String option = reader.readLine();

            switch (option){
                case "1":
                    animalChoice.animalCat();
                    break;
                case "2":
                    animalChoice.animalDog();
                    break;
                case "3":
                    systemIsRun = false;
                default:
                    System.out.println("Make your choice s'il vous plaît");
            }
        }while (systemIsRun);


    }
}
