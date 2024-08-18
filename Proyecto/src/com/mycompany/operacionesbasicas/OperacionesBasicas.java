package com.mycompany.operacionesbasicas;
//Librerias para trabajar con una lista de caracteres por patrones de busqueda
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperacionesBasicas{
    //Anthony-----------------------------------------------------------------------------------------------
    public static double calcularexpresion(String expresion){
        // Aquí se tomará el string de operaciones y se llevarán a las funciones correspondientes
        String signo = "+"; // Signo necesario para multiplicación y división con valores negativos

        // Evaluamos las multiplicaciones y divisiones, con valor1 y valor2 positivos
        Pattern pattern = Pattern.compile("(\\d+\\.?\\d*)([*/])(\\d+\\.?\\d*)");//Se define el patron que se va a comparar
        Matcher matcher = pattern.matcher(expresion);//Se busca en el string ingresado alguna coincidencia con el patron
        while (matcher.find()) {//entrara en el while hasta que ya no encuentre mas coincidencias
            String operador0 = "";//Establece el signo que acompaña al primer valor a operar
            double valor1 = Double.parseDouble(matcher.group(1));//Recibe el primer valor a operar del String
            String operador = matcher.group(2);//Recibe el operador del String
            String operador1 = "";//Establece el signo que acompaña al segundo valor a operar
            double valor2 = Double.parseDouble(matcher.group(3));//Recibe el segundo valor a operar del String
            double resultado = realizarOperacion(operador0, valor1, operador, operador1, valor2);//envia los datos a la funcion realizarOperacion
            if (Double.isNaN(resultado)) return Double.NaN;
            expresion = expresion.substring(0, matcher.start()) + resultado + expresion.substring(matcher.end());//Remplaza los valores utilizados en la operacion por el valor resultante
            matcher = pattern.matcher(expresion);//busca coincidencias del nuevo string con el patron anterior
        }

        // Evaluamos las multiplicaciones y divisiones, con valor1 negativo
        pattern = Pattern.compile("([-])(\\d+\\.?\\d*)([*/])(\\d+\\.?\\d*)");//Se define el patron que se va a comparar
        matcher = pattern.matcher(expresion);//Se busca en el string ingresado alguna coincidencia con el patron
        while (matcher.find()) {//entrara en el while hasta que ya no encuentre mas coincidencias
            String operador0 = matcher.group(1);//Recibe el signo que acompaña al primer valor a operar
            double valor1 = Double.parseDouble(matcher.group(2));//Recibe el primer valor a operar del String
            String operador = matcher.group(3);//Recibe el operador del String
            String operador1 = "";//Establece el signo que acompaña al segundo valor a operar
            double valor2 = Double.parseDouble(matcher.group(4));//Recibe el segundo valor a operar del String
            double resultado = realizarOperacion(operador0, valor1, operador, operador1, valor2);//envia los datos a la funcion realizarOperacion
            if (Double.isNaN(resultado)) return Double.NaN;
            expresion = expresion.substring(0, matcher.start()) + resultado + expresion.substring(matcher.end());//Remplaza los valores utilizados en la operacion por el valor resultante
            matcher = pattern.matcher(expresion);//busca coincidencias del nuevo string con el patron anterior
        }
        
        // Evaluamos las multiplicaciones y divisiones, con valor1 y valor2 negativos
        pattern = Pattern.compile("([-])(\\d+\\.?\\d*)([*/])([-])(\\d+\\.?\\d*)");//Se define el patron que se va a comparar
        matcher = pattern.matcher(expresion);//Se busca en el string ingresado alguna coincidencia con el patron
        while (matcher.find()) {//entrara en el while hasta que ya no encuentre mas coincidencias
            String operador0 = matcher.group(1);//Recibe el signo que acompaña al primer valor a operar
            double valor1 = Double.parseDouble(matcher.group(2));//Recibe el primer valor a operar del String
            String operador = matcher.group(3);//Recibe el operador del String
            String operador1 = matcher.group(4);//Recibe el signo que acompaña al segundo valor a operar
            double valor2 = Double.parseDouble(matcher.group(5));//Recibe el segundo valor a operar del String
            double resultado = realizarOperacion(operador0, valor1, operador, operador1, valor2);//envia los datos a la funcion realizarOperacion
            if (Double.isNaN(resultado)) return Double.NaN;
            expresion = expresion.substring(0, matcher.start()) + signo + resultado + expresion.substring(matcher.end());//Remplaza los valores utilizados en la operacion por el valor resultante
            matcher = pattern.matcher(expresion);//busca coincidencias del nuevo string con el patron anterior
        }
        
        // Evaluamos las multiplicaciones y divisiones, con valor2 negativo
        pattern = Pattern.compile("(\\d+\\.?\\d*)([*/])([-])(\\d+\\.?\\d*)");//Se define el patron que se va a comparar
        matcher = pattern.matcher(expresion);//Se busca en el string ingresado alguna coincidencia con el patron
        while (matcher.find()) {//entrara en el while hasta que ya no encuentre mas coincidencias
            String operador0 = "";//Establece el signo que acompaña al primer valor a operar
            double valor1 = Double.parseDouble(matcher.group(1));//Recibe el primer valor a operar del String
            String operador = matcher.group(2);//Recibe el operador del String
            String operador1 = matcher.group(3);//Recibe el signo que acompaña al segundo valor a operar
            double valor2 = Double.parseDouble(matcher.group(4));//Recibe el segundo valor a operar del String
            double resultado = realizarOperacion(operador0, valor1, operador, operador1, valor2);//envia los datos a la funcion realizarOperacion
            if (Double.isNaN(resultado)) return Double.NaN;
            expresion = expresion.substring(0, matcher.start()) + resultado + expresion.substring(matcher.end());//Remplaza los valores utilizados en la operacion por el valor resultante
            matcher = pattern.matcher(expresion);//busca coincidencias del nuevo string con el patron anterior
        }
        //Steven-----------------------------------------------------------------------------------------------
        // Luego evaluamos las sumas y restas, con valor1 y valor2 negativos
        pattern = Pattern.compile("([-])(\\d+\\.?\\d*)([+-])([-])(\\d+\\.?\\d*)");
        matcher = pattern.matcher(expresion);
        while (matcher.find()) {
            String operador0 = "-";
            double valor1 = Double.parseDouble(matcher.group(2));
            String operador = matcher.group(3);
            String operador1 = "-";
            double valor2 = Double.parseDouble(matcher.group(5));
            double resultado = realizarOperacion(operador0, valor1, operador, operador1, valor2);
            if (Double.isNaN(resultado)) return Double.NaN;
            expresion = expresion.substring(0, matcher.start()) + resultado + expresion.substring(matcher.end());
            matcher = pattern.matcher(expresion);
        }
        
        // Evaluamos las sumas y restas, con valor2 negativo
        pattern = Pattern.compile("(\\d+\\.?\\d*)([+-])([-])(\\d+\\.?\\d*)");
        matcher = pattern.matcher(expresion);
        while (matcher.find()) {
            String operador0 = "";
            double valor1 = Double.parseDouble(matcher.group(1));
            String operador = matcher.group(2);
            String operador1 = "-";
            double valor2 = Double.parseDouble(matcher.group(4));
            double resultado = realizarOperacion(operador0, valor1, operador, operador1, valor2);
            if (Double.isNaN(resultado)) return Double.NaN;
            expresion = expresion.substring(0, matcher.start()) + resultado + expresion.substring(matcher.end());
            matcher = pattern.matcher(expresion);
        }
        
        // Evaluamos las sumas y restas, con valor1 negativo
        pattern = Pattern.compile("([-])(\\d+\\.?\\d*)([+-])(\\d+\\.?\\d*)");
        matcher = pattern.matcher(expresion);
        while (matcher.find()) {
            String operador0 = "-";
            double valor1 = Double.parseDouble(matcher.group(2));
            String operador = matcher.group(3);
            String operador1 = "";
            double valor2 = Double.parseDouble(matcher.group(4));
            double resultado = realizarOperacion(operador0, valor1, operador, operador1, valor2);
            if (Double.isNaN(resultado)) return Double.NaN;
            expresion = expresion.substring(0, matcher.start()) + resultado + expresion.substring(matcher.end());
            matcher = pattern.matcher(expresion);
        }

        // Evaluamos las sumas y restas, con valor1 y valor2 positivos
        pattern = Pattern.compile("(\\d+\\.?\\d*)([+-])(\\d+\\.?\\d*)");
        matcher = pattern.matcher(expresion);
        while (matcher.find()) {
            String operador0 = "";
            double valor1 = Double.parseDouble(matcher.group(1));
            String operador = matcher.group(2);
            String operador1 = "";
            double valor2 = Double.parseDouble(matcher.group(3));
            double resultado = realizarOperacion(operador0, valor1, operador, operador1, valor2);
            if (Double.isNaN(resultado)) return Double.NaN;
            expresion = expresion.substring(0, matcher.start()) + resultado + expresion.substring(matcher.end());
            matcher = pattern.matcher(expresion);
        }
        return Double.parseDouble(expresion);
    }
    //Ivan-----------------------------------------------------------------------------------------------
    // Aquí se realiza la operación tomando en cuenta los signos
    public static double realizarOperacion(String operador0, double valor1, String operador, String operador1, double valor2){
        // Evaluamos con valor1 negativo
        if(operador0.equals("-") && operador1.equals("")){
            switch (operador) {
                case "+":
                    return -valor1 + valor2;
                case "-":
                    return -valor1 - valor2;
                case "*":
                    return -valor1 * valor2;
                case "/":
                    if (valor2 == 0) {
                        System.out.println("No se puede dividir por cero. ERROR");
                        return Double.NaN;
                    }
                    return  -valor1 / valor2;
                default:
                    throw new IllegalArgumentException("Operador no soportado: " + operador);
            }
        }
            
        // Evaluamos con valor2 negativo
        if(operador0.equals("") && operador1.equals("-")){
            switch (operador) {
                case "+":
                    return valor1 - valor2;
                case "-":
                    return valor1 + valor2;
                case "*":
                    return valor1 * -valor2;
                case "/":
                    if (valor2 == 0) {
                        System.out.println("No se puede dividir por cero.");
                        return Double.NaN;
                    }
                    return  valor1 / -valor2;
                default:
                    throw new IllegalArgumentException("Operador no soportado: " + operador);
            }
        }

        // Evaluamos con valor1 y valor2 negativos
        if(operador0.equals("-") && operador1.equals("-")){
            switch (operador) {
                case "+":
                    return -valor1 - valor2;
                case "-":
                    return -valor1 + valor2;
                case "*":
                    return valor1 * valor2;
                case "/":
                    if (valor2 == 0) {
                        System.out.println("No se puede dividir por cero.");
                        return Double.NaN;
                    }
                    return  valor1 / valor2;
                default:
                    throw new IllegalArgumentException("Operador no soportado: " + operador);
            }
        }

        // Evaluamos con valor1 y valor2 positivos
        else{
            switch (operador) {
                case "+":
                    return valor1 + valor2;
                case "-":
                    return valor1 - valor2;
                case "*":
                    return valor1 * valor2;
                case "/":
                    if (valor2 == 0) {
                        System.out.println("No se puede dividir por cero.");
                        return Double.NaN;
                    }
                    return  valor1 / valor2;
                default:
                    throw new IllegalArgumentException("Operador no permitido: " + operador);
            }
        }  
    }
}
