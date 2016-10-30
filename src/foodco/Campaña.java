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
public class Campaña {
    private String nombre;
    private double horarioTransmi;
    private double costo;

    public Campaña() {
        this.nombre = "";
        this.horarioTransmi = 0;
        this.costo = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getHorarioTransmi() {
        return horarioTransmi;
    }

    public void setHorarioTransmi(double horarioTransmi) {
        this.horarioTransmi = horarioTransmi;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    
}
