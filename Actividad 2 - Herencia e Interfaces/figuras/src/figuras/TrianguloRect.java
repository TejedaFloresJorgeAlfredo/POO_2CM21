/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author tejed
 */
public class TrianguloRect extends FiguraRecta{
    public TrianguloRect(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double calcularArea() {
        return (double) (ancho * alto) / 2.0;
    }

    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt((ancho * ancho) + (alto * alto));
        return ancho + alto + hipotenusa;
    }

    public String imprimeFigura() {
        super.imprimeFigura();
        return "Se imprime un Triangulo con alto: " + alto + ", ancho: " + ancho + ", area: " + calcularArea() + ", perimetro: " + calcularPerimetro();
    }
}
