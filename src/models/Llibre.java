package models;

public class Llibre {
    String autor;
    String titol;
    String tema;
    int prestatge;
    int existencies;
    int id_llibre;

    public Llibre(String autor, String titol, String tema, int prestatge, int existencies, int id_llibre) {
        this.autor = autor;
        this.titol = titol;
        this.tema = tema;
        this.prestatge = prestatge;
        this.existencies = existencies;
        this.id_llibre = id_llibre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getPrestatge() {
        return prestatge;
    }

    public void setPrestatge(int prestatge) {
        this.prestatge = prestatge;
    }

    public int getExistencies() {
        return existencies;
    }

    public void setExistencies(int existencies) {
        this.existencies = existencies;
    }

    public int getId_llibre() {
        return id_llibre;
    }

    public void setId_llibre(int id_llibre) {
        this.id_llibre = id_llibre;
    }
}