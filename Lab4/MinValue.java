import java.util.Scanner;

public class MinValue{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        int arr[] = new int[in];
        
        for(int i=0; i<in; i++){
            arr[i] = sc.nextInt();
        }
        
        sc.close();
        System.out.println(minArrayIter(arr));
        System.out.println(minArrayRec(arr, arr.length));
    }
    
    public static int minArrayIter(int[] a){
        int min = a[0];
        
        for(int i=0; i<a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        
        return min;
    }
    
    public static int minArrayRec(int[] a, int start){
        int min;
        
        if(start==1){
            return a[0];
        } else {
            min=minArrayRec(a, start-1);
            
            if(min < a[start-1]){
                return min;
            } else {
                return a[start-1];
            }
        }
    }
    
}