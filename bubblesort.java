import java.util.Scanner;

public class bubblesort{
    public static void BubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    
   

   public static void main(String args[]) {
    int arr[]={64,45,85,11,3,100,99};
    BubbleSort(arr);
     
    System.out.println("SORTED ARRAY");
    for(int i=0;i<arr.length;i++)
    System.out.print(arr[i]+" ");
   }}