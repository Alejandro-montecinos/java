/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemacomerciov2;

import sistemacomerciov2.Modelers.Ropa;



/**
 *
 * @author aleja
 */
public class SistemaComercioV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Ropa ropa=new Ropa("s", "rojo", " 555-555-555 ", "poleron ", 5000);
        System.out.println(ropa.getTalla());
        ropa.ajustarTalla("xlll");
        System.out.println(ropa.getTalla());
        System.out.println(ropa.calcularDescuento(25));
    }
    
}
