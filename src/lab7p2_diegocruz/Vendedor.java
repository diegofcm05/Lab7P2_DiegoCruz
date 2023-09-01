/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_diegocruz;

/**
 *
 * @author dfcm9
 */
public class Vendedor {
    
    private String nombre;
    private int cancarros;
    private double candinero;

    public Vendedor(String nombre, int cancarros, double candinero) {
        this.nombre = nombre;
        this.cancarros = cancarros;
        this.candinero = candinero;
    }

    public Vendedor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCancarros() {
        return cancarros;
    }

    public void setCancarros(int cancarros) {
        this.cancarros = cancarros;
    }

    public double getCandinero() {
        return candinero;
    }

    public void setCandinero(double candinero) {
        this.candinero = candinero;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
