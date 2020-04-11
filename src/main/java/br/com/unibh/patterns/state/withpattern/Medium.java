package br.com.unibh.patterns.state.withpattern;

public class Medium implements State {
    @Override
    public void pull(VelocidadeFan wrapper) {
        wrapper.setCurrentState(new High());
        System.out.println("High speed");
    }
}
