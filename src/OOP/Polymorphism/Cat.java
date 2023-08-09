package OOP.Polymorphism;

public class Cat extends Animal{

    String catName;

    public Cat() {}

    public Cat(String catName) {
        this.catName = catName;
    }

    @Override
    public void makeNoice() {
        System.out.println("Meow Meow!");
    }

    public void playingWithFabric() {
        System.out.println("Cat playing with fabric!");
    }

}
