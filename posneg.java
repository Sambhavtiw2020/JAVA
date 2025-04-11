import java.util.Scanner;
public class posneg {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter any number");
        int a=in.nextInt();
        if(a==0)
        {
            System.out.println("entered no. is zero");
        }
        else if(a<0)
        System.out.println("entered no. is a negative number");
        else 
        System.out.println("entered no. is a positive number");
    }
    


    }
    

