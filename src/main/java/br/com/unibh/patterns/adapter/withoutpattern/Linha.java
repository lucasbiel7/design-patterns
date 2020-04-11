package br.com.unibh.patterns.adapter.withoutpattern;

public class Linha {

    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println(String.format("Linha do ponto A(%d;%d), para o ponto B(%d,%d)", x1, y1, x2, y2));
    }
}
