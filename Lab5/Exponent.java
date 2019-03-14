import java.util.Scanner;

public class Exponent{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int b = sc.nextInt();
    int e = sc.nextInt();
    sc.close();

    System.out.println(powerTo(b, e));
  }

  public static int powerTo(int x, int y){
    if(y==0){
      return 1;
    } else{
      return x * powerTo(x, y-1);
    }
  }
}
