import java.util.Scanner;
public class CWH_Q1
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subject 1 :");
        float a =sc.nextFloat();
        System.out.println("Enter the number of subject 2 :");
        float b = sc.nextFloat();
        System.out.println("Enter the number of subject 3 :");
        float c = sc.nextFloat();
        System.out.println("Enter the number of subject 4 :");
        float d = sc.nextFloat();
        System.out.println("Enter the number of subject 5 :");
        float e =sc.nextFloat();
        float sum =(a+b+c+d+e);
        float per = (sum/500)*100;
        System.out.println("Percentage is :");
        System.out.println(per);
    }
}