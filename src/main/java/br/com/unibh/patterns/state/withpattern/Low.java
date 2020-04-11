package br.com.unibh.patterns.state.withpattern;

public class Low implements State {
    @Override
    public void pull(VelocidadeFan wrapper) {
        wrapper.setCurrentState(new Medium());
        System.out.println("Medium speed");
    }
}
