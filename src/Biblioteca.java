import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    Map<Llibre, Integer> prestatges = new HashMap<>();

    public void addBook(String autor, String titol, String tema, int prestatge, int existencies, int id_llibre){
        Llibre l = new Llibre(autor, titol, tema, prestatge, existencies, id_llibre);
        prestatges.put(l, prestatge);
    }
}
