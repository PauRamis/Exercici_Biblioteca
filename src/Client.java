import java.util.ArrayList;
import java.util.List;

public class Client {
    int id_client;
    List<Llibre> colection = new ArrayList<>();

    public void getBook(Llibre llibre) {
        if (llibre.existencies > 0) {
            colection.add(llibre);
            llibre.existencies--;
        }
    }

    public boolean hasBook(Llibre llibre) {
        if (colection.contains(llibre))
            return true;
        return false;
    }

    public void retunrBook(Llibre llibre) {
        if (hasBook(llibre)) {
            colection.remove(llibre);
            llibre.existencies++;
        } else System.out.printf("Aquest usuari no te el libre");
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }
}
