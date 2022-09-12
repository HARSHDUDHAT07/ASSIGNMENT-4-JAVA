// Prepared by HARSH DUDHAT 21CE026
// WAP to show the try - catch block to catch the different types of exception.
public class pr1 {

    public static void main(String[] args) {
        // -----> 1*
        try {
            int data = 50 / 0; // may throw exception
        }
        // handling the exception
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }

}
// -----> 2*
// public class TryCatchExample3 {

// public static void main(String[] args) {
// try
// {
// int data=50/0; //may throw exception
// // if exception occurs, the remaining statement will not exceute
// System.out.println("rest of the code");
// }
// // handling the exception
// catch(ArithmeticException e)
// {
// System.out.println(e);
// }

// }

// }

// ---> 3*
// try
// {
// fun();
// }
// catch(NullPointerException e)
// {
// System.out.println("Caught in main.");
// }
// finally
// {
// System.out.println("Finally statment is Called");
// }