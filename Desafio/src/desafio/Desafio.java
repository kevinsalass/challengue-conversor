package desafio;
import javax.swing.*;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class Desafio {

                                    /*  |Kevin Darinel salas Perez|   */
    public static void main(String[] args) {
        int opcion = 0;   //Variable que nos permitira salir del programa y volver a preguntar si queremos seguir
        Icon icon = new ImageIcon("C:\\Users\\Edgar\\OneDrive\\Documentos\\challenge\\Desafio\\src\\imagen-challengue\\trading.png");
        
        String[] opciones = {"Conversor de monedas", "Conversor de Temperatura"}; //opciones del conversor

        while(opcion == 0) {
                       
            String opcionElegida = (String) JOptionPane.showInputDialog(null,
                    "Seleccione un convertidor", //Mensaje 
                "Convertidor",//Titutlo 
                JOptionPane.DEFAULT_OPTION, //Opciones |Aceptar | Cancelar 
                icon, opciones, opciones[0]); //Icono de la imagen y pasamos el arreglo indicando que empieze de 0
            
            if (opcionElegida.equals(opciones[0])) { 
                /* Opción Conversion Moneda */ 
                //La opcion uno mostrara otra lista desplegable. Las opciones a convertir
                
                /*Hacemos referencia a la clase moneda para llamar a los metodos | donde se realizara toda las operaciones*/
                Moneda obj1 = new Moneda(); 
                String[] opcionesMoneda = {"Peso a Dolar ", "Peso a Euro", 
                    "Peso a Libra Esterlinas", "Peso a Yen Japones", "Peso a Won Sur-Coreano", "Dolar a Peso", "Euro a Peso",
                    "Libras Esterlinas a Peso", "Yen Japones a Peso", "Won Sur-Coreano a Peso"};
                
                obj1.mostrarListaDesplegable(opcionesMoneda);
                obj1.PesoOtraMoneda(opcionesMoneda, obj1.opcionElegida1);
                obj1.OtraMonedaPeso(opcionesMoneda, obj1.opcionElegida1);
              
                
            } else if (opcionElegida.equals(opciones[1])) {
                
                /* Opción Conversion Temperatura */
                /* Hacemos referencia a la clase Temperatura| Donde realizara toda la operacion*/
                Temperatura obj2 = new Temperatura();
                String[] opcionesTemperatura = {"Kelvin(K) a Celsius(C)", "Kelvin(K) a Fahrenheit (F)", "Celsius(C) a Kelvin(K)",
                    "Celsius(C) a Fahrenheit (F)", "Fahrenheit (F) a Kelvin(K)", "Fahrenheit (F) a Celsius(C)"};
                
                obj2.mostrarListaDesplegable(opcionesTemperatura);
                obj2.ConversionTemperatura(opcionesTemperatura, obj2.opcionElegida2);
            }
            /* Cada que Termine de ejecutar una conversion muestra la opcion de salir o seguir continuando */
                opcion = JOptionPane.showConfirmDialog(null, "¿Desea continuar con el programa?",
                    "SELECT_OPTION", JOptionPane.YES_NO_OPTION);
            
            
        }
        
             JOptionPane.showMessageDialog(null, "Fin del programa.");      
    }         

}