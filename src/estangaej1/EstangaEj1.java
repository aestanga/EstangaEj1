//Crear la clase Perro, la misma debe tener 3 atributos y el método ladrar() que muestre “Guau” por consola.
//Crear un objeto de esta clase y comprobar el funcionamiento

package estangaej1;
import java.util.Scanner;

public class EstangaEj1 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner (System.in);
        int edad;
        String nombre, sexo, tamano, conf1;
        
        do {
        System.out.print("\nIngrese el nombre de su perro: ");
        nombre = ingreso.next();
        System.out.print("Ingrese el sexo de su perro "+nombre+" (HEMBRA/MACHO): ");
        sexo = ingreso.next();
        System.out.print("Ingrese el tamaño de su perro "+nombre+" (CHICO/MEDIANO/GRANDE): ");
        tamano = ingreso.next();
        System.out.print("Ingrese la edad de su perro "+nombre+": ");
        edad = ingreso.nextInt();
        
        //CREO OBJETO "DATOS" DE LA CLASE "PERRO"
        Perro datos = new Perro();
        
        datos.setsexo(sexo);
        if(!datos.getsexo().equals(sexo)){
            System.out.println(sexo+" SEXO INVÁLIDO");
            System.exit(0);
        }
        datos.settamano(tamano);
        if(!datos.gettamano().equals(tamano)){
            System.out.println(tamano+" TAMAÑO INVÁLIDO");
            System.exit(0);
        }
        datos.setedad(edad);
        if(datos.getedad() != edad){
            System.out.println(edad+" EDAD INVÁLIDA");
            System.exit(0);
        }
        datos.mostrar(nombre);
        
        System.out.print("\n¿Los datos ingresados son correctos? (Responda con SI / NO) ");
        conf1 = ingreso.next();
        while(!conf1.equalsIgnoreCase("si") && !conf1.equalsIgnoreCase("no")){
                   datos.mostrar(nombre);
                   System.out.print("\n¿Los datos ingresados son correctos? (Responda con SI / NO) ");
                   conf1 = ingreso.next();
                }
        datos.ladrar();
        }while(conf1.equalsIgnoreCase("NO"));
        
    }
    
}
