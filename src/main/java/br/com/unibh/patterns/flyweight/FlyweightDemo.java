package br.com.unibh.patterns.flyweight;

public class FlyweightDemo {
    public static final int ROWS = 6, COLS = 10;

    public static void main(String[] args) {
        Factory flyFactory = new Factory(6);
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                flyFactory.getFlyweight(i).report(j);
            }
            System.out.println();
        }
    }
}
