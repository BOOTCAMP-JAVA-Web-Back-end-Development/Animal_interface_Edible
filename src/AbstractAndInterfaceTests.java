import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import edible.Edible;
import fruit.Fruit;
import fruit.Apple;
import fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }else if (animal instanceof Tiger){
                Edible edible = (Tiger) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
       for (Fruit fruit : fruits) {
           if (fruit instanceof Apple){
               Edible edible = (Apple) fruit;
               System.out.println(edible.howToEat());
           }
           else if (fruit instanceof Orange){
               Edible edible = (Orange) fruit;
               System.out.println(edible.howToEat());
           }
       }
    }
}