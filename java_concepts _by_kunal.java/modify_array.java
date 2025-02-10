import java.util.Arrays;

public class modify_array {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        modify(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void modify(int[] ar){
        ar[1]=22;
    }
}
