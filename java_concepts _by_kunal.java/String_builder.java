import java.util.Arrays;

public class String_builder {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder(); // but Stringbuilder are mutable just like arrays.
        for(int i=0;i<26;i++){
            char ch=(char)('a'+ i);
            // series=series + ch; it takes O(n^2) because Strings are immutable ^
            builder.append(ch);
        }
        System.out.println(builder);
        
        System.out.println(builder.charAt(5));

        //String Methods
        String name="Paravdeep Walia";
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(Arrays.toString(name.toCharArray()));


    }
}
