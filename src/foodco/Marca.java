package foodco;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juliana
 */
public class Marca {
    private String nombre;
    private Personal director;
    private String logo;

    public Marca() {
        this.nombre = "";
        this.director = new Personal();
        this.logo = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Personal getDirector() {
        return director;
    }

    public void setDirector(Personal director) {
        this.director = director;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    
    
}
