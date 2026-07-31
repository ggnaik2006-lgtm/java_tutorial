class Main1 {

    public void evenOdd(int n) {
        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}

public class First {

    public static void main(String[] args) {

        Main1 obj = new Main1();

        obj.evenOdd(10);

    }
}