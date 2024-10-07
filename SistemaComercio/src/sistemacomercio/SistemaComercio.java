/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemacomercio;

import sistemacomercio.modelers.Electronico;
import sistemacomercio.modelers.Pedidos;
import sistemacomercio.modelers.Producto;
import sistemacomercio.modelers.Ropa;

/**
 *
 * @author aleja
 */
public class SistemaComercio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Pedidos pedidos = new Pedidos();
    pedidos.getProductos();
     
    pedidos.agregarProducto(new Ropa("kkl", "rojo", "111", "poleron", 40000));
    pedidos.agregarProducto(new Electronico("samsuning", 50, "44444", "s56", 100000));
    pedidos.mostrarPedidos();
    
        
        
    }   
    
    
    
}
