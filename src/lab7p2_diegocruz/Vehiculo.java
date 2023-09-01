/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_diegocruz;

import java.awt.Color;

/**
 *
 * @author dfcm9
 */
public class Vehiculo {
    
    String marca, modelo, ID;
    Color color;
    int anio;
    double precio;

    public Vehiculo(String marca, String modelo, String ID, Color color, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.ID = ID;
        this.color = color;
        this.anio = anio;
        this.precio = precio;
    }

    

    
    public Vehiculo() {
    }
    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", ID=" + ID + ", color=" + color + ", anio=" + anio + ", precio=" + precio + '}';
    }
    
    
    
    
   
    
    
    
    
}
