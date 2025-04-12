import java.util.Scanner;
public class multi_table {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the no. whose table has to be printed");
        int n=in.nextInt();
        System.out.println("the table of "+n+"is");
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+(i*n));
        }
    
}}
