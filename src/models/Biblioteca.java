package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {
    List<Llibre> biblioteca = new ArrayList<>();
    public void registrerBook(Llibre llibre){
        biblioteca.add(llibre);
    }
}
