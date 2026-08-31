import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ElitePractice {
    public static void main(String[] args) {

        //Q1: Find the largest element in an array
        int[] arr = {19, 10, 4, 10, 15, 40, 69,30, 30};
        int max = Integer.MIN_VALUE; // or int max = arr[0];

        int secondMax = Integer.MIN_VALUE; //Q6 (Second largest element)

//        for(int i=0; i<arr.length; i++){
//            if (arr[i]>max){
//                max = arr[i];
//            }
//        }
//        System.out.println(max);

//        Q2: Find sum of all elements.....

//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            sum+= arr[i];
//        }
//        System.out.println(sum);

//    Q3: Check Even or Odd number and count them.....
//
//        int even=0;
//        int odd=0;
//
//        for (int i = 0; i <arr.length ; i++) {
//            if (arr[i] %2 ==0) {
//                even++;
//            }else{
//                odd++;
//            }
//        }
//        System.out.println("Even numbers " + even);
//        System.out.println("Odd numbers " + odd);


        //    Q4: Search for an element and mention the index..........
//        int target = 15;
//        boolean found = false;
//      for (int i=0;i< arr.length;i++){
//            if (arr[i]==target){
//                found = true;
//                System.out.println("The targeted element is found in " + i + " index");
//                break;
//            }
//        }
//      if (! found){
//          System.out.println("Element is not found");
//      }

//      Q5: Reverse an array using for loop
//
//        int i =0;
//      int j=arr.length-1;
//      while(i<j){
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//         i++;
//         j--;
//      }
//      for(int elements : arr){
//          System.out.print(elements + " ");
//      }

//      Q6: Second largest element.....................
//        for (int i = 0; i <arr.length ; i++) {
//         if (arr[i]>max){
//             max=arr[i];
//         }
//        }
//      for (int i =0;i<arr.length;i++){
//          if(arr[i]>secondMax && arr[i] !=max){
//              secondMax = arr[i];
//          }
//      }
//        System.out.println("The largest element: " + max);
//        System.out.println("The second largest element: " + secondMax);


//    OR - IN one loop
//        for (int i = 0; i <arr.length ; i++) {
//            if (arr[i]>max){
//                secondMax =max;
//                max = arr[i];
//            }
//            else if (arr[i]>secondMax && arr[i] != max){
//                secondMax = arr[i];
//            }
//        }
//        System.out.println(secondMax);


        // Q7: Find the duplicate value using for loop and hash set...................
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    System.out.println("The duplicate element: " + arr[j]);
//
//                }
//            }
//        }
//     OR using hash Set
//        HashSet<Integer> set = new HashSet<>();
//        for(int elements : arr){
//           if(!set.add(elements)){
//               System.out.println("The duplicate element: " + elements);
//           }
//        }


//        Q8: Find the unique element...
//        for (int i = 0; i <arr.length; i++) {
//            int count =0;
//            for (int j = 0; j <arr.length ; j++) {
//                if (arr[i]==arr[j]){
//                    count++;
//                }
//            }
//            if (count == 1) {
//
//
//                System.out.println( arr[i]);
//            }
//        }

//        using hashmap..........
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for (int elemenets: arr){
//            map.put(elemenets, map.getOrDefault(elemenets,0)+1);
//
//        }
//        for (int elements : arr){
//            if(map.get(elements)==1){
//                System.out.println("The unique value is :" + elements);
//            }
//        }


//        Q9: remove duplicates from an array

        // I can also use hashset but in hash set it wouldn't preserve order

//        LinkedHashSet<Integer> set = new LinkedHashSet<>();
//        for (int element:arr){
//            set.add(element);
//        }
//        System.out.println("After removing the duplicates");
//        for (int num:set){
//            System.out.println(num); // automatically remove duplicates and keeps insertion Order
//        }



    }

}
