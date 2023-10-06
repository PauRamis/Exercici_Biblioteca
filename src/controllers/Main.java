package controllers;

import models.Client;
import models.Llibre;

public class Main {
    public static void main(String[] args) {
        Client c = new Client();
        Llibre l = new Llibre("Cervantes", "Quijote", "Novela",
                6, 10, 19040);
        System.out.println(l.getExistencies());
        c.getBook(l);
        System.out.println(l.getExistencies());
        c.retunrBook(l);
        System.out.println(l.getExistencies());
        System.out.println(l.getPrestatge());
        System.out.println(l.getAutor());


    }
}
