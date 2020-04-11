package br.com.unibh.patterns.mediator;

import java.util.Random;

public class Produtor implements Runnable {

    private Mediator mediator;
    private int id;
    private static int num = 1;

    public Produtor(Mediator mediator) {
        this.mediator = mediator;
        id = num++;
    }

    @Override
    public void run() {
        int num;

        while (true) {
            mediator.storeMessage(num = new Random().nextInt(10));
            System.out.print(String.format("p%d-%d ", this.id, num));
        }
    }
}
