package desafio;

import javax.swing.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Moneda {

    public String opcionElegida1;
    /* Se pone la ruta de la imagen a utilizar utilizando la opciones de la libreria ICON*/ 
    Icon icon1 = new ImageIcon("C:\\Users\\Edgar\\OneDrive\\Documentos\\challenge\\Desafio\\src\\imagen-challengue\\coin-pixel.gif");
   
    //Clase donde mostraremos la lista nueva para la opcion moneda   
    public void mostrarListaDesplegable(String[] opciones) {

        opcionElegida1 = (String) JOptionPane.showInputDialog(null, "Seleccione un convertidor",
                "Convertidor", JOptionPane.DEFAULT_OPTION, icon1, opciones, opciones[0]);

    }

    //Pasamos parametro para poder comparar valores y poder realizar la conversion
    public void PesoOtraMoneda(String[] opciones, String opcionElegida1) {
        //Opcion Peso a Dolar 
        if (opcionElegida1.equals(opciones[0])) { 
            double peso; //Al macena el valor que el usario ingrese 
            /*Con el ciclo do-while permite que el usario vuelva a poner el valor de moneda
              Solo si se atrapa un error*/ 
            do {
                /*Con el try | catch se atrapa un error | si el usario intenta poner letras o carrecteres especaiales 
                Y se arroja un mensaje de advertencia*/
                try {
                    peso = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Ingresa la cantidad de dinero que deseas convertir: "));
                    break;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "¡No se permite letras ni caracteres especiales!",
                            "ERROR", JOptionPane.OK_OPTION);
                }
            } while(true);
                 /*Se hace referencia a la clase Valor Moneda para poder llamar a la variables por medio de get*/
                ValorMoneda obj1 = new ValorMoneda();
                double resultado = Math.round(obj1.getMxn() * peso); //Se realiza operacion 
                //Se imprime Mensaje
                JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " Dolares");
            
        } 
        //Opcion peso a euro
        else if (opcionElegida1.equals(opciones[1])) {
            double peso;
            do{
                try{
                     peso = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Ingresa la cantidad de dinero que deseas convertir: "));
                     break;
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "¡No se permite letras ni caracteres especiales!",
                            "ERROR", JOptionPane.OK_OPTION);
                }
            }while(true);
            ValorMoneda obj2 = new ValorMoneda();
            double resultado1 = Math.round(obj2.getMxne() * peso);
            JOptionPane.showMessageDialog(null, "Tienes €" + resultado1 + " Euros");
            
        } 
        //OPcion peso a libras 
        else if (opcionElegida1.equals(opciones[2])) {
           double peso;
            do{
                try{
                     peso = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Ingresa la cantidad de dinero que deseas convertir: "));
                     break;
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "¡No se permite letras ni caracteres especiales!",
                            "ERROR", JOptionPane.OK_OPTION);
                }
            }while(true);
            ValorMoneda obj3 = new ValorMoneda();
            double resultado2 = Math.round(obj3.getMxnL() * peso);
            JOptionPane.showMessageDialog(null, "Tienes £" + resultado2 + " Libras Esterlinas");
            
        }
        //Opcion peso a Yenes japoneses 
        if (opcionElegida1.equals(opciones[3])) {
           double peso;
            do{
                try{
                     peso = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Ingresa la cantidad de dinero que deseas convertir: "));
                     break;
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "¡No se permite letras ni caracteres especiales!",
                            "ERROR", JOptionPane.OK_OPTION);
                }
            }while(true);
            ValorMoneda obj4 = new ValorMoneda();
            double resultado3 = Math.round(obj4.getMxnY() * peso);
            JOptionPane.showMessageDialog(null, "Tienes ¥" + resultado3 +" Yenes Japoneses");
            
        }
        //Opcion peso a Won sur-corenano 
        else if (opcionElegida1.equals(opciones[4])) {
            double peso;
            do{
                try{
                     peso = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Ingresa la cantidad de dinero que deseas convertir: "));
                     break;
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "¡No se permite letras ni caracteres especiales!",
                            "ERROR", JOptionPane.OK_OPTION);
                }
            }while(true);
            ValorMoneda obj5 = new ValorMoneda();
            double resultado4 = Math.round(obj5.getMxnWSC() * peso);
            JOptionPane.showMessageDialog(null, "Tienes ₩" + resultado4 + " WSC");
            
        }
    }

    void OtraMonedaPeso(String[] opciones, String opcionElegida1) {
        //Dolar a peso 
        if (opcionElegida1.equals(opciones[5])) {
            double peso;
            do{
                try{
                     peso = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Ingresa la cantidad de dinero que deseas convertir: "));
                     break;
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "¡No se permite letras ni caracteres especiales!",
                            "ERROR", JOptionPane.OK_OPTION);
                }
            }while(true);
            ValorMoneda obj5 = new ValorMoneda();
            double resultado5 = obj5.getUsd() * peso;
            JOptionPane.showMessageDialog(null, "Tienes $" + resultado5 + " Pesos");
            
        }
        //Euro a peso 
        else if (opcionElegida1.equals(opciones[6])) {
            double peso;
            do{
                try{
                     peso = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Ingresa la cantidad de dinero que deseas convertir: "));
                     break;
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "¡No se permite letras ni caracteres especiales!",
                            "ERROR", JOptionPane.OK_OPTION);
                }
            }while(true);
            ValorMoneda obj6 = new ValorMoneda();
            double resultado6 = Math.round(obj6.getEur() * peso);
            JOptionPane.showMessageDialog(null, "Tienes $" + resultado6 + " Pesos");
            
        }
        //Libras esterlinas a peso 
        else if (opcionElegida1.equals(opciones[7])) {
            double peso;
            do{
                try{
                     peso = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Ingresa la cantidad de dinero que deseas convertir: "));
                     break;
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "¡No se permite letras ni caracteres especiales!",
                            "ERROR", JOptionPane.OK_OPTION);
                }
            }while(true);
            ValorMoneda obj7 = new ValorMoneda();
            double resultado7 = Math.round(obj7.getGbp() * peso);
            JOptionPane.showMessageDialog(null, "Tienes $" + resultado7 + " Pesos");
            
        } 
        //Yen japones a peso 
        else if (opcionElegida1.equals(opciones[8])) {
            double peso;
            do{
                try{
                     peso = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Ingresa la cantidad de dinero que deseas convertir:"));
                     break;
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "¡No se permite letras ni caracteres especiales!",
                            "ERROR", JOptionPane.OK_OPTION);
                }
            }while(true);
            ValorMoneda obj8 = new ValorMoneda();
            double resultado8 = Math.round(obj8.getJpy() * peso);
            JOptionPane.showMessageDialog(null, "Tienes $" + resultado8 + " Pesos");
            
        } 
        //Won sur coreano a peso   
        else if (opcionElegida1.equals(opciones[9])) {
            double peso;
            do{
                try{
                     peso = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Ingresa la cantidad de dinero que deseas convertir: "));
                     break;
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "¡No se permite letras ni caracteres especiales!",
                            "ERROR", JOptionPane.OK_OPTION);
                }
            }while(true);
            ValorMoneda obj9 = new ValorMoneda();
            double resultado9 = Math.round(obj9.getKrw() * peso);
            JOptionPane.showMessageDialog(null, "Tienes $" + resultado9 + " Pesos");
        }
    }

}
