import java.util.Scanner;
public class allelements{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("size of array:");
        int n=sc.nextInt();
        System.out.println(n);

        int[] arr =new int[n];
        System.out.print("Enter " + n + " elements:");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
        System.out.print(arr[i] + " ");
     }

}
}