import java.util.Scanner;

public class pracque3 {
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        System.out.println("enter name of site=" );
        String site= S.nextLine();
       
        if(site.endsWith(".org")){
            System.out.println("organizational weBsite");
        }
        else if(site.endsWith(".com")){
            System.out.println("commercial site");
        }
        else if(site.endsWith(".in")){
            System.out.println("indian site.");
        }
        S.close();
    }
}
