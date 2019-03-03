import java.util.Scanner;

public class Genomes{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        System.out.println((check(in)) ? true : false);
    }
    
    public static boolean check(String s){
        boolean answer = (s.matches("(a|t|c|g)*")) ? true : false;
        return answer;
    }
}