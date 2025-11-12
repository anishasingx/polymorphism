package com.driver;

public class Main {
    // Task 1: Create a class Product inside Main class
    static class Product {

        // Task 3: Method with two int parameters
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Overloaded method with three int parameters
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Overloaded method with two double parameters
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2: Create object of Product
        Product p = new Product();

        // Calling methods
        int result1 = p.product(5, 10);        // two int parameters
        int result2 = p.product(2, 3, 4);      // three int parameters
        double result3 = p.product(4.5, 2.0);  // two double parameters

        // Displaying results
        System.out.println("Product of 5 and 10: " + result1);
        System.out.println("Product of 2, 3, and 4: " + result2);
        System.out.println("Product of 4.5 and 2.0: " + result3);
    }
}
