package Collections_Framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorInterface {

    public static void main(String[] args) {
        int size = 1000000;

        List<Integer> arrList = new ArrayList<>();

        long start = System.currentTimeMillis();

        for(int i = 0; i < size; i++) {
            arrList.add(i);
        }

        long end = System.currentTimeMillis();

        List<Integer> vector = new Vector<>();
    }

}
