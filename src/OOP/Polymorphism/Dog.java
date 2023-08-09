package OOP.Polymorphism;

public class Dog extends Animal{

    @Override
    public void makeNoice() {
        System.out.println("Guf Guf!");
    }

    public void growl() {
        System.out.println("Grrrrr");
    }
}
