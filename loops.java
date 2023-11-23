import java.util.Scanner;
public class loops {
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. till you want to display odd no. :");
        int a=sc.nextInt();
        // int i=0;
        // System.out.println("Numbers are :");
        // while(i<=a)
        // {
        //     System.out.println(i);
        //     i++;
        // }
        for(int i=0;i<a;i++)
        {
            System.out.println(2*i+1);
        }


        // int a=11;
        // do{
        //     System.out.println(a);         // It will print 11
        //     a++;
        // }
        // while(a<5);


        //   NOTE ---->>>>  // do-while loop first enter in the loop then check the conditions
    }
}
