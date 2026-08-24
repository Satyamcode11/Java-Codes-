import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class cwh_02_throwsKeyword {
     //(Throws keyword - use to declare possible exceptions,
    //    used in method signature and can declare multiple exceptions)
        //example: 1
    public static int divide(int x,int y ) throws ArithmeticException{
        int result =x/y;
        return result;
    }

    //example : 2 (Throwing Multiple Exception)
    public static void method() throws NullPointerException, FileNotFoundException {
        String string = null;

        File file = new File("git.txt");
        FileInputStream stream = new FileInputStream(file);
    }

    //example: 3

    public static int getNumberfromArray(int[]a) throws ArrayIndexOutOfBoundsException{
        return a[8];
    }
    public static void main(String[] args) {

        //example: 1 (try/catch Block)
        try{
            int number = divide(2,0);
            System.out.println(number);
        }catch (ArithmeticException s ){
            System.out.println("Exception Catch");
        }

        //example : 2 (try/catch Block)

        try{
            method();
        }catch (NullPointerException e){
            System.out.println("Catch NullPointerException");

        }catch (FileNotFoundException e){
            System.out.println("Catch FileNotFound Exception");
        }

        //example: 3 (In main-Block , Create an array that size of 5)
        int [] a = new int[5];

        try{
            getNumberfromArray(a);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("catched the exception " + e.getMessage());
        }

    }
}
