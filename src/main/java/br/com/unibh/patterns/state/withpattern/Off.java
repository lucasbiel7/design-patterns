package br.com.unibh.patterns.state.withpattern;

public class Off implements State {
    @Override
    public void pull(VelocidadeFan wrapper) {
        wrapper.setCurrentState(new Low());
        System.out.println("Low speed");
    }
}
