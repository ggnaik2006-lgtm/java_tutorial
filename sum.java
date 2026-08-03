import java.util.Scanner;
public class sum{
    public static void main(String[] args) {
        int n;
        int sum=0;
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
    }
     System.out.println("sum of array is:" + sum);
}