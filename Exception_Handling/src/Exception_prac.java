import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exception_prac {
    public static void main(String[] args) {
        //Example: 1
        int number = 10/0; //ArithmeticException happen here

        //Example: 2 (Catch Exception using try/catch block)
        try {
            int num = 6 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("After exception Handling Message ");
        System.out.println();

        //Example: 3
        String string = null;

        try {
            int length = string.length();
            System.out.println("length: " + length);
        } catch (NullPointerException var23) {
            System.out.println("Here it catch an exception");
        }

        System.out.println("The program continue running safely: ");
        System.out.println();

        //Example: 3

        try {
            int[] arr = new int[]{10, 20, 30, 40};
            System.out.println(arr[50]);
            int var3 = 40 / 0;
        } catch (ArrayIndexOutOfBoundsException var21) {
            System.out.println("Here Arrays out of bound exception catch");
        } catch (ArithmeticException var22) {
            System.out.println("Here catch an arithmetic exception");
        }

        System.out.println();

        //Example: 4

        try {
            String str = "Satyam";
            int parsedNumber = Integer.parseInt(str);
            int[] arr = new int[]{1, 2, 3, 4};
            System.out.println(arr[5]);
            int var5 = 50 / 0;
        } catch ( NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        //Example: 5 (Finally Block)

        try {
            int e = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("num" + e.getMessage());
        } finally {
            System.out.println("I always execute no matter exception occurs or not");
        }

        System.out.println();

        //Example: 6

        File file = new File("git.txt");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException var26) {
            System.out.println("Error: Target file could not be found on desk");
        }

    }

}



