import java.util.Scanner;

public class TimesTen{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int ar[] = new int[len];
        
        // fill the array
        for(int i=0; i<len; i++){
            ar[i] = sc.nextInt();
        }
        
        System.out.println(checkArray(ar, 0));
    }
    
    public static boolean checkArray(int ar[], int index){
        if(index >= ar.length-1){
            return false;
        } 
        
        if(ar[index]*10 == ar[index+1]){
            return true;
        }
        
        return checkArray(ar, index+1);
    }
}