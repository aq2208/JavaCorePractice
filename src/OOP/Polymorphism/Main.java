package OOP.Polymorphism;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat myCat = new Cat();
        Cat myCat2 = new Cat("Anold");
        Dog myDog = new Dog();

        //Upcasting
        Animal myAnimalCat = new Cat();
        Animal myAnimalCat2 = new Cat("Lyly");
        Animal myAnimalDog = new Dog();

        animal.makeNoice();
        myCat.makeNoice();
        myDog.makeNoice();

        myAnimalCat.makeNoice();
        myAnimalDog.makeNoice();

        System.out.println(myCat2.catName);

        myAnimalCat.eat();

        myAnimalDog.age = 15;
    }

}
