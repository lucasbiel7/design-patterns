package br.com.unibh.patterns.adapter.withoutpattern;

public class Retangulo {
    public void draw(int x1, int y1, int width, int height) {
        System.out.println(String.format(
                "Retangulo com coordenada do ponto esquerda-base(%d;%d), largura: %d, altura: %d",
                x1, y1, width, height));
    }
}
