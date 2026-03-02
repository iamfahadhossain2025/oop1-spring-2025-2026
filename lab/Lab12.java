
public class Lab12 {

    public static void main(String[] args) {

        long x = 3_000_000_000L;
        int y = (int) x;
        long z = (long) y;

        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
        System.out.println("x-z=" + (x - z));
    }
}
