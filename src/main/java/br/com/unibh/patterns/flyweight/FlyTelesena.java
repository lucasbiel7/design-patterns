package br.com.unibh.patterns.flyweight;

public class FlyTelesena {
    private int row;

    public FlyTelesena(int row) {
        this.row = row;
        System.out.println(String.format("Setor: %d", row));
    }

    void report(int col) {
        System.out.print(String.format(" %d%d", row, col));
    }
}
