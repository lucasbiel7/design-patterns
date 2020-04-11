package br.com.unibh.patterns.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediatorDemo {
    public static void main(String[] args) {
        List<Thread> produtorList = new ArrayList<>();
        System.out.println("Pressione enter para sair");
        Mediator mediator = new Mediator();
        produtorList.add(new Thread(new Produtor(mediator)));
        produtorList.add(new Thread(new Produtor(mediator)));
        produtorList.add(new Thread(new Cliente(mediator)));
        produtorList.add(new Thread(new Cliente(mediator)));
        produtorList.add(new Thread(new Cliente(mediator)));
        produtorList.add(new Thread(new Cliente(mediator)));
        for (Thread thread : produtorList) {
            thread.start();
        }
        boolean stop = false;
        Scanner scanner = new Scanner(System.in);
        String exit = scanner.nextLine();
        while (!stop) {
            if (exit.isEmpty()) {
                stop = true;
                for (Thread thread : produtorList) {
                    thread.stop();
                }
            }
        }
    }
}
