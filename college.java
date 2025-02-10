class prof{
    String parentsprofession;
    prof(String p){
        parentsprofession=p;
    }
    String show(){
        return parentsprofession;
    }
    

}

public class college {
    public static void main(String[] args) {
        System.out.println("parents profession");

        
      prof father_proff=new prof("works in private sector");// literals are hard coded values jo phele complier mein dali ho.

      prof mother_proff=new prof("Housewife");

      prof My_proff= father_proff;

      System.out.println("My Father's Prof:"+ father_proff.show());
      System.out.println("My Mother's prof:"+ mother_proff.show());
      System.out.println("My Prof:"+ My_proff.show());



        }

    }

