/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AcFor;

/**
 *
 * @author laboratorio2
 */
import java.util.Scanner;

public class Usuario {

    private String nombre;
    private String nombre2;
    private String apellidoMa;
    private String apellidoPa;
    private String rut;
    private Scanner scanner = new Scanner(System.in);
    
    public void pedirDatosUsuario(){
        setNombre();
        setNombre2();
        setApellidoMa();
        setApellidoPa();
        setRut();
    }
    
    private void setNombre() {
        nombre = scanner.nextLine();
    }

    private void setNombre2() {
        nombre = scanner.nextLine();
    }

    private void setApellidoMa() {
        nombre = scanner.nextLine();   
    }

    private void setApellidoPa() {
        nombre = scanner.nextLine();   
    }

    private void setRut() {
        nombre = scanner.nextLine();   
    }
    
    
    
}
