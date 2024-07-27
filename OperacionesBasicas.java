public class OperacionesBasicas{
  //Funcion main provicional
  public static void main(String [] args){
    String expresion = "operacion a resolver";
    double resultado = calcularexpresion(expresion);
    System.out.println("Resultado:"+resultado);
     }
  public static double calcularexpresion(String expresion){
     //Aqui se tomara el string de operaciones y se llevaran a las funciones correspondientes
    }
  public static double realizarOperaciones(String operador, double valor1, double valor2){
    //Aqui se realiza la operacion
    switch(operador){
            case"-":
                   return valor1 - valor2;
            default:
            throw new IllegalArgumentException("Este operador no esta permitido"+operador);
        }
    }
  }
