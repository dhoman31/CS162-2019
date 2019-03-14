import java.util.Scanner;

public class Reciprocals{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        sc.close();
        System.out.println(Math.round(sumTo(val) * 100.0)/ 100.0);
    }

    public static double sumTo(int n){
        if(n==1){
            return 1;
        } else{
            return ((1.0/n) + sumTo(n-1));
        }
    }
}
