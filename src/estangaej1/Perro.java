package estangaej1;
public class Perro {
    //3 ATRIBUTOS
    private int edad;
    private String sexo = "", tamano = "";

       //METODOS SET Y GET
       public void setsexo(String sexo){
           if (sexo.equalsIgnoreCase("HEMBRA") || sexo.equalsIgnoreCase("MACHO")) this.sexo = sexo;           
       }    
       public String getsexo(){
           return sexo;
       }
       public void settamano(String tamano){
           if (tamano.equalsIgnoreCase("CHICO") || tamano.equalsIgnoreCase("MEDIANO") || tamano.equalsIgnoreCase("GRANDE")) this.tamano = tamano;           
       }    
       public String gettamano(){
           return tamano;
       }
       public void setedad(int edad){
           if (edad>0 && edad<30) this.edad=edad;
       }
       public int getedad(){
           return edad;
       }
       //METODO LADRAR QUE MUESTRA GUAU
       public void ladrar (){
           System.out.println("\nGUAU\n");
       }
       //METODO MOSTRAR
       public void mostrar(String nombre){
           System.out.println("\nLos datos de su perro son:");
           System.out.println("Nombre: "+nombre);
           System.out.println("Sexo: "+sexo);
           System.out.println("Tamaño: "+tamano);
           System.out.println("Edad: "+edad);
       }
}
