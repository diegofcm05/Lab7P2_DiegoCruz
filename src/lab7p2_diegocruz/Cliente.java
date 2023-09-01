/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_diegocruz;

/**
 *
 * @author dfcm9
 */
public class Cliente {
    
    private String nombre, prof;
    private int edad, cantcarros;
    private double sueldo;

    public Cliente(String nombre, String prof, int edad, int cantcarros, double sueldo) {
        this.nombre = nombre;
        this.prof = prof;
        this.edad = edad;
        this.cantcarros = cantcarros;
        this.sueldo = sueldo;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantcarros() {
        return cantcarros;
    }

    public void setCantcarros(int cantcarros) {
        this.cantcarros = cantcarros;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", prof=" + prof + ", edad=" + edad + ", cantcarros=" + cantcarros + ", sueldo=" + sueldo + '}';
    }
    
    
    
    
    
    
}
