package br.com.unibh.patterns.adapter.withpattern;

import br.com.unibh.patterns.adapter.withoutpattern.Linha;

public class LinhaAdapter implements Shape {

    private Linha adaptee;

    public LinhaAdapter(Linha adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void draw(int x, int y, int x2, int y2) {
        adaptee.draw(x, y, x2, y2);
    }
}
