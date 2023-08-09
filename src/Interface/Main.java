package Interface;

public class Main {

    public static void main(String[] args) {

        ByTwos byTwos = new ByTwos();
        ByThrees byThrees = new ByThrees();

        //Interface Reference Variables
        //You can create a variable of the interface type,
        //and you can have it reference objects that implement that interface
        Series obj;

        for (int i=0; i<6; i++) {
            System.out.println(byTwos.getNext());
            System.out.println(byThrees.getNext());

            //we can point the Series object to either of the two classes implementing Series,
            //and we can call the getNext() method, and it will call whichever object version it's pointing to
            //like when we point the obj to byTwos object of the ByTwos class, and then we call the getNext()
            //method, it will look at which object it's pointing to, and it will call that object's version of getNext()
            //even though both ByTwos and ByThrees have the getNext() method
            obj = byTwos;
            System.out.println("ByTwos: " + obj.getNext());

            //one thing to know that the interface type object can only call the methods defined in the interface
            obj = byThrees;
            System.out.println("ByThrees: " + obj.getNext());
        }

        //So as you can see, both ByTwos and ByThrees classes have the getNext() method
        //as we've mentioned, the interface tells it what needs to be implemented
        //but the classes can decide how it gets implemented

        byTwos.printStuff();
        byThrees.printStuff();
    }
}
