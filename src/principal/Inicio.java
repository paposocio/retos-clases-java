package principal;
import Salud.Persona;

public class Inicio 
{  
    public static void main(String[] args) 
    {
        Persona sapo = new Persona();
        sapo.pedirDatos();
        sapo.mostrarPersona();
        sapo.calcularImc();
        sapo.mayorEdad();
    }
}
