import java.util.Scanner;
import java.util.Random;
public class binarySearch
{
    public static void main(String[] args) 
    {  
        Scanner sc = new Scanner(System.in);
        int count = 0;
        boolean done = false;
        int high = sc.nextInt();   //high
        int low = sc.nextInt();   //low
        int n = sc.nextInt();   //guess
     

        Random rand = new Random();
        int randNum = 0;
        int compGuess = 1;
         
        // Generate random number between 1 and 500
        randNum = rand.nextInt(high-low +1) + low;
        String answer = "";
        System.out.println("Is it:" +randNum);
        System.out.println("Enter high or low ");
        answer = sc.nextLine();
        do
        {
            //Too low
            if (answer.equals("low"))
            {
                low = randNum +1;
                randNum= rand.nextInt(high-low +1) + low;           
                System.out.println("Is it:" +randNum);
                System.out.println("Enter high or low ");
                answer = sc.nextLine();
                compGuess++;
            }
            //Too high
            else if (answer.equals("high"))
            {
                high = randNum - 1;
                randNum= rand.nextInt(high-low +1) + low;           
                System.out.println("Is it:" +randNum);
                System.out.println("Enter high or low ");
                answer = sc.nextLine();
                compGuess++;
            }
        }
        while(!answer.equals("correct"));
        System.out.println("Computer tries: " +compGuess);
    }
  
}
     
         
 