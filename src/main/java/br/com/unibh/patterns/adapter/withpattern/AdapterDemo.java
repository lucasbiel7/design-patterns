package br.com.unibh.patterns.adapter.withpattern;

import br.com.unibh.patterns.adapter.withoutpattern.Linha;
import br.com.unibh.patterns.adapter.withoutpattern.Retangulo;

public class AdapterDemo {

    public static void main(String[] args) {
        Shape[] shapes = {new LinhaAdapter(new Linha()), new RetanguloAdapter(new Retangulo())};

        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;

        for (Shape shape : shapes) {
            shape.draw(x1, y1, x2, y2);
        }
    }
}
