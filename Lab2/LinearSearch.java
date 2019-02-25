import java.util.Scanner;

public class LinearSearch{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        double myArray[] = new double[len];

        // fill the array
        for(int i=0; i<len; i++){
            myArray[i] = sc.nextDouble();
        }

        // value to find
        double element = sc.nextDouble();
        
        sc.close();

        // check if element is present
        boolean isFound = findElement(myArray, element);

        // print the result
        System.out.println((isFound==true) ? element + " was found in the array" : element + " was NOT found in the array");

    }

    public static boolean findElement(double [] arr, double x){

        boolean found = false;

        // loop through array to find value
        for(int i=0; i<arr.length; i++){

            // if the element is present
            if(arr[i] == x){
                // set found to true - as we have found the element
                found = true;
                // break out of the loop
                break;
            }

        }

        return found;

    }

}