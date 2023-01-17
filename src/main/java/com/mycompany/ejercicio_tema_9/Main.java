
package com.mycompany.ejercicio_tema_9;
//Crea una clase Persona con las siguientes variables:
//La edad
//El nombre
//El teléfono
//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para es//ta clase.
//Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que dar//les valor y mostrarlas por pantalla.
//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Tr//Tabajador.
public class Main {
     public static void main (String[] args){
         
         Cliente cliente = new Cliente();
         
         cliente.setNombre("Pedro"); 
         cliente.setEdad(45);
         cliente.setTelefono ("223 400 5678");
         cliente.setCredito (5000);
         
         System.out.println("Nombre Cliente: " + cliente.getNombre());
         System.out.println("Edad Cliente: " + cliente.getEdad()+ " años");
         System.out.println("Telefono Cliente: " + cliente.getTelefono());
         System.out.println("Credito Cliente: " + cliente.getCredito());
         System.out.println("------------------------------------------");
         
         Trabajador trabajador = new Trabajador();
         
         trabajador.setNombre("Jorge"); 
         trabajador.setEdad(21);
         trabajador.setTelefono ("223 500 6789");
         trabajador.setSalario (1200);
         
         System.out.println("Nombre Trabajador: " + trabajador.getNombre());
         System.out.println("Edad Trabajador: " + trabajador.getEdad()+ " años");
         System.out.println("Telefono Trabajador: " + trabajador.getTelefono());
         System.out.println("Credito Trabajador: " + trabajador.getSalario());
         
     }
}

class Persona {
    int edad;
    String nombre;
    String telefono;

    public Persona() {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}

class Cliente  extends Persona{
    int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
    
    
}

class Trabajador extends Persona{
    int Salario;

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }
    
}
