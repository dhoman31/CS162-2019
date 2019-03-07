import java.util.Scanner;

public class StringClean{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        sc.close();
        System.out.println(cleanString(in));
    }
    
    public static String cleanString(String n){
        if(n.length()==1 || n.isEmpty()){
            return n;
        } 
        
        if(n.charAt(0) == n.charAt(1)){
            return cleanString(n.substring(1));
        }
        
        return n.substring(0,1) + cleanString(n.substring(1));
    }
}