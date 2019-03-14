import java.util.Scanner;

public class FindSubStrings{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String check = sc.nextLine();
    int amount = sc.nextInt();
    sc.close();

    System.out.println(checkForSub(s, check, amount));
  }


  public static boolean checkForSub(String x, String y, int times){

    String regex = "(.*" + y + ".*){" + times + "}";
    return (x.matches(regex));

  }

}
