package Exercise_7;

public class MathDemo_Main {

    public static void main(String[] args) {
        MathDemo m = new MathDemo();
        System.out.println(m.max(2, 5));
        System.out.println(m.min(3, 4));
        System.out.println(m.sum(new int[]{2,3,4,5,6}));
        System.out.println(m.mean(new int[]{2,3,4,5,6}));
        System.out.println(m.factorial(7));
    }

}
