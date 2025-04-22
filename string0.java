import java.util.Scanner;

public class string0 {
     public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str="hello";
        String str1="hiiii";
        for(int i=0;i<str.length();i++)
        System.out.println(str.charAt(i));
        for(int i=str.length()-1;i>=0;i--)
        System.out.println(str.charAt(i));
     }
}
