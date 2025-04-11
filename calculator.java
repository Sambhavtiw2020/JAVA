import java.util.Scanner;

public class calculator {
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);

       System.out.println("ENTER YOUR 1ST NUMBER");
       int a=in.nextInt();
       System.out.println("ENTER YOUR 2ND NUMBER");
       int b=in.nextInt();
       System.out.println("ENTER YOUR COMMAND");
      char c=in.next().charAt(0);
        switch(c){
        case '+' :
        System.out.println(a+b);
        break;
        case '-' :
        System.out.println(a-b);
        break;
        case '*' :
        System.out.println(a*b);
        break;
        case  '/':
        System.out.println(a/b);
        break;
        case '%':
        System.out.println(a%b);
        break;
        default :
        System.out.println("invalid input");
        
        }
    }
    
}

