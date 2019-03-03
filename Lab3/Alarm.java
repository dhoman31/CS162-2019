import java.util.Scanner;

public class Alarm{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        check(in);
    }
    
    public static void check(String s){
        if(s.length() > 10 && !s.matches(".*1234.*")){
            System.out.println("Alarm Activated");
        } else {
            System.out.println("Alarm Deactivated");
        }
    }
}