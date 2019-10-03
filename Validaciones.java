package AcFor;

import java.util.Scanner;
public class Validaciones {
    
    private String usuario="ins771";
    private String contrasenia="asdf1234";
    private int intentos=0;
    Scanner scanner = new Scanner(System.in);
    
    public void inicioCredenciales(){
        pedirCredenciales(intentos);
    }
    private void pedirCredenciales(int intentos){
        if(intentos<3){
            System.out.print("Ingrese usuario");
            String usAux= scanner.nextLine();
            System.out.print("Ingre contraseña");
            String passAux = scanner.nextLine();
            validarCrendenciales(usAux,passAux);
        }
        if(intentos==3){
            System.out.println("MAXIMOS INTENTOS");
            intentosMaximos();
        }   
    }    
    private void validarCrendenciales(String usAux, String passAux){
        if(usAux.equals(usuario)){
            
        }else{
            intentos++;
            pedirCredenciales(intentos);
        }
        if(passAux.equals(contrasenia)){
            
        }else{
            intentos++;
            pedirCredenciales(intentos);            
        }
    }
    private void intentosMaximos(){
        System.out.println("Ha superado el número máximo de intentos de ingreso."
                + " Por motivos de seguridad su cuenta se ha bloqueado. Contáctese al 600 600 5000.”");
    }
    
    public void credencialesValidas(){
        
    }
    
    public void solicitarDatosPersonales(){
        
    }
    public void ingresoDireccionCliente(){
        
    }
    
    
    
}
