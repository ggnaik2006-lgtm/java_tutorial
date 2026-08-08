class sorting{
    public static void sort(int [] arr){
        
        for(int i=0;i<arr.length;i++){
            int minindex=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;

        }
    }
}
public class selectionsort{
    public static void main(String[] args) {
        int [] arr={18,2,9,1,8};
        sorting obj=new sorting();
        obj.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}