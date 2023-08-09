package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain {

    public static void main(String[] args) {

        //When we use the class with Generics, we need to provide the type of variable that we declare

        //The data type that we passed in is going to be used as the T type in the Generic Class

        Printer<Integer> integerPrinter = new Printer<>(60);
        integerPrinter.print();

        Printer<String> stringPrinter = new Printer<>("Hihiiii");
        stringPrinter.print();

        //Call Generic Methods
        shout("John");
        shout(57);

        List<Integer> intList = new ArrayList<>();
        intList.add(100);
        shoutAList(intList);
    }

    //Generic Methods
    private static <T> void shout (T thingToShout) {
        System.out.println(thingToShout + "!!!!");
    }

    //Multiple Different Generics Type + Return Generic Type
    private static <T, V> T shout2Things (T thingToShout, V anotherThing) {

        System.out.println();

        return thingToShout;
    }

    private static <T> void shoutAList (List<T> myList) {
        System.out.println(myList);

    }
}
