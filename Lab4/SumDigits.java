import java.util.Scanner;

public class SumDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        sc.close();
        System.out.print("Result = " + recursiveSum(in));
    }
    
    public static int recursiveSum(int x){
        String s = ""+x;
        if(s.length() == 1){
            return x;
        } else {
            String next = s.substring(1);
            int y = Integer.parseInt(next);
            return (Character.getNumericValue(s.charAt(0)) + recursiveSum(y));
        }
    }
}