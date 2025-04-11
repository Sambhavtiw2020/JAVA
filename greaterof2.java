import java.util.Scanner;

public class greaterof2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter 1st number");
        int a=in.nextInt();
        System.out.println("enter 2nd number");
        int b=in.nextInt();
        if(a>b)
        System.out.println("a is greater than b ");
        else if(b>a)
        System.out.println("b is greater than a");
        else
        System.out.println("a is equal to b / b is equal to a");
    }
    
}
