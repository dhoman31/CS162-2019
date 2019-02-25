import java.util.Scanner;

public class StringAccept{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        sc.close();
        System.out.println((Matches(in)) ? "true" : "false");
    }

    public static boolean Matches(String s){
        boolean a = (s.matches("(1|0)*")) ? true : false;
        return a;
    }
}