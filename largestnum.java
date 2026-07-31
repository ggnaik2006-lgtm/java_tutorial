class Max{
    public int largest(int a,int b,int c){
        if(a>b && a>c)
        return a;
        else if(b>a && b>c)
        return b;
        else{
             return c;
        }
}
}
public class largestnum{
    public static void main(String args[]){
        Max ob1=new Max();
        ob1.largest(2,4,3);
        System.out.println( ob1.largest(2,4,3));
    }
}