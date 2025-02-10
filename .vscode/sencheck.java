import java.util.Scanner;
public class sencheck {
    public static void main(String[] args) {
        Scanner Text = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sent = Text.nextLine();
        int vowelCt=0,consonantCt=0,WordsCt=0,whitespaceCt=0;
        
        sent = sent.toLowerCase();
        String[] words = sent.split("\\s+");

        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (c =='a'|| c =='e'|| c =='i'|| c =='o'|| c=='u') {
                    vowelCt++;
                } else if (Character.isLetter(c)) {
                    consonantCt++;
                }
            }
           
            WordsCt=sent.length();
        }
        whitespaceCt= words.length - 1;
        System.out.println("Vowels: " + vowelCt);
        System.out.println("Consonants: " + consonantCt);
        System.out.println("Words: " + WordsCt);
        System.out.println("Whitespace: " + whitespaceCt);
        Text.close();
    }
}
