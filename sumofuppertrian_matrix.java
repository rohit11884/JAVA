public class sumofuppertrian_matrix {
     public static void main(String[] args) {
        int i,j,sum=0;
        int [][] matr={{1,23,45},{5,6,5},{2,44,8}};
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(j>i)
                {
                    sum=sum+matr[i][j];
                }
            }
        }
        System.out.println("sum of upper tringular matrix is :"+sum);
     }
}

