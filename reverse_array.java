public class reverse_array 
{
    public static void reverse(int [] arr)
    {
        int i=0,j=arr.length-1;
        while(i<j)
        {
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }
    public static void main(String[] arg)
    {
        int [] arr={2,4,6,8,10,12,14};
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
        reverse(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
