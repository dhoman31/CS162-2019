import java.util.Scanner;

public class WhichExpression{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        sc.close();
        check(st);
    }

    public static void check(String s){
        if(s.matches("a(b|a)b")){
            System.out.println("1");
        }
        if(s.matches("(ab)*b")){
            System.out.println("2");
        }
        if(s.matches("a(b|a)*")){
            System.out.println("3");
        }
        if(s.matches("((a|b) a)*")){
            System.out.println("4");
        }
        if(!(s.matches("a(b|a)b")) && !(s.matches("(ab)*b")) && !(s.matches("(ab)*b")) && !(s.matches("((a|b) a)*"))){
            System.out.println("Not in the language");
        }
    }
}