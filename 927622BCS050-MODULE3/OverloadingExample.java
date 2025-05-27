public class OverloadingExample {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
        System.out.println("Sum of 2 ints: " + obj.add(5, 10));
        System.out.println("Sum of 2 doubles: " + obj.add(3.5, 4.5));
        System.out.println("Sum of 3 ints: " + obj.add(1, 2, 3));
    }
}

