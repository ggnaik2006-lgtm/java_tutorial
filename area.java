class sample{
    public void area(int side){
        System.out.println(side*side);
    }
    public void area(int length,int breath){
        System.out.println(length*breath);
    }
}
public class area{
    public static void main(String args[]){
        sample obj1=new sample();
         obj1.area(4);
         obj1.area(7,9);
    }
}