 //NOTE --->> 
// ## Array indices starts from "0" and goes to "n-1", where "n" is the size of array ##

public class arrays {
    public static void main(String ar[])
    {
        // ### There are three ways of array declaration ##

        // 1)--->>>

        int [] marks = new int[5];  // "marks" array is created with 5 memory allocation with 5*4=20 bytes
        marks[0]=80;
        marks[1]=86;
        marks[2]=84;
        marks[3]=64;
        marks[4]=94;
        marks[4]=74;   // if we override the value then value inside block will override and show after overriden value

      //marks[5]=74;  // it will throw an error

        System.out.println(marks[3]);
        System.out.println(marks[4]); // it will show 74 not 94

        // 2)--->>>

        int [] age ={10,45,34,23,20}; // it will have 5 memory  // Declaer + initialize !!
        System.out.println(age[3]);
        System.out.println(age.length);



        // 3)--->>>

        int [] student;       // declaration
        student=new int[5];  // memory allocation
        
    }
}
