package org.fastrackit;

public class MathOperations {

    String name;


    public double sum(double x, double y) {
        double actualSum = x + y;
        System.out.println("The result for the sum of " + x + " & " + y + " is: " + actualSum);
        return actualSum;
    }
    public int sum(int x, int y) {
        int actualSum = x + y;
        System.out.println("The result for the sum of " + x + " & " + y + " is: " + actualSum);
        return actualSum;
    }

    public double difference(double x, double y) {
        double actualDifference = x - y;
        System.out.println("The result for the difference between " + x + " & " + y + " is: " + actualDifference);
        return actualDifference;
    }
    public int difference(int x, int y) {
        int actualDifference = x - y;
        System.out.println("The result for the difference between " + x + " & " + y + " is: " + actualDifference);
        return actualDifference;
    }

    public int multiplication(int x, int y) {
        int actualMultiplication = x * y;
        System.out.println("The result for the multiplication between " + x + " & " + y + " is: " + actualMultiplication);
        return actualMultiplication;
    }
    public double multiplication(double x, double y) {
        double actualMultiplication = x * y;
        System.out.println("The result for the multiplication between " + x + " & " + y + " is: " + actualMultiplication);
        return actualMultiplication;
    }

    public double divide(double x, double y){
        double actualDivision = x / y;
        System.out.println("The result we get from dividing " + x + " by " + y + " is: " + actualDivision);
        return actualDivision;

    }
    public int divide(int x, int y){
        int actualDivision = x / y;
        System.out.println("The result we get from dividing " + x + " by " + y + " is: " + actualDivision);
        return actualDivision;

    }
}
