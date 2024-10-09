/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacomerciov2.Modelers;

/**
 *
 * @author aleja
 */
public class Electronico extends Producto {
    private String maraca;
    private int garantiaMeses;

    public Electronico() {
    }

    public Electronico(String maraca, int garantiaMeses, String idProducto, String nombre, double precio) {
        super(idProducto, nombre, precio);
        this.maraca = maraca;
        this.garantiaMeses = garantiaMeses;
    }

    public String getMaraca() {
        return maraca;
    }

    public void setMaraca(String maraca) {
        this.maraca = maraca;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String toString() {
        return "Electronico{" + "maraca=" + maraca + ", garantiaMeses=" + garantiaMeses + '}';
    }
    
    public void extenderGarantia(int mesesExtra){
        System.out.println("se a aumentado la cantidad de meses de ");
        setGarantiaMeses(mesesExtra + getGarantiaMeses());
    }
    
    

}   
