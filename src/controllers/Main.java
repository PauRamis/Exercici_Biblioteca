package controllers;

import models.Client;
import models.Llibre;

public class Main {
    public static void main(String[] args) {
        Client c = new Client();
        Llibre l = new Llibre("Cervantes", "Quijote", "Novela",
                6, 10, 19040);
        l.howMany();
        c.getBook(l);
        l.howMany();
        c.retunrBook(l);
        l.howMany();
    }
}
