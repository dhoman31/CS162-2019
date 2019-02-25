import java.util.Scanner;

public class OddEven{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x<0){
            System.out.println("Not a valid entry!");
        } else {
            boolean ans = isEven(x);
            if(ans){
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
    
    public static boolean isEven(int x){
        if(x%2==0){
            return true;
        } else {
            return false;
        }
    }
}