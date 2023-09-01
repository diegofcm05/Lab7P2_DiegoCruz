/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_diegocruz;

/**
 *
 * @author dfcm9
 */
public class Venta {
    
    private Vendedor vendedor  = new Vendedor();
    private Cliente comprador = new Cliente();
    private double coste;
    private Vehiculo carvend = new Vehiculo();

    public Venta() {
    }

    
    
    public Venta(double coste) {
        this.coste = coste;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public Vehiculo getCarvend() {
        return carvend;
    }

    public void setCarvend(Vehiculo carvend) {
        this.carvend = carvend;
        setCoste(carvend.getPrecio());
    }

    @Override
    public String toString() {
        return "Venta{" + "vendedor=" + vendedor + ", comprador=" + comprador + ", coste=" + coste + ", carvend=" + carvend + '}';
    }
    
    
    
    
    
    
    
    
}
