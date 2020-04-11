package br.com.unibh.patterns.state.withpattern;

import java.util.Scanner;

public class StateDemo {
    public static void main(String[] args) {
        VelocidadeFan chain = new VelocidadeFan();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Press enter");
            scanner.nextLine();
            chain.pull();
        }
    }
}
