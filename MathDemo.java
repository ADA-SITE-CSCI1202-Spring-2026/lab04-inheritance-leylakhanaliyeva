package week06;

public class MathDemo {
    public int min(int a, int b) {
        if (a<b) { return a; }
        return b;
    }

    public int max(int a, int b) {
        if (a>b)  {return a;} 
        return b;
    }

    public int sum(int[] args) {
        int total = 0;
        for (int num : args) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        MathDemo demo = new MathDemo();
        int[] numbers = {2,7,6,8};
        System.out.println("Min: " + demo.min(10, 20));
        System.out.println("Max: " + demo.max(10, 20));
        System.out.println("Sum: " + demo.sum(numbers));
    }

}