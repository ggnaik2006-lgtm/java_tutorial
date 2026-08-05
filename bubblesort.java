import java.util.Arrays;
class arranging{
    public static int [] sortin(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
public class bubblesort{
    public static void main(String[] args) {
        arranging obj=new arranging();
        int [] arr={5,4,3,2,1};
       // obj.sortin(arr);
        System.out.println(Arrays.toString(obj.sortin(arr)));
    }
}