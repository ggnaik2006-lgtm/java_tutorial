class number{
    public int factor(int n){
        if(n==1){
            return 1;
        }
        return n*factor(n-1);
    }
}
public class factorial{
    public static void main(String[] args) {
        number obj1=new number();
        obj1.factor(5);
        System.out.println(obj1.factor(5));

    }
}