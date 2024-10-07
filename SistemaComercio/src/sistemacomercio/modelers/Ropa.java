/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacomercio.modelers;

/**
 *
 * @author aleja
 */
public class Ropa extends Producto {
    private String talla,color; 

    public Ropa() {
    }

    public Ropa(String talla, String color, String idProducto, String nombre, double precio) {
        super(idProducto, nombre, precio);
        this.talla = talla;
        this.color = color;
    }

    

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void ajustarTalla(String nuevaTalla){
        this.talla=nuevaTalla;
        System.out.println("Talla actualizada" + nuevaTalla);
    }

    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + ", color=" + color + '}';
    }
    
    
    

        
}
