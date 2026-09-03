import java.util.*;

public class Sollve_Questions {

    public static void main(String[] args) {


//        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10, 10, 20, 20, 30, 450, 50, 60));


//        !Q1 : Find the duplicate elements in given arrayLists (Brute & Optimal approach)

        //Brute code
//        for (int i =0;i <al.size();i++){
//            for (int j = i+1; j < al.size(); j++) {
//
//                if (al.get(i).equals(al.get(j))){
//                    System.out.println("Duplicate elements: " + al.get(i));
//                }
//            }
//        }

        //Optimal approach

        // Using HashSet because in set duplicate values are not stored

//        HashSet<Integer> set = new HashSet<>();
//        for (Integer element : al){
//            if(!set.add(element)){
//                System.out.println("Duplicate elements are: " + element);
//            }
//        }


//        !Q2 : Convert array to arrayList

        int[] arr = {1, 2, 3, 4, 5};

        ArrayList<Integer> li = new ArrayList<>();
        for (int ele : arr) {
            li.add(ele);
        }
        System.out.println(li);


//        !Q3 : ArrayList to Array convert


//      !  Q4 : Sort an arraylist

//       Collections.sort(al);
//        System.out.println(al);

//      ! Q5 : Reverse an arrayList

//        int i =0;
//        int j =al.size()-1;
//
//        while(i<j){
//            int swap =  al.get(i);
//            al.set(i, al.get(j)) ;
//            al.set(j,swap);
//            i++;
//            j--;
//        }
//        System.out.println(al);

//
//        Collections.reverse(al);
//        System.out.println(al);


//    Q6 : Find duplicate

        LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4, 4, 5, 5, 6, 7, 8));
        System.out.println(set); //use for insertion other-wise i can use also hashset

        for (Integer ele : set) {
            System.out.println(ele);
        }

//     Q7 : Find Duplicate character using hashmap
//        String name = "Satyam";
//
//        HashMap<Character , Integer> map = new HashMap<>();
//        for (char ch : name.toCharArray()){
//            map.put(ch, map.getOrDefault(ch,0)+1);
//        }
//        for (Character ch : map.keySet()){
//            if(map.get(ch) > 1){
//                System.out.println("Duplicate character is: " + ch);
//            }
//        }

//
//        HashMap<Integer , Character> hashmap = new HashMap<>();
//        hashmap.put(1,'a');
//        hashmap.put(2,'b');
//        hashmap.put(3,'c');
//        hashmap.put(4,'d');
//        hashmap.put(5,'d');
//
//
//        //When i need key value pair the i go for entry()
//        for (Map.Entry<Character,Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey() + " --> " + entry.getValue());
//        }

//  count frequency of elements using hashmap

        int[] arr5 = {1, 22, 22, 22, 33, 33, 33, 44, 45, 667};

        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int ele3 : arr5) {
            map2.put(ele3, map2.getOrDefault(ele3, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + " ----> " + entry.getValue());

        }
        System.out.println();
        // count the number of character frequency using hashmap

        String names = "SatyamMoharana";

        HashMap<Character, Integer> count = new HashMap<>();

        for (char ch1 : names.toCharArray()) {
            count.put(ch1, count.getOrDefault(ch1, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry1 : count.entrySet()) {
            System.out.println(entry1.getValue() + " ----> " + entry1.getKey());
        }


    }


}
