/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacomercio.modelers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aleja
 */
public class Pedidos {
    private List<Producto> productos; 
    private double total;

    public Pedidos() {
        productos=new ArrayList<>();
        total=0.0;
    }

    public Pedidos(double total) {
        this.total = total;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "productos=" + productos + ", total=" + total + '}';
    }

    public void mostrarPedidos() {
        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }
        System.out.println("Total del pedido: $" + total);
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        total += producto.getPrecio();  // Sumar el precio del producto al total
    }
    
    
    
}
