package br.com.unibh.patterns.adapter.withoutpattern;

public class AdapterDemo {
    public static void main(String[] args) {
        Object[] shapes = {new Linha(), new Retangulo()};
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        int width = 40, height = 40;
        for (Object shape : shapes) {
            if (shape instanceof Linha) {
                ((Linha) shape).draw(x1, y1, x2, y2);
            } else if (shape instanceof Retangulo) {
                ((Retangulo) shape).draw(x2, y2, width, height);
            }
        }
    }
}
