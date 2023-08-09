package Interface;

public interface Series {

    //interface variable (or interface attribute)
    //any classes implement Series interface will have the access to use interface's variables
    //all variables declared in interface are public, static and final
    //public: any classes implement the interface have access to the variable
    //static: you can call it without using an object (ex: Series.MAX)
    //final: we can't change the value of it
    int MAX = 10;
    String ERRORMSG = "Cannot go above value: " + MAX;

    //interface method - getNext() method
    //so classes implement this Series interface, it's going to have a value at 0,
    //and everytime this getNext() method is called,
    //it's going to increment the value by a certain amount
    int getNext();

    //default method - you can define the body of a method inside an interface
    //with the "default" keyword
    //and you don't need to implement this default method to the classes implement the interface, just use it
    //and this default method can be overrided by the classes implement interface
    default void printStuff() {
        System.out.println("Hello World");
    }
}
