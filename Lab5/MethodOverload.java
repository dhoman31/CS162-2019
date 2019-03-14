import java.util.Scanner;

public class MethodOverload{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String shape = sc.nextLine();

        if (shape.equals("Square")){
            int x = sc.nextInt();
            System.out.println("Area: " + area(x));
        } else if(shape.equals("Rectangle")){
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println("Area: " + area(x,y));
        } else if(shape.equals("Triangle")){
            double x = sc.nextDouble();
            int y = sc.nextInt();
            System.out.println("Area: " + area(x,y));
        } else if(shape.equals("Circle")){
            double x = sc.nextDouble();
            System.out.println("Area: " + area(x));
        } else if(shape.equals("Ellipse")){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            System.out.println("Area: " + area(x,y));
        } else {
            System.out.println("Not a valid shape!");
        }
    }

    // Square
    public static double area(int x){
        return x*x;
    }

    // Rectangle
    public static double area(int x, int y){
        return x*y;
    }

    // Area of Triangle
    public static double area(double x, int y){
        return (0.5 * x) * y;
    }

    // Area of Cirlce
    public static double area(double x){
        return Math.PI * (x * x);
    }

    // Area of Ellipse
    public static double area(double x, double y){
        return Math.PI * (0.5 * x) * (0.5 * y);
    }
}
