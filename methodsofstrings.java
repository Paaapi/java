public class methodsofstrings {
    public static void main(String[] args) {
        System.out.println("Strings methods");

        //LENGTH

        String name = "Parav";
        int value = name.length();
        System.out.println(value);

        //convert text to lower case or in Upper case

        String lower = name.toLowerCase();
        System.out.println(lower);

        String upper = name.toUpperCase();
        System.out.println(upper); 

        // nontrimmedstring and trimmedstring

        String nontrim = "    Parav    ";
        System.out.println(nontrim);
        String trimm = nontrim.trim();
        System.out.println(trimm);

        //SuB String

        System.out.println(name.substring(1));
        System.out.println(name.substring(2,5 ));

        // Replace

        System.out.println(name.replace('a', 'u'));
        System.out.println(name.replace("a", "ioy"));

        // Startwith & Endwith

        System.out.println(name.startsWith("pa"));
        System.out.println(name.endsWith("v"));

        // Char AT

        System.out.println(name.charAt(3));

        // Indexof and last indexof   

        String fullname = "Paraeepvdeep";
        System.out.println(fullname.indexOf("eep"));
        System.out.println(fullname.indexOf("eep",5));

        System.out.println(fullname.lastIndexOf("eep", 10));

        // Equals

        System.out.println(fullname.equals("Paraeepvdeep"));

        System.out.println(name.equalsIgnoreCase("paRav"));

        // Escape Sequence CHaracters

        System.out.println("I AM LEARNING JAVA \\ from CWH");

        System.out.println("I AM LEARNING JAVA \t from CWH");

        System.out.println("I AM LEARNING JAVA \n from CWH");

        System.out.println("I AM LEARNING JAVA \" from CWH");

    }
}
