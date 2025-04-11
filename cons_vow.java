import java.util.Scanner;
public class cons_vow {
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
       System.out.println("ENTER ANY CHARACTER");
       char c=in.next().charAt(0);
       switch(c){
        case 'a' :
        System.out.println("ENTERED CHARACTER IS VOWEL");
        break;
        case 'A' :
        System.out.println("ENTERED CHARACTER IS VOWEL");
        break;
        case 'E' :
        System.out.println("ENTERED CHARACTER IS VOWEL");
        break;
        case  'e':
        System.out.println("ENTERED CHARACTER IS VOWEL");
        break;
        case 'i':
        System.out.println("ENTERED CHARACTER IS VOWEL");
        break;
        case 'I':
        System.out.println("ENTERED CHARACTER IS VOWEL");
        break;
        case 'o':
        System.out.println("ENTERED CHARACTER IS VOWEL");
        break;
        case 'O':
        System.out.println("ENTERED CHARACTER IS VOWEL");
        break;
        case 'U':
        System.out.println("ENTERED CHARACTER IS VOWEL");
        break;
        case 'u':
        System.out.println("ENTERED CHARACTER IS VOWEL");
        break;
        default :
        System.out.println("ENTERED CHARACTER IS CONSONANT");
       }

    
}
}