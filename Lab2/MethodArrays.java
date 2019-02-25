import java.util.Scanner;

public class MethodArrays{
    public static void main(String args[]){
        int myArray[] = fillArray();
        int sum = sumArray(myArray);
        double avg = avgArray(myArray);
        System.out.println("Sum = " + sum + "\nAverage = " + avg);
        printArray(myArray);
    }

    public static int[] fillArray(){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int [len];

        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        
        sc.close();
        return arr;
    }

    public static int sumArray(int [] arr){
        int x = 0;
        for(int i=0; i<arr.length; i++){
            x+=arr[i];
        }
        return x;
    }

    public static double avgArray(int [] arr){
        double ans = 0.0;
        double sum = 0.0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        ans = sum/arr.length;
        return ans;
    }

    public static void printArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}