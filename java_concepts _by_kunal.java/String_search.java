import java.util.Arrays;

public class String_search {
    public static void main(String[] args) {
        String name="Paravdeep";
        char target='d';

        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static int search(String name,char target){
        if(name.length()==0){
            return -1;
        }
        for(int i=0;i<name.length();i++){
            if(target==name.charAt(i)){
                return i;
            }
        }
        return -2;
    }
}
