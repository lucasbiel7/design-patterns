package br.com.unibh.patterns.state.withpattern;

public class High implements State {
    @Override
    public void pull(VelocidadeFan wrapper) {
        wrapper.setCurrentState(new Off());
        System.out.println("Turning off");
    }
}
