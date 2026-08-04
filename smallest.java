public class smallest{
    public static void main(String[] args) {
        int [] arr={2,5,1,4,3};
        int smaller=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smaller){
                smaller=arr[i];
            }
        }
        System.out.println(smaller);
        
    }
}