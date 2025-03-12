import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Importo el scanner para usarlo más adelante, lo había importado en el ejercicio 8, pero como lo usaba más adelante lo he puesto al principio para que quede claro
        Scanner scanner = new Scanner(System.in);

        //1️⃣ Crea una constante llamada GRAVEDAD con el valor 9.81 y muestra su valor por pantalla.
        final double GRAVEDAD = 9.81;
        System.out.println("La gravedad es: " + GRAVEDAD);
        System.out.println("--------------");

        //2️⃣ Declara dos variables a = 25 y b = 7. Realiza todas las operaciones aritméticas entre ellas e imprime los resultados.
        float a = 25;
        float b = 7;
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Módulo: " + (a % b));
        System.out.println("--------------");

        //3️⃣ Declara una variable edad e imprime si la persona es mayor de edad (>= 18) o menor de edad (< 18).
        int edad = 18;
        System.out.println("Es mayor de edad? " + (edad >= 18));
        System.out.println("--------------");

        //4️⃣ Crea un programa que reciba dos números y determine cuál es mayor, menor o si son iguales.
        int numero1 = 10;
        int numero2 = 4;

        if (numero1 > numero2){
            System.out.println("El número 1 es MAYOR que el número 2");
        }
        else if (numero1 < numero2) {
            System.out.println("El número 2 es MAYOR que el número 1");
        } else if (numero1 == numero2) {
            System.out.println("Los dos números introducidos son iguales");
        }
        System.out.println("--------------");

        //5️⃣ Escribe un programa que evalúe la siguiente expresión lógica: (5 > 3) && (10 < 20). ¿Cuál es el resultado?
        System.out.println("El resultado de la expresión (5 > 3) && (10 < 20) es: " + ((5>3) && (10>20)));
        System.out.println("--------------");
        //6️⃣ Modifica el programa anterior y evalúa también (5 > 3) || (10 > 20). Explica los resultados obtenidos.
        System.out.println("El resultado de la expresión (5 > 3) || (10 < 20) es: " + ((5>3) || (10>20)));
        //En el programa anterior comparaba ambos resultados y daba FALSE, porque 5 es mayor que 3, pero 10 no es mayor que 20 entonces muestra un FALSE.
        //En este programa, muestra TRUE porque al menos una de las dos comparaciones que se realizan se cumplen (TRUE).
        System.out.println("--------------");

        //7️⃣ Declara tres variables x = 10, y = 20, z = 30. Compara x + y con z utilizando operadores relacionales.
        int x = 10, y = 20, z = 30;
        System.out.println("¿X + Y es igual a Z? " + ((x+y) == z));
        System.out.println("¿X + Y es diferente de Z? " + ((x+y) != z));
        System.out.println("¿X + Y es mayor que Z? " + ((x+y) > z));
        System.out.println("¿X + Y es menor que Z? " + ((x+y) < z));
        //He cambiado los valores manualmente de X,Y,Z para ver que si cambian los valores, también cambia el valor del resultado.
        System.out.println("--------------");

        //8️⃣ Crea un programa que pida al usuario dos números y evalúe si son múltiplos (num1 % num2 == 0).
        System.out.println("Hola bonito, introduce el primer número: ");
        float PrimerNumero = scanner.nextFloat();
        System.out.println("Porfa, introduce el segundo número: ");
        float SegundoNumero = scanner.nextFloat();
        float Resto = PrimerNumero % SegundoNumero;
        if (Resto == 0){
            System.out.println("El resto es 0. Por lo tanto son múltiplos");
        } else {
            System.out.println("No son múltiplos, El resto es: " + Resto);
        }
        System.out.println("--------------");


        //9️⃣ Escribe un código que reciba un número e indique si es par o impar usando el operador módulo (%).
        System.out.println("Hola chico listo, dime el número y te diré si es par o impar: ");
        float PrimerNumeroParImpar = scanner.nextFloat();
        float RestoParImpar = PrimerNumeroParImpar % 2;
        if (RestoParImpar == 0){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
        System.out.println("--------------");


        //🔟 Define una constante TASA_CAMBIO con el valor 1.12 (dólar a euro). Convierte una cantidad de dólares ingresada por el usuario a euros.
        final double TASA_CAMBIO = 1.12;
        System.out.println("Hola persona rica, cuántos euros quieres convertir?: ");
        double euros = scanner.nextDouble();
        double dolares = euros * TASA_CAMBIO;
        System.out.println(euros + " € convertido a dólares son: " + dolares + " $");
        System.out.println("--------------");

    }
}