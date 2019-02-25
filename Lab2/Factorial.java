import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();    

        if(n<=0 || m<=0){
            // calculate the factorial of the numbers
            for(int i = n; i<=m; i++){
                getFactorial(i);
            }
        } else {
            System.out.println("Not a valid entry!");
        }

    }

    public static void getFactorial(int x){
        int ans = 1;
        for(int i=x; i>0; i--){
            ans*=i;
        }
        System.out.println(ans);
    }

}