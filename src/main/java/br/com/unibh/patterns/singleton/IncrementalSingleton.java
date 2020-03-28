package br.com.unibh.patterns.singleton;

import java.util.Objects;
import java.util.Optional;

public class IncrementalSingleton{

    private static int count;
    private int numero;

    private static IncrementalSingleton instance;

    private IncrementalSingleton(){
        numero = ++count;
    }

    public static synchronized IncrementalSingleton getInstance(){
        return Optional.ofNullable(instance).orElseGet(()->{
           instance = new IncrementalSingleton();
           return instance;
        });
    }

    @Override
    public String toString() {
        return String.format("%s %d",getClass().getName(),numero);
    }
}
