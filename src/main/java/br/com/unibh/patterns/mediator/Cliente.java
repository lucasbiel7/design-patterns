package br.com.unibh.patterns.mediator;

public class Cliente implements Runnable {
    private Mediator mediator;
    private int id;
    private static int num = 1;

    public Cliente(Mediator mediator) {
        this.mediator = mediator;
        id = num++;
    }

    @Override
    public void run() {
        while (true) {
            System.out.print(String.format(String.format("c%d-%s ", id, mediator.retrieveMessage())));
        }
    }
}
