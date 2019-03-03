import java.util.Scanner;

public class Password{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        int score = check(in);
        if(score>0 && score<4){
            System.out.println("Password strength: Weak");
        }else if(score>=4 && score<6){
            System.out.println("Password strength: Fair");
        }else if(score>=6 && score<8){
            System.out.println("Password strength: Good");
        }else if(score>=8 && score<=10){
            System.out.println("Password strength: Strong");
        }
    }
    
    public static int check(String s){
        int x = 0;
        
        // length
        if(s.length()>=12){
            x+=2;
        } else if(s.length()>=8){
            x++;
        }
        
        // lowercase
        if(s.matches(".*[a-z]{2,}.*|.*[a-z]{1,}.*[a-z]{1,}.*")){
            x+=2;
        } else if(s.matches(".*[a-z]{1,}.*")){
            x++;
        }
        
        // uppercase
        if(s.matches(".*[A-Z]{2,}.*|.*[A-Z]{1,}.*[A-Z]{1,}.*")){
            x+=2;
        } else if(s.matches(".*[A-Z]{1,}.*")){
            x++;
        }
        
        // digits
        if(s.matches(".*\\d{2,}.*|.*\\d{1,}.*\\d{1,}.*")){
            x+=2;
        } else if(s.matches(".*\\d{1,}.*|")){
            x++;
        }
        
        // special characters
        if(s.matches(".*[#|!|?|@]{2,}.*|.*[#|!|?|@]{1,}.*[#|!|?|@]{1,}.*")){
            x+=2;
        } else if(s.matches(".*[#|!|?|@]{1,}.*")){
            x++;
        }
        
        return x;
    }
}