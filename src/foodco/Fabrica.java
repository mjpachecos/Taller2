package foodco;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author Juliana
 */
public class Fabrica {
    private String nombre;
    private ArrayList<Personal> personal;
    private ArrayList<Producto> producto;
    private Personal empleado;
    private Producto product;

    public Fabrica() 
    {
        this.nombre = "";
        this.personal = new ArrayList <Personal> ();
        this.producto = new ArrayList <Producto>();
        this.empleado = new Personal ();
        this.product = new Producto ();
    }
    
    public void setNombre(String a )
    {
        this.nombre = a;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public double salarioTotal()
    {
        double total = 0 ;
        for(int i = 0 ; i< personal.size() ; i++)
        {
            total = total + personal.get(i).getSalario();
            
        }
    return total;
    }
    
    public ArrayList<Personal> getPersonal() {
        return personal;
    }

    public void setPersonal(ArrayList<Personal> Personal) {
        this.personal = Personal;
    }

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Producto> Producto) {
        this.producto = Producto;
    }

    public Personal getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Personal empleado) {
        this.empleado = empleado;
    }

    public Producto getProduct() {
        return product;
    }

    public void setProduct(Producto product) {
        this.product = product;
    }
    
    
}
