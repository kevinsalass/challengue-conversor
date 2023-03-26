package desafio;
import javax.swing.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Temperatura {
    
    public String opcionElegida2;
        /*Se pone la ruta de las imagenes a utilizar */ 
        Icon icon2 = new ImageIcon("C:\\Users\\Edgar\\OneDrive\\Documentos\\challenge\\Desafio\\src\\imagen-challengue\\temperatura.png");

        
     public void mostrarListaDesplegable(String[] opciones) {
         /*Se encarga de mostrar las opciones de la opcion Temperatura */
         
         /*Pasamos el arreglo nuevo que se creo al elegir la opcion COnversion Temperatura */ 
        opcionElegida2 = (String) JOptionPane.showInputDialog(null, "Seleccione un convertidor",
                "Convertidor", JOptionPane.DEFAULT_OPTION, icon2, opciones, opciones[0]);
        
    }
     //Pasamos parametro para poder comparar valores y poder realizar la conversion
    public void ConversionTemperatura(String[] opciones, String opcionElegida2) {
        
        //Conversion de Kelvin a Celsius
        if(opcionElegida2.equals(opciones[0])){
            double kelvin; // Almacena el valor que pone el usario
            /*Con el ciclo hacemos que vuelva a pedir al usuario el valor que desea continuar
              Solamente si se atrapa un error*/ 
             do {
                try { //Atrapa un error si el usario introduce letras  y arrojamos un mensaje de ERROR 
                    kelvin = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Dame Temperatura Kelvin(K)° a convertir: "));
                    break;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "!No se permite letras ni caracteres especiales!",
                            "ERROR", JOptionPane.OK_OPTION);
                }
            } while(true);
               
                double resultado = kelvin - 273.15 ; //Se realiza la operacion 
                //Se imprime el resultado 
                JOptionPane.showMessageDialog(null, "Tu conversion es: " + resultado + " °C");   
        }
        //Convertir de Kelvin a Fahrenheit
         if(opcionElegida2.equals(opciones[1])){
            double kelvin;
             do {
                try {
                    kelvin = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Dame Temperatura Kelvin(K) a convertir: "));
                    break;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se permite letras ni caracteres especiales!",
                            "ERROR", JOptionPane.OK_OPTION);
                }
            } while(true);
             
                double resultado = (kelvin*9/5)-459.67 ;
                JOptionPane.showMessageDialog(null, "Tu conversion es: " + resultado + " °F");
            
        }
         //Celsius a kelvin
         if(opcionElegida2.equals(opciones[2])){
            double celcius;
             do {
                try {
                    celcius = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Dame Temperatura Celsius(C) a convertir: "));
                    break;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se permite letras ni caracteres especiales!",
                            "ERROR", JOptionPane.OK_OPTION);
                }
            } while(true);
                 //Creo constructor para accerder a las variables
                double resultado = celcius + 273.15 ;
                JOptionPane.showMessageDialog(null, "Tu conversion es: " + resultado + " °K");
            
        }
         //Celsius(C) a Fahrenheit (F)
         if(opcionElegida2.equals(opciones[3])){
            double celcius;
             do {
                try {
                    celcius = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Dame Temperatura Celsius(C) a convertir: "));
                    break;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se permite letras ni caracteres especiales!",
                            "ERROR", JOptionPane.OK_OPTION);
                }
            } while(true);
                 //Creo constructor para accerder a las variables
                double resultado = (celcius*9/5)+32 ;
                JOptionPane.showMessageDialog(null, "Tu conversion es: " + resultado + " °F");
            
        }
         //Fahrenheit (F) a Kelvin(K)
          if(opcionElegida2.equals(opciones[4])){
            double Fahrenheit;
             do {
                try {
                    Fahrenheit = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Dame Temperatura Fahrenheit(F) a convertir: "));
                    break;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se permite letras ni caracteres especiales!",
                            "ERROR", JOptionPane.OK_OPTION);
                }
            } while(true);
                 //Creo constructor para accerder a las variables
                double resultado = (Fahrenheit+459.67)*5/9 ;
                JOptionPane.showMessageDialog(null, "Tu conversion es: " + Math.round(resultado) + " °K");
            
        }
          //"Fahrenheit (F) a Celsius(C
           if(opcionElegida2.equals(opciones[5])){
            double Fahrenheit;
             do {
                try {
                    Fahrenheit = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Dame Temperatura Fahrenheit(F) a convertir: "));
                    break;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se permite letras ni caracteres especiales!",
                            "ERROR", JOptionPane.OK_OPTION);
                }
            } while(true);
                 //Creo constructor para accerder a las variables
                double resultado = (1.8 *Fahrenheit) + 32 ;
                JOptionPane.showMessageDialog(null, "Tu conversion es: " + resultado + " °C");
            
        }
    }
}
