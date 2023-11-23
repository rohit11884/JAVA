public class q_arrays {
    public static void main(String sr[]) {
       // float[] marks = { 67.8f, 89.9f, 78.9f, 80.6f, 72.8f };

        // Q 1.

        // float sum = 0;
        // for (float element : marks) {
        // sum = sum + element;
        // }
        // System.out.printf("The sum of the marks is : %f" ,sum);

        // Q 2.

        // float num = 89.9f;
        // boolean isInarray = false;
        // for (float element : marks) {
        //     if (num == element) {
        //         isInarray = true;
        //         break;
        //     }
        // }
        // if (isInarray) {
        //     System.out.println("The value is present in the array");
        // } else {
        //     System.out.println("The value is not present in the array");
        // }

        // Q 3.

        // float sum=0;
        // for(float element : marks)
        // {
        //     sum=sum+element;
        // }
        // System.out.printf("The average of the marks is : %f",sum/marks.length);

        //Q 4.

            // int [][] mat1={{1,2,3},
            //                {4,5,6}};
            // int [][] mat2={{7,8,9},
            //                {10,11,12}};
            // int [][] result={{0,0,0},
            //                  {0,0,0}};
            // for(int i=0;i<mat1.length;i++)  // row no. of times
            // {
            //     for(int j=0;j<mat1[i].length;j++)  // column no. of times
            //     {
            //         System.out.printf("Setting value for i=%d and j=%d\n",i,j);
            //         result[i][j]=mat1[i][j]+mat2[i][j];
            //     }
            // }   

            // for(int i=0;i<mat1.length;i++)  // row no. of times
            // {
            //     for(int j=0;j<mat1[i].length;j++)  // column no. of times
            //     {
            //         System.out.print(result[i][j] + " ");
            //     }
            //     System.out.println("");
            // }   


          //  Q 5.  Reversing of array


        //   int [] arr = {1,2,3,4,5,6};
        //   int l=arr.length;
        //   int n=Math.floorDiv(l,2);  // It is used to find the greatest integer
        //   System.out.println("Given array is : "+arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
        //   int temp;
        //   for(int i=0;i<n;i++)
        //   {
        //     temp=arr[i];
        //     arr[i]=arr[l-1-i];
        //     arr[l-1-i]=temp;
        //   }
        //   System.out.print("Array After reversing is : ");
        //   for(int element :arr)
        //   {
        //     System.out.print(element + " ");
        //   }

        // Q 6. Maximum of array


         System.out.println(Integer.MAX_VALUE);   // ways to find maximum value
         System.out.println(Integer.MIN_VALUE);   // ways to find minimum value

        // The minimum value in java is  : -2147483648
         //The maxminum value in java is  : 2147483647

        // int [] arr={1,222,3,40,5,6};
        // int max=-2147483648;
        // for(int element:arr)
        // {
        //     if(element>max){
        //     max=element;
        //     }
        // }
        // System.out.println("The maximum value of the element in this array is : "+max);

        // Q 7.

         int [] arr={1,222,3,40,5,6};
         int min=2147483647;
         for(int element:arr)
         {
            if(element<min){
            min=element;
            }
         }
         System.out.println("The minimum value of the element in this array is : "+min);

               
                          

    }
}
