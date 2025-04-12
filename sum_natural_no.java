import java.util.Scanner;
public class sum_natural_no {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=in.nextInt();
        int i=1,sum=0;
        while (i<=n)
         {
            sum=sum+i;
            i++;
        }
    System.out.println("the sum of first N natural no. is"+sum);
}
}