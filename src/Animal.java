public abstract class Animal {

     public abstract void animalCat();
     public abstract void animalDog();
     private int animalAge;
     private String animalName;




     // setter and getter for ANIMAL NAME
     public void setAnimalName(String animalName){
          this.animalName = animalName;
     }
     public String getAnimalName(){
          return animalName;
     }

     // setter and getter for ANIMAL AGE
     public void setAnimalAge(int animalAge){
          this.animalAge = animalAge;
     }
     public int getAnimalAge(){ // need to return int
          return animalAge;
     }

}
