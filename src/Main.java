import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /*
    Я вынес ридер в начало класса и сказал, что он public - то есть,
    его видят все классы и все методы и могут его вызывать

    и я сказал что от static - статик, это значит, что он существует сам по себе и он один единственный.
    вы еще пройдете это в лекциях
    */
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        boolean systemIsRun = true;

        do {
            System.out.println("Make choice: 1 - Кот | 2 - Собака | another - FOR EXIT: ");
            String option = reader.readLine();

            /*
            Тут вы видите, что передается new Cat() или new Dog()
            прикол в том, что это тоже самое что:

            Animal animal = new Dog()
            readAnimalName(animal);

            просто решил показать красоту языка

            но, есть один нюанс - в первом случае, когда вы просто передаете new Dog()
            выполнится метод readAnimalName(), засетится имя - но после окончания работы нашего метода readAnimalName()
            эта собака и любая информация о ней, будет просто удалена - вы к ней никак не обратитесь просто
            - вы не знаете де искать эту информаци. в памяти

            а во втором случае
            Animal animal = new Dog()
            readAnimalName(animal);

            после окончания работы метода readAnimalName()
            у вам еще есть доступ к области памяти, где хранится информация о собаке, через переменную animal
            переменная animal - это ссылка на ту область памяти, вот почему это называются Сыллочные типы данных
            Они хранят ссылку\адрес на область памяти, где храниться информация о животном, в данном случае, имя
            */
            switch (option) {
                case "1":
                    readAnimalName(new Cat());
                    break;
                case "2":
                    readAnimalName(new Dog());
                    break;
                default:
                    systemIsRun = false;
            }
        } while (systemIsRun);
    }


    /*
    Я создал метод, который принимает !!!! Animal !!!!
    а раз он принимает Animal, то значит он принимает все классы наследники.

    важное замечение, так как мы принимаем класс Животное,
    то мы можем иметь доступ к полям и методам только класса животное
    вы не сможете тут вызвать метод catVoice() класса Cat

    если представить - то мы берем и обрезаем все лишнее
    и все что было добавлено в наследниках и пользуемся лишь родительськими фичами
    */
    public static void readAnimalName(Animal animal) throws IOException {

        /*
        Вот кстати первый полиморфизм, у нас проде как объект анемел - вызывает метод getAnimalType()
        Но, в заисимости от того, какая реализация Животного придет ->
         -> Dog или Cat будет вызван метод из соответствующего класса
        */
        animal.getAnimalType();


        /*
        Тут мы вызываем setAnimalName() - помните, что это будет имя для кота или для собаки
        */
        System.out.print("Take me name: ");
        animal.setAnimalName(reader.readLine());

        /*
        тоже самое тут, вернется имя кота или собаки - не животного.
        повторюсь - наследники имеют доступ к полям и методам родителя
        считайте, что в самом классе собака есть все что есть в животном
        */
        animal.getAnimalName();
    }
}
