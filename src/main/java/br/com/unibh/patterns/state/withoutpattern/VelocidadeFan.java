package br.com.unibh.patterns.state.withoutpattern;

public class VelocidadeFan {
    private int currentState;

    public VelocidadeFan() {
        currentState = 0;
    }

    public void pull() {
        switch (currentState) {
            case 0:
                currentState = 1;
                System.out.println("low speed");
                break;
            case 1:
                currentState = 2;
                System.out.println("medium speed");
                break;
            case 2:
                currentState = 3;
                System.out.println("High speed");
                break;
            default:
                System.out.println("Turning off");
                currentState = 0;
        }
    }
}
