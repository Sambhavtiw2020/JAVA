import java.util.Scanner;
public class linearsearch {
    public static int LS(int[] arr,int target,int num) {
        
        for(int i=0;i<num;i++){
            if(arr[i]==target)
            {System.out.println("the number is at");
            return i;}
            
        }
       return -1;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int  num = in.nextInt();
        int arr[] = new int[num];

        for(int i=0;i<num;i++){
            arr[i]=in.nextInt();
        }
        int target=7;
        int m=LS(arr,target,num);
        
        System.out.println(m);
    }
    
}
/*int x=sc.nextInt();
        for(int i=0;i<num;i++){
            if(arr[i]==x){*/