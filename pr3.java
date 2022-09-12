
// Prepared by HARSH DUDHAT 21CE026
// Write a program that raises two exceptions. Specify two ‘catch’ clauses for the two
// exceptions. Each ‘catch’ block handles a different type of exception. For example the
// exception could be ‘ArithmeticException’ and ‘ArrayIndexOutOfBoundsException’.
// Display a message in the ‘finally’ block.
import java.util.ArrayList;

class pr3 {
    static void fun() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
    }

    public static void main(String args[]) {
        try {
            fun();
        } catch (NullPointerException e) {
            System.out.println("Caught in main.");
        } finally {
            System.out.println("Finally statment is Called");
        }
        int b = 0, j = 9, k;
        try {
            k = j / b;
        } catch (ArithmeticException e) {
            System.out.println("The original number to be Print is : " + (float) (b + 1) / j);
        } finally {
            System.out.println("Now code will give proper output");
        }
    }

    // ArrayindexBoundExeption
    public class ArrayIndexOutOfBoundException {

        public static void main(String[] args) {
            ArrayList<String> listOfPlayers = new ArrayList<>();
            listOfPlayers.add("Rohit");
            listOfPlayers.add("Shikhar");
            listOfPlayers.add("Virat");
            listOfPlayers.add("Dhoni");
            for (String val : listOfPlayers) {
                System.out.println("Player Name: " + val);
            }

        }
    }

}