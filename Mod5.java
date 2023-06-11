package cen3024;

public class Mod5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Fibonacci fibonacci = new Fibonacci();

        int[] numbs = {2,4,6,8,10};

        System.out.println("Recursive:");
        System.out.println("Input\tTime");
        for (int input : numbs) {
            long startT = System.nanoTime();
            long res = fibonacci.fibonacciRecursive(input);
            long endTime = System.nanoTime();
            long passedT = endTime - startT;
            System.out.println(input + "\t" + passedT);
        }
        System.out.println("\nIterative:");
        System.out.println("Input\tTime");
        for (int input : numbs) {
            long startT = System.nanoTime();
            long res = fibonacci.fibonacciIterative(input);
            long endT = System.nanoTime();
            long passedT = endT - startT;
            System.out.println(input + "\t" + passedT);
        }
    }
}