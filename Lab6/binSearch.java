import java.util.Scanner;
import java.util.Random;

public class binSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        int n = sc.nextInt();
        //sc.close();

        Random rand = new Random();
        int randNum = 0;
        int compGuess = 1;

        randNum = rand.nextInt(high-low +1) + low;
        String answer = "";
        System.out.println("Is it:" +randNum);
        System.out.println("Enter high or low ");
        
        do{
            answer = sc.nextLine();

            if (answer.equals("low")){
                low = randNum +1;
                randNum= rand.nextInt(high-low +1) + low;           
                System.out.println("Is it:" +randNum);
                System.out.println("Enter high or low ");
                answer = sc.nextLine();
                compGuess++;
            }
            //Too high
            else if (answer.equals("high")){
                high = randNum - 1;
                randNum= rand.nextInt(high-low +1) + low;           
                System.out.println("Is it:" +randNum);
                System.out.println("Enter high or low ");
                answer = sc.nextLine();
                compGuess++;
            }
        } while(!(randNum==n));
        System.out.println("Computer tries: " +compGuess);

    }
}