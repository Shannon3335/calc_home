package ie.atu.week5;

public class calc {
    public calc() {
    }
    public calc(int x)
    {
        if (x< 0)
        {
            throw new IllegalArgumentException("number sould be greater than 0");
        }
    }
    public static int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) { return x-y;}

    public int mult(int x, int y) { return x*y;}
}
