import java.util.Scanner;

public class isPolindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String a = input.nextLine();
        System.out.println(isPalindrome(a));
    }
    public static boolean isPalindrome(String s){
        if(s.length() <= 1)
            return true ;
        else if (s.charAt(0) != s.charAt(s.length()-1))
            return false;
        else
            return isPalindrome(s.substring(1, s.length() -1));

        }

}
