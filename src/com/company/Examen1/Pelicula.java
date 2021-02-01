public class Pelicula {

    private String titol;
    private int duracio;
    private String director;


//CONSTRUCTOR

    public Pelicula(String titol, int duracio, String director) {
        this.titol = titol;
        this.duracio = duracio;
        this.director = director;

    }


// GET

    private String titol() {
        return this.titol;
    }
    private int duracio() {
        return this.duracio;
    }

}
