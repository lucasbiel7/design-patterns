package br.com.unibh.patterns.state.withoutpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StateDemo {
    public static void main(String[] args) {
        VelocidadeFan chain = new VelocidadeFan();
        while (true) {
            System.out.println("Press enter");
            getLine();
            chain.pull();
        }
    }

    /**
     * Dava para usar o Scanner mas o exemplo estava com buffer
     *
     * @return
     */
    private static String getLine() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            return in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
