public class Practice13 {
    public static void main(String[] args) {
        double p = 2000;
        double r = 0.07;
        double t = 3;
        double amount = p* Math.pow((1+r),t);
        double ci = amount - p;
        System.out.printf("%.2f",ci);

    }
}
