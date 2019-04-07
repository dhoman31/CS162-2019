import java.util.Scanner;

public class Circle{
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int rad = sc.nextInt();
        BasicCircle Circle1 = new BasicCircle(rad);

        rad = sc.nextInt();
        BasicCircle Circle2 = new BasicCircle(rad);

        rad = sc.nextInt();
        BasicCircle Circle3 = new BasicCircle(rad);
        sc.close();

        System.out.println(Circle1.getRadius());
        System.out.println(Circle2.getRadius());
        System.out.println(Circle3.getRadius());
        System.out.println(Circle1.getCircumference());
        System.out.println(Circle2.getCircumference());
        System.out.println(Circle3.getCircumference());
        System.out.println(Circle1.getArea());
        System.out.println(Circle2.getArea());
        System.out.println(Circle3.getArea());
    }
}