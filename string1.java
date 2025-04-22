import java.util.Scanner;
public class string1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str="hello";
        String str1="hiiii";
        int count=0;
        int n=str.length();
        int m=str1.length();
        if(n>=m){
        for(int i=0;i<n;i++)
        {
        if(str.charAt(i)==str1.charAt(i))
        count++;
        }}
        else{
            for(int i=0;i<m;i++)
        {
        if(str.charAt(i)==str1.charAt(i))
        count++;
        }
        }

System.out.println("there are "+count+" elements common in both strings");    }
}

    

