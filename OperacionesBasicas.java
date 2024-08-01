package com.mycompany.operacionesbasicas;
//Librerias para trabajar con una lista de caracteres por patrones de busqueda
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OperacionesBasicas{
    //Función main provisional
    /*public static void main(String [] args){
        //String expresion = "operacion a resolver";
        String expresion = "5+34/4-4/0";
        double resultado = calcularexpresion(expresion);
        if (!Double.isNaN(resultado)) {
            System.out.println("Resultado: " + resultado);
        }
    }*/
  
    public static double calcularexpresion(String expresion){
        // Aquí se tomará el string de operaciones y se llevarán a las funciones correspondientes
        String signo = "+"; // Signo necesario para multiplicación y división con valores negativos

        // Evaluamos las multiplicaciones y divisiones, con valor1 y valor2 positivos
        Pattern pattern = Pattern.compile("(\\d+\\.?\\d*)([*/])(\\d+\\.?\\d*)");
        Matcher matcher = pattern.matcher(expresion);
        while (matcher.find()) {
            //System.out.println("Expresión: " + expresion); // imprime el proceso de la expresión, opcional
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

        // Evaluamos las multiplicaciones y divisiones, con valor1 negativo
        pattern = Pattern.compile("([-])(\\d+\\.?\\d*)([*/])(\\d+\\.?\\d*)");
        matcher = pattern.matcher(expresion);
        while (matcher.find()) {
            //System.out.println("Expresión: " + expresion); // imprime el proceso de la expresión, opcional
            String operador0 = matcher.group(1);
            double valor1 = Double.parseDouble(matcher.group(2));
            String operador = matcher.group(3);
            String operador1 = "";
            double valor2 = Double.parseDouble(matcher.group(4));
            double resultado = realizarOperacion(operador0, valor1, operador, operador1, valor2);
            if (Double.isNaN(resultado)) return Double.NaN;
            expresion = expresion.substring(0, matcher.start()) + resultado + expresion.substring(matcher.end());
            matcher = pattern.matcher(expresion);
        }
        
        // Evaluamos las multiplicaciones y divisiones, con valor1 y valor2 negativos
        pattern = Pattern.compile("([-])(\\d+\\.?\\d*)([*/])([-])(\\d+\\.?\\d*)");
        matcher = pattern.matcher(expresion);
        while (matcher.find()) {
            //System.out.println("Expresión: " + expresion); // imprime el proceso de la expresión, opcional
            String operador0 = matcher.group(1);
            double valor1 = Double.parseDouble(matcher.group(2));
            String operador = matcher.group(3);
            String operador1 = matcher.group(4);
            double valor2 = Double.parseDouble(matcher.group(5));
            double resultado = realizarOperacion(operador0, valor1, operador, operador1, valor2);
            if (Double.isNaN(resultado)) return Double.NaN;
            expresion = expresion.substring(0, matcher.start()) + signo + resultado + expresion.substring(matcher.end());
            matcher = pattern.matcher(expresion);
        }
        
        // Evaluamos las multiplicaciones y divisiones, con valor2 negativo
        pattern = Pattern.compile("(\\d+\\.?\\d*)([*/])([-])(\\d+\\.?\\d*)");
        matcher = pattern.matcher(expresion);
        while (matcher.find()) {
            //System.out.println("Expresión: " + expresion); // imprime el proceso de la expresión, opcional
            String operador0 = "";
            double valor1 = Double.parseDouble(matcher.group(1));
            String operador = matcher.group(2);
            String operador1 = matcher.group(3);
            double valor2 = Double.parseDouble(matcher.group(4));
            double resultado = realizarOperacion(operador0, valor1, operador, operador1, valor2);
            if (Double.isNaN(resultado)) return Double.NaN;
            expresion = expresion.substring(0, matcher.start()) + resultado + expresion.substring(matcher.end());
            matcher = pattern.matcher(expresion);
        }
        
        // Luego evaluamos las sumas y restas, con valor1 y valor2 negativos
        pattern = Pattern.compile("([-])(\\d+\\.?\\d*)([+-])([-])(\\d+\\.?\\d*)");
        matcher = pattern.matcher(expresion);
        while (matcher.find()) {
            //System.out.println("Expresión: " + expresion); // imprime el proceso de la expresión, opcional
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
            //System.out.println("Expresión: " + expresion); // imprime el proceso de la expresión, opcional
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
            //System.out.println("Expresión: " + expresion); // imprime el proceso de la expresión, opcional
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
            //System.out.println("Expresión: " + expresion); // imprime el proceso de la expresión, opcional
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
                    throw new IllegalArgumentException("Operador no soportado: " + operador);
            }
        }  
    }
}
