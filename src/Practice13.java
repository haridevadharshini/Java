public class Practice13 {
    public static void main(String[] args) {
        double p = 2000;
        double r = 0.07;
        double t = 3;
        double n = 2;
        double amount = p* Math.pow(1+r/n,n*t);
        double ci = amount - p;
        System.out.printf("%.2f",ci);

    }
}
