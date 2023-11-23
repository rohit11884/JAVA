public class methods {
    static int logic(int x,int y)
    //int logic(int x,int y)  //-->> If we do not use static keyword then we have to create object to access methods
    {
        int z;
        if(x>y)
        {
            z=(x+y)*4;
        }
        else
        {
            z=x+y+10;
        }
        return z;
    }
    public static void main(String sr[])
    {
        int a=10;
        int b=20;
        int c;
        // methods obj= new methods();   // object creation
        //c=obj.logic(a,b);
        c=logic(a,b);
        System.out.println(c);
    }
    
}
