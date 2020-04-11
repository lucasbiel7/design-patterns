package br.com.unibh.patterns.state.withpattern;

public class VelocidadeFan {

    private State currentState;

    public VelocidadeFan() {
        this.currentState = new Off();
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void pull() {
        currentState.pull(this);
    }
}
