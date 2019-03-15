import java.util.Scanner;

public class FindSubStrings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String sub = sc.nextLine();
        int x = sc.nextInt();
        sc.close();
        System.out.println(checkForSub(s,sub,x));
    }

    public static boolean checkForSub(String s, String sub, int times){

        if(times==0){
            return true;
        }

        if(s.length()<sub.length()){
            return false;
        }

        if(s.substring(0, sub.length()).equals(sub)){
            return checkForSub(s.substring(sub.length()), sub, times-1);
        } else{
            return checkForSub(s.substring(sub.length()), sub, times);
        }
    }
}