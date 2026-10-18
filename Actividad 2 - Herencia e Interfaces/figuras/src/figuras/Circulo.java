/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author tejed
 */
public class Circulo extends FiguraCircular{
    public Circulo(int radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * (radio * radio);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public String imprimeFigura() {
        super.imprimeFigura();
        return "Se imprime un Circulo con radio: " + radio + ", area: " + calcularArea() + ", perimetro: " + calcularPerimetro();
    }
}
