package br.com.unibh.patterns.adapter.withpattern;

import br.com.unibh.patterns.adapter.withoutpattern.Retangulo;

public class RetanguloAdapter implements Shape {

    private final Retangulo adaptee;

    public RetanguloAdapter(Retangulo adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void draw(int x, int y, int x2, int y2) {
        int finalX = Math.min(x, x2);
        int finalY = Math.min(y, y2);
        int width = Math.abs(x2 - x);
        int height = Math.abs(y2 - y);
        adaptee.draw(finalX, finalY, width, height);
    }
}
