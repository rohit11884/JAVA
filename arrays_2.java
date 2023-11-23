public class arrays_2 {
    public static void main(String ar[])
    {
        int [] marks = {98,99,78,87,69};

        // Displaying the array (for loop)

        System.out.println("Printing arrays using for loops");

        System.out.println("In revese order");
        for(int i=marks.length-1;i>=0;i--)
        {
            System.out.println(marks[i]);
        }

        System.out.println("In forward order");
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

        // Diplaying the array (for-each loop)
        System.out.println("Printing using for-each loop");
        for(int element: marks)
        {
            System.out.println(element);
        }
    }
}
