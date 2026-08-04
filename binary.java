 class bina{
    public static int search(int[] arr,int k) {
        int low=0;
        int high=arr.length-1;
        int mid;
        while(low<=high){
             mid=(low+high)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]>k){
                high=mid-1;
            }
            else if(arr[mid]<k){
                low=mid+1;
            }
            
        }
        return -1;
    }
}
public class binary{
    public static void main(String[] args) {
        bina obj=new bina();
        int [] arr={1,4,5,6,8,9,10,12};
        int k=9;
        System.out.println(obj.search(arr,k));
        return;
    }
}
