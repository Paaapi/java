import java.util.ArrayList;

public class array_recursion_q3 {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        int[] arr={2,4,53,6,5,87,66,9,74,4,89,4};
        int target = 4;
        System.out.println(findall(arr, target, 0, List));

        System.out.println(find2(arr, target, 0));
    }

    // taking an arraylist as an argument
    static ArrayList<Integer> findall(int[] arr,int target,int index,ArrayList<Integer> List){
        if(index==arr.length){
            return List; // base condition
        }
        if(arr[index]== target){
            List.add(index); // this add the index of 4 occus multiple times
        }
        return findall(arr, target, index +1, List);
    }

    // taking an arraylist in the function
    static ArrayList<Integer> find2(int[] arr,int target,int index){
        ArrayList<Integer> list= new ArrayList<>();
        if(index==arr.length){
            return list; // base condition
        }
        if(arr[index]== target){
            list.add(index);
        }
        ArrayList<Integer> ansfrombelowcalls = find2(arr, target, index+1);

        list.addAll(ansfrombelowcalls); // this will add all elements from the below of the calling to pass it to above call at main function
        return list;
    }
}
