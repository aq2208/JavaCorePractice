package Lambda_Expressions;

import javax.swing.*;

public class Lambdas {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Dog myDog = new Dog();

        //myCat.print();
        printThing(myCat);
        printThing(myDog);

        printThing(
                () -> {
                    System.out.println("Anh Quan dep trai");
                });
    }

    static void printThing(Printable thing) {
        thing.print();
    }
}
