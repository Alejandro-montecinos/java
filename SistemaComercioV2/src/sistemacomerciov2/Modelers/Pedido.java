/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacomerciov2.Modelers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Pedido {
    private List<Producto> listaProductos =new ArrayList<>();
    private double total;

    public Pedido() {
    }

    public Pedido(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void crearProducto(){
        Scanner scanner =new Scanner(System.in);
        
    };
    

    

    
    
    
}
