package Enumeration;

import java.util.Arrays;

public class Enumeration {

    public static void main(String[] args) {

        //Create an object of an enum (not using the new keyword)
        DaysOfTheWeek day = DaysOfTheWeek.THURSDAY;

        if(day == DaysOfTheWeek.THURSDAY) {
            System.out.println("Today is Thursday!");
        }

        //Get all the values of the Enum
        //Get the array of all values of the Enum
        System.out.println(Arrays.toString(DaysOfTheWeek.values()));

        System.out.println(Cereals.FROOT_LOOPS.levelOfDeliciousness);

        //Loop through enum
        for(DaysOfTheWeek daysOfTheWeek : DaysOfTheWeek.values()) {
            System.out.println(daysOfTheWeek);
        }

    }

}
