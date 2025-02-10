import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>(30);
        ArrayList<Integer> arr1= new ArrayList<>();
        
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(9);
        arr.add(2,6);
        arr1.add(10);
        arr1.add(12);
        arr1.add(14);
        arr1.add(16);
        arr.addAll(arr1);
        arr.set(0, 18);
        arr.clone();
        System.out.println(arr.indexOf(5));
        System.out.println(arr.contains(6));
     /*   for (Integer i : arr) {
            System.out.println(i);
        }
    */
    for(int i=0;i<arr.size();i++){
        System.out.print(arr.get(i) +",");
    }
    }
}
