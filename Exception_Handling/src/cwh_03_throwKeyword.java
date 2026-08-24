import java.util.Scanner;

public class cwh_03_throwKeyword {

    //Throw keyword - used to explicitly throw an exception,
    //used inside a method and can declare only one exception at a time.

    public static void main(String[] args) {

        //example: 1
        //Take input from users
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");

        try{
            int age = scanner.nextInt();
            if(age<0){
                throw new MycustomException("Invalid Number, Number cannot be negative");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
class MycustomException extends Exception {
    public MycustomException(String message){
        super(message);
    }
}