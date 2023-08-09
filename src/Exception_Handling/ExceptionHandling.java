package Exception_Handling;

import java.nio.file.FileAlreadyExistsException;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            //Code that may cause an exception
            int myInt = Integer.parseInt("pants");
//            int myInt2 = Integer.parseInt("1");
            //If an exception is thrown in the try block, the rest of the code in the try block, after that exception will not be executed
            System.out.println("after parsing pants");
            return;  //just for testing, usually try to avoid return statement in try catch block
        }
        catch (NumberFormatException e) {  //catch the NumberFormatException if it's thrown in the try block
            //The type of exception that you put in your catch block will catch only exception of that type,
                //or any subclasses of that exception
            //So you can use multiple catch blocks to catch multiple types of exception,
                //this allow us to have different behaviours depending on the type of exception that was thrown
            //Or you can have an universal code block to handle all of the exceptions in one, using Exception e catch block
            //Code that we want to execute if this type of exception happen
            //If this exception is not thrown, this catch block will never be executed
            System.out.println("Hey dude, you can't make an int out of that. Stop trying to make it happen!");
        }
        catch (NullPointerException e) {
            System.out.println();
        }
        //If you just want 1 block of code to handle multiple different types of exception => use multi-catch statement
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
            //Code block to catch and handle multiple exceptions at once
            // => avoid code duplication
        }
        catch (Exception e) {  //This will catch any types of exception at all, any exceptions that are subclasses of Exception

        }
        finally {
            //The code that always be executed whether there's an exception or not, this code will always be executed
            //Even if there is a return statement in the try block, it will always execute the finally block
            //Most of the time you don't need a finally block, most of the time try-catch block is enough,
                //but there's certain situation you will need to use finally block, for example to clear the database connection
            System.out.println("In the finally block");
        }
        System.out.println("End the program here!");
    }
}
