public class break_continue {
    public static void main(String ar[])
    {
        int a=5;
        for(int i=1;i<=a;i++)
        {
            System.out.println(i);
            System.out.println("Great\n");
            if(i==4)
            {
                System.out.println("Ending ");
                break;
            }
        }
    }
}
