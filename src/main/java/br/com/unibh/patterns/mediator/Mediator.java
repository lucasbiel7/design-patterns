package br.com.unibh.patterns.mediator;

public class Mediator {
    private boolean slotFull;
    private int number;

    public synchronized void storeMessage(int num) {
        while (slotFull) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        slotFull = true;
        number = num;
        notifyAll();
    }

    public synchronized String retrieveMessage() {
        while (!slotFull) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        if (number == 0) {
            slotFull = false;
            notifyAll();
        }
        return String.valueOf(number--);
    }
}
