import java.util.Scanner;

public class StringReverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.println(reverseString(s));
    }
    
    public static String reverseString(String s){
        if(s.length()==1){
            return s;
        } else {
            return reverseString(s.substring(1)) + s.charAt(0);
        }
    }
}