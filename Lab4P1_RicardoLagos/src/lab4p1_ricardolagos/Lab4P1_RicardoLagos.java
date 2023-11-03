//Lab numero 4 :(
//Un laboratorio en el que sufro

package lab4p1_ricardolagos;
import java.util.Scanner;
public class Lab4P1_RicardoLagos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¡Bienvenido (a/e) al lab numero 4!");
        System.out.println("Cada dia mas loco :/");
        System.out.println("""
                           1. Inversion especial
                           2. Balanza de cadenas
                           3. Cifrado de Mensajes
                           4. Salir del programa""");
        int opcion=leer.nextInt();
        while (opcion>0&&opcion<4){
            switch (opcion){
                case 1 -> {
                    System.out.println("Bienvenido a la opcion 1");
                    System.out.println("Ingrese una palabara: ");
                    leer.nextLine();
                    String palabra=leer.nextLine().toLowerCase();
                    String resp2="";
                    int cambio;
                    for (int b = 0; b < palabra.length(); b++){
                        cambio = palabra.charAt(b);
                        int num =cambio;
                        cambio/=num;  
                        resp2+=cambio;
                    }//fin del for
                    System.out.println("Mensaje cifrado: "+resp2); 
                break;    
                }//Fin del caso 1
                
                
                case 2-> {
                    System.out.println("Bienvenido a la opcion 2");
                    int suma = 0;
                    System.out.println("Ingrese una cadena:");
                    leer.nextLine();
                    String pala=leer.nextLine();
                    for(int a = 0; a < pala.length(); a++){
                        char caracter = pala.charAt(a);
                        int numero = caracter;
                        suma += numero; 
                    }//Fin del for
                    System.out.println("Peso de la cadena: "+suma);
                    //fin de la palabra 1
                        
                    System.out.println("Ingrese otra cadena: ");
                    int suma2 = 0;
                    String pala2=leer.nextLine();
                    for(int a = 0; a < pala2.length(); a++){
                        char caracter2 = pala2.charAt(a);
                        int numero2 = caracter2;
                        suma2 += numero2; 
                    }//Fin del for2
                    System.out.println("Peso de la cadena: "+suma2);
                    //fin de la palabra 2
                    
                    System.out.println("Ingrese la ultima cadena: ");
                    int suma3 = 0;
                    String pala3=leer.nextLine();
                    for(int a = 0; a < pala3.length(); a++){
                        char caracter3 = pala3.charAt(a);
                        int numero3 = caracter3;
                        suma3 += numero3; 
                    }//Fin del for3
                    System.out.println("Peso de la cadena: "+suma3);
                    //Fin de la Palabra 3
                    
                    if(suma>suma2&&suma>suma3){
                        System.out.println("La cadena 1 es la mas grande");
                    }
                    if(suma2>suma&&suma2>suma3){
                        System.out.println("La cadena 2 es la mas grande");
                    }
                    if(suma3>suma&&suma3>suma2){
                        System.out.println("La cadena 3 es la mas grande");
                    }
                  
                break;
                }//Fin del case 2

                case 3->{
                    System.out.println("Bienvenido e la opcion 3");
                    System.out.println("Ingrese el mensaje que desea cifrar: ");
                    leer.nextLine();
                    String mensaje=leer.nextLine();
                           
                    char cifra =' ';
                    String resp="";
                    for (int b = 0; b < mensaje.length(); b++){
                        cifra = mensaje.charAt(b);
                        int num =cifra;
                        cifra +=2;  
                        resp += cifra;
                    }
                    System.out.println("Mensaje cifrado: "+resp); 
                    
                break;    
                }//Fin del case 3
            }//Fin del switch   
            
         System.out.println("----------- M E N U ------------");
         System.out.println("""
                           1. Inversion especial
                           2. Balanza de cadenas
                           3. Cifrado de Mensajes
                           4. Salir del programa""");
         opcion=leer.nextInt();
        }//Fin del while
    }//Fin de public static
}//Fin del public class
