public class swapping
 {
    public static void main(String args[])
    {
        int a=5,b=3;
        System.out.println("initial value of a is   "+a+"  initial value of b is  "+b);
        a=b+a;
        b=a-b;
        a=a-b;
        System.out.println("swapped value of a is  "+a+" swapped value of b is  "+b);
    }
    
}
