import java.util.ArrayList;
import java.util.Arrays;

public class cwh_01_OneD_Array {
    public static void main(String[] args) {
     //Array- It is linear data structure that store a collection of elements of
        // same data type in a contiguous location under a single variable name.
        // Traditional Array are fixed in capacity once allocated meaning their
        // length is fixed but the stored value can be updated.

        //example: 1
        int [] arr = new int [5];
        arr[0]= 10;
        arr[1]= 10;
        arr[2]= 10;
        arr[3]= 10;
        arr[4]= 10;
        System.out.println(arr.length);
        for(int numbers:arr) {
            System.out.print(numbers + ", ");
        }

        System.out.println();


            //example: 2 (Traversing/Accessing an array)
            String [] array = {"Java", "Kotlin", "C++", "Python"};
            System.out.println(array.length);
             for(int i=0;i<array.length;i++){
                 System.out.println(array[i]);
             }

        System.out.println();

             //example: 3 (Reverse an array using while loop)
        int x =array.length-1;
        while(x>=0){
            System.out.print(array[x]+ ", ");
            x--;
        }

       System.out.println();

        //example: 4
        int [] numbers = {10,20,30,47,59,60};

        int i=0;
        while(i<numbers.length){
            if (numbers[i]%2==0){
                System.out.println(numbers[i] + ", ");
            }
            i++;
        }

            System.out.println();

        //example: 5 (Array to arraylist)
      ArrayList<Integer> al = new ArrayList<>();
      for (int num: numbers){
          al.add(num);
      }
        System.out.println(al);

         //Reverse an array
//        for (int x = numbers.length-1; x>0;x--){
//            System.out.println(numbers[x]);
//        }
//        System.out.println();

        // using two pointer swapping.
        for (int j =0; j<numbers.length/2;j++ ){
            int temp= numbers[j];
            numbers[j] = numbers[numbers.length-1-j];
            numbers[numbers.length-1-j]=temp;
        }
        for (int j =0 ; j<numbers.length;j++){
            System.out.print(numbers[j] + " ");
        }

    }
}