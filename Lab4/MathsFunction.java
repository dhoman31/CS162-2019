import java.util.Scanner;

public class MathsFunction{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        sc.close();
        System.out.println("The method will print the value of a(n) for each method (which is a(" + in + ") in this case)");
        System.out.println(q2Iterative(in));
        System.out.println(q2Recursive(in));
    }
    
    public static int q2Iterative(int n){
        int ans = 2;
        if(n>1){
            for(int i=2; i<=n; i++){
                ans = (4*ans)-(3*i);
            }
        }
        
        return ans;
    }
    
    public static int q2Recursive(int n){
        if(n==1){
            return 2;
        } else {
            return 4*q2Recursive(n-1)-(3*n);
        }

    }
}
