import java.util.Scanner;

public class StarTriangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        printStarTriangle(x);
    }
    
    public static void printStarTriangle(int x){
        for(int i=0; i<=x; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}