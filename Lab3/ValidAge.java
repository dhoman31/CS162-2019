import java.util.Scanner;

public class ValidAge{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while(!check(x)){
            System.out.println("Age is NOT valid");
            x = sc.nextInt();
        }

        sc.close();
        System.out.println("Age is valid");
    }

    public static boolean check(int x){
        String s = "" + x;
        boolean answer = (s.matches("[0-9]|[1-9][0-9]|1[0-4][0-9]|150")) ? true : false;
        return answer;
    }
}