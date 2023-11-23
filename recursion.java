public class recursion {
    public static void fibi(int n){
        int t1=0;
        int t2=1;
        while(t1<n){
            System.out.println(t1);
            int nextterm=t1+t2;
            t1=t2;
            t2=nextterm;
             
        }

    }
     public static void main(String[] args) {
        int n=10;
        fibi(n);
        }
}
