import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rn=new Random();
        int computerin=rn.nextInt(100);
        // System.out.println(computerin);
        int userin;
        
    
       do{
            System.out.println("Enter the number between 0 to 100");
            userin=sc.nextInt();
            
            if(userin==computerin){
            System.out.println("Right number");
        }
         else if(userin<computerin){
            System.out.println("Guess higher number");
        }
         else if(userin>computerin){
            System.out.println("Guess lower number");
        }
        else{
            System.out.println("Wrong input");
        }
         
        }
        while(userin!=computerin);
        
        
        
    }

}
