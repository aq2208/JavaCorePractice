package Generics;

public class Printer<T> {

    //In this class, the T represents the type of things that the Printer is able to hold and print

    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}
