import java.util.Scanner;

public class FlightCodes{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String flight = sc.nextLine();

        while(!check(flight)){
            System.out.println("Flight code is NOT valid");
            flight = sc.nextLine();
        }
        sc.close();
        System.out.println("Flight code is valid");
    }

    public static boolean check(String s){
        boolean answer = (s.matches("[A-Z]{2,3}[0-9]{3,4}")) ? true : false;
        return answer;
    }
}