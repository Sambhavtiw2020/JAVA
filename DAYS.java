import java.util.Scanner;
public class DAYS {
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
       int a=in.nextInt();
        switch(a){
        case 1 :
        System.out.println("MONDAY");
        break;
        case 2 :
        System.out.println("TUESDAY");
        break;
        case 3 :
        System.out.println("WEDNESDAY");
        break;
        case 4 :
        System.out.println("THURSDAY");
        break;
        case 5 :
        System.out.println("FRIDAY");
        break;
        case 6 :
        System.out.println("SATURDAY");
        break;
        default :
        System.out.println("SUNDAY");
        }
    }
    
}
