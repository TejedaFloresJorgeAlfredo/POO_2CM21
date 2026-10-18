/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author tejed
 */
public class Profesor extends Persona{
    public int numEmpleado;
    public Profesor(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    @Override
    public String toString() {
        return "Un profesor de edad " + edad + ", con clave " + numEmpleado;
    }
}
