package br.com.unibh.patterns.flyweight;

public class WithoutFlyweightDemo {
    public static final int ROWS = 6, COLS = 10;

    public static void main(String... args) {
        Telesena[][] matriz = new Telesena[ROWS][COLS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                matriz[i][j] = new Telesena(COLS);
                matriz[i][j].report();
            }
            System.out.println();
        }
    }
}
