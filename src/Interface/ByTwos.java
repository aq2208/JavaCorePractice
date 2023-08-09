package Interface;

//this class is to increment the amount by two
public class ByTwos implements Series {

    int val;

    //constructor to initialize the value of val to 0
    public ByTwos() {
        val = 0;
    }

    //whenever you implement an interface, you have to implement all the methods that it provide
    //here we implement getNext() method and make it increment val by 2
    public int getNext() {
        if(val >= MAX) {
            System.out.println(ERRORMSG);
        } else {
            val += 2;
        }
        return val;

    }
}
