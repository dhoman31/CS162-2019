import java.util.Scanner;

public class CountDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(countEights(n));
    }
    
    public static int countEights(int n){
        // only one eight
        if(n==8) return 1;
        // no eights contained
        if(n<10) return 0;
        // if two present, return two and shorten to capture the rest
        if(n%100==88) return 2 + countEights(n/10);
        // if only 1 present, return 1 and shorten to capture the rest
        if(n%10==8) return 1 + countEights(n/10);
        
        // if not eights found, call function and pass reduced
        return countEights(n/10);
    }
}