import java.util.Scanner;

public class palindrome0 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String pal="racecar";
        String target="r";
        int count=0;
        for(int i=0;i<pal.length();i++)
        {
            if(pal.charAt(i)==target.charAt(0))
            count++;
        }
            System.out.println("total common elements are "+count);
        
    }}

