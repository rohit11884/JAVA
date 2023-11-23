import java.util.Scanner;
public class CWH_strings_1 {
    public static void main(String arg[])
    {
        /* 
        String name ="Rohit";
        System.out.println(name);
        float a =6.555f;
        int b =45;
        System.out.printf("The value of a is %f and the value of b is %d ",a,b);
        System.out.println();
        System.out.format("The value of a is %f and the value of b is %d ",a,b);
        */
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String str = sc.nextLine();  // "nextLine" show full string   /--/  "next" show only first letter of string
        System.out.println(str);
    }
}
