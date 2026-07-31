 class example{
    public boolean  evenodd(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}

public class even{
    public static void main(String args[]){
        example obj1=new example();
        obj1.evenodd(27);
        System.out.println(obj1.evenodd(27));

}
}
