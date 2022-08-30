import java.io.IOException;

public abstract class Animal {

     public int animalAge;
     public String animalName;

     public abstract void getAnimalCat(); // CAT
     public abstract void getAnimalDog(); // DOG
     // NAME
     public abstract void getAnimalName();
     public abstract void getAnimalAge(); // age 0-1 - shenok/kotenek


     // setters and getters
     // set NAME
     public void setAnimalName(String animalName){
          this.animalName = animalName;
     }

     // set AGE
     public void setAnimalAge(int animalAge){
          this.animalAge = animalAge;
     }


}







//{
//
//     public abstract void getAnimalCat();
//     public abstract void getAnimalDog() throws IOException;
//     public abstract void getAnimalAge(); // age 0-1 - shenok/kotenek
//     public abstract void getAnimalName();
//     private int animalAge;
//     private String animalName;




     // setter and getter for ANIMAL NAME
//     public void setAnimalName(String animalName){
//          this.animalName = animalName;
//     }
//     public String getAnimalName(){
//          return animalName;
//     }
//
//     // setter and getter for ANIMAL AGE
//     public void setAnimalAge(int animalAge){
//          this.animalAge = animalAge;
//     }
//     public int getAnimalAge(){ // need to return int
//          return animalAge;
//     }
//
//     public void

