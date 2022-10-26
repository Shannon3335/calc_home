package ie.atu.week5;

public class calc {
    private int num=0;

    public calc() {}

    public calc(int x)
    {
        if (x< 0)
        {
            throw new IllegalArgumentException("number sould be greater than 0");
        }
        else
        {
            num = x;
            get_num();
        }
    }

    public int get_num()
    {
        return num;
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) { return x-y;}

    public int mult(int x, int y) { return x*y;}
}
