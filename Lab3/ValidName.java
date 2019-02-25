import java.util.Scanner;

public class ValidName{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();

        while(!check(in)){
            System.out.println("Name is NOT valid");
            in = sc.nextLine();
        }
        sc.close();

        System.out.println("Name is valid");
    }

    public static boolean check(String s){
        boolean answer = (s.matches("[A-Z]([A-Z]|[a-z]){1,25}")) ? true : false;
        return answer;
    }
}