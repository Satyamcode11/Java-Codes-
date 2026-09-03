import java.security.KeyStore;
import java.util.*;

public class ElitePractice {
    public static void main(String[] args) {

        //Q1: Find the largest element in an array
        int[] arr = {19, 10, 4, 10, 15, 40, 69, 30, 30};
        int n = arr.length;
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
//                System.out.println( arr[i]);
//            }
//        }

//        using hashmap..........
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for (int elemenets: arr){
//            map.put(elemenets, map.getOrDefault(elemenets,0)+1);
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


//        Q10: Find the average of an array elements......\
        // we know that average = sum of all elements / number of elements

//        int sum = 0;
//        for (int i = 0; i <arr.length ; i++) {
//            sum += arr[i];
//        }
//        double average = (double)sum/arr.length; // here both explicit and implicit is done
//        System.out.println("The average number is: " + average);


//        Q11: Sort an array with sort() and without sort()
//        Arrays.sort(arr); //with
//        System.out.println(Arrays.toString(arr));

        //without
//        boolean swapped;
//        for (int i = 0; i <n-1 ; i++) {
//            swapped = false;
//            for (int j = 0; j < n-1-i; j++) {
//                if (arr[j] > arr[j+1]) {
//                    int swap = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = swap;
//                    swapped = true;
//                }
//            }
//            if (!swapped) break;
//        }
//        for (int ele : arr){
//            System.out.print(ele + " ");
//        }


//        Q12: Merge two array
//        int [] arr1 = {1,2,3};
//        int [] arr2 = {4,5,6,7};
//        int[]merged = new int[arr1.length + arr2.length]; // here means merged size is 6
//
//        //copy the first array
//        for (int i=0;i<arr1.length;i++){
//            merged [i] = arr1[i];
//        }
//
//        //copy the second array after the first array
//        for (int i =0;i<arr2.length;i++){
//            merged[arr1.length+i] =arr2[i];
//        }
//        for(int mergedElements : merged){
//            System.out.print(mergedElements + " ");
//        }

//        Q13: Find the occurance of the specific element of an aray

//        int target = 10;
//        int count =0;
//        for (int i = 0; i <n ; i++) {
//            if (arr[i] == target){
//                count++;
//            }
//        }
//        System.out.println(target + " ---- " + count);

        //using hashmap

//        HashMap<Integer,Integer> element = new HashMap<>();
//        for(int value : arr){
//            element.put(value, element.getOrDefault(value, 0) + 1);
//        }
//
//       for(Map.Entry<Integer,Integer> entry : element.entrySet()){
//           System.out.println(entry.getKey() + " --> " + entry.getValue());
//       }

//        Q14: Find the common elements between an array
       int [] arr1 ={1,2,3,4,59,40,49};
       int [] arr2 ={1,2,3,4,100,80,70};

//        for (int i = 0; i <arr1.length ; i++) {
//            for (int j=0; j< arr2.length;j++){
//                if (arr1[i] == arr2[j]){
//                    System.out.println("The common element is: " + arr1[i]);
//                    break;
//                }
//            }
//        }

        //using hashset

//      HashSet<Integer> set1 = new HashSet<>();
//      for (int elements : arr1){
//          set1.add(elements);
//      }
//      for (int elements : arr2){
//          if (set1.contains(elements)){
//              System.out.println("The common elements are: " + elements);
//          }
//      }
    }
    }


