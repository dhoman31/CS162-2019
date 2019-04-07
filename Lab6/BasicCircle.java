import java.lang.Math.*;

public class BasicCircle{

    private int radius;

    public BasicCircle(){
        this.radius = 1;
    }

    public BasicCircle(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public double getCircumference(){
        return Math.round((2 * Math.PI * this.radius) * 100.0)/100.0;
    }

    public double getArea(){
        return Math.round((Math.PI * Math.pow(this.radius,2)) * 100.0)/100.0;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }
}
