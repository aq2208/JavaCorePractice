package Interface;

public class ByThrees implements Series {

    int val;

    public ByThrees() {
        val = 0;
    }

    public int getNext() {
        val += 3;
        return val;
    }

    //you can override the default method of an interface
    public void printStuff() {
        System.out.println("I'm Nguyen Anh Quan");
    }
}
