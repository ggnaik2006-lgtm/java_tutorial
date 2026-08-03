import java.util.Scanner;
public class average{
    public static void main(String[] args) {
        int n;
         double sum=0;
        double result;
        Scanner sc=new Scanner(System.in);
        System.err.print("size of array:"+" ");
        n=sc.nextInt();
        System.out.println("enter" + n +"elements:");
        int[] arr =new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            sum +=arr[i];
        }
        result=(sum/n);
        System.out.println("sum of array is:" + result);
    }
    
}