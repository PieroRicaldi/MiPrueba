
import entidades.Perro;
import entidades.Persona;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
         
         Perro b = new Perro();
         b.setNombre("Peluchin");
         b.setRaza("Siberiano");
         b.setEdad(10);
         b.setTamaño(0.50);
         
         
         Persona a = new Persona();
         a.setNombre("Alejandro");
         a.setEdad(10);
         a.setApellido("Rodrigez");
         a.setDNI("61104579");
         a.setMascota(b);
         
         System.out.println("Primer dueño:");
         System.out.println(a);
         System.out.println("---------------------------");
         
         Perro b1 = new Perro();
         b1.setNombre("Lola");
         b1.setRaza("Chiwuawa");
         b1.setEdad(7);
         b1.setTamaño(0.45);
         
         
         Persona a1 = new Persona();
         a1.setNombre("Alberto");
         a1.setEdad(30);
         a1.setApellido("Quispe");
         a1.setDNI("123456789");
         a1.setMascota(b1);
         
         System.out.println("Segundo dueño:");
         System.out.println(a1);
         
         
         
    }

}
