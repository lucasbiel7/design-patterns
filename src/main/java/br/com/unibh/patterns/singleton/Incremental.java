package br.com.unibh.patterns.singleton;

public class Incremental {
    private static int count;
    private int numero;

    public static int getCount(){
        return count;
    }

    public Incremental(){
        numero = ++count;
    }

    @Override
    public String toString() {
        return String.format("%s %d",getClass().getName(),numero);
    }
}

