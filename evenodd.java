import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=1234;
    for(int i=0;i<=3;i++)
    {
        int a=n%10;
        if(a%2==0)
        System.out.println(a+" is a even number");
        else
        System.out.println(a+" is a odd number");
        n=n/10;
    }
    }
    
}
