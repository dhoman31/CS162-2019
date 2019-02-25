import java.util.Scanner;

public class WeatherReport{
    public static void main(String args[]){
        printWeatherReport();
    }
    
    public static void printWeatherReport(){
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        
        if(in>=0 || in<=8){
            System.out.println("It is cold outside, bring a jacket!");
        }
        else if(in >= 9 || in <= 16){
            System.out.println("The sun is coming out, and it is getting warmer");
        }
        else if(in>=17 || in<=32){
            System.out.println("Time to sit beside the pool and relax");
        }
        else if(in>=33 || in<=45){
            System.out.println("Too hot, can't move!");
        }
        else{
            System.out.println("Not a valid number!");
        }
    }
    
}