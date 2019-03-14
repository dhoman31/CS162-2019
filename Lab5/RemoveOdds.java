import java.util.Scanner;

public class RemoveOdds{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        System.out.println(evenDigits(num));
    }

    public static int evenDigits(int n){
        if(n == 0)
            return 0;

        int last = n % 10;

        if(last % 2 == 0)
            return 10 * evenDigits(n / 10) + last;

        return evenDigits(n / 10);
    }
}
