import java.util.Scanner;

public class DoubleSize{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        determineSize(x,y);
    }
    
    public static void determineSize(double x, double y){
        if(x==y){
            System.out.println("Numbers are the same.");
        } else if (x>y){
            System.out.println("Largest = " + x + "\nSmallest = " + y);
        } else {
            System.out.println("Largest = " + y + "\nSmallest = " + x);
        }
    }
}