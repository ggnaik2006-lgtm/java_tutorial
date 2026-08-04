public class largestarray{
    public static void main(String[] args) {
        int [] arr={2,5,1,4,3};
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
        
    }
}