class sorting{
    public static void sort(int [] arr){
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int previous=i-1;
            while(previous>=0 && arr[previous]>current){
                arr[previous+1]=arr[previous];
                previous--;
            }
            arr[previous+1]=current;
        }
        for(int i=1;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
public class insertionsort{
    public static void main(String[] args) {
        int [] arr={18,9,3,7,6};
        sorting obj=new sorting();
        obj.sort(arr);

    }
}