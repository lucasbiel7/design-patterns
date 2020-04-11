package br.com.unibh.patterns.flyweight;

public class Telesena {
    private static int num = 0;
    private int row, col;

    public Telesena(int maxPerRow) {
        row = num / maxPerRow;
        col = num % maxPerRow;
        num++;
    }

    public void report() {
        System.out.print(String.format(" %d%d", row, col));
    }
}
