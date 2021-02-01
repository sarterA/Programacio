import java.util.ArrayList;

public class Cinema {
//atributos
    private String nom;
    private int sales;
    private ArrayList<Pelicula> peliculas;

//constructor
    public Cinema(String nom, int sales, ArrayList<Pelicula> peliculas) {
        this.nom = nom;
        this.sales = sales;
        peliculas = new ArrayList<Pelicula>();

    }
    public Pelicula peliculaMesLlarga(){
        Pelicula arr;

        arr = new Pelicula("Coches", 2, "D.palacio");
        arr = new Pelicula("Jober", 140, "J. Dimecres");


        System.out.println(arr);
        return null;
    }
}
