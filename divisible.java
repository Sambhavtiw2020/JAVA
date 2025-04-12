import java.util.Scanner;
public class divisible {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=in.nextInt();
        if(n%5==0 && n%11==0){
            System.out.println("the no. n is divisible by 5 & 11");
        }
        else
        System.out.println("the no. n is not divisible by 5 & 11");
    }
}
