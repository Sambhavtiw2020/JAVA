import java.util.Scanner;
public class palindrome1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String rev="";
        String sc=in.nextLine();
    
        for(int i=sc.length()-1;i>=0;i--){
            rev+=sc.charAt(i);}
            System.out.println("reverse string is "+rev);
            if(rev.equals(sc)){
            System.out.println("it is an palindrome string");}
            else{
                System.out.println("it is not a palindrome string");
            }
        
           
 
}
}